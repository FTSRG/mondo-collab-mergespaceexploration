package org.eclipse.viatra.dse.merge.generator

import com.google.common.collect.Lists
import com.google.common.collect.Maps
import java.io.ByteArrayInputStream
import java.util.Collection
import java.util.List
import java.util.Map
import java.util.Properties
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.incquery.tooling.core.project.ProjectGenerationHelper
import org.eclipse.jdt.core.IPackageFragment
import org.eclipse.jdt.core.JavaCore
import org.eclipse.pde.internal.core.natures.PDE
import org.junit.Assert

class ArtifactBuilder extends Builder {

	URI uri
	Resource resource
	Map<EClass, List<EReference>> containmentMapping
	Map<EClass, EAttribute> idMapping
	IProject project
	IFolder target
	IPackageFragment packageFragment
	IProgressMonitor monitor
	Collection<String> metamodelURIs

	def void doSetup(IFile file, IProgressMonitor monitor) {
		this.monitor = monitor 
		this.metamodelURIs = Lists.newArrayList
		val prop = new Properties
		prop.load(file.contents)
		doSetup(prop, file.project)
	}

	def doSetup(Properties properties, IProject project) {
		
		validation(project, properties)

		this.project = project
		target = project.getFolder(properties.get("target") as String)
		if(!target.exists) {
			target.create(true, true, monitor)
		}
		
		updateClasspath(project, target, monitor);
		
		packageFragment = getOrCreateFragment(target, properties.get("package") as String, monitor)
		var packageSegments = (properties.get("package") as String).split("\\.")
		for(segment : packageSegments) {
			target = target.getFolder(segment)
		}
		
		var exports = Lists.newArrayList(properties.get("package") as String)
		ProjectGenerationHelper::ensureBundleDependencies(project, dependencies)
		ProjectGenerationHelper::ensurePackageExports(project, exports)
		ProjectGenerationHelper::ensurePackageImports(project, imports)
		
		uri = URI.createURI(properties.get("uri") as String)
		resource = (new ResourceSetImpl()).getResource(uri, true)
		Assert::assertNotNull("Resource cannot be loaded: " + uri.toString, resource);		
	}
	
	def validation(IProject project, Properties properties) {
		Assert::assertNotNull("Unknown project", project)
		Assert::assertTrue(project.isOpen() && PDE.hasPluginNature(project))
		Assert::assertNotNull("This project has no Java nature", project.getNature(JavaCore.NATURE_ID))	
		Assert::assertNotEquals("URI is not given. Usage: uri=<full resource URI>", "", properties.get("uri"))
		Assert::assertNotEquals("Target folder is not given. Usage: target=<source folder>", "", properties.get("target"))
		Assert::assertNotEquals("Package is not given. Usage: package=<source folder>", "", properties.get("package"))
	}

	def void doTraverse() {
		for (o : resource.contents) {
			if (o instanceof EPackage) {
				doTraverse(o as EPackage)
			}
		}
	}

	def void doTraverse(EPackage pack) {
		metamodelURIs.add(pack.nsURI)
		for (p : pack.ESubpackages) {
			doTraverse(p)
		}
		for (c : pack.EClassifiers) {
			if (c instanceof EClass) {
				doTraverse(c as EClass)
			}
		}
	}

	def void doTraverse(EClass c) {
		for (r : c.EReferences) {
			if (r.containment) {
				putReference(c, r);
			}
		}
		for(a : c.EAttributes) {
			if(a.name.toLowerCase.contains("id")) {
				putAttribute(c, a)
			}
		}
	}

	def void putReference(EClass c, EReference r) {
		if (containmentMapping == null)
			containmentMapping = Maps.newHashMap
		if (!containmentMapping.containsKey(c))
			containmentMapping.put(c, Lists.newArrayList);
		containmentMapping.get(c).add(r);		
	}
	
	def void putAttribute(EClass c, EAttribute a) {
		if (idMapping == null)
			idMapping = Maps.newHashMap
		idMapping.put(c,a);		
	}
	
	def doGenerate() {
		doGenerateHelperClass
		doGenerateIdPattern
		doGenerateContainmentPattern
	}
	
	def doGenerateHelperClass() {
		var file = target.getFile("Helper.java")
		if(!file.exists) {
			file.create(new ByteArrayInputStream(#[]), true, monitor)
		}
		var bytes = featuresClass(target.project.name, idMapping).toString.bytes
		file.setContents(new ByteArrayInputStream(bytes), true, true, monitor)
	}
	
	def doGenerateIdPattern() {
		var file = target.getFile("helpers.eiq")
		if(!file.exists) {
			file.create(new ByteArrayInputStream(#[]), true, monitor)
		}
		var bytes = idPattern(target.project.name, metamodelURIs, idMapping).toString.bytes
		file.setContents(new ByteArrayInputStream(bytes), true, true, monitor)
	}
	
	def doGenerateContainmentPattern() {
		var file = target.getFile("mergeQueries.eiq")
		if(!file.exists) {
			file.create(new ByteArrayInputStream(#[]), true, monitor)
		}
		var bytes = containmentPattern(packageFragment.elementName, metamodelURIs, containmentMapping).toString.bytes
		file.setContents(new ByteArrayInputStream(bytes), true, true, monitor)		
	}

	def static containmentPattern(String packageName, Collection<String> metamodelURIs, Map<EClass, List<EReference>> mapping) {
		var classes = mapping.keySet.toList
		'''
			package «packageName»
			
			import "http://www.eclipse.org/emf/2002/Ecore"
			«FOR metamodelURI : metamodelURIs»import "«metamodelURI»"
			«ENDFOR»
			
			
			pattern containmentPattern(parent:EObject,child:EObject)
			«FOR clazz : classes»«classPart(clazz, mapping.get(clazz),classes.iterator.next == clazz)»«ENDFOR»
		'''
	}
	
	def static idPattern(String packageName, Collection<String> metamodelURIs, Map<EClass, EAttribute> mapping) {
		var classes = mapping.keySet.toList
		'''
			package «packageName»
			
			import "http://www.eclipse.org/emf/2002/Ecore"
			«FOR metamodelURI : metamodelURIs»import "«metamodelURI»"
			«ENDFOR»
			
			
			pattern id2object(object:EObject,key)
			«FOR clazz : classes»«idPart(clazz, mapping.get(clazz),classes.iterator.next == clazz)»«ENDFOR»
		'''
	}

	def static idPart(EClass clazz, EAttribute attribute, boolean flag) {
		'''«IF (!flag)»or «ENDIF»{	«clazz.name».«attribute.name»(object,key); }
		'''
	}

	def static classPart(EClass clazz, List<EReference> collection, boolean flag) {
		'''«FOR reference : collection»«referencePart(clazz,reference,flag && collection.iterator.next == reference)»«ENDFOR»'''
	}

	def static referencePart(EClass clazz, EReference reference, boolean flag) {
		'''«IF (!flag)»or «ENDIF»{	«clazz.name».«reference.name»(parent,child); }
		'''
	}
	
	def static featuresClass(String packageName, Map<EClass, EAttribute> mapping) {
		var classes = mapping.keySet.toList
		'''
			package «packageName»;
			
			import org.eclipse.emf.ecore.EClass;
			import org.eclipse.emf.ecore.EObject;
			import org.eclipse.emf.ecore.EAttribute;
			import org.eclipse.emf.ecore.EStructuralFeature;
			
			public class Helper {
				
				public static EAttribute getIdFeature(EObject object) {
					EClass eClass = object.eClass();
					«FOR clazz : classes»«featuresIfFeatures(clazz, mapping.get(clazz))»«ENDFOR»
					return null;
				}
				public static boolean isDeterminativeFeature(EStructuralFeature feature) {
					«FOR attribute : mapping.values»«featuresIfDeterminative(attribute)»«ENDFOR»
					return false;
				}
			}
		'''
	}

	def static featuresIfFeatures(EClass eClass, EAttribute attribute) {
		'''
		if(eClass.getName().equals("«eClass.name»") 
				&& eClass.getEPackage().getNsURI().equals("«eClass.EPackage.nsURI»")) { 
					return (EAttribute) eClass.getEStructuralFeature("«attribute.name»");
		}
		'''
	}
	def static featuresIfDeterminative(EAttribute attribute) {
		'''
		if(feature.getName().equals(«attribute.getName()»)){ 
			return true;
		}
		'''
	}
}