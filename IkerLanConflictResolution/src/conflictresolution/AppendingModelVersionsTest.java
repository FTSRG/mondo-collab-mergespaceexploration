package conflictresolution;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.junit.Test;

import WTSpecID.WTSpecIDFactory;
import WTSpecID.WT;
import DiffModel.DiffContainer;
//import versioncontainer.MainRoot;
import ModelContainer.MainRoot;

public class AppendingModelVersionsTest {

	@Test
	public void appendingModelsTest() throws IncQueryException {
		
		System.out.println("Appending original and deltas (deltaOA, deltaOB) of a WTid intancemodel... ");
		
		// Creating resources...
		
		ResourceSet rS = new ResourceSetImpl();
		
//		ResourceSet remoteRS = new ResourceSetImpl();
//		
//		ResourceSet localRS = new ResourceSetImpl();
		
		Resource original = rS.getResource(
				URI.createPlatformPluginURI("/IkerLanConflictResolution/instancemodels/original.wtspecid", true), true);
		
		Resource deltaOB = rS.getResource(
				URI.createPlatformPluginURI("/IkerLanConflictResolution/instancemodels/deltaOB.diffmodel", true), true);
		
		Resource deltaOA = rS.getResource(
				URI.createPlatformPluginURI("/IkerLanConflictResolution/instancemodels/deltaOA.diffmodel", true), true);
		
		System.out.println("Original and deltas are loaded into resources... ");
		
//		ResourceSet appendedRS = new ResourceSetImpl();
		
		Resource appended = rS.getResource(
				URI.createPlatformPluginURI("/IkerLanConflictResolution/instancemodels/empty.modelcontainer", true), true);
		
		// Getting root elements...
		
		MainRoot mainRoot = (MainRoot) appended.getContents().get(0);
		
		WT originalRoot = (WT) original.getContents().get(0);
		
		DiffContainer deltaOBRoot = (DiffContainer) deltaOB.getContents().get(0);
		
		DiffContainer deltaOARoot = (DiffContainer) deltaOA.getContents().get(0);
		
		System.out.println("Root elements are loaded... ");
		
		// Appending root elements to the MainRoot...
		
		mainRoot.setOriginal(originalRoot);
		System.out.println(mainRoot.getOriginal().toString());
		mainRoot.setDeltaOB(deltaOBRoot);
		System.out.println(mainRoot.getDeltaOB().toString());
		mainRoot.setDeltaOA(deltaOARoot);
		System.out.println(mainRoot.getDeltaOA().toString());
		System.out.println("Root elements are appended to the MainRoot... ");
		
//		// create engine on resource set to access match results
//		IncQueryEngine engine = IncQueryEngine.on(rS);
		
		OutputStream output;
		try {
			output = new FileOutputStream("C:\\Users\\Marci\\Desktop\\originalWithDeltas.modelcontainer");
			
			appended.save(output, null);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
