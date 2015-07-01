package eu.mondo.collaboration.dsemerge.rules.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import wtspecid.IdentifiableWTElement;
import DiffModel.Move;
import eu.mondo.collaboration.dsemerge.patterns.MoveMatch;
import eu.mondo.collaboration.dsemerge.patterns.MoveMatcher;
import eu.mondo.collaboration.dsemerge.patterns.util.MoveProcessor;

public class MoveElement extends MoveProcessor {

	@Override
	public void process(Move pMoveOp, IdentifiableWTElement pContainerTarget,
			IdentifiableWTElement pRef, Move pMoveOp2, IdentifiableWTElement pContainerTarget2,
			IdentifiableWTElement pRef2) {
		
		String ref = pMoveOp.getReference();

		EStructuralFeature esf = pContainerTarget.eClass().getEStructuralFeature(ref);
		
		// Moving referenced element based on the cardinality of its container
		if (esf.getUpperBound() == 1) {
			pContainerTarget.eSet(esf, pRef);
		}
		else {
			List<EObject> newList = new ArrayList<EObject>();
			
			Object obj = pContainerTarget.eGet(esf);
			if (obj instanceof Collection<?>) {
				for (Object element : (Collection<?>) obj) {
					if (element instanceof EObject) {
						newList.add((EObject) element);
					}
				}
			}
			
			newList.add(pRef);

			pContainerTarget.eSet(esf, newList);
		}
		
		// deleting this MoveOp from DiffModel
		EcoreUtil.delete(pMoveOp);
		
	}
	
	public static TransformationRule<MoveMatch> createRule()
			throws IncQueryException {

		TransformationRule<MoveMatch> moveElement = new TransformationRule<MoveMatch>(
				MoveMatcher.querySpecification(), new MoveElement());

		return moveElement;
	}

}
