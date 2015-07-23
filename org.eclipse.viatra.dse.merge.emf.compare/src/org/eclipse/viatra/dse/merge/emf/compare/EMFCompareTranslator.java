package org.eclipse.viatra.dse.merge.emf.compare;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.internal.spec.AttributeChangeSpec;
import org.eclipse.emf.compare.internal.spec.ReferenceChangeSpec;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra.dse.merge.DSEMergeIdMapper;
import org.eclipse.viatra.dse.merge.model.Attribute;
import org.eclipse.viatra.dse.merge.model.ChangeSet;
import org.eclipse.viatra.dse.merge.model.Create;
import org.eclipse.viatra.dse.merge.model.Delete;
import org.eclipse.viatra.dse.merge.model.Id;
import org.eclipse.viatra.dse.merge.model.IdType;
import org.eclipse.viatra.dse.merge.model.Kind;
import org.eclipse.viatra.dse.merge.model.ModelFactory;
import org.eclipse.viatra.dse.merge.model.Reference;

@SuppressWarnings("restriction")
public class EMFCompareTranslator {

    private DSEMergeIdMapper mapper;

    public ChangeSet translate(Comparison compare, DSEMergeIdMapper mapper) {
        this.mapper = mapper;
        ChangeSet changeSet = ModelFactory.eINSTANCE.createChangeSet();
        processFeatureChangeSpec(compare, changeSet);

        return changeSet;
    }

    private void processFeatureChangeSpec(Comparison compare, ChangeSet changeSet) {

        EList<Diff> list = compare.getDifferences();
        for (Diff diff : list) {
            if (diff instanceof ReferenceChangeSpec) {
                processReferenceChangeSpec((ReferenceChangeSpec) diff, changeSet);
            }
            if (diff instanceof AttributeChangeSpec) {
                processAttributeChangeSpec((AttributeChangeSpec) diff, changeSet);
            }
        }
    }

    private void processAttributeChangeSpec(AttributeChangeSpec diff, ChangeSet changeSet) {

        EObject original = diff.getMatch().getRight();
        if (original == null) {
            return; // A create operation will come
        }
        EObject object = diff.getMatch().getLeft();
        if (object == null)
            return; // A delete operation will come

        Attribute attribute = ModelFactory.eINSTANCE.createAttribute();
        attribute.setFeature(diff.getAttribute());
        attribute.setValue(diff.getValue());
        attribute.setExecutable(true);

        // TODO: introduce new operation if it is related to changing identifier

        // If we change the value of an attribute that
        if (mapper.isDeterminativeFeature(diff.getAttribute()))
            attribute.setSrc(create(diff.getMatch().getRight()));
        else
            attribute.setSrc(create(diff.getMatch().getLeft()));

        switch (diff.getKind()) {
        case ADD:
            attribute.setKind(Kind.ADD);
            break;
        case CHANGE:
            attribute.setKind(Kind.SET);
            attribute.setOldValue(diff.getMatch().getRight().eGet(diff.getAttribute()));
            break;
        case DELETE:
            attribute.setKind(Kind.REMOVE);
            break;
        default:
            break;
        }

        changeSet.getChanges().add(attribute);
    }

    private void processReferenceChangeSpec(ReferenceChangeSpec diff, ChangeSet changeSet) {

        if (processIfDelete(diff, changeSet))
            return;

        if (processIfCreate(diff, changeSet))
            return;

        EObject original = diff.getMatch().getRight();
        if (original == null) {
            return; // A create operation will come
        }
        EObject object = diff.getMatch().getLeft();

        if (object == null) {
            return; // A delete operation will come
        }

        Reference reference = ModelFactory.eINSTANCE.createReference();
        reference.setFeature(diff.getReference());
        reference.setSrc(create(diff.getMatch().getLeft()));

        Object target = object.eGet(diff.getReference());
        if (target != null) {
            if (diff.getMatch().getComparison().getMatch(diff.getValue()).getLeft() == null)
                return;
            reference.setTrg(create((EObject) diff.getValue()));
        }
        reference.setExecutable(true);

        switch (diff.getKind()) {
        case ADD:
            reference.setKind(Kind.ADD);
            break;
        case CHANGE:
            if (target == null) {
                reference.setKind(Kind.UNSET);
                reference.setOldTrg(create((EObject) diff.getMatch().getRight().eGet(diff.getReference())));
            } else {
                reference.setKind(Kind.SET);
                reference.setOldTrg(create((EObject) diff.getMatch().getRight().eGet(diff.getReference())));
            }
            break;
        case DELETE:
            reference.setKind(Kind.REMOVE);
            break;
        case MOVE:
            if (diff.getReference().isMany()) {
                reference.setKind(Kind.ADD);
            } else {
                reference.setKind(Kind.SET);
            }
            break;
        default:
            break;
        }
        changeSet.getChanges().add(reference);
    }

    @SuppressWarnings("unchecked")
    private boolean processIfCreate(ReferenceChangeSpec diff, ChangeSet changeSet) {
        if (diff.getReference().isContainment() && diff.getKind() != DifferenceKind.DELETE) {

            EObject object = diff.getValue();

            Create create = ModelFactory.eINSTANCE.createCreate();
            create.setExecutable(true);
            create.setSrc(create(object));
            create.setFeature(diff.getReference());
            create.setClazz(object.eClass());
            create.setContainer(create(object.eContainer()));
            changeSet.getChanges().add(create);

            for (EStructuralFeature f : object.eClass().getEAllStructuralFeatures()) {
                // If this feature is determinative in calculating the identifier we miss it 'cause we will set it at
                // the object creation.
                if (mapper.isDeterminativeFeature(f)) {
                    continue;
                }
                if (f instanceof EReference) {
                    Object result = object.eGet(f);
                    if (result instanceof EList<?>) {
                        for (EObject trg : (EList<EObject>) result) {
                            insertReference(create, f, object, trg, changeSet, Kind.ADD);
                        }
                    } else if (result != null) {
                        EObject trg = (EObject) result;
                        insertReference(create, f, object, trg, changeSet, Kind.SET);
                    }

                }
                if (f instanceof EAttribute) {
                    Object result = object.eGet(f);
                    if (result instanceof EList<?>) {
                        for (Object trg : (EList<Object>) result) {
                            insertAttribute(create, f, object, trg, changeSet, Kind.ADD);
                        }
                    } else {
                        Object trg = (Object) result;
                        insertAttribute(create, f, object, trg, changeSet, Kind.SET);
                    }
                }
            }
            return true;
        }
        return false;
    }

    private boolean processIfDelete(ReferenceChangeSpec diff, ChangeSet changeSet) {
        if (diff.getKind() == DifferenceKind.DELETE && diff.getReference().isContainment()) {

            EObject object = diff.getValue();
            Delete delete = ModelFactory.eINSTANCE.createDelete();
            delete.setExecutable(true);
            delete.setSrc(create(object));
            changeSet.getChanges().add(delete);
            return true;
        }
        return false;
    }

    private void insertReference(Create create, EStructuralFeature feature, EObject src, EObject trg, ChangeSet set,
            Kind kind) {
        Reference reference = ModelFactory.eINSTANCE.createReference();
        reference.setFeature(feature);
        reference.setSrc(create(src));
        reference.setTrg(create(trg));
        reference.setExecutable(true);
        reference.setKind(kind);
        set.getChanges().add(reference);
        create.getFeatures().add(reference);
    }

    private void insertAttribute(Create create, EStructuralFeature feature, EObject src, Object trg, ChangeSet set,
            Kind kind) {
        Attribute reference = ModelFactory.eINSTANCE.createAttribute();
        reference.setFeature(feature);
        reference.setSrc(create(src));
        reference.setValue(trg);
        reference.setExecutable(true);
        reference.setKind(kind);
        set.getChanges().add(reference);
        create.getFeatures().add(reference);
    }

    private Id create(int value) {
        Id id = ModelFactory.eINSTANCE.createId();
        id.setEInt(value);
        id.setType(IdType.EINT);
        return id;
    }

    private Id create(long value) {
        Id id = ModelFactory.eINSTANCE.createId();
        id.setELong(value);
        id.setType(IdType.ELONG);
        return id;
    }

    private Id create(String value) {
        Id id = ModelFactory.eINSTANCE.createId();
        id.setEString(value);
        id.setType(IdType.ESTRING);
        return id;
    }

    private Id create(EObject object) {
        Object value = mapper.getId(object);

        if (value instanceof Integer) {
            return create((int) value);
        }
        if (value instanceof Long) {
            return create((long) value);
        }
        if (value instanceof String) {
            return create((String) value);
        }
        return null;
    }
}
