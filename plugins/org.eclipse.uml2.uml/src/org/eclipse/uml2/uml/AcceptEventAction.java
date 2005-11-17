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
 * $Id: AcceptEventAction.java,v 1.1 2005/11/14 22:25:56 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AcceptEventAction is an action that waits for the occurrence of an event meeting specified conditions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.AcceptEventAction#isUnmarshall <em>Is Unmarshall</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptEventAction#getResults <em>Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.AcceptEventAction#getTriggers <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getAcceptEventAction()
 * @model
 * @generated
 */
public interface AcceptEventAction
		extends Action {

	/**
	 * Returns the value of the '<em><b>Is Unmarshall</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether there is a single output pin for the event, or multiple output pins for attributes of the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Unmarshall</em>' attribute.
	 * @see #setIsUnmarshall(boolean)
	 * @see org.eclipse.uml2.uml.UMLPackage#getAcceptEventAction_IsUnmarshall()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isUnmarshall();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.AcceptEventAction#isUnmarshall <em>Is Unmarshall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unmarshall</em>' attribute.
	 * @see #isUnmarshall()
	 * @generated
	 */
	void setIsUnmarshall(boolean value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pins holding the received event objects or their attributes. Event objects may be copied in transmission, so identity might not be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getAcceptEventAction_Result()
	 * @model type="org.eclipse.uml2.uml.OutputPin" ordered="false"
	 * @generated
	 */
	List getResults();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>' from the '<em><b>Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.OutputPin} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.OutputPin} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getResults()
	 * @generated
	 */
	OutputPin getResult(String name);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of events accepted by the action, as specified by triggers. For triggers with signal events, a signal of the specified type or any subtype of the specified signal type is accepted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getAcceptEventAction_Trigger()
	 * @model type="org.eclipse.uml2.uml.Trigger" containment="true" resolveProxies="false" required="true" ordered="false"
	 * @generated
	 */
	List getTriggers();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Trigger} and appends it to the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Trigger}.
	 * @see #getTriggers()
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Trigger} with the specified '<em><b>Name</b></em>' from the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Trigger} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Trigger} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getTriggers()
	 * @generated
	 */
	Trigger getTrigger(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AcceptEventActions may have no input pins.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoInputPins(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There are no output pins if the trigger events are only ChangeEvents, or if they are only CallEvents when this action is an instance of AcceptEventAction and not an instance of a descendant of AcceptEventAction (such as AcceptCallAction).
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoOutputPins(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the trigger events are all TimeEvents, there is exactly one output pin.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateTriggerEvents(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If isUnmarshall is true, there must be exactly one trigger for events of type SignalEvent. The number of result output pins must be the same as the number of attributes of the signal. The type and ordering of each result output pin must be the same as the corresponding attribute of the signal. The multiplicity of each result output pin must be compatible with the multiplicity of the corresponding attribute.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateIsUnmarshall(DiagnosticChain diagnostics, Map context);

} // AcceptEventAction