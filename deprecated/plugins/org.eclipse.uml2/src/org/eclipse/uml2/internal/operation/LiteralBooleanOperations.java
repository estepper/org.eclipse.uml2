/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: LiteralBooleanOperations.java,v 1.3 2005/03/15 18:44:46 khussey Exp $
 */
package org.eclipse.uml2.internal.operation;

import org.eclipse.uml2.LiteralBoolean;

/**
 * A static utility class that provides operations related to literal booleans.
 */
public final class LiteralBooleanOperations
	extends UML2Operations {

	/**
	 * Constructs a new Literal Boolean Operations. This constructor should
	 * never be called because this is a static utility class.
	 */
	private LiteralBooleanOperations() {
		super();
	}

	public static boolean booleanValue(LiteralBoolean literalBoolean) {
		return literalBoolean.isValue();
	}

	public static boolean isComputable(LiteralBoolean literalBoolean) {
		return true;
	}

}