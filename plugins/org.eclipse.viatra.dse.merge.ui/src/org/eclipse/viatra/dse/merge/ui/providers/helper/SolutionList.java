package org.eclipse.viatra.dse.merge.ui.providers.helper;

import java.util.Collection;

import org.eclipse.viatra.dse.merge.DSEMergeManager.Solution;
import org.eclipse.viatra.dse.merge.ui.providers.helper.SolutionElement;

import com.google.common.collect.Lists;

public class SolutionList {
    public Collection<SolutionElement> list = Lists.newArrayList();

    public SolutionList(Collection<Solution> solutions) {
        for (Solution solution : solutions) {
            add(solution);
        }
    }

    private void add(Solution solution) {
        list.add(new SolutionElement(list.size() + 1, solution));
    }
}