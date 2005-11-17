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
 * $Id: SlotImpl.java,v 1.1 2005/11/14 22:26:03 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SlotImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SlotImpl#getOwningInstance <em>Owning Instance</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SlotImpl#getDefiningFeature <em>Defining Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.SlotImpl#getValues <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlotImpl
		extends ElementImpl
		implements Slot {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getSlot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getOwnedElements() {
		List ownedElement = (List) eVirtualGet(UMLPackage.SLOT__OWNED_ELEMENT);
		if (ownedElement == null) {
			eVirtualSet(UMLPackage.SLOT__OWNED_ELEMENT,
				ownedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.SLOT__OWNED_ELEMENT,
					new EStructuralFeature[]{
						UMLPackage.eINSTANCE.getElement_OwnedComment(),
						UMLPackage.eINSTANCE.getSlot_Value()}));
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification getOwningInstance() {
		if (eContainerFeatureID != UMLPackage.SLOT__OWNING_INSTANCE)
			return null;
		return (InstanceSpecification) eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningInstance(InstanceSpecification newOwningInstance) {
		if (newOwningInstance != eContainer
			|| (eContainerFeatureID != UMLPackage.SLOT__OWNING_INSTANCE && newOwningInstance != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newOwningInstance))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningInstance != null)
				msgs = ((InternalEObject) newOwningInstance).eInverseAdd(this,
					UMLPackage.INSTANCE_SPECIFICATION__SLOT,
					InstanceSpecification.class, msgs);
			msgs = eBasicSetContainer((InternalEObject) newOwningInstance,
				UMLPackage.SLOT__OWNING_INSTANCE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.SLOT__OWNING_INSTANCE, newOwningInstance,
				newOwningInstance));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature getDefiningFeature() {
		StructuralFeature definingFeature = (StructuralFeature) eVirtualGet(UMLPackage.SLOT__DEFINING_FEATURE);
		if (definingFeature != null && definingFeature.eIsProxy()) {
			StructuralFeature oldDefiningFeature = definingFeature;
			definingFeature = (StructuralFeature) eResolveProxy((InternalEObject) definingFeature);
			if (definingFeature != oldDefiningFeature) {
				eVirtualSet(UMLPackage.SLOT__DEFINING_FEATURE, definingFeature);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.SLOT__DEFINING_FEATURE, oldDefiningFeature,
						definingFeature));
			}
		}
		return definingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature basicGetDefiningFeature() {
		return (StructuralFeature) eVirtualGet(UMLPackage.SLOT__DEFINING_FEATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningFeature(StructuralFeature newDefiningFeature) {
		StructuralFeature definingFeature = newDefiningFeature;
		Object oldDefiningFeature = eVirtualSet(
			UMLPackage.SLOT__DEFINING_FEATURE, definingFeature);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.SLOT__DEFINING_FEATURE,
				oldDefiningFeature == EVIRTUAL_NO_VALUE
					? null
					: oldDefiningFeature, definingFeature));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getValues() {
		List value = (List) eVirtualGet(UMLPackage.SLOT__VALUE);
		if (value == null) {
			eVirtualSet(UMLPackage.SLOT__VALUE,
				value = new EObjectContainmentEList(ValueSpecification.class,
					this, UMLPackage.SLOT__VALUE));
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createValue(EClass eClass) {
		ValueSpecification newValue = (ValueSpecification) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getValues().add(newValue);
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getValue(String name) {
		for (Iterator i = getValues().iterator(); i.hasNext();) {
			ValueSpecification value = (ValueSpecification) i.next();
			if (name.equals(value.getName())) {
				return value;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.SLOT__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.SLOT__OWNING_INSTANCE :
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.SLOT__OWNING_INSTANCE, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UMLPackage.SLOT__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.SLOT__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.SLOT__OWNING_INSTANCE :
					return eBasicSetContainer(null,
						UMLPackage.SLOT__OWNING_INSTANCE, msgs);
				case UMLPackage.SLOT__VALUE :
					return ((InternalEList) getValues()).basicRemove(otherEnd,
						msgs);
				default :
					return eDynamicInverseRemove(otherEnd, featureID,
						baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case UMLPackage.SLOT__OWNING_INSTANCE :
					return eContainer.eInverseRemove(this,
						UMLPackage.INSTANCE_SPECIFICATION__SLOT,
						InstanceSpecification.class, msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
			- eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.SLOT__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.SLOT__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.SLOT__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.SLOT__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.SLOT__OWNING_INSTANCE :
				return getOwningInstance();
			case UMLPackage.SLOT__DEFINING_FEATURE :
				if (resolve)
					return getDefiningFeature();
				return basicGetDefiningFeature();
			case UMLPackage.SLOT__VALUE :
				return getValues();
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
			case UMLPackage.SLOT__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.SLOT__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.SLOT__OWNING_INSTANCE :
				setOwningInstance((InstanceSpecification) newValue);
				return;
			case UMLPackage.SLOT__DEFINING_FEATURE :
				setDefiningFeature((StructuralFeature) newValue);
				return;
			case UMLPackage.SLOT__VALUE :
				getValues().clear();
				getValues().addAll((Collection) newValue);
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
			case UMLPackage.SLOT__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.SLOT__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.SLOT__OWNING_INSTANCE :
				setOwningInstance((InstanceSpecification) null);
				return;
			case UMLPackage.SLOT__DEFINING_FEATURE :
				setDefiningFeature((StructuralFeature) null);
				return;
			case UMLPackage.SLOT__VALUE :
				getValues().clear();
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
			case UMLPackage.SLOT__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.SLOT__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.SLOT__OWNER :
				return isSetOwner();
			case UMLPackage.SLOT__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.SLOT__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.SLOT__OWNING_INSTANCE :
				return getOwningInstance() != null;
			case UMLPackage.SLOT__DEFINING_FEATURE :
				return eVirtualGet(UMLPackage.SLOT__DEFINING_FEATURE) != null;
			case UMLPackage.SLOT__VALUE :
				List value = (List) eVirtualGet(UMLPackage.SLOT__VALUE);
				return value != null && !value.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		InstanceSpecification owningInstance = getOwningInstance();
		if (owningInstance != null) {
			return owningInstance;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.eINSTANCE.getSlot_OwningInstance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.eINSTANCE.getSlot_Value());
	}

} //SlotImpl