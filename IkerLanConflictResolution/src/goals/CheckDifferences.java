package goals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.diffmerge.api.IComparison;
import org.eclipse.emf.diffmerge.api.diff.IDifference;
import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
import org.eclipse.emf.diffmerge.diffdata.impl.EComparisonImpl;
import org.eclipse.emf.diffmerge.impl.policies.DefaultDiffPolicy;
import org.eclipse.emf.diffmerge.impl.policies.DefaultMatchPolicy;
import org.eclipse.emf.diffmerge.impl.policies.DefaultMergePolicy;
import org.eclipse.emf.diffmerge.impl.scopes.FragmentedModelScope;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.dse.api.strategy.interfaces.ICheckGoalState;
import org.eclipse.viatra.dse.base.ThreadContext;

public class CheckDifferences implements ICheckGoalState {

	private Resource original;
	private Resource modA;
	private Resource modB;

	private EPackage actualPackage;
	private Resource.Factory.Registry reg;
	private Map<String, Object> m;

	private IEditableModelScope targetScope;
	private IEditableModelScope referenceScope;
	private IComparison comparison;
	private Collection<IDifference> differences;

	@Override
	public Map<String, Double> isGoalState(ThreadContext context) {

		Map<String, Double> results = new HashMap<String, Double>();
		
		//---------------------------------------------------------
		// Getting number of differences between O and A
		//---------------------------------------------------------
		
		// Getting the scopes of the resources
		targetScope = new FragmentedModelScope(modA, false);
		referenceScope = new FragmentedModelScope(original, false);

		// Creating a Comparison based on the scopes
		comparison = new EComparisonImpl(targetScope, referenceScope);

		// Computing with default policies
		comparison.compute(new DefaultMatchPolicy(), new DefaultDiffPolicy(),
				new DefaultMergePolicy(), new NullProgressMonitor());

		// Getting differences
		differences = comparison.getRemainingDifferences();

		results.put("diffOA", (double) differences.size());
		System.out.println("diffOA: " + differences.size());
		
		//---------------------------------------------------------
		// Getting number of differences between O and B
		//---------------------------------------------------------
		
		// Changing the scope
		targetScope = new FragmentedModelScope(modB, false);
		
		// Creating a Comparison based on the scopes
		comparison = new EComparisonImpl(targetScope, referenceScope);

		// Computing with default policies
		comparison.compute(new DefaultMatchPolicy(), new DefaultDiffPolicy(),
				new DefaultMergePolicy(), new NullProgressMonitor());

		// Getting differences
		differences = comparison.getRemainingDifferences();

		results.put("diffOB", (double) differences.size());
		System.out.println("diffOB: " + differences.size());

		return results;
	}

	public CheckDifferences(Resource O, Resource A, Resource B, EPackage p,
			String modelExtension) {
		original = O;
		modA = A;
		modB = B;

		actualPackage = p;
		actualPackage.eClass();

		// Register the XMI resource factory for the model extension
		reg = Resource.Factory.Registry.INSTANCE;
		m = reg.getExtensionToFactoryMap();
		m.put(modelExtension, new XMIResourceFactoryImpl());
	}

}
