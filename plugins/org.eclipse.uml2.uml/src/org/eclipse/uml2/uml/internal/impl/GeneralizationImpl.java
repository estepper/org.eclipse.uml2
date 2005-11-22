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
 * $Id: GeneralizationImpl.java,v 1.2 2005/11/22 15:32:38 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.GeneralizationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralizationImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralizationImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralizationImpl#isSubstitutable <em>Is Substitutable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralizationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralizationImpl#getGeneralizationSets <em>Generalization Set</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.GeneralizationImpl#getSpecific <em>Specific</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationImpl
		extends DirectedRelationshipImpl
		implements Generalization {

	/**
	 * The default value of the '{@link #isSubstitutable() <em>Is Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBSTITUTABLE_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isSubstitutable() <em>Is Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_SUBSTITUTABLE_EFLAG = 1 << 8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getGeneralization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getTargets() {
		List target = (List) eVirtualGet(UMLPackage.GENERALIZATION__TARGET);
		if (target == null) {
			eVirtualSet(UMLPackage.GENERALIZATION__TARGET,
				target = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.GENERALIZATION__TARGET,
					new EStructuralFeature[]{UMLPackage.eINSTANCE
						.getGeneralization_General()}));
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSources() {
		List source = (List) eVirtualGet(UMLPackage.GENERALIZATION__SOURCE);
		if (source == null) {
			eVirtualSet(UMLPackage.GENERALIZATION__SOURCE,
				source = new DerivedUnionEObjectEList(Element.class, this,
					UMLPackage.GENERALIZATION__SOURCE,
					new EStructuralFeature[]{UMLPackage.eINSTANCE
						.getGeneralization_Specific()}));
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubstitutable() {
		return (eFlags & IS_SUBSTITUTABLE_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSubstitutable(boolean newIsSubstitutable) {
		boolean oldIsSubstitutable = (eFlags & IS_SUBSTITUTABLE_EFLAG) != 0;
		if (newIsSubstitutable)
			eFlags |= IS_SUBSTITUTABLE_EFLAG;
		else
			eFlags &= ~IS_SUBSTITUTABLE_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.GENERALIZATION__IS_SUBSTITUTABLE,
				oldIsSubstitutable, newIsSubstitutable));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getGeneral() {
		Classifier general = (Classifier) eVirtualGet(UMLPackage.GENERALIZATION__GENERAL);
		if (general != null && general.eIsProxy()) {
			InternalEObject oldGeneral = (InternalEObject) general;
			general = (Classifier) eResolveProxy(oldGeneral);
			if (general != oldGeneral) {
				eVirtualSet(UMLPackage.GENERALIZATION__GENERAL, general);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.GENERALIZATION__GENERAL, oldGeneral, general));
			}
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetGeneral() {
		return (Classifier) eVirtualGet(UMLPackage.GENERALIZATION__GENERAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(Classifier newGeneral) {
		Classifier general = newGeneral;
		Object oldGeneral = eVirtualSet(UMLPackage.GENERALIZATION__GENERAL,
			general);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.GENERALIZATION__GENERAL,
				oldGeneral == EVIRTUAL_NO_VALUE
					? null
					: oldGeneral, general));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getGeneralizationSets() {
		List generalizationSet = (List) eVirtualGet(UMLPackage.GENERALIZATION__GENERALIZATION_SET);
		if (generalizationSet == null) {
			eVirtualSet(
				UMLPackage.GENERALIZATION__GENERALIZATION_SET,
				generalizationSet = new EObjectWithInverseResolvingEList.ManyInverse(
					GeneralizationSet.class, this,
					UMLPackage.GENERALIZATION__GENERALIZATION_SET,
					UMLPackage.GENERALIZATION_SET__GENERALIZATION));
		}
		return generalizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet getGeneralizationSet(String name) {
		for (Iterator i = getGeneralizationSets().iterator(); i.hasNext();) {
			GeneralizationSet generalizationSet = (GeneralizationSet) i.next();
			if (name.equals(generalizationSet.getName())) {
				return generalizationSet;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSpecific() {
		if (eContainerFeatureID != UMLPackage.GENERALIZATION__SPECIFIC)
			return null;
		return (Classifier) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(Classifier newSpecific) {
		if (newSpecific != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.GENERALIZATION__SPECIFIC && newSpecific != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newSpecific))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecific != null)
				msgs = ((InternalEObject) newSpecific).eInverseAdd(this,
					UMLPackage.CLASSIFIER__GENERALIZATION, Classifier.class,
					msgs);
			msgs = eBasicSetContainer((InternalEObject) newSpecific,
				UMLPackage.GENERALIZATION__SPECIFIC, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.GENERALIZATION__SPECIFIC, newSpecific, newSpecific));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizationSameClassifier(
			DiagnosticChain diagnostics, Map context) {
		return GeneralizationOperations.validateGeneralizationSameClassifier(
			this, diagnostics, context);
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
				case UMLPackage.GENERALIZATION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.GENERALIZATION__GENERALIZATION_SET :
					return ((InternalEList) getGeneralizationSets()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.GENERALIZATION__SPECIFIC :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.GENERALIZATION__SPECIFIC, msgs);
				default :
					return eDynamicInverseAdd(otherEnd, featureID, baseClass,
						msgs);
			}
		}
		if (eInternalContainer() != null)
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
				case UMLPackage.GENERALIZATION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.GENERALIZATION__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.GENERALIZATION__GENERALIZATION_SET :
					return ((InternalEList) getGeneralizationSets())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.GENERALIZATION__SPECIFIC :
					return eBasicSetContainer(null,
						UMLPackage.GENERALIZATION__SPECIFIC, msgs);
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
				case UMLPackage.GENERALIZATION__SPECIFIC :
					return eInternalContainer().eInverseRemove(this,
						UMLPackage.CLASSIFIER__GENERALIZATION,
						Classifier.class, msgs);
				default :
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eInternalContainer().eInverseRemove(this,
			EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UMLPackage.GENERALIZATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.GENERALIZATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.GENERALIZATION__OWNER :
				return getOwner();
			case UMLPackage.GENERALIZATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.GENERALIZATION__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.GENERALIZATION__SOURCE :
				return getSources();
			case UMLPackage.GENERALIZATION__TARGET :
				return getTargets();
			case UMLPackage.GENERALIZATION__IS_SUBSTITUTABLE :
				return isSubstitutable()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.GENERALIZATION__GENERAL :
				if (resolve)
					return getGeneral();
				return basicGetGeneral();
			case UMLPackage.GENERALIZATION__GENERALIZATION_SET :
				return getGeneralizationSets();
			case UMLPackage.GENERALIZATION__SPECIFIC :
				return getSpecific();
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
			case UMLPackage.GENERALIZATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.GENERALIZATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.GENERALIZATION__IS_SUBSTITUTABLE :
				setIsSubstitutable(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.GENERALIZATION__GENERAL :
				setGeneral((Classifier) newValue);
				return;
			case UMLPackage.GENERALIZATION__GENERALIZATION_SET :
				getGeneralizationSets().clear();
				getGeneralizationSets().addAll((Collection) newValue);
				return;
			case UMLPackage.GENERALIZATION__SPECIFIC :
				setSpecific((Classifier) newValue);
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
			case UMLPackage.GENERALIZATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.GENERALIZATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.GENERALIZATION__IS_SUBSTITUTABLE :
				setIsSubstitutable(IS_SUBSTITUTABLE_EDEFAULT);
				return;
			case UMLPackage.GENERALIZATION__GENERAL :
				setGeneral((Classifier) null);
				return;
			case UMLPackage.GENERALIZATION__GENERALIZATION_SET :
				getGeneralizationSets().clear();
				return;
			case UMLPackage.GENERALIZATION__SPECIFIC :
				setSpecific((Classifier) null);
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
			case UMLPackage.GENERALIZATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.GENERALIZATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.GENERALIZATION__OWNER :
				return isSetOwner();
			case UMLPackage.GENERALIZATION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.GENERALIZATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.GENERALIZATION__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.GENERALIZATION__SOURCE :
				return isSetSources();
			case UMLPackage.GENERALIZATION__TARGET :
				return isSetTargets();
			case UMLPackage.GENERALIZATION__IS_SUBSTITUTABLE :
				return ((eFlags & IS_SUBSTITUTABLE_EFLAG) != 0) != IS_SUBSTITUTABLE_EDEFAULT;
			case UMLPackage.GENERALIZATION__GENERAL :
				return eVirtualGet(UMLPackage.GENERALIZATION__GENERAL) != null;
			case UMLPackage.GENERALIZATION__GENERALIZATION_SET :
				List generalizationSet = (List) eVirtualGet(UMLPackage.GENERALIZATION__GENERALIZATION_SET);
				return generalizationSet != null
					&& !generalizationSet.isEmpty();
			case UMLPackage.GENERALIZATION__SPECIFIC :
				return getSpecific() != null;
		}
		return eDynamicIsSet(eFeature);
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
		result.append(" (isSubstitutable: "); //$NON-NLS-1$
		result.append((eFlags & IS_SUBSTITUTABLE_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(UMLPackage.eINSTANCE.getGeneralization_General());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(UMLPackage.eINSTANCE.getGeneralization_Specific());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		Classifier specific = getSpecific();
		if (specific != null) {
			return specific;
		}
		return super.getOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(UMLPackage.eINSTANCE.getGeneralization_Specific());
	}

} //GeneralizationImpl
