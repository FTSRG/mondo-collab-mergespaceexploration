package patterns.util;

import DiffModel.ResetAttribute;
import WTSpecID.IdentifiableWTElement;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import patterns.ResetAttributeMatch;

/**
 * A match processor tailored for the patterns.resetAttribute pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ResetAttributeProcessor implements IMatchProcessor<ResetAttributeMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pResetAttrOp the value of pattern parameter resetAttrOp in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * 
   */
  public abstract void process(final ResetAttribute pResetAttrOp, final IdentifiableWTElement pTarget);
  
  @Override
  public void process(final ResetAttributeMatch match) {
    process(match.getResetAttrOp(), match.getTarget());
    
  }
}
