package org.eclipse.viatra.dse.merge.generator

import com.google.common.collect.Lists
import java.util.List
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.jdt.core.IClasspathEntry
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.pde.internal.core.natures.PDE

class Builder {
	
	public static List<String> dependencies = Lists.newArrayList(
											  "org.eclipse.viatra.dse.merge",
											  "org.eclipse.viatra.dse.merge.ui",
											  "org.eclipse.incquery.runtime",
											  "org.eclipse.emf",
											  "org.eclipse.core.contenttype")
	
	public static List<String> imports = Lists.newArrayList("org.apache.log4j", "com.google.common.collect")			
	public static List<String> natures = Lists.newArrayList(JavaCore.NATURE_ID, PDE.PLUGIN_NATURE)
	
	def addClasspath(IClasspathEntry[] entries, IPath path) {
		var modifiedEntries = Lists.newArrayList(entries);
		modifiedEntries.add(JavaCore.newSourceEntry(path))
		modifiedEntries.toArray(entries)
	}
	
	def onClasspath(IClasspathEntry[] entries, IFolder target) {
		for(entry : entries) {
			if(entry.entryKind ==  IClasspathEntry.CPE_SOURCE)
				if(entry.path.toString.equals(target.fullPath.toString))
					return true
		}
		return false
	}
	
	def updateClasspath(IProject project, IFolder target, IProgressMonitor monitor) {
		val javaProject = project.getNature(JavaCore.NATURE_ID) as IJavaProject
		if(!onClasspath(javaProject.rawClasspath, target)) {
			javaProject.setRawClasspath(addClasspath(javaProject.rawClasspath, target.fullPath), monitor)
			javaProject.save(monitor, true)
		}
	}
	
	def getOrCreateFragment(IFolder root, String packageName, IProgressMonitor monitor) {
		val javaProject = root.project.getNature(JavaCore.NATURE_ID) as IJavaProject
		val packageFragment = javaProject.getPackageFragmentRoot(root).getPackageFragment(packageName)
		if(!packageFragment.exists) {
			javaProject.getPackageFragmentRoot(root).createPackageFragment(packageName, true, monitor)
		}
		return packageFragment
	}
}