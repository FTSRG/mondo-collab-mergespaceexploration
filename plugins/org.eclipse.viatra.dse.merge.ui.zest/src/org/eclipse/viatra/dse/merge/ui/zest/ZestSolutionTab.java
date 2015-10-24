package org.eclipse.viatra.dse.merge.ui.zest;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.gef4.layout.algorithms.TreeLayoutAlgorithm;
import org.eclipse.gef4.zest.core.viewers.GraphViewer;
import org.eclipse.gef4.zest.core.widgets.GraphConnection;
import org.eclipse.gef4.zest.core.widgets.GraphItem;
import org.eclipse.gef4.zest.core.widgets.GraphNode;
import org.eclipse.gef4.zest.core.widgets.GraphWidget;
import org.eclipse.gef4.zest.core.widgets.ZestStyles;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.merge.DSEMergeSerializer.ActivationCodeWrapper;
import org.eclipse.viatra.dse.merge.model.Attribute;
import org.eclipse.viatra.dse.merge.model.Change;
import org.eclipse.viatra.dse.merge.model.Create;
import org.eclipse.viatra.dse.merge.model.Delete;
import org.eclipse.viatra.dse.merge.model.Priority;
import org.eclipse.viatra.dse.merge.model.Reference;
import org.eclipse.viatra.dse.merge.ui.providers.helper.SolutionElement;
import org.eclipse.viatra.dse.merge.ui.providers.helper.SolutionList;
import org.eclipse.viatra.dse.merge.ui.tabs.AbstractSolutionTab;
import org.eclipse.viatra.dse.merge.util.DSEMergeUtil;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class ZestSolutionTab extends AbstractSolutionTab {

    private GraphWidget graph;
    private GraphViewer viewer;

    Map<Object, GraphNode> nodeMapping = Maps.newHashMap();
    Map<GraphNode, SolutionElement> solutionMapping = Maps.newHashMap();
    Composite parent;
    SolutionElement selected;

    int sumMay, sumMust, selectedMay, selectedMust;
    private ZestSolutionForm form;
    
    @Override
    protected String getTabTitle() {
        return "Graph Visualizer";
    }

    @Override
    protected StructuredViewer getStructuredViewer() {
        return viewer;
    }

    @Override
    protected Control createViewer(Composite parent) {
        this.parent = parent;
        
        form = new ZestSolutionForm(parent, SWT.None);
        form.getSelectButton().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if(selected != null)
                    selectSolution(selected.solution);
            }
        });
        
        graph = new GraphWidget(form.getGraphComposite(), SWT.None);
        graph.setLayoutAlgorithm(new TreeLayoutAlgorithm(), true);
        graph.addSelectionListener(new ZestTabSelectionListener());
        
        viewer = new GraphViewer(graph);
        return form;
    }

    @Override
    public void setSolutions(SolutionList solutionList) {
        nodeMapping.clear();
        sumMay = sumMust = 0;
        int counter = 0;
        for (SolutionElement solution : solutionList.list) {
            GraphNode s = new GraphNode(graph, SWT.None, "Solution #" + ++counter);
            s.setBackgroundColor(parent.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
            s.setForegroundColor(parent.getDisplay().getSystemColor(SWT.COLOR_BLACK));
            s.setHighlightColor(new Color(parent.getDisplay(), 233, 143, 37));
            s.setBorderColor(parent.getDisplay().getSystemColor(SWT.COLOR_BLACK));
            
            solutionMapping.put(s, solution);

            GraphNode previous = null;
            for (Object object : solution.solution.getTrajectory().getActivationCodes()) {
                if (!nodeMapping.containsKey(object)) {
                    GraphNode node = new GraphNode(graph, SWT.None);
                    setStyles(node, (ActivationCodeWrapper) object);
                    modifyNumbers((ActivationCodeWrapper) object);
                    nodeMapping.put(object, node);
                }
                GraphNode current = nodeMapping.get(object);
                if (previous != null) {
                    GraphConnection graphConnection = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED,
                            previous, current);
                    graphConnection.setHighlightColor(parent.getDisplay().getSystemColor(SWT.COLOR_RED));
                } else {
                    GraphConnection graphConnection = new GraphConnection(graph, SWT.NONE, s, current);
                    graphConnection.setConnectionStyle(ZestStyles.CONNECTIONS_DIRECTED);
                    graphConnection.setLineColor(parent.getDisplay().getSystemColor(SWT.COLOR_BLACK));
                    graphConnection.setHighlightColor(parent.getDisplay().getSystemColor(SWT.COLOR_RED));
                }
                previous = current;
            }
        }
    }

    private void modifyNumbers(ActivationCodeWrapper object) {
        if(object.getChange().getPriority() == Priority.MUST)
            sumMust++;
        else
            sumMay++;
            
    }

    protected void setStyles(GraphNode node, ActivationCodeWrapper wrapper) {
        node.setBackgroundColor(wrapper.getChange().getPriority() == Priority.MUST ? new Color(parent.getDisplay(),
                233, 93, 37) : new Color(parent.getDisplay(), 126, 185, 217));

        node.setForegroundColor(parent.getDisplay().getSystemColor(SWT.COLOR_BLACK));
        node.setHighlightColor(wrapper.getChange().getPriority() == Priority.MUST ? new Color(parent.getDisplay(), 255,
                175, 143) : new Color(parent.getDisplay(), 30, 107, 148));

        String label = "";
        Change change = wrapper.getChange();
        if (change instanceof Create) {
            Create _change = (Create) change;
            label = "Create " + DSEMergeUtil.getId(_change.getSrc());
        }
        if (change instanceof Delete) {
            Delete _change = (Delete) change;
            label = "Delete " + DSEMergeUtil.getId(_change.getSrc());
        }
        if (change instanceof Reference) {
            Reference _change = (Reference) change;
            label = _change.getKind() + " Reference: " + DSEMergeUtil.getId(_change.getSrc()) + "-"
                    + _change.getFeature().getName() + "-" + DSEMergeUtil.getId(_change.getTrg());
        }
        if (change instanceof Attribute) {
            Attribute _change = (Attribute) change;
            label = _change.getKind() + " Attribute: " + DSEMergeUtil.getId(_change.getSrc()) + "-"
                    + _change.getFeature().getName() + "-" + _change.getValue();
        }
        node.setText(label);
    }

    private void setMetrics() {
        form.getIncludedLabel().setText(String.format("Included: %d", selectedMay + selectedMust));
        form.getExcludedLabel().setText(String.format("Excluded: %d", (sumMay + sumMust) - (selectedMay + selectedMust)));
        form.getMayLabel().setText(String.format("May %d/%d", selectedMay, sumMay));
        form.getMustLabel().setText(String.format("Must %d/%d", selectedMust, sumMust));
    }
    
    HashSet<GraphItem> set = Sets.newHashSet();
    public void selectFullSolution(GraphNode solutionNode) {
        set = Sets.newHashSet();
        selectedMay = selectedMust = 0;
        selected = solutionMapping.get(solutionNode);
        SolutionTrajectory trajectory = selected.solution.getTrajectory();
        GraphNode previous = solutionNode;
        previous.highlight();
        set.add(previous);
        for (Object code : trajectory.getActivationCodes()) {
            GraphNode current = nodeMapping.get(code);
            modifyCurrentCounts((ActivationCodeWrapper) code);
            
            current.highlight();
            for (GraphConnection graphConnection : current.getTargetConnections()) {
                if (graphConnection.getSource() == previous) {
                    graphConnection.highlight();
                    set.add(graphConnection);
                }
            }
            previous = current;
            set.add(previous);
        }
        setMetrics();
    }
    
    private void clearPreviousSelection() {
        for (GraphItem graphItem : set) {
            graphItem.unhighlight();
        }
    }

    private void modifyCurrentCounts(ActivationCodeWrapper code) {
        if(code.getChange().getPriority() == Priority.MUST)
            selectedMust++;
        else
            selectedMay++;
    }

    
    public class ZestTabSelectionListener implements SelectionListener  {
        
        @Override
        public void widgetSelected(SelectionEvent e) {
            List<GraphItem> selection = graph.getSelection();
            clearPreviousSelection();
            if(selection.size() == 1 && solutionMapping.containsKey(selection.get(0)))
                selectFullSolution((GraphNode)selection.get(0));
        }

        @Override
        public void widgetDefaultSelected(SelectionEvent e) {
            clearPreviousSelection();
        }
    }
    
}
