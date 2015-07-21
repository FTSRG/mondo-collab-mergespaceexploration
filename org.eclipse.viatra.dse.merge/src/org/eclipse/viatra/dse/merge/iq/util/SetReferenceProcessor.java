package org.eclipse.viatra.dse.merge.iq.util;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.viatra.dse.merge.iq.SetReferenceMatch;
import org.eclipse.viatra.dse.merge.model.Reference;

/**
 * A match processor tailored for the org.eclipse.viatra.dse.merge.iq.setReference pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SetReferenceProcessor implements IMatchProcessor<SetReferenceMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSrc the value of pattern parameter src in the currently processed match
   * @param pTrg the value of pattern parameter trg in the currently processed match
   * @param pChange the value of pattern parameter change in the currently processed match
   * 
   */
  public abstract void _process(final EObject pSrc, final EObject pTrg, final Reference pChange);
  
  @Override
  public void process(final SetReferenceMatch match) {
    _process(match.getSrc(), match.getTrg(), match.getChange());
  }
}
