package goals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import org.eclipse.viatra.dse.api.Solution;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.base.DesignSpaceManager;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.solutionstore.ISolutionStore;

public class DifferencesSolutionStore implements ISolutionStore {

	private int numberOfStoredTrajectories;
	
	private final HashMap<SolutionTrajectory, ArrayList<Double>> differences = new HashMap<SolutionTrajectory, ArrayList<Double>>();
    private final HashMap<SolutionTrajectory, Object> stateIds = new HashMap<SolutionTrajectory, Object>();
    private final TreeSet<SolutionTrajectory> solutionsTrajectories = new TreeSet<SolutionTrajectory>(
            new Comparator<SolutionTrajectory>() {
                @Override
                public int compare(SolutionTrajectory o1, SolutionTrajectory o2) {
                	ArrayList<Double> a1 = differences.get(o1);
                	ArrayList<Double> a2 = differences.get(o2);
                	
                	Double d1 = a1.get(0) + a1.get(1);
                	Double d2 = a2.get(0) + a2.get(1);
                	
                    return d1.compareTo(d2);
                }
            });
	
	@Override
	public synchronized Solution newSolution(ThreadContext context,
			Map<String, Double> measurements) {

		ArrayList<Double> difference = new ArrayList<Double>();
		difference.add(measurements.get("diffOA"));
		difference.add(measurements.get("diffOB"));
		
		Double diff = difference.get(0) + difference.get(1);

        if (numberOfStoredTrajectories == 0) {
            saveTrajectory(context.getDesignSpaceManager(), difference);
            numberOfStoredTrajectories++;
        } else if (differences.get(solutionsTrajectories.first()).get(0) + differences.get(solutionsTrajectories.first()).get(1) <= diff) {
            return null;
        } else {
            SolutionTrajectory worst = solutionsTrajectories.pollFirst();
            differences.remove(worst);
            stateIds.remove(worst);
            saveTrajectory(context.getDesignSpaceManager(), difference);
        }
        return null;
		
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
	
	private void saveTrajectory(DesignSpaceManager dsm, ArrayList<Double> difference) {
        SolutionTrajectory trajectory = dsm.createSolutionTrajectroy();
        differences.put(trajectory, difference);
        solutionsTrajectories.add(trajectory);
        stateIds.put(trajectory, dsm.getCurrentState().getId());
    }

}
