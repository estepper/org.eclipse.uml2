/*
 * Copyright (c) 2003, 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: WriteStructuralFeatureActionImpl.java,v 1.14 2005/10/04 21:55:13 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Activity;
import org.eclipse.uml2.InputPin;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuralFeature;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;
import org.eclipse.uml2.WriteStructuralFeatureAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write Structural Feature Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.WriteStructuralFeatureActionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WriteStructuralFeatureActionImpl extends StructuralFeatureActionImpl implements WriteStructuralFeatureAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected InputPin value = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteStructuralFeatureActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getWriteStructuralFeatureAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(InputPin newValue, NotificationChain msgs) {
		InputPin oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(InputPin newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__VALUE, newValue, newValue));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createValue(EClass eClass) {
		InputPin newValue = (InputPin) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__VALUE, null, newValue));
		}
		setValue(newValue);
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createValue() {
		InputPin newValue = UML2Factory.eINSTANCE.createInputPin();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__VALUE, null, newValue));
		}
		setValue(newValue);
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OUTGOING:
					return ((InternalEList)getOutgoings()).basicAdd(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__INCOMING:
					return ((InternalEList)getIncomings()).basicAdd(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__ACTIVITY:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__ACTIVITY, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_PARTITION:
					return ((InternalEList)getInPartitions()).basicAdd(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION:
					return ((InternalEList)getInInterruptibleRegions()).basicAdd(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__HANDLER:
					return ((InternalEList)getHandlers()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OUTGOING:
					return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__INCOMING:
					return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__ACTIVITY:
					return eBasicSetContainer(null, UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__ACTIVITY, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE:
					return eBasicSetContainer(null, UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_PARTITION:
					return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION:
					return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__HANDLER:
					return ((InternalEList)getHandlers()).basicRemove(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION:
					return ((InternalEList)getLocalPreconditions()).basicRemove(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION:
					return ((InternalEList)getLocalPostconditions()).basicRemove(otherEnd, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OBJECT:
					return basicSetObject(null, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__VALUE:
					return basicSetValue(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
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
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__ACTIVITY:
					return eContainer.eInverseRemove(this, UML2Package.ACTIVITY__NODE, Activity.class, msgs);
				case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE:
					return eContainer.eInverseRemove(this, UML2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE, StructuredActivityNode.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__NAME:
				return getName();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__VISIBILITY:
				return getVisibility();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OUTGOING:
				return getOutgoings();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__INCOMING:
				return getIncomings();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_GROUP:
				return getInGroups();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__ACTIVITY:
				return getActivity();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_PARTITION:
				return getInPartitions();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__HANDLER:
				return getHandlers();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__EFFECT:
				return getEffect();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OUTPUT:
				return getOutputs();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__INPUT:
				return getInputs();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__CONTEXT:
				return getContext();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION:
				return getLocalPreconditions();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION:
				return getLocalPostconditions();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE:
				if (resolve) return getStructuralFeature();
				return basicGetStructuralFeature();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OBJECT:
				return getObject();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__VALUE:
				return getValue();
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
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__HANDLER:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__EFFECT:
				setEffect((String)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE:
				setStructuralFeature((StructuralFeature)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OBJECT:
				setObject((InputPin)newValue);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__VALUE:
				setValue((InputPin)newValue);
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
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__HANDLER:
				getHandlers().clear();
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE:
				setStructuralFeature((StructuralFeature)null);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OBJECT:
				setObject((InputPin)null);
				return;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__VALUE:
				setValue((InputPin)null);
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
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT:
				return eIsSet(UML2Package.eINSTANCE.getElement_OwnedComment())
					|| eIsSet(UML2Package.eINSTANCE.getTemplateableElement_TemplateBinding())
					|| eIsSet(UML2Package.eINSTANCE.getTemplateableElement_OwnedTemplateSignature())
					|| eIsSet(UML2Package.eINSTANCE.getNamedElement_NameExpression())
					|| eIsSet(UML2Package.eINSTANCE.getExecutableNode_Handler())
					|| eIsSet(UML2Package.eINSTANCE.getAction_LocalPrecondition())
					|| eIsSet(UML2Package.eINSTANCE.getAction_LocalPostcondition())
					|| eIsSet(UML2Package.eINSTANCE.getStructuralFeatureAction_Object())
					|| eIsSet(UML2Package.eINSTANCE.getWriteStructuralFeatureAction_Value());
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OWNER:
				return eIsSet(UML2Package.eINSTANCE.getActivityNode_Activity());
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_GROUP:
				return eIsSet(UML2Package.eINSTANCE.getActivityNode_InStructuredNode())
					|| eIsSet(UML2Package.eINSTANCE.getActivityNode_InPartition())
					|| eIsSet(UML2Package.eINSTANCE.getActivityNode_InInterruptibleRegion());
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__ACTIVITY:
				return getActivity() != null;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT:
				return redefinedElement != null && !redefinedElement.isEmpty();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_PARTITION:
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__HANDLER:
				return handler != null && !handler.isEmpty();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OUTPUT:
				return !getOutputs().isEmpty();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__INPUT:
				return eIsSet(UML2Package.eINSTANCE.getStructuralFeatureAction_Object())
					|| eIsSet(UML2Package.eINSTANCE.getWriteStructuralFeatureAction_Value());
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__CONTEXT:
				return getContext() != null;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION:
				return localPrecondition != null && !localPrecondition.isEmpty();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION:
				return localPostcondition != null && !localPostcondition.isEmpty();
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE:
				return structuralFeature != null;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__OBJECT:
				return object != null;
			case UML2Package.WRITE_STRUCTURAL_FEATURE_ACTION__VALUE:
				return value != null;
		}
		return eDynamicIsSet(eFeature);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getInputsHelper(EList input) {
		super.getInputsHelper(input);
		InputPin value = getValue();
		if (value != null) {
			input.add(value);
		}
		return input;
	}


} //WriteStructuralFeatureActionImpl
