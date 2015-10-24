package org.eclipse.viatra.dse.merge.ui.interpreter;

import org.eclipse.emf.ecore.resource.Resource;

public interface IResourceHandler {

    public IResourceInterpreter createInterpreter(Object fileResource);

    public boolean canHandle(Object fileResource);
    
    public interface IResourceInterpreter {

        public boolean saveModel(byte[] content);
        
        public Resource loadModel();
    
    }
    
}
