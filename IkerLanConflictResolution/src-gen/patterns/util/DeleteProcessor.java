package patterns.util;

import DiffModel.Delete;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import patterns.DeleteMatch;

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
   * 
   */
  public abstract void process(final Delete pDeleteOp);
  
  @Override
  public void process(final DeleteMatch match) {
    process(match.getDeleteOp());
    
  }
}
