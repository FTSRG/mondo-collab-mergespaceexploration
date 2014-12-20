package eu.mondo.collaboration.dsemerge.statecoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra.dse.statecode.IStateSerializer;

import eu.mondo.collaboration.dsemerge.patterns.CreateMatch;
import eu.mondo.collaboration.dsemerge.patterns.CreateVSDeleteMatch;
import eu.mondo.collaboration.dsemerge.patterns.DeleteMatch;
import eu.mondo.collaboration.dsemerge.patterns.DeleteVSCreateMatch;
import eu.mondo.collaboration.dsemerge.patterns.DeleteVSMoveMatch;
import eu.mondo.collaboration.dsemerge.patterns.DeleteVSSetAttrMatch;
import eu.mondo.collaboration.dsemerge.patterns.DeleteVSSetRefMatch;
import eu.mondo.collaboration.dsemerge.patterns.MoveMatch;
import eu.mondo.collaboration.dsemerge.patterns.MoveVSDeleteMatch;
import eu.mondo.collaboration.dsemerge.patterns.MoveVSMoveMatch;
import eu.mondo.collaboration.dsemerge.patterns.NonExecCreateAndExecSetRefWithSameTargetMatch;
import eu.mondo.collaboration.dsemerge.patterns.SetAttrVSDeleteMatch;
import eu.mondo.collaboration.dsemerge.patterns.SetAttrVSSetAttrMatch;
import eu.mondo.collaboration.dsemerge.patterns.SetAttributeMatch;
import eu.mondo.collaboration.dsemerge.patterns.SetRefVSDeleteMatch;
import eu.mondo.collaboration.dsemerge.patterns.SetRefVSSetRefMatch;
import eu.mondo.collaboration.dsemerge.patterns.SetReferenceMatch;
import wtspecid.IdentifiableWTElement;
import wtspecid.WT;
import DiffModel.Create;
import DiffModel.Delete;
import DiffModel.DiffContainer;
import DiffModel.Identifiable;
import DiffModel.Move;
import DiffModel.SetAttribute;
import DiffModel.SetReference;
import ModelContainer.MainRoot;

public class IkerLanStateCoder implements IStateSerializer{

	private IncQueryEngine engine;
	private MainRoot model;
	private WT original;
	private DiffContainer deltaOA;
	private DiffContainer deltaOB;

	public IkerLanStateCoder(IncQueryEngine _engine) {
		engine = _engine;
		model = (MainRoot) engine.getScope();
		original = (WT) model.getOriginal();
		deltaOA = (DiffContainer) model.getDeltaOA();
		deltaOB = (DiffContainer) model.getDeltaOB();
		
	}

	@Override
	public Object serializeContainmentTree() {
		
		StringBuilder sb = new StringBuilder();
		
		List<String> ids = new ArrayList<String>();
		
		{
			TreeIterator<EObject> iterator = original.eAllContents();
			EObject current;
			while(iterator.hasNext()) {
				current = iterator.next();
				IdentifiableWTElement id = (IdentifiableWTElement) current;
				ids.add(id.getID());
			}
		}
		
		{
			TreeIterator<EObject> iterator = deltaOA.eAllContents();
			EObject current;
			while(iterator.hasNext()) {
				current = iterator.next();
				Identifiable id = (Identifiable) current;
				ids.add(id.getID()  
						+ "_eliminated: " + id.isEliminated()
						+ "_executable: " + id.isExecutable()
						);
			}
		}
		
		{
			TreeIterator<EObject> iterator = deltaOB.eAllContents();
			EObject current;
			while(iterator.hasNext()) {
				current = iterator.next();
				Identifiable id = (Identifiable) current;
				ids.add(id.getID()  
						+ "_eliminated: " + id.isEliminated()
						+ "_executable: " + id.isExecutable()
						);
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
			sb.append(op.isEliminated() + ",");
			sb.append(op.isExecutable() + ",");
			
			return sb.toString();
			
		}
		else if(match instanceof MoveMatch){
			MoveMatch m = (MoveMatch) match;
			sb.append("MoveMatch:");
			
			Move op = m.getMoveOp();
			sb.append(op.getID() + ",");
			sb.append(op.getTargetID() + ",");
			sb.append(op.getContainerTargetID() + ",");
			sb.append(op.getReference() + ",");
			sb.append(op.isEliminated() + ",");
			sb.append(op.isExecutable() + ",");
			
			return sb.toString();
			
		}
		else if(match instanceof DeleteMatch){
			DeleteMatch m = (DeleteMatch) match;
			sb.append("DeleteMatch:");
			
			Delete op = m.getDeleteOp();
			sb.append(op.getID() + ",");
			sb.append(op.getTargetID() + ",");
			sb.append(op.isEliminated() + ",");
			sb.append(op.isExecutable() + ",");
			
			return sb.toString();
			
		}
		else if(match instanceof SetAttributeMatch){
			SetAttributeMatch m = (SetAttributeMatch) match;
			sb.append("SetAttributeMatch:");
			
			SetAttribute op = m.getSetAttrOp();
			sb.append(op.getID() + ",");
			sb.append(op.getTargetID() + ",");
			sb.append(op.getAttribute() + ",");
			sb.append(op.getValue() + ",");
			sb.append(op.isEliminated() + ",");
			sb.append(op.isExecutable() + ",");
			
			return sb.toString();
			
		}
		else if(match instanceof SetReferenceMatch){
			SetReferenceMatch m = (SetReferenceMatch) match;
			sb.append("SetReferenceMatch:");
			
			SetReference op = m.getSetRefOp();
			sb.append(op.getID() + ",");
			sb.append(op.getTargetID() + ",");
			sb.append(op.getRefID() + ",");
			sb.append(op.getReference() + ",");
			sb.append(op.isEliminated() + ",");
			sb.append(op.isExecutable() + ",");
			SetReference op2 = m.getSetRefOp();
			sb.append(op2.getID() + ",");
			sb.append(op2.getTargetID() + ",");
			sb.append(op2.getRefID() + ",");
			sb.append(op2.getReference() + ",");
			sb.append(op2.isEliminated() + ",");
			sb.append(op2.isExecutable() + ",");
			
			return sb.toString();
			
		}
		else if(match instanceof CreateVSDeleteMatch){
			CreateVSDeleteMatch m = (CreateVSDeleteMatch) match;
			sb.append("CreateVSDeleteMatch:");
			
			Delete opD = m.getDeleteOp();
			Create opC = m.getCreateOp();
			sb.append(opD.getID() + ",");
			sb.append(opD.getTargetID() + ",");
			sb.append(opD.isEliminated() + ",");
			sb.append(opD.isExecutable() + ",");
			sb.append(opC.getID() + ",");
			sb.append(opC.getTargetID() + ",");
			sb.append(opC.getType() + ",");
			sb.append(opC.getAttributes() + ",");
			sb.append(opC.getValues() + ",");
			sb.append(opC.getContainerTargetID() + ",");
			sb.append(opC.getReference() + ",");
			sb.append(opC.isEliminated() + ",");
			sb.append(opC.isExecutable() + ",");
			
			return sb.toString();
			
		}
		else if(match instanceof DeleteVSCreateMatch){
			DeleteVSCreateMatch m = (DeleteVSCreateMatch) match;
			sb.append("DeleteVSCreateMatch:");
			
			Delete opD = m.getDeleteOp();
			Create opC = m.getCreateOp();
			sb.append(opD.getID() + ",");
			sb.append(opD.getTargetID() + ",");
			sb.append(opD.isEliminated() + ",");
			sb.append(opD.isExecutable() + ",");
			sb.append(opC.getID() + ",");
			sb.append(opC.getTargetID() + ",");
			sb.append(opC.getType() + ",");
			sb.append(opC.getAttributes() + ",");
			sb.append(opC.getValues() + ",");
			sb.append(opC.getContainerTargetID() + ",");
			sb.append(opC.getReference() + ",");
			sb.append(opC.isEliminated() + ",");
			sb.append(opC.isExecutable() + ",");
			
			return sb.toString();
			
		}
		else if(match instanceof SetRefVSDeleteMatch){
			SetRefVSDeleteMatch m = (SetRefVSDeleteMatch) match;
			sb.append("SetRefVSDeleteMatch:");
			
			Delete opD = m.getDeleteOp();
			SetReference opSR = m.getSetRefOp();
			sb.append(opD.getID() + ",");
			sb.append(opD.getTargetID() + ",");
			sb.append(opD.isEliminated() + ",");
			sb.append(opD.isExecutable() + ",");
			sb.append(opSR.getID() + ",");
			sb.append(opSR.getTargetID() + ",");
			sb.append(opSR.getReference() + ",");
			sb.append(opSR.getRefID() + ",");
			sb.append(opSR.isEliminated() + ",");
			sb.append(opSR.isExecutable() + ",");
			//sb.append("true" + ",");
			
			return sb.toString();
			
		}
		else if(match instanceof DeleteVSSetRefMatch){
			DeleteVSSetRefMatch m = (DeleteVSSetRefMatch) match;
			sb.append("DeleteVSSetRefMatch:");
			
			Delete opD = m.getDeleteOp();
			SetReference opSR = m.getSetRefOp();
			sb.append(opD.getID() + ",");
			sb.append(opD.getTargetID() + ",");
			sb.append(opD.isEliminated() + ",");
			sb.append(opD.isExecutable() + ",");
			sb.append(opSR.getID() + ",");
			sb.append(opSR.getTargetID() + ",");
			sb.append(opSR.getReference() + ",");
			sb.append(opSR.getRefID() + ",");
			sb.append(opSR.isEliminated() + ",");
			sb.append(opSR.isExecutable() + ",");
			
			return sb.toString();
			
		}
		else if(match instanceof NonExecCreateAndExecSetRefWithSameTargetMatch){
			NonExecCreateAndExecSetRefWithSameTargetMatch m = (NonExecCreateAndExecSetRefWithSameTargetMatch) match;
			sb.append("NonExecCreateAndExecSetRefWithSameTargetMatch:");
			
			SetReference opSR = m.getSetRefOp();
			Create opC = m.getCreateOp();
			sb.append(opSR.getID() + ",");
			sb.append(opSR.getTargetID() + ",");
			sb.append(opSR.getReference() + ",");
			sb.append(opSR.getRefID() + ",");
			sb.append(opSR.isEliminated() + ",");
			sb.append(opSR.isExecutable() + ",");
			sb.append(opC.getID() + ",");
			sb.append(opC.getTargetID() + ",");
			sb.append(opC.getType() + ",");
			sb.append(opC.getAttributes() + ",");
			sb.append(opC.getValues() + ",");
			sb.append(opC.getContainerTargetID() + ",");
			sb.append(opC.getReference() + ",");
			sb.append(opC.isEliminated() + ",");
			sb.append(opC.isExecutable() + ",");
			
			return sb.toString();
			
		}
		else if(match instanceof SetAttrVSDeleteMatch){
			SetAttrVSDeleteMatch m = (SetAttrVSDeleteMatch) match;
			sb.append("SetAttrVSDeleteMatch:");
			
			Delete opD = m.getDeleteOp();
			SetAttribute opSA = m.getSetAttrOp();
			sb.append(opD.getID() + ",");
			sb.append(opD.getTargetID() + ",");
			sb.append(opD.isEliminated() + ",");
			sb.append(opD.isExecutable() + ",");
			sb.append(opSA.getID() + ",");
			sb.append(opSA.getTargetID() + ",");
			sb.append(opSA.getAttribute() + ",");
			sb.append(opSA.getValue() + ",");
			sb.append(opSA.isEliminated() + ",");
			sb.append(opSA.isExecutable() + ",");
			
			return sb.toString();
			
		}
		else if(match instanceof DeleteVSSetAttrMatch){
			DeleteVSSetAttrMatch m = (DeleteVSSetAttrMatch) match;
			sb.append("DeleteVSSetAttrMatch:");
			
			Delete opD = m.getDeleteOp();
			SetAttribute opSA = m.getSetAttrOp();
			sb.append(opD.getID() + ",");
			sb.append(opD.getTargetID() + ",");
			sb.append(opD.isEliminated() + ",");
			sb.append(opD.isExecutable() + ",");
			sb.append(opSA.getID() + ",");
			sb.append(opSA.getTargetID() + ",");
			sb.append(opSA.getAttribute() + ",");
			sb.append(opSA.getValue() + ",");
			sb.append(opSA.isEliminated() + ",");
			sb.append(opSA.isExecutable() + ",");
			
			return sb.toString();
			
		}
		else if(match instanceof SetAttrVSSetAttrMatch){
			SetAttrVSSetAttrMatch m = (SetAttrVSSetAttrMatch) match;
			sb.append("SetAttrVSSetAttrMatch:");
			
			SetAttribute op1 = m.getSetAttrOp();
			SetAttribute op2 = m.getSetAttrOp2();
			sb.append(op1.getID() + ",");
			sb.append(op1.getTargetID() + ",");
			sb.append(op1.getAttribute() + ",");
			sb.append(op1.getValue() + ",");
			sb.append(op1.isEliminated() + ",");
			sb.append(op1.isExecutable() + ",");
			sb.append(op2.getID() + ",");
			sb.append(op2.getTargetID() + ",");
			sb.append(op2.getAttribute() + ",");
			sb.append(op2.getValue() + ",");
			sb.append(op2.isEliminated() + ",");
			sb.append(op2.isExecutable() + ",");
			
			return sb.toString();
			
		}
		else if(match instanceof SetRefVSSetRefMatch){
			SetRefVSSetRefMatch m = (SetRefVSSetRefMatch) match;
			sb.append("SetRefVSSetRefMatch:");
			
			SetReference op1 = m.getSetRefOp();
			SetReference op2 = m.getSetRefOp2();
			sb.append(op1.getID() + ",");
			sb.append(op1.getTargetID() + ",");
			sb.append(op1.getRefID() + ",");
			sb.append(op1.getReference() + ",");
			sb.append(op1.isEliminated() + ",");
			sb.append(op1.isExecutable() + ",");
			sb.append(op2.getID() + ",");
			sb.append(op2.getTargetID() + ",");
			sb.append(op2.getRefID() + ",");
			sb.append(op2.getReference() + ",");
			sb.append(op2.isEliminated() + ",");
			sb.append(op2.isExecutable() + ",");
			
			return sb.toString();
			
		}
		else if(match instanceof MoveVSMoveMatch){
			MoveVSMoveMatch m = (MoveVSMoveMatch) match;
			sb.append("MoveVSMoveMatch:");
			
			Move op1 = m.getMoveOp();
			Move op2 = m.getMoveOp2();
			sb.append(op1.getID() + ",");
			sb.append(op1.getTargetID() + ",");
			sb.append(op1.getContainerTargetID() + ",");
			sb.append(op1.getReference() + ",");
			sb.append(op1.isEliminated() + ",");
			sb.append(op1.isExecutable() + ",");
			sb.append(op2.getID() + ",");
			sb.append(op2.getTargetID() + ",");
			sb.append(op2.getContainerTargetID() + ",");
			sb.append(op2.getReference() + ",");
			sb.append(op2.isEliminated() + ",");
			sb.append(op2.isExecutable() + ",");
			
			return sb.toString();
			
		}
		else if(match instanceof MoveVSDeleteMatch){
			MoveVSDeleteMatch m = (MoveVSDeleteMatch) match;
			sb.append("MoveVSDeleteMatch:");
			
			Delete opD = m.getDeleteOp();
			Move opM = m.getMoveOp();
			sb.append(opD.getID() + ",");
			sb.append(opD.getTargetID() + ",");
			sb.append(opD.isEliminated() + ",");
			sb.append(opD.isExecutable() + ",");
			sb.append(opM.getID() + ",");
			sb.append(opM.getTargetID() + ",");
			sb.append(opM.getContainerTargetID() + ",");
			sb.append(opM.getReference() + ",");
			sb.append(opM.isEliminated() + ",");
			sb.append(opM.isExecutable() + ",");
			
			return sb.toString();
			
		}
		else if(match instanceof DeleteVSMoveMatch){
			DeleteVSMoveMatch m = (DeleteVSMoveMatch) match;
			sb.append("DeleteVSMoveMatch:");
			
			Delete opD = m.getDeleteOp();
			Move opM = m.getMoveOp();
			sb.append(opD.getID() + ",");
			sb.append(opD.getTargetID() + ",");
			sb.append(opD.isEliminated() + ",");
			sb.append(opD.isExecutable() + ",");
			sb.append(opM.getID() + ",");
			sb.append(opM.getTargetID() + ",");
			sb.append(opM.getContainerTargetID() + ",");
			sb.append(opM.getReference() + ",");
			sb.append(opM.isEliminated() + ",");
			sb.append(opM.isExecutable() + ",");
			
			return sb.toString();
			
		}
		
		throw new RuntimeException("Unsupported transformation");
	}

	@Override
	public void resetCache() {
		// TODO Auto-generated method stub
		
	}
	
}
