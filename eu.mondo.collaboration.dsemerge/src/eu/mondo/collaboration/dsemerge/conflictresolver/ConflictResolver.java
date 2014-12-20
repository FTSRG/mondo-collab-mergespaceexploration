package eu.mondo.collaboration.dsemerge.conflictresolver;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.Solution;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.api.Strategies;
import org.eclipse.viatra.dse.api.TransformationRule;
import org.eclipse.viatra.dse.api.strategy.Strategy;
import org.eclipse.viatra.dse.base.DesignSpaceManager;
import org.eclipse.viatra.dse.designspace.impl.pojo.ConcurrentDesignSpace;
import org.eclipse.viatra.dse.util.EMFHelper;
import org.junit.Test;

import wtspecid.WT;
import wtspecid.WtspecidPackage;
import DiffModel.DiffContainer;
import DiffModel.DiffModelPackage;
import ModelContainer.MainRoot;
import ModelContainer.ModelContainerFactory;
import ModelContainer.ModelContainerPackage;
import eu.mondo.collaboration.dsemerge.diffmodelgenerator.DiffModelGenerator;
import eu.mondo.collaboration.dsemerge.goals.GoalChecker;
import eu.mondo.collaboration.dsemerge.goals.SolutionStoreForConflictResolver;
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
import eu.mondo.collaboration.dsemerge.patterns.SetAttrVSDeleteMatch;
import eu.mondo.collaboration.dsemerge.patterns.SetAttrVSSetAttrMatch;
import eu.mondo.collaboration.dsemerge.patterns.SetAttributeMatch;
import eu.mondo.collaboration.dsemerge.patterns.SetRefVSDeleteMatch;
import eu.mondo.collaboration.dsemerge.patterns.SetRefVSSetRefMatch;
import eu.mondo.collaboration.dsemerge.patterns.SetReferenceMatch;
import eu.mondo.collaboration.dsemerge.rules.basic.CreateElement;
import eu.mondo.collaboration.dsemerge.rules.basic.DeleteElement;
import eu.mondo.collaboration.dsemerge.rules.basic.MoveElement;
import eu.mondo.collaboration.dsemerge.rules.basic.SetAttributeOnElement;
import eu.mondo.collaboration.dsemerge.rules.basic.SetReferenceOnElement;
import eu.mondo.collaboration.dsemerge.rules.helper.CreateVSDelete;
import eu.mondo.collaboration.dsemerge.rules.helper.DeleteVSCreate;
import eu.mondo.collaboration.dsemerge.rules.helper.DeleteVSMove;
import eu.mondo.collaboration.dsemerge.rules.helper.DeleteVSSetAttr;
import eu.mondo.collaboration.dsemerge.rules.helper.DeleteVSSetRef;
import eu.mondo.collaboration.dsemerge.rules.helper.MoveVSDelete;
import eu.mondo.collaboration.dsemerge.rules.helper.MoveVSMove;
import eu.mondo.collaboration.dsemerge.rules.helper.SetAttrVSDelete;
import eu.mondo.collaboration.dsemerge.rules.helper.SetAttrVSSetAttr;
import eu.mondo.collaboration.dsemerge.rules.helper.SetRefVSDelete;
import eu.mondo.collaboration.dsemerge.rules.helper.SetRefVSSetRef;
import eu.mondo.collaboration.dsemerge.statecoder.IkerLanStateCoderFactory;

public class ConflictResolver {

	@Test
	public void conflictResolution() throws IncQueryException {

		// Configuring loggers
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.OFF);
		Logger.getLogger(DesignSpaceManager.class).setLevel(Level.OFF);
		Logger.getLogger(ConcurrentDesignSpace.class).setLevel(Level.OFF);

		DesignSpaceExplorer dse = new DesignSpaceExplorer();
		DiffModelGenerator dmg = new DiffModelGenerator();

		ResourceSet rS = new ResourceSetImpl();

		// loading models
		Resource original = rS
				.getResource(
						URI.createPlatformPluginURI(
								"/eu.mondo.collaboration.dsemerge/instancemodels/original.wtspecid",
								true), true);

		Resource modA = rS.getResource(URI.createPlatformPluginURI(
				"/eu.mondo.collaboration.dsemerge/instancemodels/A.wtspecid",
				true), true);

		Resource modB = rS.getResource(URI.createPlatformPluginURI(
				"/eu.mondo.collaboration.dsemerge/instancemodels/B.wtspecid",
				true), true);

		DiffContainer deltaOA_gen = (DiffContainer) dmg.generateDiffModel(
				"instancemodels/original.wtspecid",
				"instancemodels/A.wtspecid", true);
		DiffContainer deltaOB_gen = (DiffContainer) dmg.generateDiffModel(
				"instancemodels/original.wtspecid",
				"instancemodels/B.wtspecid", true);

		MainRoot mainRoot = ModelContainerFactory.eINSTANCE.createMainRoot();

		WT originalRoot = (WT) original.getContents().get(0);

		mainRoot.setOriginal(originalRoot);
		mainRoot.setDeltaOA(deltaOA_gen);
		mainRoot.setDeltaOB(deltaOB_gen);

		dse.setStartingModel(mainRoot);

		// adding metamodel packages
		dse.addMetaModelPackage(ModelContainerPackage.eINSTANCE);
		dse.addMetaModelPackage(WtspecidPackage.eINSTANCE);
		dse.addMetaModelPackage(DiffModelPackage.eINSTANCE);

		dse.setSerializerFactory(new IkerLanStateCoderFactory());

		TransformationRule<CreateMatch> createElement = CreateElement
				.createRule();
		TransformationRule<DeleteMatch> deleteElement = DeleteElement
				.createRule();
		TransformationRule<MoveMatch> moveElement = MoveElement.createRule();
		TransformationRule<SetAttributeMatch> setAttributeOnElement = SetAttributeOnElement
				.createRule();
		TransformationRule<SetReferenceMatch> setReferenceOnElement = SetReferenceOnElement
				.createRule();

		TransformationRule<CreateVSDeleteMatch> createVSDelete = CreateVSDelete
				.createRule();
		TransformationRule<DeleteVSCreateMatch> deleteVSCreate = DeleteVSCreate
				.createRule();
		TransformationRule<MoveVSDeleteMatch> moveVSDelete = MoveVSDelete
				.createRule();
		TransformationRule<DeleteVSMoveMatch> deleteVSMove = DeleteVSMove
				.createRule();
		TransformationRule<SetAttrVSDeleteMatch> setAttrVSDelete = SetAttrVSDelete
				.createRule();
		TransformationRule<DeleteVSSetAttrMatch> deleteVSSetAttr = DeleteVSSetAttr
				.createRule();
		TransformationRule<SetRefVSDeleteMatch> setRefVSDelete = SetRefVSDelete
				.createRule();
		TransformationRule<DeleteVSSetRefMatch> deleteVSSetRef = DeleteVSSetRef
				.createRule();

		TransformationRule<SetAttrVSSetAttrMatch> setAttrVSSetAttr = SetAttrVSSetAttr
				.createRule();
		TransformationRule<SetRefVSSetRefMatch> setRefVSSetRef = SetRefVSSetRef
				.createRule();
		TransformationRule<MoveVSMoveMatch> moveVSMove = MoveVSMove
				.createRule();

		// adding basic rules
		dse.addTransformationRule(createElement);
		dse.addTransformationRule(deleteElement);
		dse.addTransformationRule(moveElement);
		dse.addTransformationRule(setAttributeOnElement);
		dse.addTransformationRule(setReferenceOnElement);
		// adding helper rules
		dse.addTransformationRule(createVSDelete);
		dse.addTransformationRule(deleteVSCreate);
		dse.addTransformationRule(moveVSDelete);
		dse.addTransformationRule(deleteVSMove);
		dse.addTransformationRule(setAttrVSDelete);
		dse.addTransformationRule(deleteVSSetAttr);
		dse.addTransformationRule(setRefVSDelete);
		dse.addTransformationRule(deleteVSSetRef);
		
		dse.addTransformationRule(setAttrVSSetAttr);
		dse.addTransformationRule(setRefVSSetRef);
		dse.addTransformationRule(moveVSMove);

		// setting solution and goal parameters
		dse.setSolutionStore(new SolutionStoreForConflictResolver());

		boolean waitForTermination = true;
		Strategy strategy = Strategies.createDFSStrategy(-1);
		strategy.setGoalStateChecker(new GoalChecker());

		System.out.println("Design Space Exploration is running...");
		dse.startExploration(strategy, waitForTermination);
		System.out.println("Design Space Exploration is done.");

		Collection<Solution> solutions = dse.getAllSolutions();
		System.out.println("solutions:" + solutions.size());
		int s = 1;

		System.out.println("states: " + dse.getNumberOfStates());

		if (!solutions.isEmpty()) {
			for (Solution solution : solutions) {
				SolutionTrajectory solutionTrajectory = solution
						.getShortestTrajectory();

				Collection<SolutionTrajectory> trajectories = solution
						.getTrajectories();

				MainRoot copyMainRoot = (MainRoot) EcoreUtil.copy(mainRoot);

				// Transform the model
				solutionTrajectory.setModel(IncQueryEngine.on(copyMainRoot));
				try {
					solutionTrajectory.doTransformation();
				} catch (Exception e) {
					e.printStackTrace();
				}

				// Serilize solutions
				Date d = new Date();
				SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(
						"MM.dd.'at'.HH.mm.ss");
				String date = DATE_FORMAT.format(d);

				EMFHelper.serializeModel(copyMainRoot.getOriginal(), date
						+ "_solution" + "_Number" + s, "wtspecid");
				EMFHelper.serializeModel(copyMainRoot.getDeltaOA(), date
						+ "_nonExOpDeltaOA" + "_Number" + s, "wtspecid");
				EMFHelper.serializeModel(copyMainRoot.getDeltaOB(), date
						+ "_nonExOpDeltaOB" + "_Number" + s++, "wtspecid");

				System.out.println("serialization_" + (s - 1) + "_is_done");
			}

		}

	}

}
