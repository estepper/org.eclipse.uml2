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
 * $Id: ExecutionSpecificationImpl.java,v 1.2 2005/11/22 15:32:36 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.ExecutionOccurrenceSpecification;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ExecutionSpecificationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExecutionSpecificationImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ExecutionSpecificationImpl#getFinish <em>Finish</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExecutionSpecificationImpl
		extends InteractionFragmentImpl
		implements ExecutionSpecification {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getExecutionSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOccurrenceSpecification getStart() {
		ExecutionOccurrenceSpecification start = (ExecutionOccurrenceSpecification) eVirtualGet(UMLPackage.EXECUTION_SPECIFICATION__START);
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject) start;
			start = (ExecutionOccurrenceSpecification) eResolveProxy(oldStart);
			if (start != oldStart) {
				eVirtualSet(UMLPackage.EXECUTION_SPECIFICATION__START, start);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.EXECUTION_SPECIFICATION__START, oldStart,
						start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOccurrenceSpecification basicGetStart() {
		return (ExecutionOccurrenceSpecification) eVirtualGet(UMLPackage.EXECUTION_SPECIFICATION__START);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(ExecutionOccurrenceSpecification newStart) {
		ExecutionOccurrenceSpecification start = newStart;
		Object oldStart = eVirtualSet(
			UMLPackage.EXECUTION_SPECIFICATION__START, start);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXECUTION_SPECIFICATION__START,
				oldStart == EVIRTUAL_NO_VALUE
					? null
					: oldStart, start));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOccurrenceSpecification getFinish() {
		ExecutionOccurrenceSpecification finish = (ExecutionOccurrenceSpecification) eVirtualGet(UMLPackage.EXECUTION_SPECIFICATION__FINISH);
		if (finish != null && finish.eIsProxy()) {
			InternalEObject oldFinish = (InternalEObject) finish;
			finish = (ExecutionOccurrenceSpecification) eResolveProxy(oldFinish);
			if (finish != oldFinish) {
				eVirtualSet(UMLPackage.EXECUTION_SPECIFICATION__FINISH, finish);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.EXECUTION_SPECIFICATION__FINISH, oldFinish,
						finish));
			}
		}
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOccurrenceSpecification basicGetFinish() {
		return (ExecutionOccurrenceSpecification) eVirtualGet(UMLPackage.EXECUTION_SPECIFICATION__FINISH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinish(ExecutionOccurrenceSpecification newFinish) {
		ExecutionOccurrenceSpecification finish = newFinish;
		Object oldFinish = eVirtualSet(
			UMLPackage.EXECUTION_SPECIFICATION__FINISH, finish);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.EXECUTION_SPECIFICATION__FINISH,
				oldFinish == EVIRTUAL_NO_VALUE
					? null
					: oldFinish, finish));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSameLifeline(DiagnosticChain diagnostics, Map context) {
		return ExecutionSpecificationOperations.validateSameLifeline(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.EXECUTION_SPECIFICATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.EXECUTION_SPECIFICATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.EXECUTION_SPECIFICATION__OWNER :
				return getOwner();
			case UMLPackage.EXECUTION_SPECIFICATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.EXECUTION_SPECIFICATION__NAME :
				return getName();
			case UMLPackage.EXECUTION_SPECIFICATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.EXECUTION_SPECIFICATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.EXECUTION_SPECIFICATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.EXECUTION_SPECIFICATION__COVERED :
				return getCovereds();
			case UMLPackage.EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				return getGeneralOrderings();
			case UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				return getEnclosingInteraction();
			case UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				return getEnclosingOperand();
			case UMLPackage.EXECUTION_SPECIFICATION__START :
				if (resolve)
					return getStart();
				return basicGetStart();
			case UMLPackage.EXECUTION_SPECIFICATION__FINISH :
				if (resolve)
					return getFinish();
				return basicGetFinish();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.EXECUTION_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__COVERED :
				getCovereds().clear();
				getCovereds().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				getGeneralOrderings().addAll((Collection) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__START :
				setStart((ExecutionOccurrenceSpecification) newValue);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__FINISH :
				setFinish((ExecutionOccurrenceSpecification) newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.EXECUTION_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__COVERED :
				getCovereds().clear();
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				getGeneralOrderings().clear();
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				setEnclosingInteraction((Interaction) null);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				setEnclosingOperand((InteractionOperand) null);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__START :
				setStart((ExecutionOccurrenceSpecification) null);
				return;
			case UMLPackage.EXECUTION_SPECIFICATION__FINISH :
				setFinish((ExecutionOccurrenceSpecification) null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.EXECUTION_SPECIFICATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.EXECUTION_SPECIFICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.EXECUTION_SPECIFICATION__OWNER :
				return isSetOwner();
			case UMLPackage.EXECUTION_SPECIFICATION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.EXECUTION_SPECIFICATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.EXECUTION_SPECIFICATION__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.EXECUTION_SPECIFICATION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.EXECUTION_SPECIFICATION__VISIBILITY :
				return eVirtualGet(
					UMLPackage.EXECUTION_SPECIFICATION__VISIBILITY,
					VISIBILITY_EDEFAULT) != VISIBILITY_EDEFAULT;
			case UMLPackage.EXECUTION_SPECIFICATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.EXECUTION_SPECIFICATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.EXECUTION_SPECIFICATION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.EXECUTION_SPECIFICATION__NAME_EXPRESSION) != null;
			case UMLPackage.EXECUTION_SPECIFICATION__COVERED :
				List covered = (List) eVirtualGet(UMLPackage.EXECUTION_SPECIFICATION__COVERED);
				return covered != null && !covered.isEmpty();
			case UMLPackage.EXECUTION_SPECIFICATION__GENERAL_ORDERING :
				List generalOrdering = (List) eVirtualGet(UMLPackage.EXECUTION_SPECIFICATION__GENERAL_ORDERING);
				return generalOrdering != null && !generalOrdering.isEmpty();
			case UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION :
				return getEnclosingInteraction() != null;
			case UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_OPERAND :
				return getEnclosingOperand() != null;
			case UMLPackage.EXECUTION_SPECIFICATION__START :
				return eVirtualGet(UMLPackage.EXECUTION_SPECIFICATION__START) != null;
			case UMLPackage.EXECUTION_SPECIFICATION__FINISH :
				return eVirtualGet(UMLPackage.EXECUTION_SPECIFICATION__FINISH) != null;
		}
		return eDynamicIsSet(eFeature);
	}

} //ExecutionSpecificationImpl
