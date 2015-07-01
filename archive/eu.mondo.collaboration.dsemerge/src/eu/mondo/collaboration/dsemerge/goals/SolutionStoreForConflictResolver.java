package eu.mondo.collaboration.dsemerge.goals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.viatra.dse.api.Solution;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.api.strategy.interfaces.ISolutionFoundHandler;
import org.eclipse.viatra.dse.base.DesignSpaceManager;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.solutionstore.ISolutionStore;

public class SolutionStoreForConflictResolver implements ISolutionStore {

	private int numberOfStoredTrajectories;
	
	private final HashMap<SolutionTrajectory, ArrayList<Double>> measurements = new HashMap<SolutionTrajectory, ArrayList<Double>>();
    private final HashMap<SolutionTrajectory, Object> stateIds = new HashMap<SolutionTrajectory, Object>();
    private final ArrayList<SolutionTrajectory> solutionsTrajectories = new ArrayList<SolutionTrajectory>();
	
	@Override
	public StopExecutionType newSolution(ThreadContext context,
			Map<String, Double> objectives) {

		ArrayList<Double> measurement = new ArrayList<Double>();
		measurement.add(objectives.get("executables"));
		measurement.add(objectives.get("nonExecutables"));

		if (measurement.get(0) == 0) {
            saveTrajectory(context.getDesignSpaceManager(), measurement);
        }
		
		return StopExecutionType.CONTINUE;
	}

	@Override
	public synchronized Collection<Solution> getSolutions() {
		Map<Object, Solution> solutions = new HashMap<Object, Solution>();

        for (SolutionTrajectory traj : solutionsTrajectories) {
            Object id = stateIds.get(traj);
            Solution solution = solutions.get(id);
            if (solution == null) {
                solution = new Solution(id, traj);
                solutions.put(id, solution);
            } else {
                solution.addTrajectory(traj);
            }
        }

        return solutions.values();
	}

	private void saveTrajectory(DesignSpaceManager dsm, ArrayList<Double> measurement) {
        SolutionTrajectory trajectory = dsm.createSolutionTrajectroy();
        measurements.put(trajectory, measurement);
        solutionsTrajectories.add(trajectory);
        stateIds.put(trajectory, dsm.getCurrentState().getId());
    }

	@Override
	public void registerSolutionFoundHandler(ISolutionFoundHandler handler) {}
}
