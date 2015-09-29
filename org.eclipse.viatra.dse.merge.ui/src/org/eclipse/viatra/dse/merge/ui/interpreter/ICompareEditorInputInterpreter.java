package org.eclipse.viatra.dse.merge.ui.interpreter;

import org.eclipse.compare.CompareConfiguration;

/**
 * An interpreter is responsible for processing the input object for the merge and content views.
 * 
 * @author Csaba Debreceni
 *
 */
public interface ICompareEditorInputInterpreter {

    public boolean isInterpreterForType(Object input);

    public void interpretEditorInput(Object input, CompareConfiguration config);

}
