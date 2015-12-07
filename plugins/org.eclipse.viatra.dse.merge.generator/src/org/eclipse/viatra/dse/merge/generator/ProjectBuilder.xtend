package org.eclipse.viatra.dse.merge.generator

import com.google.common.collect.ImmutableList
import java.io.ByteArrayInputStream
import java.util.Collections
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.incquery.tooling.core.generator.ExtensionGenerator
import org.eclipse.incquery.tooling.core.project.IncQueryNature
import org.eclipse.incquery.tooling.core.project.ProjectGenerationHelper
import org.eclipse.pde.core.project.IBundleProjectService

class ProjectBuilder extends Builder {
	
	def doGenerate(IProject project, String generatorName, String ext, String className, String uri, IFolder root, IProgressMonitor monitor) {
		var pluginId = GeneratorHelper.getPlugin(uri)
		if(pluginId.length != 0) {
			dependencies.add(pluginId)
		}
		
		setSingleton(project, monitor)
        
		getOrCreateFragment(root, project.name, monitor)
		var packageSegments = (project.name).split("\\.")
		var target = root;
		for(segment : packageSegments) {
			target = target.getFolder(segment)
		}
		
		ProjectGenerationHelper::ensureBundleDependencies(project, dependencies)
		ProjectGenerationHelper::ensurePackageImports(project, imports)
		
		doGenerateConfigurator(target, ext, className, uri, monitor)
		doGenerateGenerator(target, generatorName, uri, monitor)
	}
	
	def setSingleton(IProject project, IProgressMonitor monitor) {
		var context = Activator.context
        var ref = context.getServiceReference(IBundleProjectService)
        var service = context.getService(ref)
        var bundleDesc = service.getDescription(project)
        
        var additionalBinIncludes = #[new Path("plugin.xml")]
        ProjectGenerationHelper.fillProjectMetadata(project, dependencies, imports, service, bundleDesc, additionalBinIncludes);
        bundleDesc.apply(monitor);
        
        // Adding IncQuery-specific natures
        ProjectGenerationHelper.updateNatures(project,
                    ImmutableList.of(IncQueryNature.XTEXT_NATURE_ID, IncQueryNature.NATURE_ID),
                    ImmutableList.<String>of(), monitor);    
	}
	
	def doGenerateConfigurator(IFolder target, String ext, String className, String uri, IProgressMonitor monitor) {
		var file = target.getFile(className+".java")
		if(!file.exists) {
			file.create(new ByteArrayInputStream(#[]), true, monitor)
		}
		var bytes = generateConfiguratorContent(target.project.name, className, uri).toString.bytes
		file.setContents(new ByteArrayInputStream(bytes), true, true, monitor)
		
		val generator = new ExtensionGenerator
		val extensions = newImmutableList(
			{
				generator.contribExtension(target.project.name+".configuration.generated", "org.eclipse.viatra.dse.merge.configuration") [
					generator.contribElement(it, "configuration") [
						generator.contribAttribute(it, "class", target.project.name+"."+className)
						generator.contribAttribute(it, "epackageURI", uri.toString)
					]
				]
			},{
				generator.contribExtension(target.project.name+".contentType.generated", "org.eclipse.core.contenttype.contentTypes") [
					generator.contribElement(it, "content-type") [
						generator.contribAttribute(it, "base-type", "org.eclipse.emf.ecore.xmi")
						generator.contribAttribute(it, "file-extensions", ext)
						generator.contribAttribute(it, "id", target.project.name+"."+ext)
						generator.contribAttribute(it, "name", "("+ext+")" + target.project.name+"."+ext)
						generator.contribAttribute(it, "priority", "high")
					]
				]
			},{
				generator.contribExtension(target.project.name+".contentMergeViewer.generated", "org.eclipse.compare.contentMergeViewers") [
					generator.contribElement(it, "viewer") [
						generator.contribAttribute(it, "class", "org.eclipse.viatra.dse.merge.ui.DSEContentMergeViewerCreator")
						generator.contribAttribute(it, "extensions", ext)
						generator.contribAttribute(it, "id", "org.eclipse.viatra.dse.merge.ui.contentMergeViewer")
						generator.contribAttribute(it, "label", "DSE Content Merge Viewer")
					]
					generator.contribElement(it, "contentTypeBinding") [
						generator.contribAttribute(it, "contentMergeViewerId", "org.eclipse.viatra.dse.merge.ui.contentMergeViewer")
						generator.contribAttribute(it, "contentTypeId", target.project.name+"."+ext)
					]
				]
			},{
				generator.contribExtension(target.project.name+".structureMergeViewer.generated", "org.eclipse.compare.structureMergeViewers") [
					generator.contribElement(it, "viewer") [
						generator.contribAttribute(it, "class", "org.eclipse.viatra.dse.merge.ui.DSEStructureMergeViewerCreator")
						generator.contribAttribute(it, "extensions", ext)
						generator.contribAttribute(it, "id", "org.eclipse.viatra.dse.merge.ui.structureMergeViewer")
						generator.contribAttribute(it, "label", "DSE Structure Merge Viewer")
					]
					generator.contribElement(it, "contentTypeBinding") [
						generator.contribAttribute(it, "structureMergeViewerId", "org.eclipse.viatra.dse.merge.ui.structureMergeViewer")
						generator.contribAttribute(it, "contentTypeId", target.project.name+"."+ext)
					]
				]
			})
		
		ProjectGenerationHelper::ensureExtensions(target.project, extensions, Collections.emptySet)
	}
	
	def generateConfiguratorContent(String projectName, String className, String uri) {
		'''
		package «projectName»;
		
		import org.eclipse.emf.common.util.URI;
		import org.eclipse.emf.ecore.EClass;
		import org.eclipse.emf.ecore.EObject;
		import org.eclipse.emf.ecore.EPackage;
		import org.eclipse.emf.ecore.EStructuralFeature;
		import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
		import org.eclipse.incquery.runtime.api.IQuerySpecification;
		import org.eclipse.incquery.runtime.exception.IncQueryException;
		import org.eclipse.viatra.dse.merge.DSEMergeIdMapper;
		import «projectName».util.Id2objectQuerySpecification;
		import «projectName».util.ContainmentPatternQuerySpecification;
		
		public class «className» extends org.eclipse.viatra.dse.merge.DSEMergeConfigurator {
		
			URI uri = URI.createURI("«uri»");
			
		    @Override
		    public EPackage getMetamodel() {
		        return (EPackage) new ResourceSetImpl().getResource(uri, true).getContents().get(0);
		    }
		
		    @Override
		    public IQuerySpecification<?> getId2EObject() throws IncQueryException {
		        return Id2objectQuerySpecification.instance();
		    }
		    
		   	@Override
		    public IQuerySpecification<?> getContainmentPattern() throws IncQueryException {
		        return ContainmentPatternQuerySpecification.instance();
		    }
		    
		    @Override
		    public DSEMergeIdMapper getIdMapper() {
		        return new DSEMergeIdMapper() {
		            
		            @Override
		            public Object getId(EObject object) {
		                return object.eGet(getIdFeature(object));
		            }
		
		            @Override
		            public boolean isDeterminativeFeature(EStructuralFeature feature) {
		            	//TODO: This is an automatically generated method -> check Id features
		                if (feature.getName().equals("sysId"))
		                    return true;
		                return false;
		            }
		
		            @Override
		            public EStructuralFeature getIdFeature(EObject object) {
		                //TODO: This is an automatically generated method -> check Id features
		                EClass eClass = object.eClass();
		                return eClass.getEStructuralFeature("sysId");
		            }
		        };
		    }
		
		}'''
	}
	
	def doGenerateGenerator(IFolder target, String generatorName, String uri, IProgressMonitor monitor) {
		var file = target.getFile(generatorName)
		if(!file.exists) {
			file.create(new ByteArrayInputStream(#[]), true, monitor)
		}
		var bytes = generateGeneratorContent(target.project.name, uri).toString.bytes
		file.setContents(new ByteArrayInputStream(bytes), true, true, monitor)
		file
	}
	
	def generateGeneratorContent(String projectName, String uri) {
		'''
		uri=«uri.toString»
		target=dse-gen
		package=«projectName»
		'''
	}
}