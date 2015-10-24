package org.eclipse.viatra.dse.merge.ui.providers.helper;

import org.eclipse.viatra.dse.merge.DSEMergeManager.Solution;

public class SolutionElement {
    public int counter;
    public Solution solution;

    public SolutionElement(int counter, Solution solution) {
        this.counter = counter;
        this.solution = solution;
    }
}
