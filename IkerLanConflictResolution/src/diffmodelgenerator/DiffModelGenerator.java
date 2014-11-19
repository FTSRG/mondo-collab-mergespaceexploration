package diffmodelgenerator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.internal.spec.AttributeChangeSpec;
import org.eclipse.emf.compare.internal.spec.ReferenceChangeSpec;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.viatra.dse.util.EMFHelper;

import wtspecid.IdentifiableWTElement;
import DseMergeDiffModel.Create;
import DseMergeDiffModel.Delete;
import DseMergeDiffModel.DiffContainer;
import DseMergeDiffModel.DseMergeDiffModelFactory;
import DseMergeDiffModel.SetAttribute;
import DseMergeDiffModel.SetReference;

public class DiffModelGenerator {

	private ResourceSet resSet1;
	private ResourceSet resSet2;
	private static int createNum = 0;
	private static int deleteNum = 0;
	private static int setAttrNum = 0;
	private static int setRefNum = 0;
	private static int resetAttrNum = 0;
	private static int resetRefNum = 0;
	private String model = "diffOA";

	public DiffContainer generateDiffModel(String referenceModelPath,
			String targetModelPath) {
		return generateDiffModel(referenceModelPath, targetModelPath, false);
	}

	public DiffContainer generateDiffModel(String referenceModelPath,
			String targetModelPath, boolean serialize) {
		resSet1 = new ResourceSetImpl();
		resSet2 = new ResourceSetImpl();
		
		// Loading models to resource set
		resSet1.getResource(URI.createURI(referenceModelPath), true);
		resSet2.getResource(URI.createURI(targetModelPath), true);

		// Configure EMF Compare
		IEObjectMatcher matcher = DefaultMatchEngine
				.createDefaultEObjectMatcher(UseIdentifiers.WHEN_AVAILABLE);
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(
				new DefaultEqualityHelperFactory());
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(
				matcher, comparisonFactory);
		matchEngineFactory.setRanking(20);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);
		EMFCompare comparator = EMFCompare.builder()
				.setMatchEngineFactoryRegistry(matchEngineRegistry).build();

		// Compare the two models
		IComparisonScope scope = EMFCompare
				.createDefaultScope(resSet2, resSet1);

		Comparison comparison = comparator.compare(scope);

		// Getting differences
		List<Diff> differences = comparison.getDifferences();
		for (Diff diff : differences){
			System.out.println(diff.toString());
		}
		
		DiffContainer dc = (DiffContainer) DseMergeDiffModelFactory.eINSTANCE.createDiffContainer();
		
		for (Diff diff : differences){
			if(diff instanceof ReferenceChangeSpec){
				ReferenceChangeSpec r = (ReferenceChangeSpec) diff;
				String kind = r.getKind().getName();
				EAttribute idAttr = r.getValue().eClass().getEIDAttribute();
				String targetID = r.getValue().eGet(idAttr).toString();
				
				if(kind.equals("ADD")) {

					// CreateOp
					Create c = DseMergeDiffModelFactory.eINSTANCE.createCreate();
					c.setID("Create_" + createNum++ + "_" + targetID);
					c.setTargetID(targetID);
					c.setType(r.getValue().eClass().getName());
					
					// initial SetAttrOps
					EList<EAttribute> attrList = r.getValue().eClass().getEAllAttributes();
					String attrName;
					String value;
					for(EAttribute attr : attrList) {
						attrName = attr.getName();
						if (!attrName.equals(idAttr.getName())) {
							value = r.getValue().eGet(attr).toString();
							//System.out.println("attrname: " + attrName);
							c.getAttributes().add(attrName);
							c.getValues().add(value);
							//System.out.println("value: " + value);
//							SetAttribute sa = DiffModelFactory.eINSTANCE.createSetAttribute();
//							sa.setID("SetAttribute_" + setAttrNum++ + "_" + targetID);
//							sa.setTargetID(targetID);
//							sa.setAttribute(attrName);
//							sa.setValue(value);
//							dc.getSetAttrDiffs().add(sa);
						}
					}
					
					// SetRefOp for container
					String refName = r.getReference().getName();
					String refID = "";
					EObject obj = r.getMatch().getLeft();
					if (obj instanceof IdentifiableWTElement) {
						refID = ((IdentifiableWTElement) obj).getID();
					}
					// TODO targetID and refID should be swapped
//					SetReference sr = DiffModelFactory.eINSTANCE.createSetReference();
//					sr.setID("SetReference_" + setRefNum++ + "_" + targetID);
					c.setContainerTargetID(refID);
					c.setReference(refName);
//					c.setRefID(targetID);
//					dc.getSetRefDiffs().add(sr);
					
					dc.getCreateDiffs().add(c);
					
				}
				else if(kind.equals("DELETE")) {
					Delete d = DseMergeDiffModelFactory.eINSTANCE.createDelete();
					d.setID("Delete_" + deleteNum++ + "_" + targetID);
					d.setTargetID(targetID);
					dc.getDeleteDiffs().add(d);
				}
				else if(kind.equals("CHANGE")) {
					String refName = r.getReference().getName();
					String refID = "";
					EObject obj = r.getMatch().getLeft();
					if (obj instanceof IdentifiableWTElement) {
						refID = ((IdentifiableWTElement) obj).getID();
					}
					// TODO targetID and refID should be swapped
					SetReference sr = DseMergeDiffModelFactory.eINSTANCE.createSetReference();
					sr.setID("SetReference_" + setRefNum++ + "_" + targetID);
					sr.setTargetID(refID);
					sr.setReference(refName);
					sr.setRefID(targetID);
					dc.getSetRefDiffs().add(sr);
				}
				// TODO convert to ResetAttribute and ResetReference
				
			}
			else if(diff instanceof AttributeChangeSpec) {
				AttributeChangeSpec r = (AttributeChangeSpec) diff;
				String targetID = "";
				EObject obj = r.getMatch().getLeft();
				if (obj instanceof IdentifiableWTElement) {
					targetID = ((IdentifiableWTElement) obj).getID();
				}
				String attrName = r.getAttribute().getName();
				String value = r.getValue().toString();
				
				SetAttribute sa = DseMergeDiffModelFactory.eINSTANCE.createSetAttribute();
				sa.setID("SetAttribute_" + setAttrNum++ + "_" + targetID);
				sa.setTargetID(targetID);
				sa.setAttribute(attrName);
				sa.setValue(value);
				dc.getSetAttrDiffs().add(sa);
			}
			
		}

		if (serialize) {
			Date d = new Date();
			SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(
					"MM.dd.'at'.HH.mm.ss");
			String date = DATE_FORMAT.format(d);
			EMFHelper.serializeModel(dc, model + "_" + date, "diffmodel");
			model = "diffOB";
		}
		
		return dc;

	}
}
