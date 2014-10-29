package conflictresolution;

//import static org.junit.Assert.*;
import goals.CheckDifferences;
import goals.DifferencesSolutionStore;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.Solution;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.api.Strategies;
import org.eclipse.viatra.dse.api.strategy.Strategy;
import org.eclipse.viatra.dse.base.DesignSpaceManager;
import org.eclipse.viatra.dse.statecode.incrementalgraph.IncrementalGraphHasherFactory;
import org.junit.Test;

import rules.AddToList;
import rules.CreateElement;
import rules.DeleteElement;
import rules.RemoveFromList;
import rules.ResetAttribute;
import rules.ResetReference;
import rules.SetAttribute;
import rules.SetReference;
import DiffModel.DiffContainer;
import DiffModel.DiffModelPackage;
import ModelContainer.MainRoot;
import ModelContainer.ModelContainerFactory;
import ModelContainer.ModelContainerPackage;
import WTSpecID.WT;
import WTSpecID.WTSpecIDPackage;

public class ConflictResolutionTest {

	@Test
	public void test() throws IncQueryException {
		
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.ERROR);
		Logger.getLogger(DesignSpaceManager.class).setLevel(Level.DEBUG);

		DesignSpaceExplorer dse = new DesignSpaceExplorer();

		ResourceSet rS = new ResourceSetImpl();

		String modelExtension = "wtspecid";
		
		// loading models
		Resource original = rS.getResource(URI.createPlatformPluginURI(
				"/IkerLanConflictResolution/instancemodels/original.wtspecid",
				true), true);
		
		Resource modA = rS.getResource(URI.createPlatformPluginURI(
				"/IkerLanConflictResolution/instancemodels/A.wtspecid", true),
				true);

		Resource modB = rS.getResource(URI.createPlatformPluginURI(
				"/IkerLanConflictResolution/instancemodels/B.wtspecid", true),
				true);

		Resource deltaOA = rS.getResource(URI.createPlatformPluginURI(
				"/IkerLanConflictResolution/instancemodels/deltaOA.diffmodel",
				true), true);

		Resource deltaOB = rS.getResource(URI.createPlatformPluginURI(
				"/IkerLanConflictResolution/instancemodels/deltaOB.diffmodel",
				true), true);

//		Resource originalWithDeltas = rS
//				.getResource(
//						URI.createPlatformPluginURI(
//								"/IkerLanConflictResolution/instancemodels/empty.modelcontainer",
//								true), true);

		
		// appending models for IncQuery
		//MainRoot mainRoot = (MainRoot) originalWithDeltas.getContents().get(0);
		MainRoot mainRoot = ModelContainerFactory.eINSTANCE.createMainRoot();
		
		WT originalRoot = (WT) original.getContents().get(0);
		DiffContainer deltaOBRoot = (DiffContainer) deltaOB.getContents().get(0);
		DiffContainer deltaOARoot = (DiffContainer) deltaOA.getContents().get(0);

		mainRoot.setOriginal(originalRoot);
		mainRoot.setDeltaOA(deltaOARoot);
		mainRoot.setDeltaOB(deltaOBRoot);

		dse.setStartingModel(mainRoot);

		// TODO setting MaxNumberOfThreads
		//dse.setMaxNumberOfThreads(1);

		// adding metamodel packages
		dse.addMetaModelPackage(ModelContainerPackage.eINSTANCE);
		dse.addMetaModelPackage(WTSpecIDPackage.eINSTANCE);
		dse.addMetaModelPackage(DiffModelPackage.eINSTANCE);

		dse.setSerializerFactory(new IncrementalGraphHasherFactory(
				dse.getMetaModelPackages()));

		// adding rules
		dse.addTransformationRule(CreateElement.createRule());
		dse.addTransformationRule(DeleteElement.createRule());
		dse.addTransformationRule(SetAttribute.createRule());
		dse.addTransformationRule(SetReference.createRule());
		dse.addTransformationRule(ResetAttribute.createRule());
		dse.addTransformationRule(ResetReference.createRule());
		dse.addTransformationRule(AddToList.createRule());
		dse.addTransformationRule(RemoveFromList.createRule());

		dse.setSolutionStore(new DifferencesSolutionStore());
		
		boolean waitForTermination = true;
		Strategy strategy = Strategies.createDFSStrategy();
		
		strategy.setGoalStateChecker(
				new CheckDifferences(original, modA, modB,
						WTSpecIDPackage.eINSTANCE, modelExtension));
		
		System.out.println("BEFORE startExploration");
		
		dse.startExploration(strategy, waitForTermination);

		System.out.println("AFTER startExploration");
		
		Collection<Solution> solutions = dse.getAllSolutions();
		OutputStream output;
		int s = 0;
		
		if (!solutions.isEmpty()) {
			Solution solution = dse.getAllSolutions().iterator().next();
			SolutionTrajectory solutionTrajectory = solution
					.getArbitraryTrajectory();
			// Transform the model
			// TODO maybe this should be the mainRoot instead of originalRoot
			solutionTrajectory.setModel(IncQueryEngine.on(originalRoot));
			solutionTrajectory.doTransformation();

			try {
				output = new FileOutputStream(
						"C:\\Users\\Marci\\Desktop\\solutions\\solution" + s++
								+ ".wtspecid");

				original.save(output, null);

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}

}
