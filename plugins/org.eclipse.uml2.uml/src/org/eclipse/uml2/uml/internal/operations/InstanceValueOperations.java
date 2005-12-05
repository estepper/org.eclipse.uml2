/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: InstanceValueOperations.java,v 1.3 2005/12/05 20:47:30 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Instance Value</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.InstanceValue#stringValue() <em>String Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */
public final class InstanceValueOperations
		extends UMLOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InstanceValueOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static String stringValue(InstanceValue instanceValue) {
		InstanceSpecification instance = instanceValue.getInstance();

		if (instance instanceof EnumerationLiteral) {
			return ((EnumerationLiteral) instance).getName();
		} else if (instance != null) {
			ValueSpecification specification = instance.getSpecification();

			if (specification != null) {
				return specification.stringValue();
			}
		}

		return ValueSpecificationOperations.stringValue(instanceValue);
	}

} // InstanceValueOperations