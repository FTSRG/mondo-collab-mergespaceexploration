package eu.mondo.collaboration.dsemerge.diffmodelgenerator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.viatra.dse.util.EMFHelper;

import wtspecid.IdentifiableWTElement;
import DiffModel.Create;
import DiffModel.Delete;
import DiffModel.DiffContainer;
import DiffModel.DiffModelFactory;
import DiffModel.Move;
import DiffModel.SetAttribute;
import DiffModel.SetReference;

public class DiffModelGenerator {
	
	private ResourceSet resSet1;
	private ResourceSet resSet2;
	private static int createNum = 0;
	private static int deleteNum = 0;
	private static int setAttrNum = 0;
	private static int setRefNum = 0;
	private static int moveNum = 0;
	private String model = "deltaOA";
	
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
		
		DiffContainer dc = (DiffContainer) DiffModelFactory.eINSTANCE.createDiffContainer();
		
		for (Diff diff : differences){
			if(diff instanceof ReferenceChangeSpec){
				ReferenceChangeSpec r = (ReferenceChangeSpec) diff;
				DifferenceKind kind = r.getKind();
				EAttribute idAttr = r.getValue().eClass().getEIDAttribute();
				String targetID = r.getValue().eGet(idAttr).toString();
				
				if(kind.equals(DifferenceKind.ADD)) {

					// CreateOp
					Create c = DiffModelFactory.eINSTANCE.createCreate();
					c.setID("Create_" + createNum++ + "_" + targetID);
					c.setTargetID(targetID);
					c.setType(r.getValue().eClass().getName());
					
					// initial SetAttrOps
					EList<EAttribute> attrList = r.getValue().eClass().getEAllAttributes();
					String attrName;
					String value = "";
					for(EAttribute attr : attrList) {
						attrName = attr.getName();
						if (!attrName.equals(idAttr.getName())) {
							Object vobj = r.getValue().eGet(attr);
							if(vobj != null) {
								value = vobj.toString();
								c.getAttributes().add(attrName);
								c.getValues().add(value);
							}
						}
					}
					
					// SetRefOp for container
					String refName = r.getReference().getName();
					String refID = "";
					EObject obj = r.getMatch().getLeft();
					if (obj instanceof IdentifiableWTElement) {
						refID = ((IdentifiableWTElement) obj).getID();
					}
					
					c.setContainerTargetID(refID);
					c.setReference(refName);
					
					c.setEliminated(false);
					c.setExecutable(true);
					dc.getCreateDiffs().add(c);
					
				}
				else if(kind.equals(DifferenceKind.DELETE)) {
					// DeleteOp
					Delete d = DiffModelFactory.eINSTANCE.createDelete();
					d.setID("Delete_" + deleteNum++ + "_" + targetID);
					d.setTargetID(targetID);
					d.setEliminated(false);
					d.setExecutable(true);
					dc.getDeleteDiffs().add(d);
				}
				else if(kind.equals(DifferenceKind.CHANGE)) {
					String refName = r.getReference().getName();
					String refID = "";
					EObject obj = r.getMatch().getLeft();
					if (obj instanceof IdentifiableWTElement) {
						refID = ((IdentifiableWTElement) obj).getID();
					}
					
					// SetReferenceOp
					SetReference sr = DiffModelFactory.eINSTANCE.createSetReference();
					sr.setID("SetReference_" + setRefNum++ + "_" + targetID);
					sr.setTargetID(refID);
					sr.setReference(refName);
					sr.setRefID(targetID);
					sr.setEliminated(false);
					sr.setExecutable(true);
					dc.getSetRefDiffs().add(sr);
				}
				else if(kind.equals(DifferenceKind.MOVE)) {

					// MoveOp
					Move m = DiffModelFactory.eINSTANCE.createMove();
					m.setID("Move_" + moveNum++ + "_" + targetID);
					m.setTargetID(targetID);
					
					// Setting up container
					String refName = r.getReference().getName();
					String containerID = "";
					EObject obj = r.getMatch().getLeft();
					if (obj instanceof IdentifiableWTElement) {
						containerID = ((IdentifiableWTElement) obj).getID();
					}
					m.setContainerTargetID(containerID);
					m.setReference(refName);
					
					m.setEliminated(false);
					m.setExecutable(true);
					dc.getMoveDiffs().add(m);
				}
			}
			else if(diff instanceof AttributeChangeSpec) {
				AttributeChangeSpec a = (AttributeChangeSpec) diff;
				String targetID = "";
				EObject obj = a.getMatch().getLeft();
				if (obj instanceof IdentifiableWTElement) {
					targetID = ((IdentifiableWTElement) obj).getID();
				}
				String attrName = a.getAttribute().getName();
				String value = a.getValue().toString();
				
				// SetAttributeOp
				SetAttribute sa = DiffModelFactory.eINSTANCE.createSetAttribute();
				sa.setID("SetAttribute_" + setAttrNum++ + "_" + targetID);
				sa.setTargetID(targetID);
				sa.setAttribute(attrName);
				sa.setValue(value);
				sa.setEliminated(false);
				sa.setExecutable(true);
				dc.getSetAttrDiffs().add(sa);
			}
			
		}
		
		// Removing SetReference elements which are in fact UnsetReference elements and belong to Delete elements
		EList<Delete> deleteList = dc.getDeleteDiffs();
		EList<SetReference> setRefList = dc.getSetRefDiffs();
		int dsize = deleteList.size();
		int srsize = setRefList.size();

		String targetID, refID, dtargetID;
		for (int i=0; i < srsize; i++) {
			targetID = setRefList.get(i).getTargetID();
			refID = setRefList.get(i).getRefID();
			for (int j=0; j < dsize; j++) {
				dtargetID = deleteList.get(j).getTargetID();
				if (dtargetID.equals(targetID) || dtargetID.equals(refID)) {
					EcoreUtil.delete(setRefList.get(i));
					i--;
					srsize--;
					break;
				}
			}
		}
		
		// Serializing if it is needed
		if (serialize) {
			Date d = new Date();
			SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(
					"MM.dd.'at'.HH.mm.ss");
			String date = DATE_FORMAT.format(d);
			EMFHelper.serializeModel(dc, model + "_" + date, "diffmodel");
			model = "deltaOB";
		}
		
		return dc;

	}
	
}
