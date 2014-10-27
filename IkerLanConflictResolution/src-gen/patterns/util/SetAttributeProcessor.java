package patterns.util;

import DiffModel.SetAttribute;
import WTSpecID.IdentifiableWTElement;
import WTSpecID.WT;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import patterns.SetAttributeMatch;

/**
 * A match processor tailored for the patterns.setAttribute pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SetAttributeProcessor implements IMatchProcessor<SetAttributeMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSetAttrOp the value of pattern parameter setAttrOp in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * @param pWt the value of pattern parameter wt in the currently processed match
   * 
   */
  public abstract void process(final SetAttribute pSetAttrOp, final IdentifiableWTElement pTarget, final WT pWt);
  
  @Override
  public void process(final SetAttributeMatch match) {
    process(match.getSetAttrOp(), match.getTarget(), match.getWt());
    
  }
}
