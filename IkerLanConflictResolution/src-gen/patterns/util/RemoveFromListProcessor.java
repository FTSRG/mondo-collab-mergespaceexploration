package patterns.util;

import DiffModel.RemoveFromList;
import WTSpecID.IdentifiableWTElement;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import patterns.RemoveFromListMatch;

/**
 * A match processor tailored for the patterns.removeFromList pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RemoveFromListProcessor implements IMatchProcessor<RemoveFromListMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRemoveFromListOp the value of pattern parameter removeFromListOp in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * @param pRef the value of pattern parameter ref in the currently processed match
   * 
   */
  public abstract void process(final RemoveFromList pRemoveFromListOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef);
  
  @Override
  public void process(final RemoveFromListMatch match) {
    process(match.getRemoveFromListOp(), match.getTarget(), match.getRef());
    
  }
}
