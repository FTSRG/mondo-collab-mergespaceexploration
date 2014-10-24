package patterns.util;

import DiffModel.AddToList;
import WTSpecID.IdentifiableWTElement;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import patterns.AddToListMatch;

/**
 * A match processor tailored for the patterns.addToList pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AddToListProcessor implements IMatchProcessor<AddToListMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pAddToListOp the value of pattern parameter addToListOp in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * 
   */
  public abstract void process(final AddToList pAddToListOp, final IdentifiableWTElement pTarget);
  
  @Override
  public void process(final AddToListMatch match) {
    process(match.getAddToListOp(), match.getTarget());
    
  }
}
