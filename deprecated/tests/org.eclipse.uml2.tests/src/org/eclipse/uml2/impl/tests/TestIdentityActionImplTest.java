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
 * $Id: TestIdentityActionImplTest.java,v 1.2 2004/05/20 03:03:32 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.TestIdentityActionImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Test Identity Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.TestIdentityActionImpl#getInputs() <em>Get Inputs</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.TestIdentityActionImpl#getOutputs() <em>Get Outputs</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TestIdentityActionImplTest extends ActionImplTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003, 2004 IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TestIdentityActionImplTest.class);
	}

	/**
	 * Constructs a new Test Identity Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestIdentityActionImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Test Identity Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TestIdentityActionImpl getFixture() {
		return (TestIdentityActionImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((TestIdentityActionImpl) UML2Factory.eINSTANCE.createTestIdentityAction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TestIdentityActionImpl#getInputs() <em>Get Inputs</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TestIdentityActionImpl#getInputs()
	 * @generated
	 */
	public void testGetInputsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetInputs() {
		testGetInputsGen();
		
		super.testGetInputs();

		assertTrue(getFixture().getInputs().contains(getFixture().getFirst()));
		assertTrue(getFixture().getInputs().contains(getFixture().getSecond()));
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.TestIdentityActionImpl#getOutputs() <em>Get Outputs</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.TestIdentityActionImpl#getOutputs()
	 * @generated
	 */
	public void testGetOutputsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOutputs() {
		testGetOutputsGen();
		
		super.testGetOutputs();

		assertTrue(getFixture().getOutputs().contains(getFixture().getResult()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpInputs()
	 */
	protected void setUpInputs() {
		super.setUpInputs();

		getFixture().setFirst(UML2Factory.eINSTANCE.createInputPin());

		getFixture().setSecond(UML2Factory.eINSTANCE.createInputPin());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ActionImplTest#setUpOutputs()
	 */
	protected void setUpOutputs() {
		super.setUpOutputs();

		getFixture().setResult(UML2Factory.eINSTANCE.createOutputPin());
	}

} //TestIdentityActionImplTest
