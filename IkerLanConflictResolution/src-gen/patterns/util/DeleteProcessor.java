package patterns.util;

import DseMergeDiffModel.Delete;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import patterns.DeleteMatch;
import wtspecid.IdentifiableWTElement;

/**
 * A match processor tailored for the patterns.delete pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class DeleteProcessor implements IMatchProcessor<DeleteMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDeleteOp the value of pattern parameter deleteOp in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * 
   */
  public abstract void process(final Delete pDeleteOp, final IdentifiableWTElement pTarget);
  
  @Override
  public void process(final DeleteMatch match) {
    process(match.getDeleteOp(), match.getTarget());
    
  }
}
