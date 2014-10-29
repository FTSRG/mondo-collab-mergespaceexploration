package patterns.util;

import WTSpecID.IdentifiableWTElement;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import patterns.AllIdentifiableMatch;

/**
 * A match processor tailored for the patterns.allIdentifiable pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AllIdentifiableProcessor implements IMatchProcessor<AllIdentifiableMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTarget the value of pattern parameter target in the currently processed match
   * 
   */
  public abstract void process(final IdentifiableWTElement pTarget);
  
  @Override
  public void process(final AllIdentifiableMatch match) {
    process(match.getTarget());
    
  }
}
