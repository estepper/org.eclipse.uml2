/*
 * Copyright (c) 2003, 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * $Id: WriteStructuralFeatureActionImplTest.java,v 1.2 2004/05/20 03:03:32 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.WriteStructuralFeatureActionImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Write Structural Feature Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.WriteStructuralFeatureActionImpl#getInputs() <em>Get Inputs</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class WriteStructuralFeatureActionImplTest extends StructuralFeatureActionImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * Constructs a new Write Structural Feature Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteStructuralFeatureActionImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Write Structural Feature Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private WriteStructuralFeatureActionImpl getFixture() {
		return (WriteStructuralFeatureActionImpl) fixture;
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.WriteStructuralFeatureActionImpl#getInputs() <em>Get Inputs</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.WriteStructuralFeatureActionImpl#getInputs()
	 * @generated
	 */
	public void testGetInputsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetInputs() {
		testGetInputsGen();
		
		super.testGetInputs();

		if (null != getFixture().getValue()) {
			assertTrue(getFixture().getInputs().contains(getFixture().getValue()));
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpInputs()
	 */
	protected void setUpInputs() {
		super.setUpInputs();

		getFixture().setValue(UML2Factory.eINSTANCE.createInputPin());
	}

} //WriteStructuralFeatureActionImplTest
