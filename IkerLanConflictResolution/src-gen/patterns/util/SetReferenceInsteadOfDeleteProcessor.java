package patterns.util;

import DseMergeDiffModel.Delete;
import DseMergeDiffModel.SetReference;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import patterns.SetReferenceInsteadOfDeleteMatch;

/**
 * A match processor tailored for the patterns.setReferenceInsteadOfDelete pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SetReferenceInsteadOfDeleteProcessor implements IMatchProcessor<SetReferenceInsteadOfDeleteMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDeleteOp the value of pattern parameter deleteOp in the currently processed match
   * @param pSetRefOp the value of pattern parameter setRefOp in the currently processed match
   * 
   */
  public abstract void process(final Delete pDeleteOp, final SetReference pSetRefOp);
  
  public void process();
}
