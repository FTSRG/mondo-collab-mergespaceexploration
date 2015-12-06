package org.eclipse.viatra.dse.merge.generator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator implements BundleActivator {

    // The plug-in ID
    public static final String PLUGIN_ID = "asd.asd.asd"; //$NON-NLS-1$

    // The shared instance
    private static Activator plugin;

    // Current bundleContext
    private static BundleContext bundleContext;
    
    /**
     * The constructor
     */
    public Activator() {
    }

    @Override
    public void start(BundleContext context) throws Exception {
        bundleContext = context;
        plugin = this;
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        bundleContext = null;
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }
    
    /**
     * Returns the current bundleContext
     * 
     * @return the current bundleContext
     */
    public static BundleContext getContext() {
        return bundleContext;
    }

}