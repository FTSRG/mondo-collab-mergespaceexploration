package statecoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra.dse.statecode.IStateSerializer;

//import patterns.CreateInsteadOfDeleteMatch;
//import patterns.CreateMatch;
//import patterns.DeleteMatch;
//import patterns.ResetAttributeMatch;
//import patterns.ResetReferenceMatch;
//import patterns.SetAttributeMatch;
//import patterns.SetReferenceInsteadOfDeleteMatch;
//import patterns.SetReferenceMatch;
import DiffModel.Create;
import DiffModel.Delete;
import DiffModel.DiffContainer;
import DiffModel.Identifiable;
import DiffModel.ResetAttribute;
import DiffModel.ResetReference;
import DiffModel.SetAttribute;
import DiffModel.SetReference;
import ModelContainer.MainRoot;
import WTSpecID.IdentifiableWTElement;
import WTSpecID.WT;

public class IkerLanStateCoder implements IStateSerializer{

	private IncQueryEngine engine;
	private MainRoot model;
	private WT original;
	private DiffContainer diffOA;
	private DiffContainer diffOB;

	public IkerLanStateCoder(IncQueryEngine _engine) {
		engine = _engine;
		model = (MainRoot) engine.getScope();
		original = (WT) model.getOriginal();
		diffOA = (DiffContainer) model.getDeltaOA();
		diffOB = (DiffContainer) model.getDeltaOB();
		
	}

	@Override
	public Object serializeContainmentTree() {
		
		StringBuilder sb = new StringBuilder();
		
		List<String> ids = new ArrayList<String>();
		
		{
			TreeIterator<EObject> iterator = original.eAllContents();
//			for(EObject current = iterator.next(); iterator.hasNext(); current = iterator.next()) {
//				IdentifiableWTElement id = (IdentifiableWTElement) current;
//				ids.add(id.getID());
//			}
			EObject current;
			while(iterator.hasNext()) {
				current = iterator.next();
				IdentifiableWTElement id = (IdentifiableWTElement) current;
				ids.add(id.getID());
			}
		}
		
		{
			TreeIterator<EObject> iterator = diffOA.eAllContents();
//			for(EObject current = iterator.next(); iterator.hasNext(); current = iterator.next()) {
//				Identifiable id = (Identifiable) current;
//				ids.add(id.getID());
//			}
			EObject current;
			while(iterator.hasNext()) {
				current = iterator.next();
				Identifiable id = (Identifiable) current;
				ids.add(id.getID());
			}
		}
		
		{
			TreeIterator<EObject> iterator = diffOB.eAllContents();
//			for(EObject current = iterator.next(); iterator.hasNext(); current = iterator.next()) {
//				Identifiable id = (Identifiable) current;
//				ids.add(id.getID());
//			}
			EObject current;
			while(iterator.hasNext()) {
				current = iterator.next();
				Identifiable id = (Identifiable) current;
				ids.add(id.getID());
			}
		}
		
		Collections.sort(ids, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);

			}
			
		});
		
		sb.append("All IDs:");
		for (String id : ids) {
			sb.append("{" + "id: " + id+ "}" + ",");
		}
	
		return sb.toString();
	}

	@Override
	public Object serializePatternMatch(IPatternMatch match) {
		StringBuilder sb = new StringBuilder();
		
		if(match instanceof CreateMatch){
			CreateMatch m = (CreateMatch) match;
			sb.append("CreateMatch:");
			
			Create op = m.getCreateOp();
			sb.append(op.getID() + ",");
			sb.append(op.getTargetID() + ",");
			sb.append(op.getType() + ",");
			
			sb.append(op.getAttributes() + ",");
			sb.append(op.getValues() + ",");
			sb.append(op.getContainerTargetID() + ",");
			sb.append(op.getReference() + ",");
			
			return sb.toString();
			
		}
		else if(match instanceof DeleteMatch){
			DeleteMatch m = (DeleteMatch) match;
			sb.append("DeleteMatch:");
			
			Delete op = m.getDeleteOp();
			sb.append(op.getID() + ",");
			sb.append(op.getTargetID() + ",");
			return sb.toString();
			
		}
		else if(match instanceof SetAttributeMatch){
			SetAttributeMatch m = (SetAttributeMatch) match;
			sb.append("SetAttribute:");
			
			SetAttribute op = m.getSetAttrOp();
			sb.append(op.getID() + ",");
			sb.append(op.getTargetID() + ",");
			sb.append(op.getAttribute() + ",");
			sb.append(op.getValue() + ",");
			return sb.toString();
			
		}
		else if(match instanceof SetReferenceMatch){
			SetReferenceMatch m = (SetReferenceMatch) match;
			sb.append("SetReference:");
			
			SetReference op = m.getSetRefOp();
			sb.append(op.getID() + ",");
			sb.append(op.getTargetID() + ",");
			sb.append(op.getRefID() + ",");
			sb.append(op.getReference() + ",");
			return sb.toString();
			
		}
		else if(match instanceof ResetAttributeMatch){
			ResetAttributeMatch m = (ResetAttributeMatch) match;
			sb.append("ResetAttribute:");
			
			ResetAttribute op = m.getResetAttrOp();
			sb.append(op.getID() + ",");
			sb.append(op.getTargetID() + ",");
			sb.append(op.getAttribute() + ",");
			return sb.toString();
			
		}
		else if(match instanceof ResetReferenceMatch){
			ResetReferenceMatch m = (ResetReferenceMatch) match;
			sb.append("ResetReference:");
			
			ResetReference op = m.getResetRefOp();
			sb.append(op.getID() + ",");
			sb.append(op.getTargetID() + ",");
			sb.append(op.getRefID() + ",");
			sb.append(op.getReference() + ",");
			return sb.toString();
			
		}
		else if(match instanceof CreateInsteadOfDeleteMatch){
			CreateInsteadOfDeleteMatch m = (CreateInsteadOfDeleteMatch) match;
			sb.append("CreateInsteadOfDelete:");
			
			Delete opD = m.getDeleteOp();
			Create opC = m.getCreateOp();
			sb.append(opD.getID() + ",");
			sb.append(opD.getTargetID() + ",");
			sb.append(opC.getID() + ",");
			sb.append(opC.getTargetID() + ",");
			sb.append(opC.getType() + ",");
			sb.append(opC.getAttributes() + ",");
			sb.append(opC.getValues() + ",");
			sb.append(opC.getContainerTargetID() + ",");
			sb.append(opC.getReference() + ",");
			return sb.toString();
			
		}
		else if(match instanceof SetReferenceInsteadOfDeleteMatch){
			SetReferenceInsteadOfDeleteMatch m = (SetReferenceInsteadOfDeleteMatch) match;
			sb.append("CreateInsteadOfDelete:");
			
			Delete opD = m.getDeleteOp();
			SetReference opSR = m.getSetRefOp();
			sb.append(opD.getID() + ",");
			sb.append(opD.getTargetID() + ",");
			sb.append(opSR.getID() + ",");
			sb.append(opSR.getTargetID() + ",");
			sb.append(opSR.getReference() + ",");
			sb.append(opSR.getRefID() + ",");
			return sb.toString();
			
		}

		throw new RuntimeException("Unsupported transformation");
	}

	@Override
	public void resetCache() {
		// TODO Auto-generated method stub
		
	}

}
