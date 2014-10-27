package patterns.util;

import DiffModel.SetReference;
import WTSpecID.IdentifiableWTElement;
import WTSpecID.WT;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import patterns.SetReferenceMatch;

/**
 * A match processor tailored for the patterns.setReference pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SetReferenceProcessor implements IMatchProcessor<SetReferenceMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSetRefOp the value of pattern parameter setRefOp in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * @param pWt the value of pattern parameter wt in the currently processed match
   * 
   */
  public abstract void process(final SetReference pSetRefOp, final IdentifiableWTElement pTarget, final WT pWt);
  
  @Override
  public void process(final SetReferenceMatch match) {
    process(match.getSetRefOp(), match.getTarget(), match.getWt());
    
  }
}
