package statecoder;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra.dse.statecode.IStateSerializer;
import org.eclipse.viatra.dse.statecode.IStateSerializerFactory;

public class IkerLanStateCoderFactory implements IStateSerializerFactory{

	@Override
	public IStateSerializer createStateSerializer(IncQueryEngine engine)
			throws UnsupportedMetaModel {
		return new IkerLanStateCoder(engine);
	}

}
