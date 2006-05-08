/*
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: AddStructuralFeatureValueActionImpl.java,v 1.20 2006/05/08 17:46:10 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.AddStructuralFeatureValueActionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Structural Feature Value Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AddStructuralFeatureValueActionImpl#isReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AddStructuralFeatureValueActionImpl#getInsertAt <em>Insert At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddStructuralFeatureValueActionImpl
		extends WriteStructuralFeatureActionImpl
		implements AddStructuralFeatureValueAction {

	/**
	 * The default value of the '{@link #isReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REPLACE_ALL_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_REPLACE_ALL_EFLAG = 1 << 11;

	/**
	 * The cached value of the '{@link #getInsertAt() <em>Insert At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertAt()
	 * @generated
	 * @ordered
	 */
	protected InputPin insertAt = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddStructuralFeatureValueActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ADD_STRUCTURAL_FEATURE_VALUE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList inputs = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ACTION__INPUT);
			if (inputs == null) {
				cache.put(eResource, this, UMLPackage.Literals.ACTION__INPUT,
					inputs = new DerivedUnionEObjectEList(InputPin.class, this,
						UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT,
						INPUT_ESUBSETS));
			}
			return inputs;
		}
		return new DerivedUnionEObjectEList(InputPin.class, this,
			UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT,
			INPUT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReplaceAll() {
		return (eFlags & IS_REPLACE_ALL_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReplaceAll(boolean newIsReplaceAll) {
		boolean oldIsReplaceAll = (eFlags & IS_REPLACE_ALL_EFLAG) != 0;
		if (newIsReplaceAll)
			eFlags |= IS_REPLACE_ALL_EFLAG;
		else
			eFlags &= ~IS_REPLACE_ALL_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL,
				oldIsReplaceAll, newIsReplaceAll));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getInsertAt() {
		if (insertAt != null && insertAt.eIsProxy()) {
			InternalEObject oldInsertAt = (InternalEObject) insertAt;
			insertAt = (InputPin) eResolveProxy(oldInsertAt);
			if (insertAt != oldInsertAt) {
				InternalEObject newInsertAt = (InternalEObject) insertAt;
				NotificationChain msgs = oldInsertAt
					.eInverseRemove(
						this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT,
						null, null);
				if (newInsertAt.eInternalContainer() == null) {
					msgs = newInsertAt
						.eInverseAdd(
							this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(
						this,
						Notification.RESOLVE,
						UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT,
						oldInsertAt, insertAt));
			}
		}
		return insertAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetInsertAt() {
		return insertAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsertAt(InputPin newInsertAt,
			NotificationChain msgs) {
		InputPin oldInsertAt = insertAt;
		insertAt = newInsertAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET,
				UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT,
				oldInsertAt, newInsertAt);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertAt(InputPin newInsertAt) {
		if (newInsertAt != insertAt) {
			NotificationChain msgs = null;
			if (insertAt != null)
				msgs = ((InternalEObject) insertAt)
					.eInverseRemove(
						this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT,
						null, msgs);
			if (newInsertAt != null)
				msgs = ((InternalEObject) newInsertAt)
					.eInverseAdd(
						this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT,
						null, msgs);
			msgs = basicSetInsertAt(newInsertAt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT,
				newInsertAt, newInsertAt));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createInsertAt(String name, Type type, EClass eClass) {
		InputPin newInsertAt = (InputPin) create(eClass);
		setInsertAt(newInsertAt);
		if (name != null)
			newInsertAt.setName(name);
		if (type != null)
			newInsertAt.setType(type);
		return newInsertAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createInsertAt(String name, Type type) {
		return createInsertAt(name, type, UMLPackage.Literals.INPUT_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlimitedNaturalAndMultiplicity(
			DiagnosticChain diagnostics, Map context) {
		return AddStructuralFeatureValueActionOperations
			.validateUnlimitedNaturalAndMultiplicity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE :
				return basicSetInStructuredNode(null, msgs);
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY :
				return basicSetActivity(null, msgs);
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING :
				return ((InternalEList) getOutgoings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING :
				return ((InternalEList) getIncomings()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION :
				return ((InternalEList) getInPartitions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				return ((InternalEList) getInInterruptibleRegions())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER :
				return ((InternalEList) getHandlers()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION :
				return ((InternalEList) getLocalPreconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION :
				return ((InternalEList) getLocalPostconditions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT :
				return basicSetObject(null, msgs);
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE :
				return basicSetValue(null, msgs);
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT :
				return basicSetInsertAt(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME :
				return getName();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VISIBILITY :
				return getVisibility();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE :
				if (resolve)
					return getInStructuredNode();
				return basicGetInStructuredNode();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY :
				if (resolve)
					return getActivity();
				return basicGetActivity();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING :
				return getOutgoings();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING :
				return getIncomings();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION :
				return getInPartitions();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				return getInInterruptibleRegions();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_GROUP :
				return getInGroups();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_NODE :
				return getRedefinedNodes();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER :
				return getHandlers();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTPUT :
				return getOutputs();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT :
				return getInputs();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CONTEXT :
				if (resolve)
					return getContext();
				return basicGetContext();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION :
				return getLocalPreconditions();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION :
				return getLocalPostconditions();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE :
				if (resolve)
					return getStructuralFeature();
				return basicGetStructuralFeature();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT :
				if (resolve)
					return getObject();
				return basicGetObject();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE :
				if (resolve)
					return getValue();
				return basicGetValue();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL :
				return isReplaceAll()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT :
				if (resolve)
					return getInsertAt();
				return basicGetInsertAt();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY :
				setActivity((Activity) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING :
				getOutgoings().clear();
				getOutgoings().addAll((Collection) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING :
				getIncomings().clear();
				getIncomings().addAll((Collection) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				getInPartitions().addAll((Collection) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				getRedefinedNodes().addAll((Collection) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER :
				getHandlers().clear();
				getHandlers().addAll((Collection) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE :
				setStructuralFeature((StructuralFeature) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT :
				setObject((InputPin) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE :
				setValue((InputPin) newValue);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL :
				setIsReplaceAll(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT :
				setInsertAt((InputPin) newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME :
				unsetName();
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE :
				setInStructuredNode((StructuredActivityNode) null);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY :
				setActivity((Activity) null);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING :
				getOutgoings().clear();
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING :
				getIncomings().clear();
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION :
				getInPartitions().clear();
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				getInInterruptibleRegions().clear();
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_NODE :
				getRedefinedNodes().clear();
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER :
				getHandlers().clear();
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION :
				getLocalPreconditions().clear();
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION :
				getLocalPostconditions().clear();
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE :
				setStructuralFeature((StructuralFeature) null);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT :
				setObject((InputPin) null);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE :
				setValue((InputPin) null);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL :
				setIsReplaceAll(IS_REPLACE_ALL_EDEFAULT);
				return;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT :
				setInsertAt((InputPin) null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNER :
				return isSetOwner();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME :
				return isSetName();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE :
				return basicGetInStructuredNode() != null;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY :
				return basicGetActivity() != null;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING :
				return outgoings != null && !outgoings.isEmpty();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING :
				return incomings != null && !incomings.isEmpty();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION :
				return inPartitions != null && !inPartitions.isEmpty();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION :
				return inInterruptibleRegions != null
					&& !inInterruptibleRegions.isEmpty();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_GROUP :
				return isSetInGroups();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_NODE :
				return redefinedNodes != null && !redefinedNodes.isEmpty();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER :
				return handlers != null && !handlers.isEmpty();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTPUT :
				return isSetOutputs();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT :
				return isSetInputs();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CONTEXT :
				return basicGetContext() != null;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION :
				return localPreconditions != null
					&& !localPreconditions.isEmpty();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION :
				return localPostconditions != null
					&& !localPostconditions.isEmpty();
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE :
				return structuralFeature != null;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT :
				return object != null;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE :
				return value != null;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL :
				return ((eFlags & IS_REPLACE_ALL_EFLAG) != 0) != IS_REPLACE_ALL_EDEFAULT;
			case UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT :
				return insertAt != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isReplaceAll: "); //$NON-NLS-1$
		result.append((eFlags & IS_REPLACE_ALL_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getInputs() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected static final int[] INPUT_ESUBSETS = new int[]{
		UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT,
		UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE,
		UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UMLPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT);
	}

} //AddStructuralFeatureValueActionImpl
