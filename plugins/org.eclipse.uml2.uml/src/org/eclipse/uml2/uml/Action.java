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
 * $Id: Action.java,v 1.1 2005/11/14 22:25:56 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An action is a named element that is the fundamental unit of executable functionality. The execution of an action represents some transformation or processing in the modeled system, be it a computer system or otherwise.
 * An action may have sets of incoming and outgoing activity edges that specify control flow and data flow from and to other nodes. An action will not begin execution until all of its input conditions are satisfied. The completion of the execution of an action may enable the execution of a set of successor nodes and actions that take their inputs from the outputs of the action. In CompleteActivities, action is extended to have pre- and postconditions.
 * An action may have sets of incoming and outgoing activity edges that specify control flow and data flow from and to other nodes. An action will not begin execution until all of its input conditions are satisfied. The completion of the execution of an action may enable the execution of a set of successor nodes and actions that take their inputs from the outputs of the action.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Action#getOutputs <em>Output</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Action#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Action#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Action#getLocalPreconditions <em>Local Precondition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Action#getLocalPostconditions <em>Local Postcondition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getAction()
 * @model
 * @generated
 */
public interface Action
		extends ExecutableNode {

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of output pins connected to the Action. The action places its results onto pins in this set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getAction_Output()
	 * @model type="org.eclipse.uml2.uml.OutputPin" resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	List getOutputs();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>' from the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOutputs()
	 * @generated
	 */
	OutputPin getOutput(String name);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of input pins connected to the Action. These are among the total set of inputs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getAction_Input()
	 * @model type="org.eclipse.uml2.uml.InputPin" resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	List getInputs();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>' from the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.InputPin} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInputs()
	 * @generated
	 */
	InputPin getInput(String name);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier that owns the behavior of which this action is a part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see org.eclipse.uml2.uml.UMLPackage#getAction_Context()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Classifier getContext();

	/**
	 * Returns the value of the '<em><b>Local Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constraint that must be satisfied when execution is started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Precondition</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getAction_LocalPrecondition()
	 * @model type="org.eclipse.uml2.uml.Constraint" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getLocalPreconditions();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Constraint} and appends it to the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getLocalPreconditions()
	 * @generated
	 */
	Constraint createLocalPrecondition(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Constraint} and appends it to the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getLocalPreconditions()
	 * @generated
	 */
	Constraint createLocalPrecondition();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLocalPreconditions()
	 * @generated
	 */
	Constraint getLocalPrecondition(String name);

	/**
	 * Returns the value of the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constraint that must be satisfied when executed is completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Postcondition</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getAction_LocalPostcondition()
	 * @model type="org.eclipse.uml2.uml.Constraint" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getLocalPostconditions();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Constraint} and appends it to the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getLocalPostconditions()
	 * @generated
	 */
	Constraint createLocalPostcondition(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Constraint} and appends it to the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getLocalPostconditions()
	 * @generated
	 */
	Constraint createLocalPostcondition();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>' from the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Constraint} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Constraint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLocalPostconditions()
	 * @generated
	 */
	Constraint getLocalPostcondition(String name);

} // Action