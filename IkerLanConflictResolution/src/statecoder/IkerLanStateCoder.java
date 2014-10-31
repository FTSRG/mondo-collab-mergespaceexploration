package statecoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.statecode.IStateSerializer;

import patterns.AddToListMatch;
import patterns.CreateMatch;
import patterns.DeleteMatch;
import patterns.SetAttributeMatch;
import patterns.SetReferenceMatch;
import DiffModel.AddToList;
import DiffModel.Create;
import DiffModel.Delete;
import DiffModel.DiffContainer;
import DiffModel.Identifiable;
import DiffModel.SetAttribute;
import DiffModel.SetReference;
import ModelContainer.MainRoot;
import WTSpecID.CtrlUnit2;
import WTSpecID.IdentifiableWTElement;
import WTSpecID.Subsystem;
import WTSpecID.SystemParam;
import WTSpecID.SystemVariable;
import WTSpecID.WT;
import WTSpecID.wtc;

public class IkerLanStateCoder implements IStateSerializer{

	private IncQueryEngine engine;
	private MainRoot model;
	private WT original;
	private DiffContainer diffOA;
	private DiffContainer diffOB;
	//private Resource model2;

	public IkerLanStateCoder(IncQueryEngine _engine) {
		engine = _engine;
		model = (MainRoot) engine.getScope();
		original = (WT) model.getOriginal();
		diffOA = (DiffContainer) model.getDeltaOA();
		diffOB = (DiffContainer) model.getDeltaOB();
		
//		IncQueryEngine on;
//		try {
//			on = IncQueryEngine.on(model.eResource());
//			model2 = (Resource) on.getScope();
//		} catch (IncQueryException e) {
//			e.printStackTrace();
//		}
		
	}

	@Override
	public Object serializeContainmentTree() {
		
		StringBuilder sb = new StringBuilder();
		
		List<String> ids = new ArrayList<String>();
		
		{
			TreeIterator<EObject> iterator = original.eAllContents();
			for(EObject current = iterator.next(); iterator.hasNext(); current = iterator.next()) {
				IdentifiableWTElement id = (IdentifiableWTElement) current;
				ids.add(id.getID());
			}
		}
		
		{
			TreeIterator<EObject> iterator = diffOA.eAllContents();
			for(EObject current = iterator.next(); iterator.hasNext(); current = iterator.next()) {
				Identifiable id = (Identifiable) current;
				ids.add(id.getId());
			}
		}
		
		{
			TreeIterator<EObject> iterator = diffOB.eAllContents();
			for(EObject current = iterator.next(); iterator.hasNext(); current = iterator.next()) {
				Identifiable id = (Identifiable) current;
				ids.add(id.getId());
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
//		EList<EObject> identifiableWTElements = model.eResource().getContents();
//		
//		sb.append("allIdentifiable:");
//		
//		for (EObject obj : identifiableWTElements) {
//			if(obj instanceof CtrlUnit2) {
//				CtrlUnit2 cu2 = (CtrlUnit2) obj;
//				sb.append("{" + "id: " + cu2.getID()+ "}" + ",");
//			}
//		}
//		
//		
//		EList<Subsystem> subsystems = original.getItsSubsystems();
//
//		sb.append("wtc:");
//		
//		for (Subsystem subsystem : subsystems) {
//			for (wtc _wtc : subsystem.getItsWTCs()) {
//				sb.append("{" + "id: " + _wtc.getID()+ "}" + ",");
//			}
//		}
//		
//		EList<SystemParam> params = original.getItsParams();
//
//		sb.append("|params:");
//		
//		for (SystemParam systemParam : params) {
//			sb.append(systemParam.getID() + ",");
//		}
//		
//		sb.append("|variables:");
//		
//		for (SystemVariable variable : original.getItsVariables()) {
//			sb.append(variable.getID() + ",");
//		}
		
		
		return sb.toString();
	}

	@Override
	public Object serializePatternMatch(IPatternMatch match) {
		StringBuilder sb = new StringBuilder();
		
//		if(match instanceof AllIdentifiableMatch) {
//			AllIdentifiableMatch m = (AllIdentifiableMatch) match;
//			sb.append("AllIdentifiableMatch:");
//			
//			IdentifiableWTElement a = m.getTarget();
//			sb.append(a.getID() + ",");
//			return sb.toString();
//		}
		if(match instanceof CreateMatch){
			CreateMatch m = (CreateMatch) match;
			sb.append("CreateMatch:");
			
			Create op = m.getCreateOp();
			sb.append(op.getId() + ",");
			sb.append(op.getTargetId() + ",");
			sb.append(op.getType() + ",");
//			sb.append(m.getWt().getID());
			return sb.toString();
			
		}
		else if(match instanceof DeleteMatch){
			DeleteMatch m = (DeleteMatch) match;
			sb.append("DeleteMatch:");
			
			Delete op = m.getDeleteOp();
			sb.append(op.getId() + ",");
			sb.append(op.getTargetId() + ",");
			return sb.toString();
			
		}
		else if(match instanceof SetAttributeMatch){
			SetAttributeMatch m = (SetAttributeMatch) match;
			sb.append("SetAttribute:");
			
			SetAttribute op = m.getSetAttrOp();
			sb.append(op.getId() + ",");
			sb.append(op.getTargetId() + ",");
			sb.append(op.getAttribute() + ",");
			sb.append(op.getValue() + ",");
			return sb.toString();
			
		}
		else if(match instanceof SetReferenceMatch){
			SetReferenceMatch m = (SetReferenceMatch) match;
			sb.append("SetReference:");
			
			SetReference op = m.getSetRefOp();
			sb.append(op.getId() + ",");
			sb.append(op.getTargetId() + ",");
			sb.append(op.getRefID() + ",");
			sb.append(op.getReference() + ",");
			return sb.toString();
			
		}
		else if(match instanceof AddToListMatch){
			AddToListMatch m = (AddToListMatch) match;
			sb.append("AddToList:");
			
			AddToList op = m.getAddToListOp();
			sb.append(op.getId() + ",");
			sb.append(op.getTargetId() + ",");
			sb.append(op.getList() + ",");
			sb.append(op.getRefID() + ",");
			return sb.toString();
			
		}
		throw new RuntimeException("Unsupported transformation");
	}

	@Override
	public void resetCache() {
		// TODO Auto-generated method stub
		
	}

}
