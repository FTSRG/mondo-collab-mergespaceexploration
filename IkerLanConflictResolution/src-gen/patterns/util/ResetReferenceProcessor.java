package patterns.util;

import DseMergeDiffModel.ResetReference;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import patterns.ResetReferenceMatch;
import wtspecid.IdentifiableWTElement;

/**
 * A match processor tailored for the patterns.resetReference pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ResetReferenceProcessor implements IMatchProcessor<ResetReferenceMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pResetRefOp the value of pattern parameter resetRefOp in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * @param pRef the value of pattern parameter ref in the currently processed match
   * 
   */
  public abstract void process(final ResetReference pResetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef);
  
  @Override
  public void process(final ResetReferenceMatch match) {
    process(match.getResetRefOp(), match.getTarget(), match.getRef());
    
  }
}
