package org.eclipse.viatra.dse.merge.iq.util;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.viatra.dse.merge.iq.SetAttributeMatch;
import org.eclipse.viatra.dse.merge.model.Attribute;

/**
 * A match processor tailored for the org.eclipse.viatra.dse.merge.iq.setAttribute pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SetAttributeProcessor implements IMatchProcessor<SetAttributeMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSrc the value of pattern parameter src in the currently processed match
   * @param pChange the value of pattern parameter change in the currently processed match
   * 
   */
  public abstract void _process(final EObject pSrc, final Attribute pChange);
  
  @Override
  public void process(final SetAttributeMatch match) {
    _process(match.getSrc(), match.getChange());
  }
}
