package org.eclipse.viatra.dse.merge.ui.interpreter;

import org.eclipse.compare.CompareConfiguration;

public interface ICompareEditorInputInterpreter {

	public boolean isInterpreterForType(Object input);
	
	public void interpretEditorInput(Object input, CompareConfiguration config);
	
}
