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
 * $Id: DeploymentSpecificationImpl.java,v 1.2 2005/11/22 15:32:35 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
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

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentSpecification;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.DeploymentSpecificationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentSpecificationImpl#getDeploymentLocation <em>Deployment Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentSpecificationImpl#getExecutionLocation <em>Execution Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.DeploymentSpecificationImpl#getDeployment <em>Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentSpecificationImpl
		extends ArtifactImpl
		implements DeploymentSpecification {

	/**
	 * The default value of the '{@link #getDeploymentLocation() <em>Deployment Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYMENT_LOCATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExecutionLocation() <em>Execution Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTION_LOCATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.eINSTANCE.getDeploymentSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeploymentLocation() {
		return (String) eVirtualGet(
			UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION,
			DEPLOYMENT_LOCATION_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentLocation(String newDeploymentLocation) {
		newDeploymentLocation = newDeploymentLocation == null
			? DEPLOYMENT_LOCATION_EDEFAULT
			: newDeploymentLocation;
		String deploymentLocation = newDeploymentLocation;
		Object oldDeploymentLocation = eVirtualSet(
			UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION,
			deploymentLocation);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION,
				oldDeploymentLocation == EVIRTUAL_NO_VALUE
					? DEPLOYMENT_LOCATION_EDEFAULT
					: oldDeploymentLocation, deploymentLocation));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecutionLocation() {
		return (String) eVirtualGet(
			UMLPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION,
			EXECUTION_LOCATION_EDEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionLocation(String newExecutionLocation) {
		newExecutionLocation = newExecutionLocation == null
			? EXECUTION_LOCATION_EDEFAULT
			: newExecutionLocation;
		String executionLocation = newExecutionLocation;
		Object oldExecutionLocation = eVirtualSet(
			UMLPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION,
			executionLocation);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION,
				oldExecutionLocation == EVIRTUAL_NO_VALUE
					? EXECUTION_LOCATION_EDEFAULT
					: oldExecutionLocation, executionLocation));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment() {
		if (eContainerFeatureID != UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT)
			return null;
		return (Deployment) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployment(Deployment newDeployment) {
		if (newDeployment != eInternalContainer()
			|| (eContainerFeatureID != UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT && newDeployment != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newDeployment))
				throw new IllegalArgumentException(
					"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDeployment != null)
				msgs = ((InternalEObject) newDeployment).eInverseAdd(this,
					UMLPackage.DEPLOYMENT__CONFIGURATION, Deployment.class,
					msgs);
			msgs = eBasicSetContainer((InternalEObject) newDeployment,
				UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT, newDeployment,
				newDeployment));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployedElements(DiagnosticChain diagnostics,
			Map context) {
		return DeploymentSpecificationOperations.validateDeployedElements(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentTarget(DiagnosticChain diagnostics,
			Map context) {
		return DeploymentSpecificationOperations.validateDeploymentTarget(this,
			diagnostics, context);
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
				case UMLPackage.DEPLOYMENT_SPECIFICATION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER :
					TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER);
					if (templateParameter != null)
						msgs = ((InternalEObject) templateParameter)
							.eInverseRemove(
								this,
								UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
								TemplateParameter.class, msgs);
					return basicSetTemplateParameter(
						(TemplateParameter) otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(
						otherEnd,
						UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER,
						msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING :
					return ((InternalEList) getTemplateBindings()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE :
					TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE);
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject) ownedTemplateSignature)
							.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
									- UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE,
								null, msgs);
					return basicSetOwnedTemplateSignature(
						(TemplateSignature) otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
					return ((InternalEList) getGeneralizations()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT :
					return ((InternalEList) getPowertypeExtents()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
					return ((InternalEList) getUseCases()).basicAdd(otherEnd,
						msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
					return ((InternalEList) getSubstitutions()).basicAdd(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_SIGNATURE :
					RedefinableTemplateSignature ownedSignature = (RedefinableTemplateSignature) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_SIGNATURE);
					if (ownedSignature != null)
						msgs = ((InternalEObject) ownedSignature)
							.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
									- UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_SIGNATURE,
								null, msgs);
					return basicSetOwnedSignature(
						(RedefinableTemplateSignature) otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT :
					if (eInternalContainer() != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd,
						UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT, msgs);
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
				case UMLPackage.DEPLOYMENT_SPECIFICATION__EANNOTATIONS :
					return ((InternalEList) getEAnnotations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT :
					return ((InternalEList) getOwnedComments()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY :
					return ((InternalEList) getClientDependencies())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION :
					return basicSetNameExpression(null, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
					return ((InternalEList) getElementImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
					return ((InternalEList) getPackageImports()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
					return ((InternalEList) getOwnedRules()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER :
					return basicSetTemplateParameter(null, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
					return eBasicSetContainer(
						null,
						UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER,
						msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING :
					return ((InternalEList) getTemplateBindings()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE :
					return basicSetOwnedTemplateSignature(null, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
					return ((InternalEList) getGeneralizations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT :
					return ((InternalEList) getPowertypeExtents()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE :
					return ((InternalEList) getOwnedUseCases()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
					return ((InternalEList) getUseCases()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
					return ((InternalEList) getSubstitutions()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__COLLABORATION_USE :
					return ((InternalEList) getCollaborationUses())
						.basicRemove(otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_SIGNATURE :
					return basicSetOwnedSignature(null, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT :
					return ((InternalEList) getNestedArtifacts()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__MANIFESTATION :
					return ((InternalEList) getManifestations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION :
					return ((InternalEList) getOwnedOperations()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE :
					return ((InternalEList) getOwnedAttributes()).basicRemove(
						otherEnd, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT :
					return eBasicSetContainer(null,
						UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT, msgs);
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
				case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
					return eInternalContainer()
						.eInverseRemove(
							this,
							UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT :
					return eInternalContainer().eInverseRemove(this,
						UMLPackage.DEPLOYMENT__CONFIGURATION, Deployment.class,
						msgs);
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNER :
				return getOwner();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME :
				return getName();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__VISIBILITY :
				return getVisibility();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION :
				return getNameExpression();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MEMBER :
				return getMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE :
				return getPackage();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE :
				return getOwnedTemplateSignature();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FEATURE :
				return getFeatures();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERAL :
				return getGenerals();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
				return getUseCases();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REPRESENTATION :
				return getRepresentation();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_SIGNATURE :
				return getOwnedSignature();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FILE_NAME :
				return getFileName();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT :
				return getNestedArtifacts();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MANIFESTATION :
				return getManifestations();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION :
				return getDeploymentLocation();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION :
				return getExecutionLocation();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT :
				return getDeployment();
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__INHERITED_MEMBER :
				getInheritedMembers().clear();
				getInheritedMembers().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FILE_NAME :
				setFileName((String) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT :
				getNestedArtifacts().clear();
				getNestedArtifacts().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MANIFESTATION :
				getManifestations().clear();
				getManifestations().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION :
				setDeploymentLocation((String) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION :
				setExecutionLocation((String) newValue);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT :
				setDeployment((Deployment) newValue);
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__VISIBILITY :
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__INHERITED_MEMBER :
				getInheritedMembers().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FILE_NAME :
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT :
				getNestedArtifacts().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MANIFESTATION :
				getManifestations().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION :
				setDeploymentLocation(DEPLOYMENT_LOCATION_EDEFAULT);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION :
				setExecutionLocation(EXECUTION_LOCATION_EDEFAULT);
				return;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT :
				setDeployment((Deployment) null);
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
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EANNOTATIONS :
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNER :
				return isSetOwner();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT :
				List ownedComment = (List) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME :
				String name = (String) eVirtualGet(
					UMLPackage.DEPLOYMENT_SPECIFICATION__NAME, NAME_EDEFAULT);
				return NAME_EDEFAULT == null
					? name != null
					: !NAME_EDEFAULT.equals(name);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY :
				List clientDependency = (List) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__NAME_EXPRESSION) != null;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT :
				List elementImport = (List) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT :
				List packageImport = (List) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE :
				List ownedRule = (List) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MEMBER :
				return isSetMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__PACKAGE :
				return getPackage() != null;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING :
				List templateBinding = (List) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__IS_ABSTRACT :
				return ((eFlags & IS_ABSTRACT_EFLAG) != 0) != IS_ABSTRACT_EDEFAULT;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION :
				List generalization = (List) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT :
				List powertypeExtent = (List) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FEATURE :
				return isSetFeatures();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER :
				List redefinedClassifier = (List) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__GENERAL :
				return !getGenerals().isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE :
				List ownedUseCase = (List) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE :
				List useCase = (List) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION :
				List substitution = (List) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__REPRESENTATION :
				return eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__REPRESENTATION) != null;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__COLLABORATION_USE :
				List collaborationUse = (List) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_SIGNATURE) != null;
			case UMLPackage.DEPLOYMENT_SPECIFICATION__FILE_NAME :
				String fileName = (String) eVirtualGet(
					UMLPackage.DEPLOYMENT_SPECIFICATION__FILE_NAME,
					FILE_NAME_EDEFAULT);
				return FILE_NAME_EDEFAULT == null
					? fileName != null
					: !FILE_NAME_EDEFAULT.equals(fileName);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT :
				List nestedArtifact = (List) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__NESTED_ARTIFACT);
				return nestedArtifact != null && !nestedArtifact.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__MANIFESTATION :
				List manifestation = (List) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__MANIFESTATION);
				return manifestation != null && !manifestation.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION :
				List ownedOperation = (List) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE :
				List ownedAttribute = (List) eVirtualGet(UMLPackage.DEPLOYMENT_SPECIFICATION__OWNED_ATTRIBUTE);
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION :
				String deploymentLocation = (String) eVirtualGet(
					UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION,
					DEPLOYMENT_LOCATION_EDEFAULT);
				return DEPLOYMENT_LOCATION_EDEFAULT == null
					? deploymentLocation != null
					: !DEPLOYMENT_LOCATION_EDEFAULT.equals(deploymentLocation);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION :
				String executionLocation = (String) eVirtualGet(
					UMLPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION,
					EXECUTION_LOCATION_EDEFAULT);
				return EXECUTION_LOCATION_EDEFAULT == null
					? executionLocation != null
					: !EXECUTION_LOCATION_EDEFAULT.equals(executionLocation);
			case UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT :
				return getDeployment() != null;
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
		result.append(" (deploymentLocation: "); //$NON-NLS-1$
		result.append(eVirtualGet(
			UMLPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION,
			DEPLOYMENT_LOCATION_EDEFAULT));
		result.append(", executionLocation: "); //$NON-NLS-1$
		result.append(eVirtualGet(
			UMLPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION,
			EXECUTION_LOCATION_EDEFAULT));
		result.append(')');
		return result.toString();
	}

} //DeploymentSpecificationImpl
