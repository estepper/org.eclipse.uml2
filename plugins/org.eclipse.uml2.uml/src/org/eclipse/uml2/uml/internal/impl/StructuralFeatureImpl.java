/*
 * Copyright (c) 2005, 2008 IBM Corporation, Embarcadero Technologies, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey (Embarcadero Technologies) - 204200
 *
 * $Id: StructuralFeatureImpl.java,v 1.29 2008/10/02 20:56:21 jbruck Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.MultiplicityElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#isReadOnly <em>Is Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StructuralFeatureImpl
		extends FeatureImpl
		implements StructuralFeature {

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #isOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_ORDERED_EFLAG = 1 << 14;

	/**
	 * The default value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_UNIQUE_EFLAG = 1 << 15;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 1;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperValue;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification lowerValue;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_READ_ONLY_EFLAG = 1 << 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralFeatureImpl() {
		super();
		eFlags |= IS_UNIQUE_EFLAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.STRUCTURAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Type) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.STRUCTURAL_FEATURE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STRUCTURAL_FEATURE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			@SuppressWarnings("unchecked")
			EList<Element> ownedElements = (EList<Element>) cache.get(
				eResource, this, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList<Element>(
						Element.class, this,
						UMLPackage.STRUCTURAL_FEATURE__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList<Element>(Element.class, this,
			UMLPackage.STRUCTURAL_FEATURE__OWNED_ELEMENT,
			OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return (eFlags & IS_ORDERED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = (eFlags & IS_ORDERED_EFLAG) != 0;
		if (newIsOrdered)
			eFlags |= IS_ORDERED_EFLAG;
		else
			eFlags &= ~IS_ORDERED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STRUCTURAL_FEATURE__IS_ORDERED, oldIsOrdered,
				newIsOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return (eFlags & IS_UNIQUE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = (eFlags & IS_UNIQUE_EFLAG) != 0;
		if (newIsUnique)
			eFlags |= IS_UNIQUE_EFLAG;
		else
			eFlags &= ~IS_UNIQUE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE, oldIsUnique,
				newIsUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		return MultiplicityElementOperations.getUpper(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		MultiplicityElementOperations.setUpper(this, newUpper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return MultiplicityElementOperations.getLower(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		MultiplicityElementOperations.setLower(this, newLower);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		if (upperValue != null && upperValue.eIsProxy()) {
			InternalEObject oldUpperValue = (InternalEObject) upperValue;
			upperValue = (ValueSpecification) eResolveProxy(oldUpperValue);
			if (upperValue != oldUpperValue) {
				InternalEObject newUpperValue = (InternalEObject) upperValue;
				NotificationChain msgs = oldUpperValue.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE, null,
					null);
				if (newUpperValue.eInternalContainer() == null) {
					msgs = newUpperValue.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE, null,
						msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE,
						oldUpperValue, upperValue));
			}
		}
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(
			ValueSpecification newUpperValue, NotificationChain msgs) {
		ValueSpecification oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE,
				oldUpperValue, newUpperValue);
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
	public void setUpperValue(ValueSpecification newUpperValue) {
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject) upperValue).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE, null,
					msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject) newUpperValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE, null,
					msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE, newUpperValue,
				newUpperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createUpperValue(String name, Type type,
			EClass eClass) {
		ValueSpecification newUpperValue = (ValueSpecification) create(eClass);
		setUpperValue(newUpperValue);
		if (name != null)
			newUpperValue.setName(name);
		if (type != null)
			newUpperValue.setType(type);
		return newUpperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getLowerValue() {
		if (lowerValue != null && lowerValue.eIsProxy()) {
			InternalEObject oldLowerValue = (InternalEObject) lowerValue;
			lowerValue = (ValueSpecification) eResolveProxy(oldLowerValue);
			if (lowerValue != oldLowerValue) {
				InternalEObject newLowerValue = (InternalEObject) lowerValue;
				NotificationChain msgs = oldLowerValue.eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE, null,
					null);
				if (newLowerValue.eInternalContainer() == null) {
					msgs = newLowerValue.eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
							- UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE, null,
						msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE,
						oldLowerValue, lowerValue));
			}
		}
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(
			ValueSpecification newLowerValue, NotificationChain msgs) {
		ValueSpecification oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
				Notification.SET, UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE,
				oldLowerValue, newLowerValue);
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
	public void setLowerValue(ValueSpecification newLowerValue) {
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject) lowerValue).eInverseRemove(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE, null,
					msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject) newLowerValue).eInverseAdd(this,
					EOPPOSITE_FEATURE_BASE
						- UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE, null,
					msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE, newLowerValue,
				newLowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createLowerValue(String name, Type type,
			EClass eClass) {
		ValueSpecification newLowerValue = (ValueSpecification) create(eClass);
		setLowerValue(newLowerValue);
		if (name != null)
			newLowerValue.setName(name);
		if (type != null)
			newLowerValue.setType(type);
		return newLowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return (eFlags & IS_READ_ONLY_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = (eFlags & IS_READ_ONLY_EFLAG) != 0;
		if (newIsReadOnly)
			eFlags |= IS_READ_ONLY_EFLAG;
		else
			eFlags &= ~IS_READ_ONLY_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY, oldIsReadOnly,
				newIsReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerGe0(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultiplicityElementOperations.validateLowerGe0(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGeLower(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MultiplicityElementOperations.validateUpperGeLower(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationNoSideEffects(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MultiplicityElementOperations
			.validateValueSpecificationNoSideEffects(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationConstant(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MultiplicityElementOperations
			.validateValueSpecificationConstant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultivalued() {
		return MultiplicityElementOperations.isMultivalued(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesCardinality(int C) {
		return MultiplicityElementOperations.includesCardinality(this, C);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesMultiplicity(MultiplicityElement M) {
		return MultiplicityElementOperations.includesMultiplicity(this, M);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lowerBound() {
		return MultiplicityElementOperations.lowerBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upperBound() {
		return MultiplicityElementOperations.upperBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean compatibleWith(MultiplicityElement other) {
		return MultiplicityElementOperations.compatibleWith(this, other);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is(int lowerbound, int upperbound) {
		return MultiplicityElementOperations.is(this, lowerbound, upperbound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.STRUCTURAL_FEATURE__EANNOTATIONS :
				return ((InternalEList<?>) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURAL_FEATURE__OWNED_COMMENT :
				return ((InternalEList<?>) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.STRUCTURAL_FEATURE__CLIENT_DEPENDENCY :
				return ((InternalEList<?>) getClientDependencies())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.STRUCTURAL_FEATURE__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE :
				return basicSetUpperValue(null, msgs);
			case UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE :
				return basicSetLowerValue(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.STRUCTURAL_FEATURE__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.STRUCTURAL_FEATURE__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.STRUCTURAL_FEATURE__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.STRUCTURAL_FEATURE__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.STRUCTURAL_FEATURE__NAME :
				return getName();
			case UMLPackage.STRUCTURAL_FEATURE__VISIBILITY :
				return getVisibility();
			case UMLPackage.STRUCTURAL_FEATURE__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.STRUCTURAL_FEATURE__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.STRUCTURAL_FEATURE__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.STRUCTURAL_FEATURE__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.STRUCTURAL_FEATURE__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STRUCTURAL_FEATURE__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.STRUCTURAL_FEATURE__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.STRUCTURAL_FEATURE__IS_STATIC :
				return isStatic()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STRUCTURAL_FEATURE__FEATURING_CLASSIFIER :
				return getFeaturingClassifiers();
			case UMLPackage.STRUCTURAL_FEATURE__TYPE :
				if (resolve)
					return getType();
				return basicGetType();
			case UMLPackage.STRUCTURAL_FEATURE__IS_ORDERED :
				return isOrdered()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE :
				return isUnique()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.STRUCTURAL_FEATURE__UPPER :
				return new Integer(getUpper());
			case UMLPackage.STRUCTURAL_FEATURE__LOWER :
				return new Integer(getLower());
			case UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE :
				if (resolve)
					return getUpperValue();
				return basicGetUpperValue();
			case UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE :
				if (resolve)
					return getLowerValue();
				return basicGetLowerValue();
			case UMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY :
				return isReadOnly()
					? Boolean.TRUE
					: Boolean.FALSE;
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.STRUCTURAL_FEATURE__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll(
					(Collection<? extends EAnnotation>) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll(
					(Collection<? extends Comment>) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll(
					(Collection<? extends Dependency>) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_STATIC :
				setIsStatic(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STRUCTURAL_FEATURE__TYPE :
				setType((Type) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_ORDERED :
				setIsOrdered(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE :
				setIsUnique(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.STRUCTURAL_FEATURE__UPPER :
				setUpper(((Integer) newValue).intValue());
				return;
			case UMLPackage.STRUCTURAL_FEATURE__LOWER :
				setLower(((Integer) newValue).intValue());
				return;
			case UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE :
				setUpperValue((ValueSpecification) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE :
				setLowerValue((ValueSpecification) newValue);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY :
				setIsReadOnly(((Boolean) newValue).booleanValue());
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.STRUCTURAL_FEATURE__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.STRUCTURAL_FEATURE__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.STRUCTURAL_FEATURE__NAME :
				unsetName();
				return;
			case UMLPackage.STRUCTURAL_FEATURE__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.STRUCTURAL_FEATURE__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.STRUCTURAL_FEATURE__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_STATIC :
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__TYPE :
				setType((Type) null);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_ORDERED :
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE :
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__UPPER :
				setUpper(UPPER_EDEFAULT);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__LOWER :
				setLower(LOWER_EDEFAULT);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE :
				setUpperValue((ValueSpecification) null);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE :
				setLowerValue((ValueSpecification) null);
				return;
			case UMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY :
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.STRUCTURAL_FEATURE__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.STRUCTURAL_FEATURE__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.STRUCTURAL_FEATURE__OWNER :
				return isSetOwner();
			case UMLPackage.STRUCTURAL_FEATURE__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.STRUCTURAL_FEATURE__NAME :
				return isSetName();
			case UMLPackage.STRUCTURAL_FEATURE__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.STRUCTURAL_FEATURE__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.STRUCTURAL_FEATURE__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.STRUCTURAL_FEATURE__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.STRUCTURAL_FEATURE__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.STRUCTURAL_FEATURE__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.STRUCTURAL_FEATURE__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.STRUCTURAL_FEATURE__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.STRUCTURAL_FEATURE__IS_STATIC :
				return ((eFlags & IS_STATIC_EFLAG) != 0) != IS_STATIC_EDEFAULT;
			case UMLPackage.STRUCTURAL_FEATURE__FEATURING_CLASSIFIER :
				return isSetFeaturingClassifiers();
			case UMLPackage.STRUCTURAL_FEATURE__TYPE :
				return type != null;
			case UMLPackage.STRUCTURAL_FEATURE__IS_ORDERED :
				return ((eFlags & IS_ORDERED_EFLAG) != 0) != IS_ORDERED_EDEFAULT;
			case UMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE :
				return ((eFlags & IS_UNIQUE_EFLAG) != 0) != IS_UNIQUE_EDEFAULT;
			case UMLPackage.STRUCTURAL_FEATURE__UPPER :
				return getUpper() != UPPER_EDEFAULT;
			case UMLPackage.STRUCTURAL_FEATURE__LOWER :
				return getLower() != LOWER_EDEFAULT;
			case UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE :
				return upperValue != null;
			case UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE :
				return lowerValue != null;
			case UMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY :
				return ((eFlags & IS_READ_ONLY_EFLAG) != 0) != IS_READ_ONLY_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.STRUCTURAL_FEATURE__TYPE :
					return UMLPackage.TYPED_ELEMENT__TYPE;
				default :
					return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case UMLPackage.STRUCTURAL_FEATURE__IS_ORDERED :
					return UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case UMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE :
					return UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case UMLPackage.STRUCTURAL_FEATURE__UPPER :
					return UMLPackage.MULTIPLICITY_ELEMENT__UPPER;
				case UMLPackage.STRUCTURAL_FEATURE__LOWER :
					return UMLPackage.MULTIPLICITY_ELEMENT__LOWER;
				case UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE :
					return UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE;
				case UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE :
					return UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.TYPED_ELEMENT__TYPE :
					return UMLPackage.STRUCTURAL_FEATURE__TYPE;
				default :
					return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED :
					return UMLPackage.STRUCTURAL_FEATURE__IS_ORDERED;
				case UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE :
					return UMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE;
				case UMLPackage.MULTIPLICITY_ELEMENT__UPPER :
					return UMLPackage.STRUCTURAL_FEATURE__UPPER;
				case UMLPackage.MULTIPLICITY_ELEMENT__LOWER :
					return UMLPackage.STRUCTURAL_FEATURE__LOWER;
				case UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE :
					return UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE;
				case UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE :
					return UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isOrdered: "); //$NON-NLS-1$
		result.append((eFlags & IS_ORDERED_EFLAG) != 0);
		result.append(", isUnique: "); //$NON-NLS-1$
		result.append((eFlags & IS_UNIQUE_EFLAG) != 0);
		result.append(", isReadOnly: "); //$NON-NLS-1$
		result.append((eFlags & IS_READ_ONLY_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[]{
		UMLPackage.STRUCTURAL_FEATURE__OWNED_COMMENT,
		UMLPackage.STRUCTURAL_FEATURE__NAME_EXPRESSION,
		UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE,
		UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE)
			|| eIsSet(UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE);
	}

} //StructuralFeatureImpl
