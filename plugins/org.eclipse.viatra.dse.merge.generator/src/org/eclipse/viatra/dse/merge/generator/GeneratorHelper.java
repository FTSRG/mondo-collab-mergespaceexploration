package org.eclipse.viatra.dse.merge.generator;

import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;

import com.google.common.collect.Maps;

public class GeneratorHelper {

    public static String ECORE_EXTENSION_POINT = "org.eclipse.emf.ecore.generated_package";
    public static String ECORE_PACKAGE = "package";
    public static String ECORE_URI = "uri";
    
    private static Map<String, String> uriToPlugin;    
    public static String getPlugin(String uri) {
        if(uriToPlugin == null) {
            uriToPlugin = Maps.newHashMap();
            try {
                IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(ECORE_EXTENSION_POINT);
                for (IExtension ext : extensionPoint.getExtensions()) {
                    for (IConfigurationElement conf : ext.getConfigurationElements()) {
                        String uri_temp = conf.getAttribute(ECORE_URI);
                        String contributor = ext.getContributor().getName();
                        uriToPlugin.put(uri_temp, contributor);
                    }
                }
            } catch (InvalidRegistryObjectException e) {
                Logger.getLogger(GeneratorHelper.class).error(e.getMessage(),e);
            }            
        }
        return uriToPlugin.get(uri);
    }
}
