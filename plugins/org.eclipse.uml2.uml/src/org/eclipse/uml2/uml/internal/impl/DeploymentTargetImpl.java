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
 * $Id: DeploymentTargetImpl.java,v 1.17 2006/05/08 17:46:10 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.DeploymentTargetOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentTargetImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentTargetImpl#getDeployments <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentTargetImpl#getDeployedElements <em>Deployed Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DeploymentTargetImpl
		extends NamedElementImpl
		implements DeploymentTarget {

	/**
	 * The cached value of the '{@link #getDeployments() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList deployments = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.DEPLOYMENT_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			Resource eResource = eResource();
			EList ownedElements = (EList) cache.get(eResource, this,
				UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
			if (ownedElements == null) {
				cache.put(eResource, this,
					UMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
					ownedElements = new DerivedUnionEObjectEList(Element.class,
						this, UMLPackage.DEPLOYMENT_TARGET__OWNED_ELEMENT,
						OWNED_ELEMENT_ESUBSETS));
			}
			return ownedElements;
		}
		return new DerivedUnionEObjectEList(Element.class, this,
			UMLPackage.DEPLOYMENT_TARGET__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClientDependencies() {
		if (clientDependencies == null) {
			clientDependencies = new SubsetSupersetEObjectWithInverseResolvingEList.ManyInverse(
				Dependency.class, this,
				UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY, null,
				CLIENT_DEPENDENCY_ESUBSETS, UMLPackage.DEPENDENCY__CLIENT);
		}
		return clientDependencies;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getClientDependencies() <em>Client Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientDependencies()
	 * @generated
	 * @ordered
	 */
	protected static final int[] CLIENT_DEPENDENCY_ESUBSETS = new int[]{UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT};

	/**
	 * The array of superset feature identifiers for the '{@link #getDeployments() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected static final int[] DEPLOYMENT_ESUPERSETS = new int[]{UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDeployments() {
		if (deployments == null) {
			deployments = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving(
				Deployment.class, this,
				UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT,
				DEPLOYMENT_ESUPERSETS, null, UMLPackage.DEPLOYMENT__LOCATION);
		}
		return deployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment(String name) {
		Deployment newDeployment = (Deployment) create(UMLPackage.Literals.DEPLOYMENT);
		getDeployments().add(newDeployment);
		if (name != null)
			newDeployment.setName(name);
		return newDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment(String name) {
		return getDeployment(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment(String name, boolean ignoreCase,
			boolean createOnDemand) {
		deploymentLoop : for (Iterator i = getDeployments().iterator(); i
			.hasNext();) {
			Deployment deployment = (Deployment) i.next();
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(deployment.getName())
				: name.equals(deployment.getName())))
				continue deploymentLoop;
			return deployment;
		}
		return createOnDemand
			? createDeployment(name)
			: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDeployedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT);
			if (result == null) {
				cache.put(this,
					UMLPackage.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT,
					result = DeploymentTargetOperations
						.getDeployedElements(this));
			}
			return result;
		}
		return DeploymentTargetOperations.getDeployedElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getDeployedElement(String name) {
		return getDeployedElement(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getDeployedElement(String name,
			boolean ignoreCase, EClass eClass) {
		deployedElementLoop : for (Iterator i = getDeployedElements()
			.iterator(); i.hasNext();) {
			PackageableElement deployedElement = (PackageableElement) i.next();
			if (eClass != null && !eClass.isInstance(deployedElement))
				continue deployedElementLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(deployedElement.getName())
				: name.equals(deployedElement.getName())))
				continue deployedElementLoop;
			return deployedElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.DEPLOYMENT_TARGET__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT :
				return ((InternalEList) getDeployments()).basicAdd(otherEnd,
					msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.DEPLOYMENT_TARGET__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_TARGET__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.DEPLOYMENT_TARGET__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT :
				return ((InternalEList) getDeployments()).basicRemove(otherEnd,
					msgs);
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
			case UMLPackage.DEPLOYMENT_TARGET__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DEPLOYMENT_TARGET__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DEPLOYMENT_TARGET__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.DEPLOYMENT_TARGET__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DEPLOYMENT_TARGET__NAME :
				return getName();
			case UMLPackage.DEPLOYMENT_TARGET__VISIBILITY :
				return getVisibility();
			case UMLPackage.DEPLOYMENT_TARGET__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DEPLOYMENT_TARGET__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DEPLOYMENT_TARGET__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT :
				return getDeployments();
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT :
				return getDeployedElements();
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
			case UMLPackage.DEPLOYMENT_TARGET__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_TARGET__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_TARGET__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DEPLOYMENT_TARGET__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_TARGET__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT :
				getDeployments().clear();
				getDeployments().addAll((Collection) newValue);
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
			case UMLPackage.DEPLOYMENT_TARGET__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.DEPLOYMENT_TARGET__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.DEPLOYMENT_TARGET__NAME :
				unsetName();
				return;
			case UMLPackage.DEPLOYMENT_TARGET__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.DEPLOYMENT_TARGET__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT :
				getDeployments().clear();
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
			case UMLPackage.DEPLOYMENT_TARGET__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DEPLOYMENT_TARGET__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DEPLOYMENT_TARGET__OWNER :
				return isSetOwner();
			case UMLPackage.DEPLOYMENT_TARGET__OWNED_COMMENT :
				return ownedComments != null && !ownedComments.isEmpty();
			case UMLPackage.DEPLOYMENT_TARGET__NAME :
				return isSetName();
			case UMLPackage.DEPLOYMENT_TARGET__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DEPLOYMENT_TARGET__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY :
				return clientDependencies != null
					&& !clientDependencies.isEmpty();
			case UMLPackage.DEPLOYMENT_TARGET__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DEPLOYMENT_TARGET__NAME_EXPRESSION :
				return nameExpression != null;
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT :
				return deployments != null && !deployments.isEmpty();
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT :
				return !getDeployedElements().isEmpty();
		}
		return eDynamicIsSet(featureID);
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
		UMLPackage.DEPLOYMENT_TARGET__OWNED_COMMENT,
		UMLPackage.DEPLOYMENT_TARGET__NAME_EXPRESSION,
		UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements()
			|| eIsSet(UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT);
	}

} //DeploymentTargetImpl
