package patterns.util;

import DiffModel.Create;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import patterns.CreateMatch;

/**
 * A match processor tailored for the patterns.create pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CreateProcessor implements IMatchProcessor<CreateMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pCreateOp the value of pattern parameter createOp in the currently processed match
   * 
   */
  public abstract void process(final Create pCreateOp);
  
  @Override
  public void process(final CreateMatch match) {
    process(match.getCreateOp());
    
  }
}
