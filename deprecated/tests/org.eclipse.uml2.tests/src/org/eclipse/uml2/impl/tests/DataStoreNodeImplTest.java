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
 * $Id: DataStoreNodeImplTest.java,v 1.2 2005/03/15 18:51:29 khussey Exp $
 */
package org.eclipse.uml2.impl.tests;

import junit.textui.TestRunner;

import org.eclipse.uml2.UML2Factory;

import org.eclipse.uml2.impl.DataStoreNodeImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Store Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataStoreNodeImplTest extends CentralBufferNodeImplTest {

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
		TestRunner.run(DataStoreNodeImplTest.class);
	}

	/**
	 * Constructs a new Data Store Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStoreNodeImplTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Store Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DataStoreNodeImpl getFixture() {
		return (DataStoreNodeImpl) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture((DataStoreNodeImpl) UML2Factory.eINSTANCE.createDataStoreNode());
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

} //DataStoreNodeImplTest
