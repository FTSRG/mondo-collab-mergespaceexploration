package patterns.util;

import DseMergeDiffModel.Create;
import DseMergeDiffModel.Delete;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import patterns.CreateInsteadOfDeleteMatch;

/**
 * A match processor tailored for the patterns.createInsteadOfDelete pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CreateInsteadOfDeleteProcessor implements IMatchProcessor<CreateInsteadOfDeleteMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDeleteOp the value of pattern parameter deleteOp in the currently processed match
   * @param pCreateOp the value of pattern parameter createOp in the currently processed match
   * 
   */
  public abstract void process(final Delete pDeleteOp, final Create pCreateOp);
  
  public void process();
}
