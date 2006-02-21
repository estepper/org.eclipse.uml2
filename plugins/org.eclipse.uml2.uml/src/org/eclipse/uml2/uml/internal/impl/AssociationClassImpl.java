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
 * $Id: AssociationClassImpl.java,v 1.16 2006/02/21 16:12:18 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectWithInverseResolvingEList;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.AssociationClassOperations;
import org.eclipse.uml2.uml.internal.operations.AssociationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#getOwnedEnds <em>Owned End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#getMemberEnds <em>Member End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#getEndTypes <em>End Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationClassImpl#getNavigableOwnedEnds <em>Navigable Owned End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationClassImpl
		extends ClassImpl
		implements AssociationClass {

	/**
	 * The default value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The flag representing the value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final int IS_DERIVED_EFLAG = 1 << 11;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ASSOCIATION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRelatedElements() {
		EList relatedElement = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__RELATED_ELEMENT);
		if (relatedElement == null) {
			eVirtualSet(UMLPackage.ASSOCIATION_CLASS__RELATED_ELEMENT,
				relatedElement = new DerivedUnionEObjectEList(Element.class,
					this, UMLPackage.ASSOCIATION_CLASS__RELATED_ELEMENT,
					new int[]{UMLPackage.ASSOCIATION_CLASS__END_TYPE}));
		}
		return relatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMembers() {
		EList member = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__MEMBER);
		if (member == null) {
			eVirtualSet(UMLPackage.ASSOCIATION_CLASS__MEMBER,
				member = new DerivedUnionEObjectEList(NamedElement.class, this,
					UMLPackage.ASSOCIATION_CLASS__MEMBER, new int[]{
						UMLPackage.ASSOCIATION_CLASS__IMPORTED_MEMBER,
						UMLPackage.ASSOCIATION_CLASS__OWNED_MEMBER,
						UMLPackage.ASSOCIATION_CLASS__FEATURE,
						UMLPackage.ASSOCIATION_CLASS__INHERITED_MEMBER,
						UMLPackage.ASSOCIATION_CLASS__ROLE,
						UMLPackage.ASSOCIATION_CLASS__MEMBER_END}));
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatures() {
		EList feature = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__FEATURE);
		if (feature == null) {
			eVirtualSet(UMLPackage.ASSOCIATION_CLASS__FEATURE,
				feature = new DerivedUnionEObjectEList(Feature.class, this,
					UMLPackage.ASSOCIATION_CLASS__FEATURE, new int[]{
						UMLPackage.ASSOCIATION_CLASS__ATTRIBUTE,
						UMLPackage.ASSOCIATION_CLASS__OWNED_CONNECTOR,
						UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION,
						UMLPackage.ASSOCIATION_CLASS__OWNED_RECEPTION,
						UMLPackage.ASSOCIATION_CLASS__OWNED_END}));
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedMembers() {
		EList ownedMember = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__OWNED_MEMBER);
		if (ownedMember == null) {
			eVirtualSet(UMLPackage.ASSOCIATION_CLASS__OWNED_MEMBER,
				ownedMember = new DerivedUnionEObjectEList(NamedElement.class,
					this, UMLPackage.ASSOCIATION_CLASS__OWNED_MEMBER,
					new int[]{UMLPackage.ASSOCIATION_CLASS__OWNED_RULE,
						UMLPackage.ASSOCIATION_CLASS__OWNED_USE_CASE,
						UMLPackage.ASSOCIATION_CLASS__OWNED_ATTRIBUTE,
						UMLPackage.ASSOCIATION_CLASS__OWNED_CONNECTOR,
						UMLPackage.ASSOCIATION_CLASS__OWNED_BEHAVIOR,
						UMLPackage.ASSOCIATION_CLASS__OWNED_TRIGGER,
						UMLPackage.ASSOCIATION_CLASS__NESTED_CLASSIFIER,
						UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION,
						UMLPackage.ASSOCIATION_CLASS__OWNED_RECEPTION,
						UMLPackage.ASSOCIATION_CLASS__OWNED_END}));
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMemberEnds() {
		EList memberEnd = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__MEMBER_END);
		if (memberEnd == null) {
			eVirtualSet(UMLPackage.ASSOCIATION_CLASS__MEMBER_END,
				memberEnd = new SubsetSupersetEObjectWithInverseResolvingEList(
					Property.class, this,
					UMLPackage.ASSOCIATION_CLASS__MEMBER_END, null,
					new int[]{UMLPackage.ASSOCIATION_CLASS__OWNED_END},
					UMLPackage.PROPERTY__ASSOCIATION));
		}
		return memberEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getMemberEnd(String name) {
		for (Iterator i = getMemberEnds().iterator(); i.hasNext();) {
			Property memberEnd = (Property) i.next();
			if (name.equals(memberEnd.getName())) {
				return memberEnd;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedEnds() {
		EList ownedEnd = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__OWNED_END);
		if (ownedEnd == null) {
			eVirtualSet(
				UMLPackage.ASSOCIATION_CLASS__OWNED_END,
				ownedEnd = new SubsetSupersetEObjectContainmentWithInverseEList.Resolving(
					Property.class,
					this,
					UMLPackage.ASSOCIATION_CLASS__OWNED_END,
					new int[]{UMLPackage.ASSOCIATION_CLASS__MEMBER_END},
					new int[]{UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END},
					UMLPackage.PROPERTY__OWNING_ASSOCIATION));
		}
		return ownedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedEnd(EClass eClass) {
		Property newOwnedEnd = (Property) eClass.getEPackage()
			.getEFactoryInstance().create(eClass);
		getOwnedEnds().add(newOwnedEnd);
		return newOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedEnd() {
		Property newOwnedEnd = UMLFactory.eINSTANCE.createProperty();
		getOwnedEnds().add(newOwnedEnd);
		return newOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedEnd(String name) {
		for (Iterator i = getOwnedEnds().iterator(); i.hasNext();) {
			Property ownedEnd = (Property) i.next();
			if (name.equals(ownedEnd.getName())) {
				return ownedEnd;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerived() {
		return (eFlags & IS_DERIVED_EFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = (eFlags & IS_DERIVED_EFLAG) != 0;
		if (newIsDerived)
			eFlags |= IS_DERIVED_EFLAG;
		else
			eFlags &= ~IS_DERIVED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.ASSOCIATION_CLASS__IS_DERIVED, oldIsDerived,
				newIsDerived));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEndTypes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.ASSOCIATION__END_TYPE);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.ASSOCIATION__END_TYPE,
					result = AssociationOperations.getEndTypes(this));
			}
			return result;
		}
		return AssociationOperations.getEndTypes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getEndType(String name) {
		for (Iterator i = getEndTypes().iterator(); i.hasNext();) {
			Type endType = (Type) i.next();
			if (name.equals(endType.getName())) {
				return endType;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNavigableOwnedEnds() {
		EList navigableOwnedEnd = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END);
		if (navigableOwnedEnd == null) {
			eVirtualSet(UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END,
				navigableOwnedEnd = new SubsetSupersetEObjectResolvingEList(
					Property.class, this,
					UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END,
					new int[]{UMLPackage.ASSOCIATION_CLASS__OWNED_END}, null));
		}
		return navigableOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getNavigableOwnedEnd(String name) {
		for (Iterator i = getNavigableOwnedEnds().iterator(); i.hasNext();) {
			Property navigableOwnedEnd = (Property) i.next();
			if (name.equals(navigableOwnedEnd.getName())) {
				return navigableOwnedEnd;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializedEndNumber(DiagnosticChain diagnostics,
			Map context) {
		return AssociationOperations.validateSpecializedEndNumber(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializedEndTypes(DiagnosticChain diagnostics,
			Map context) {
		return AssociationOperations.validateSpecializedEndTypes(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryAssociations(DiagnosticChain diagnostics,
			Map context) {
		return AssociationOperations.validateBinaryAssociations(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEnds(DiagnosticChain diagnostics,
			Map context) {
		return AssociationOperations.validateAssociationEnds(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCannotBeDefined(DiagnosticChain diagnostics,
			Map context) {
		return AssociationClassOperations.validateCannotBeDefined(this,
			diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList allConnections() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList result = (EList) cache.get(this,
				UMLPackage.Literals.ASSOCIATION_CLASS.getEOperations().get(1));
			if (result == null) {
				cache.put(this, UMLPackage.Literals.ASSOCIATION_CLASS
					.getEOperations().get(1),
					result = AssociationClassOperations.allConnections(this));
			}
			return result;
		}
		return AssociationClassOperations.allConnections(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.ASSOCIATION_CLASS__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ASSOCIATION_CLASS__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNING_TEMPLATE_PARAMETER :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd,
					UMLPackage.ASSOCIATION_CLASS__OWNING_TEMPLATE_PARAMETER,
					msgs);
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_PARAMETER :
				TemplateParameter templateParameter = (TemplateParameter) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__TEMPLATE_PARAMETER);
				if (templateParameter != null)
					msgs = ((InternalEObject) templateParameter)
						.eInverseRemove(this,
							UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT,
							TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter) otherEnd,
					msgs);
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE :
				TemplateSignature ownedTemplateSignature = (TemplateSignature) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE);
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject) ownedTemplateSignature)
						.eInverseRemove(
							this,
							EOPPOSITE_FEATURE_BASE
								- UMLPackage.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE,
							null, msgs);
				return basicSetOwnedTemplateSignature(
					(TemplateSignature) otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicAdd(otherEnd,
					msgs);
			case UMLPackage.ASSOCIATION_CLASS__USE_CASE :
				return ((InternalEList) getUseCases()).basicAdd(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_SIGNATURE :
				RedefinableTemplateSignature ownedSignature = (RedefinableTemplateSignature) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__OWNED_SIGNATURE);
				if (ownedSignature != null)
					msgs = ((InternalEObject) ownedSignature).eInverseRemove(
						this, EOPPOSITE_FEATURE_BASE
							- UMLPackage.ASSOCIATION_CLASS__OWNED_SIGNATURE,
						null, msgs);
				return basicSetOwnedSignature(
					(RedefinableTemplateSignature) otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicAdd(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_END :
				return ((InternalEList) getOwnedEnds())
					.basicAdd(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__MEMBER_END :
				return ((InternalEList) getMemberEnds()).basicAdd(otherEnd,
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
			case UMLPackage.ASSOCIATION_CLASS__EANNOTATIONS :
				return ((InternalEList) getEAnnotations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_COMMENT :
				return ((InternalEList) getOwnedComments()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__CLIENT_DEPENDENCY :
				return ((InternalEList) getClientDependencies()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__NAME_EXPRESSION :
				return basicSetNameExpression(null, msgs);
			case UMLPackage.ASSOCIATION_CLASS__ELEMENT_IMPORT :
				return ((InternalEList) getElementImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE_IMPORT :
				return ((InternalEList) getPackageImports()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RULE :
				return ((InternalEList) getOwnedRules()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNING_TEMPLATE_PARAMETER :
				return eBasicSetContainer(null,
					UMLPackage.ASSOCIATION_CLASS__OWNING_TEMPLATE_PARAMETER,
					msgs);
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_PARAMETER :
				return basicSetTemplateParameter(null, msgs);
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_BINDING :
				return ((InternalEList) getTemplateBindings()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE :
				return basicSetOwnedTemplateSignature(null, msgs);
			case UMLPackage.ASSOCIATION_CLASS__GENERALIZATION :
				return ((InternalEList) getGeneralizations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__POWERTYPE_EXTENT :
				return ((InternalEList) getPowertypeExtents()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__SUBSTITUTION :
				return ((InternalEList) getSubstitutions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__COLLABORATION_USE :
				return ((InternalEList) getCollaborationUses()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_USE_CASE :
				return ((InternalEList) getOwnedUseCases()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__USE_CASE :
				return ((InternalEList) getUseCases()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_SIGNATURE :
				return basicSetOwnedSignature(null, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_ATTRIBUTE :
				return ((InternalEList) getOwnedAttributes()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_CONNECTOR :
				return ((InternalEList) getOwnedConnectors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_BEHAVIOR :
				return ((InternalEList) getOwnedBehaviors()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__INTERFACE_REALIZATION :
				return ((InternalEList) getInterfaceRealizations())
					.basicRemove(otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TRIGGER :
				return ((InternalEList) getOwnedTriggers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__NESTED_CLASSIFIER :
				return ((InternalEList) getNestedClassifiers()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION :
				return ((InternalEList) getOwnedOperations()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RECEPTION :
				return ((InternalEList) getOwnedReceptions()).basicRemove(
					otherEnd, msgs);
			case UMLPackage.ASSOCIATION_CLASS__OWNED_END :
				return ((InternalEList) getOwnedEnds()).basicRemove(otherEnd,
					msgs);
			case UMLPackage.ASSOCIATION_CLASS__MEMBER_END :
				return ((InternalEList) getMemberEnds()).basicRemove(otherEnd,
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
			case UMLPackage.ASSOCIATION_CLASS__EANNOTATIONS :
				return getEAnnotations();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_ELEMENT :
				return getOwnedElements();
			case UMLPackage.ASSOCIATION_CLASS__OWNER :
				if (resolve)
					return getOwner();
				return basicGetOwner();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_COMMENT :
				return getOwnedComments();
			case UMLPackage.ASSOCIATION_CLASS__NAME :
				return getName();
			case UMLPackage.ASSOCIATION_CLASS__VISIBILITY :
				return getVisibility();
			case UMLPackage.ASSOCIATION_CLASS__QUALIFIED_NAME :
				return getQualifiedName();
			case UMLPackage.ASSOCIATION_CLASS__CLIENT_DEPENDENCY :
				return getClientDependencies();
			case UMLPackage.ASSOCIATION_CLASS__NAMESPACE :
				if (resolve)
					return getNamespace();
				return basicGetNamespace();
			case UMLPackage.ASSOCIATION_CLASS__NAME_EXPRESSION :
				if (resolve)
					return getNameExpression();
				return basicGetNameExpression();
			case UMLPackage.ASSOCIATION_CLASS__ELEMENT_IMPORT :
				return getElementImports();
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE_IMPORT :
				return getPackageImports();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RULE :
				return getOwnedRules();
			case UMLPackage.ASSOCIATION_CLASS__MEMBER :
				return getMembers();
			case UMLPackage.ASSOCIATION_CLASS__IMPORTED_MEMBER :
				return getImportedMembers();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_MEMBER :
				return getOwnedMembers();
			case UMLPackage.ASSOCIATION_CLASS__IS_LEAF :
				return isLeaf()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ASSOCIATION_CLASS__REDEFINED_ELEMENT :
				return getRedefinedElements();
			case UMLPackage.ASSOCIATION_CLASS__REDEFINITION_CONTEXT :
				return getRedefinitionContexts();
			case UMLPackage.ASSOCIATION_CLASS__OWNING_TEMPLATE_PARAMETER :
				if (resolve)
					return getOwningTemplateParameter();
				return basicGetOwningTemplateParameter();
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_PARAMETER :
				if (resolve)
					return getTemplateParameter();
				return basicGetTemplateParameter();
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE :
				if (resolve)
					return getPackage();
				return basicGetPackage();
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_BINDING :
				return getTemplateBindings();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE :
				if (resolve)
					return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case UMLPackage.ASSOCIATION_CLASS__IS_ABSTRACT :
				return isAbstract()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ASSOCIATION_CLASS__GENERALIZATION :
				return getGeneralizations();
			case UMLPackage.ASSOCIATION_CLASS__POWERTYPE_EXTENT :
				return getPowertypeExtents();
			case UMLPackage.ASSOCIATION_CLASS__FEATURE :
				return getFeatures();
			case UMLPackage.ASSOCIATION_CLASS__INHERITED_MEMBER :
				return getInheritedMembers();
			case UMLPackage.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER :
				return getRedefinedClassifiers();
			case UMLPackage.ASSOCIATION_CLASS__GENERAL :
				return getGenerals();
			case UMLPackage.ASSOCIATION_CLASS__SUBSTITUTION :
				return getSubstitutions();
			case UMLPackage.ASSOCIATION_CLASS__ATTRIBUTE :
				return getAttributes();
			case UMLPackage.ASSOCIATION_CLASS__REPRESENTATION :
				if (resolve)
					return getRepresentation();
				return basicGetRepresentation();
			case UMLPackage.ASSOCIATION_CLASS__COLLABORATION_USE :
				return getCollaborationUses();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_USE_CASE :
				return getOwnedUseCases();
			case UMLPackage.ASSOCIATION_CLASS__USE_CASE :
				return getUseCases();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_SIGNATURE :
				if (resolve)
					return getOwnedSignature();
				return basicGetOwnedSignature();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_ATTRIBUTE :
				return getOwnedAttributes();
			case UMLPackage.ASSOCIATION_CLASS__PART :
				return getParts();
			case UMLPackage.ASSOCIATION_CLASS__ROLE :
				return getRoles();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_CONNECTOR :
				return getOwnedConnectors();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_PORT :
				return getOwnedPorts();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_BEHAVIOR :
				return getOwnedBehaviors();
			case UMLPackage.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR :
				if (resolve)
					return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case UMLPackage.ASSOCIATION_CLASS__INTERFACE_REALIZATION :
				return getInterfaceRealizations();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TRIGGER :
				return getOwnedTriggers();
			case UMLPackage.ASSOCIATION_CLASS__NESTED_CLASSIFIER :
				return getNestedClassifiers();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION :
				return getOwnedOperations();
			case UMLPackage.ASSOCIATION_CLASS__SUPER_CLASS :
				return getSuperClasses();
			case UMLPackage.ASSOCIATION_CLASS__IS_ACTIVE :
				return isActive()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RECEPTION :
				return getOwnedReceptions();
			case UMLPackage.ASSOCIATION_CLASS__EXTENSION :
				return getExtensions();
			case UMLPackage.ASSOCIATION_CLASS__RELATED_ELEMENT :
				return getRelatedElements();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_END :
				return getOwnedEnds();
			case UMLPackage.ASSOCIATION_CLASS__MEMBER_END :
				return getMemberEnds();
			case UMLPackage.ASSOCIATION_CLASS__IS_DERIVED :
				return isDerived()
					? Boolean.TRUE
					: Boolean.FALSE;
			case UMLPackage.ASSOCIATION_CLASS__END_TYPE :
				return getEndTypes();
			case UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END :
				return getNavigableOwnedEnds();
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
			case UMLPackage.ASSOCIATION_CLASS__EANNOTATIONS :
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_COMMENT :
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__NAME :
				setName((String) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__VISIBILITY :
				setVisibility((VisibilityKind) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__NAME_EXPRESSION :
				setNameExpression((StringExpression) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__ELEMENT_IMPORT :
				getElementImports().clear();
				getElementImports().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE_IMPORT :
				getPackageImports().clear();
				getPackageImports().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RULE :
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_LEAF :
				setIsLeaf(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_ABSTRACT :
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ASSOCIATION_CLASS__GENERALIZATION :
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__GENERAL :
				getGenerals().clear();
				getGenerals().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__SUBSTITUTION :
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__REPRESENTATION :
				setRepresentation((CollaborationUse) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__COLLABORATION_USE :
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__USE_CASE :
				getUseCases().clear();
				getUseCases().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_PORT :
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION :
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__SUPER_CLASS :
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_ACTIVE :
				setIsActive(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_END :
				getOwnedEnds().clear();
				getOwnedEnds().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__MEMBER_END :
				getMemberEnds().clear();
				getMemberEnds().addAll((Collection) newValue);
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_DERIVED :
				setIsDerived(((Boolean) newValue).booleanValue());
				return;
			case UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END :
				getNavigableOwnedEnds().clear();
				getNavigableOwnedEnds().addAll((Collection) newValue);
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
			case UMLPackage.ASSOCIATION_CLASS__EANNOTATIONS :
				getEAnnotations().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_COMMENT :
				getOwnedComments().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__NAME :
				unsetName();
				return;
			case UMLPackage.ASSOCIATION_CLASS__VISIBILITY :
				unsetVisibility();
				return;
			case UMLPackage.ASSOCIATION_CLASS__CLIENT_DEPENDENCY :
				getClientDependencies().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__NAME_EXPRESSION :
				setNameExpression((StringExpression) null);
				return;
			case UMLPackage.ASSOCIATION_CLASS__ELEMENT_IMPORT :
				getElementImports().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE_IMPORT :
				getPackageImports().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RULE :
				getOwnedRules().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_LEAF :
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNING_TEMPLATE_PARAMETER :
				setOwningTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_PARAMETER :
				setTemplateParameter((TemplateParameter) null);
				return;
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE :
				setPackage((org.eclipse.uml2.uml.Package) null);
				return;
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_BINDING :
				getTemplateBindings().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE :
				setOwnedTemplateSignature((TemplateSignature) null);
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_ABSTRACT :
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UMLPackage.ASSOCIATION_CLASS__GENERALIZATION :
				getGeneralizations().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__POWERTYPE_EXTENT :
				getPowertypeExtents().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER :
				getRedefinedClassifiers().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__GENERAL :
				getGenerals().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__SUBSTITUTION :
				getSubstitutions().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__REPRESENTATION :
				setRepresentation((CollaborationUse) null);
				return;
			case UMLPackage.ASSOCIATION_CLASS__COLLABORATION_USE :
				getCollaborationUses().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_USE_CASE :
				getOwnedUseCases().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__USE_CASE :
				getUseCases().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_SIGNATURE :
				setOwnedSignature((RedefinableTemplateSignature) null);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_ATTRIBUTE :
				getOwnedAttributes().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_CONNECTOR :
				getOwnedConnectors().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_PORT :
				getOwnedPorts().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_BEHAVIOR :
				getOwnedBehaviors().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR :
				setClassifierBehavior((Behavior) null);
				return;
			case UMLPackage.ASSOCIATION_CLASS__INTERFACE_REALIZATION :
				getInterfaceRealizations().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TRIGGER :
				getOwnedTriggers().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__NESTED_CLASSIFIER :
				getNestedClassifiers().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION :
				getOwnedOperations().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__SUPER_CLASS :
				getSuperClasses().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_ACTIVE :
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RECEPTION :
				getOwnedReceptions().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_END :
				getOwnedEnds().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__MEMBER_END :
				getMemberEnds().clear();
				return;
			case UMLPackage.ASSOCIATION_CLASS__IS_DERIVED :
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END :
				getNavigableOwnedEnds().clear();
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
			case UMLPackage.ASSOCIATION_CLASS__EANNOTATIONS :
				EList eAnnotations = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__EANNOTATIONS);
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_ELEMENT :
				return isSetOwnedElements();
			case UMLPackage.ASSOCIATION_CLASS__OWNER :
				return isSetOwner();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_COMMENT :
				EList ownedComment = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__OWNED_COMMENT);
				return ownedComment != null && !ownedComment.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__NAME :
				return isSetName();
			case UMLPackage.ASSOCIATION_CLASS__VISIBILITY :
				return isSetVisibility();
			case UMLPackage.ASSOCIATION_CLASS__QUALIFIED_NAME :
				return QUALIFIED_NAME_EDEFAULT == null
					? getQualifiedName() != null
					: !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UMLPackage.ASSOCIATION_CLASS__CLIENT_DEPENDENCY :
				EList clientDependency = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__CLIENT_DEPENDENCY);
				return clientDependency != null && !clientDependency.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__NAMESPACE :
				return isSetNamespace();
			case UMLPackage.ASSOCIATION_CLASS__NAME_EXPRESSION :
				return eVirtualGet(UMLPackage.ASSOCIATION_CLASS__NAME_EXPRESSION) != null;
			case UMLPackage.ASSOCIATION_CLASS__ELEMENT_IMPORT :
				EList elementImport = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__ELEMENT_IMPORT);
				return elementImport != null && !elementImport.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE_IMPORT :
				EList packageImport = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__PACKAGE_IMPORT);
				return packageImport != null && !packageImport.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RULE :
				EList ownedRule = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__OWNED_RULE);
				return ownedRule != null && !ownedRule.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__MEMBER :
				return isSetMembers();
			case UMLPackage.ASSOCIATION_CLASS__IMPORTED_MEMBER :
				return !getImportedMembers().isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_MEMBER :
				return isSetOwnedMembers();
			case UMLPackage.ASSOCIATION_CLASS__IS_LEAF :
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UMLPackage.ASSOCIATION_CLASS__REDEFINED_ELEMENT :
				return isSetRedefinedElements();
			case UMLPackage.ASSOCIATION_CLASS__REDEFINITION_CONTEXT :
				return isSetRedefinitionContexts();
			case UMLPackage.ASSOCIATION_CLASS__OWNING_TEMPLATE_PARAMETER :
				return basicGetOwningTemplateParameter() != null;
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_PARAMETER :
				return isSetTemplateParameter();
			case UMLPackage.ASSOCIATION_CLASS__PACKAGE :
				return basicGetPackage() != null;
			case UMLPackage.ASSOCIATION_CLASS__TEMPLATE_BINDING :
				EList templateBinding = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__TEMPLATE_BINDING);
				return templateBinding != null && !templateBinding.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE :
				return eVirtualGet(UMLPackage.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE) != null;
			case UMLPackage.ASSOCIATION_CLASS__IS_ABSTRACT :
				return isSetIsAbstract();
			case UMLPackage.ASSOCIATION_CLASS__GENERALIZATION :
				EList generalization = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__GENERALIZATION);
				return generalization != null && !generalization.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__POWERTYPE_EXTENT :
				EList powertypeExtent = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__POWERTYPE_EXTENT);
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__FEATURE :
				return isSetFeatures();
			case UMLPackage.ASSOCIATION_CLASS__INHERITED_MEMBER :
				return !getInheritedMembers().isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER :
				EList redefinedClassifier = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER);
				return redefinedClassifier != null
					&& !redefinedClassifier.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__GENERAL :
				return isSetGenerals();
			case UMLPackage.ASSOCIATION_CLASS__SUBSTITUTION :
				EList substitution = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__SUBSTITUTION);
				return substitution != null && !substitution.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__ATTRIBUTE :
				return isSetAttributes();
			case UMLPackage.ASSOCIATION_CLASS__REPRESENTATION :
				return eVirtualGet(UMLPackage.ASSOCIATION_CLASS__REPRESENTATION) != null;
			case UMLPackage.ASSOCIATION_CLASS__COLLABORATION_USE :
				EList collaborationUse = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__COLLABORATION_USE);
				return collaborationUse != null && !collaborationUse.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_USE_CASE :
				EList ownedUseCase = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__OWNED_USE_CASE);
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__USE_CASE :
				EList useCase = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__USE_CASE);
				return useCase != null && !useCase.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_SIGNATURE :
				return eVirtualGet(UMLPackage.ASSOCIATION_CLASS__OWNED_SIGNATURE) != null;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_ATTRIBUTE :
				return isSetOwnedAttributes();
			case UMLPackage.ASSOCIATION_CLASS__PART :
				return !getParts().isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__ROLE :
				return isSetRoles();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_CONNECTOR :
				EList ownedConnector = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__OWNED_CONNECTOR);
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_PORT :
				return !getOwnedPorts().isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_BEHAVIOR :
				EList ownedBehavior = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__OWNED_BEHAVIOR);
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR :
				return eVirtualGet(UMLPackage.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR) != null;
			case UMLPackage.ASSOCIATION_CLASS__INTERFACE_REALIZATION :
				EList interfaceRealization = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__INTERFACE_REALIZATION);
				return interfaceRealization != null
					&& !interfaceRealization.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_TRIGGER :
				EList ownedTrigger = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__OWNED_TRIGGER);
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__NESTED_CLASSIFIER :
				EList nestedClassifier = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__NESTED_CLASSIFIER);
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION :
				EList ownedOperation = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__OWNED_OPERATION);
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__SUPER_CLASS :
				return isSetSuperClasses();
			case UMLPackage.ASSOCIATION_CLASS__IS_ACTIVE :
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UMLPackage.ASSOCIATION_CLASS__OWNED_RECEPTION :
				EList ownedReception = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__OWNED_RECEPTION);
				return ownedReception != null && !ownedReception.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__EXTENSION :
				return !getExtensions().isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__RELATED_ELEMENT :
				return isSetRelatedElements();
			case UMLPackage.ASSOCIATION_CLASS__OWNED_END :
				EList ownedEnd = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__OWNED_END);
				return ownedEnd != null && !ownedEnd.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__MEMBER_END :
				EList memberEnd = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__MEMBER_END);
				return memberEnd != null && !memberEnd.isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__IS_DERIVED :
				return ((eFlags & IS_DERIVED_EFLAG) != 0) != IS_DERIVED_EDEFAULT;
			case UMLPackage.ASSOCIATION_CLASS__END_TYPE :
				return !getEndTypes().isEmpty();
			case UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END :
				EList navigableOwnedEnd = (EList) eVirtualGet(UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END);
				return navigableOwnedEnd != null
					&& !navigableOwnedEnd.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case UMLPackage.ASSOCIATION_CLASS__RELATED_ELEMENT :
					return UMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case UMLPackage.ASSOCIATION_CLASS__OWNED_END :
					return UMLPackage.ASSOCIATION__OWNED_END;
				case UMLPackage.ASSOCIATION_CLASS__MEMBER_END :
					return UMLPackage.ASSOCIATION__MEMBER_END;
				case UMLPackage.ASSOCIATION_CLASS__IS_DERIVED :
					return UMLPackage.ASSOCIATION__IS_DERIVED;
				case UMLPackage.ASSOCIATION_CLASS__END_TYPE :
					return UMLPackage.ASSOCIATION__END_TYPE;
				case UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END :
					return UMLPackage.ASSOCIATION__NAVIGABLE_OWNED_END;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case UMLPackage.RELATIONSHIP__RELATED_ELEMENT :
					return UMLPackage.ASSOCIATION_CLASS__RELATED_ELEMENT;
				default :
					return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case UMLPackage.ASSOCIATION__OWNED_END :
					return UMLPackage.ASSOCIATION_CLASS__OWNED_END;
				case UMLPackage.ASSOCIATION__MEMBER_END :
					return UMLPackage.ASSOCIATION_CLASS__MEMBER_END;
				case UMLPackage.ASSOCIATION__IS_DERIVED :
					return UMLPackage.ASSOCIATION_CLASS__IS_DERIVED;
				case UMLPackage.ASSOCIATION__END_TYPE :
					return UMLPackage.ASSOCIATION_CLASS__END_TYPE;
				case UMLPackage.ASSOCIATION__NAVIGABLE_OWNED_END :
					return UMLPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END;
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
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isDerived: "); //$NON-NLS-1$
		result.append((eFlags & IS_DERIVED_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElements() {
		return eIsSet(UMLPackage.ASSOCIATION_CLASS__END_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembers() {
		return super.isSetMembers()
			|| eIsSet(UMLPackage.ASSOCIATION_CLASS__MEMBER_END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return super.isSetFeatures()
			|| eIsSet(UMLPackage.ASSOCIATION_CLASS__OWNED_END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(UMLPackage.ASSOCIATION_CLASS__OWNED_END);
	}

} //AssociationClassImpl
