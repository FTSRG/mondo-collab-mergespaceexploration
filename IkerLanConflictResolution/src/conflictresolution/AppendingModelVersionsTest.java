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
import versioncontainer.MainRoot;

public class AppendingModelVersionsTest {

	@Test
	public void appendingModelsTest() throws IncQueryException {
		
		System.out.println("Appending original, remote and local versions of a WTid intancemodel... ");
		
		// Creating resources...
		
		ResourceSet originalRS = new ResourceSetImpl();
		
		ResourceSet remoteRS = new ResourceSetImpl();
		
		ResourceSet localRS = new ResourceSetImpl();
		
		Resource original = originalRS.getResource(
				URI.createPlatformPluginURI("/IkerLanConflictResolution/instancemodels/original.wtspecid", true), true);
		
		Resource remote = remoteRS.getResource(
				URI.createPlatformPluginURI("/IkerLanConflictResolution/instancemodels/remote.wtspecid", true), true);
		
		Resource local = localRS.getResource(
				URI.createPlatformPluginURI("/IkerLanConflictResolution/instancemodels/local.wtspecid", true), true);
		
		System.out.println("Original, remote and local versions are loaded into resources... ");
		
		ResourceSet appendedRS = new ResourceSetImpl();
		
		Resource appended = appendedRS.getResource(
				URI.createPlatformPluginURI("/IkerLanConflictResolution/instancemodels/empty.versioncontainer", true), true);
		
		// Getting root elements...
		
		MainRoot mainRoot = (MainRoot) appended.getContents().get(0);
		
		WT originalRoot = (WT) original.getContents().get(0);
		
		WT remoteRoot = (WT) remote.getContents().get(0);
		
		WT localRoot = (WT) local.getContents().get(0);
		
		System.out.println("Root elements are loaded... ");
		
		// Appending root elements to the MainRoot...
		
		mainRoot.setOriginal(originalRoot);
		System.out.println(mainRoot.getOriginal().toString());
		mainRoot.setRemote(remoteRoot);
		System.out.println(mainRoot.getRemote().toString());
		mainRoot.setLocal(localRoot);
		System.out.println(mainRoot.getLocal().toString());
		System.out.println("Root elements are appended to the MainRoot... ");
		
		// create engine on resource set to access match results
		IncQueryEngine engine = IncQueryEngine.on(appendedRS);
		
		OutputStream output;
		try {
			output = new FileOutputStream("C:\\Users\\Marci\\Desktop\\3versions.versioncontainer");
			
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
