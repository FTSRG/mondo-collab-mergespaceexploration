package eu.mondo.collaboration.dsemerge.goals;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.dse.api.strategy.interfaces.ICheckGoalState;
import org.eclipse.viatra.dse.base.ThreadContext;

import DiffModel.Identifiable;
import ModelContainer.MainRoot;

public class GoalChecker implements ICheckGoalState {

	@Override
	public Map<String, Double> isGoalState(ThreadContext context) {

		Map<String, Double> values = new HashMap<String, Double>();
		
		MainRoot modelRoot = (MainRoot) context.getModelRoot();
		
		double executables = 0;
		double nonExecutables = 0;
		Identifiable id;
		boolean executable;
		
		EList<EObject> deltaOAElements = modelRoot.getDeltaOA().eContents();
		EList<EObject> deltaOBElements = modelRoot.getDeltaOB().eContents();
		
		for(EObject obj : deltaOAElements) {
			if(obj instanceof Identifiable) {
				id = (Identifiable) obj;
				executable = id.isExecutable();
				if(executable)
					executables++;
				else if(!executable)
					nonExecutables++;
			}
		}
		
		for(EObject obj : deltaOBElements) {
			if(obj instanceof Identifiable) {
				id = (Identifiable) obj;
				executable = id.isExecutable();
				if(executable)
					executables++;
				else if(!executable)
					nonExecutables++;
			}
		}
		
		values.put("executables", executables);
		values.put("nonExecutables", nonExecutables);
		
		return values;
	}

}
