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
 * $Id: ActionImplTest.java,v 1.2 2004/05/20 03:03:32 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.impl.ActionImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ActionImpl#getOutputs() <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActionImpl#getInputs() <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.ActionImpl#getContext() <em>Context</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.ActionImpl#getOwnedElements() <em>Get Owned Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ActionImplTest extends ExecutableNodeImplTest {

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
		TestRunner.run(ActionImplTest.class);
	}

	/**
	 * Constructs a new Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActionImpl getFixture() {
		return (ActionImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((ActionImpl) UML2Factory.eINSTANCE.createAction());
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
	 * Tests the '{@link org.eclipse.uml2.impl.ActionImpl#getOutputs() <em>Output</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActionImpl#getOutputs()
	 * @generated
	 */
	public void testGetOutputsGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetOutputs() {
		testGetOutputsGen();
		
		setUpOutputs();
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActionImpl#getInputs() <em>Input</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActionImpl#getInputs()
	 * @generated
	 */
	public void testGetInputsGen() {
		// TODO: implement this feature getter test method
	}

	public void testGetInputs() {
		testGetInputsGen();
		
		setUpInputs();
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActionImpl#getContext() <em>Context</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActionImpl#getContext()
	 * @generated
	 */
	public void testGetContext() {
		// TODO: implement this feature getter test method
	}

	/**
	 * Tests the '{@link org.eclipse.uml2.impl.ActionImpl#getOwnedElements() <em>Get Owned Elements</em>}' getter operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.impl.ActionImpl#getOwnedElements()
	 * @generated
	 */
	public void testGetOwnedElementsGen() {
		// TODO: implement this getter operation test method
	}

	public void testGetOwnedElements() {
		testGetOwnedElementsGen();
		
		super.testGetOwnedElements();

		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getInputs()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getLocalPostconditions()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getLocalPreconditions()));
		assertTrue(getFixture().getOwnedElements().containsAll(getFixture().getOutputs()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.uml2.impl.tests.ElementImplTest#setUpOwnedElements()
	 */
	protected void setUpOwnedElements() {
		super.setUpOwnedElements();

		setUpInputs();
		setUpOutputs();

		getFixture().getLocalPostconditions().add(UML2Factory.eINSTANCE.createConstraint());
		getFixture().getLocalPostconditions().add(UML2Factory.eINSTANCE.createConstraint());

		getFixture().getLocalPreconditions().add(UML2Factory.eINSTANCE.createConstraint());
		getFixture().getLocalPreconditions().add(UML2Factory.eINSTANCE.createConstraint());
	}

	protected void setUpInputs() {
		// do nothing
	}

	protected void setUpOutputs() {
		// do nothing
	}

} //ActionImplTest
