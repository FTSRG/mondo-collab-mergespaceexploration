/*******************************************************************************
 * Copyright (c) 2010-2015, Csaba Debreceni, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Csaba Debreceni - initial API and implementation
 *******************************************************************************/
package org.eclipse.viatra.dse.merge.util;

import org.eclipse.viatra.dse.merge.model.Id;

public final class DSEMergeUtil {

    public DSEMergeUtil() {
        // disabled ctor
    }

    public static Object getId(Id id) {
        if (id == null)
            return null;
        switch (id.getType()) {
        case EINT:
            return id.getEInt();
        case ELONG:
            return id.getELong();
        case ESTRING:
            return id.getEString();
        default:
            return null;
        }
    }

}
