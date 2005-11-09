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
 * $Id: StartOwnedBehaviorActionImpl.java,v 1.16 2005/11/09 22:53:08 khussey Exp $
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
import org.eclipse.uml2.StartOwnedBehaviorAction;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.StructuredActivityNode;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Owned Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.StartOwnedBehaviorActionImpl#getInputs <em>Input</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.StartOwnedBehaviorActionImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartOwnedBehaviorActionImpl extends ActionImpl implements StartOwnedBehaviorAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected InputPin object = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartOwnedBehaviorActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UML2Package.eINSTANCE.getStartOwnedBehaviorAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputs() {
		if (input == null) {
			input = new DerivedUnionEObjectEList(InputPin.class, this, UML2Package.START_OWNED_BEHAVIOR_ACTION__INPUT, new EStructuralFeature[] {UML2Package.eINSTANCE.getStartOwnedBehaviorAction_Object()});
		}
		return input;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputs() {
		return super.isSetInputs()
			|| eIsSet(UML2Package.eINSTANCE.getStartOwnedBehaviorAction_Object());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(InputPin newObject, NotificationChain msgs) {
		InputPin oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UML2Package.START_OWNED_BEHAVIOR_ACTION__OBJECT, oldObject, newObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(InputPin newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.START_OWNED_BEHAVIOR_ACTION__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UML2Package.START_OWNED_BEHAVIOR_ACTION__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.START_OWNED_BEHAVIOR_ACTION__OBJECT, newObject, newObject));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createObject(EClass eClass) {
		InputPin newObject = (InputPin) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.START_OWNED_BEHAVIOR_ACTION__OBJECT, null, newObject));
		}
		setObject(newObject);
		return newObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin createObject() {
		InputPin newObject = UML2Factory.eINSTANCE.createInputPin();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.START_OWNED_BEHAVIOR_ACTION__OBJECT, null, newObject));
		}
		setObject(newObject);
		return newObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.START_OWNED_BEHAVIOR_ACTION__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.START_OWNED_BEHAVIOR_ACTION__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.START_OWNED_BEHAVIOR_ACTION__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.START_OWNED_BEHAVIOR_ACTION__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.START_OWNED_BEHAVIOR_ACTION__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.START_OWNED_BEHAVIOR_ACTION__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.START_OWNED_BEHAVIOR_ACTION__OUTGOING:
					return ((InternalEList)getOutgoings()).basicRemove(otherEnd, msgs);
				case UML2Package.START_OWNED_BEHAVIOR_ACTION__INCOMING:
					return ((InternalEList)getIncomings()).basicRemove(otherEnd, msgs);
				case UML2Package.START_OWNED_BEHAVIOR_ACTION__ACTIVITY:
					return eBasicSetContainer(null, UML2Package.START_OWNED_BEHAVIOR_ACTION__ACTIVITY, msgs);
				case UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_STRUCTURED_NODE:
					return eBasicSetContainer(null, UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_STRUCTURED_NODE, msgs);
				case UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_PARTITION:
					return ((InternalEList)getInPartitions()).basicRemove(otherEnd, msgs);
				case UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION:
					return ((InternalEList)getInInterruptibleRegions()).basicRemove(otherEnd, msgs);
				case UML2Package.START_OWNED_BEHAVIOR_ACTION__HANDLER:
					return ((InternalEList)getHandlers()).basicRemove(otherEnd, msgs);
				case UML2Package.START_OWNED_BEHAVIOR_ACTION__LOCAL_PRECONDITION:
					return ((InternalEList)getLocalPreconditions()).basicRemove(otherEnd, msgs);
				case UML2Package.START_OWNED_BEHAVIOR_ACTION__LOCAL_POSTCONDITION:
					return ((InternalEList)getLocalPostconditions()).basicRemove(otherEnd, msgs);
				case UML2Package.START_OWNED_BEHAVIOR_ACTION__OBJECT:
					return basicSetObject(null, msgs);
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
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__NAME:
				return getName();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__VISIBILITY:
				return getVisibility();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OUTGOING:
				return getOutgoings();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__INCOMING:
				return getIncomings();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_GROUP:
				return getInGroups();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__ACTIVITY:
				return getActivity();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__REDEFINED_ELEMENT:
				return getRedefinedElements();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_PARTITION:
				return getInPartitions();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION:
				return getInInterruptibleRegions();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__HANDLER:
				return getHandlers();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__EFFECT:
				return getEffect();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OUTPUT:
				return getOutputs();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__INPUT:
				return getInputs();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__CONTEXT:
				return getContext();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__LOCAL_PRECONDITION:
				return getLocalPreconditions();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__LOCAL_POSTCONDITION:
				return getLocalPostconditions();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OBJECT:
				return getObject();
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
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__NAME:
				setName((String)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OUTGOING:
				getOutgoings().clear();
				getOutgoings().addAll((Collection)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__INCOMING:
				getIncomings().clear();
				getIncomings().addAll((Collection)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				getRedefinedElements().addAll((Collection)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_PARTITION:
				getInPartitions().clear();
				getInPartitions().addAll((Collection)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				getInInterruptibleRegions().addAll((Collection)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__HANDLER:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__EFFECT:
				setEffect((String)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				getLocalPreconditions().addAll((Collection)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				getLocalPostconditions().addAll((Collection)newValue);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OBJECT:
				setObject((InputPin)newValue);
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
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OUTGOING:
				getOutgoings().clear();
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__INCOMING:
				getIncomings().clear();
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__ACTIVITY:
				setActivity((Activity)null);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__REDEFINED_ELEMENT:
				getRedefinedElements().clear();
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_STRUCTURED_NODE:
				setInStructuredNode((StructuredActivityNode)null);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_PARTITION:
				getInPartitions().clear();
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION:
				getInInterruptibleRegions().clear();
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__HANDLER:
				getHandlers().clear();
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__LOCAL_PRECONDITION:
				getLocalPreconditions().clear();
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__LOCAL_POSTCONDITION:
				getLocalPostconditions().clear();
				return;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OBJECT:
				setObject((InputPin)null);
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
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OWNED_ELEMENT:
				return isSetOwnedElements();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OWNER:
				return isSetOwner();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__REDEFINITION_CONTEXT:
				return isSetRedefinitionContexts();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_GROUP:
				return isSetInGroups();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__ACTIVITY:
				return getActivity() != null;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__REDEFINED_ELEMENT:
				return isSetRedefinedElements();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_STRUCTURED_NODE:
				return getInStructuredNode() != null;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_PARTITION:
				return inPartition != null && !inPartition.isEmpty();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION:
				return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__HANDLER:
				return handler != null && !handler.isEmpty();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__EFFECT:
				return EFFECT_EDEFAULT == null ? effect != null : !EFFECT_EDEFAULT.equals(effect);
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OUTPUT:
				return isSetOutputs();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__INPUT:
				return isSetInputs();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__CONTEXT:
				return getContext() != null;
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__LOCAL_PRECONDITION:
				return localPrecondition != null && !localPrecondition.isEmpty();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__LOCAL_POSTCONDITION:
				return localPostcondition != null && !localPostcondition.isEmpty();
			case UML2Package.START_OWNED_BEHAVIOR_ACTION__OBJECT:
				return object != null;
		}
		return eDynamicIsSet(eFeature);
	}


} //StartOwnedBehaviorActionImpl
