package org.eclipse.viatra.dse.merge.iq.util;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.viatra.dse.merge.iq.GoalPatternMatch;

/**
 * A match processor tailored for the org.eclipse.viatra.dse.merge.iq.goalPattern pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class GoalPatternProcessor implements IMatchProcessor<GoalPatternMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * 
   */
  public abstract void _process();
  
  @Override
  public void process(final GoalPatternMatch match) {
    _process();
  }
}
