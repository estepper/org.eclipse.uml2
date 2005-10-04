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
 * $Id: AssociationClassImpl.java,v 1.32 2005/10/04 21:55:12 khussey Exp $
 */
package org.eclipse.uml2.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.Association;
import org.eclipse.uml2.AssociationClass;
import org.eclipse.uml2.Behavior;
import org.eclipse.uml2.CollaborationOccurrence;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.Relationship;
import org.eclipse.uml2.StringExpression;
import org.eclipse.uml2.TemplateParameter;
import org.eclipse.uml2.TemplateSignature;
import org.eclipse.uml2.Type;
import org.eclipse.uml2.UML2Factory;
import org.eclipse.uml2.UML2Package;
import org.eclipse.uml2.VisibilityKind;

import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.common.util.SubsetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SupersetEObjectWithInverseResolvingEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.eclipse.uml2.internal.operation.AssociationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getMemberEnds <em>Member End</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getOwnedEnds <em>Owned End</em>}</li>
 *   <li>{@link org.eclipse.uml2.impl.AssociationClassImpl#getEndTypes <em>End Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationClassImpl extends ClassImpl implements AssociationClass {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) IBM Corporation and others."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getMemberEnds() <em>Member End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnds()
	 * @generated
	 * @ordered
	 */
	protected EList memberEnd = null;

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
	 * The cached value of the '{@link #getOwnedEnds() <em>Owned End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnds()
	 * @generated
	 * @ordered
	 */
	protected EList ownedEnd = null;

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
		return UML2Package.eINSTANCE.getAssociationClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRelatedElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			EList relatedElement = (EList) cache.get(eResource(), this, UML2Package.eINSTANCE.getRelationship_RelatedElement());
			if (relatedElement == null) {
				List union = getRelatedElementsHelper(new UniqueEList());
				cache.put(eResource(), this, UML2Package.eINSTANCE.getRelationship_RelatedElement(), relatedElement = new UnionEObjectEList(this, UML2Package.eINSTANCE.getRelationship_RelatedElement(), union.size(), union.toArray()));
			}
			return relatedElement;
		}
		List union = getRelatedElementsHelper(new UniqueEList());
		return new UnionEObjectEList(this, UML2Package.eINSTANCE.getRelationship_RelatedElement(), union.size(), union.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getFeaturesHelper(EList feature) {
		super.getFeaturesHelper(feature);
		if (eIsSet(UML2Package.eINSTANCE.getAssociation_OwnedEnd())) {
			feature.addAll(getOwnedEnds());
		}
		return feature;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getOwnedMembersHelper(EList ownedMember) {
		super.getOwnedMembersHelper(ownedMember);
		if (eIsSet(UML2Package.eINSTANCE.getAssociation_OwnedEnd())) {
			ownedMember.addAll(getOwnedEnds());
		}
		return ownedMember;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EList getMembersHelper(EList member) {
		super.getMembersHelper(member);
		if (eIsSet(UML2Package.eINSTANCE.getAssociation_MemberEnd())) {
			for (Iterator i = ((InternalEList) getMemberEnds()).basicIterator(); i.hasNext(); ) {
				member.add(i.next());
			}
		}
		return member;
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
		if (newIsDerived) eFlags |= IS_DERIVED_EFLAG; else eFlags &= ~IS_DERIVED_EFLAG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2Package.ASSOCIATION_CLASS__IS_DERIVED, oldIsDerived, newIsDerived));

	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOwnedEnds() {
		if (ownedEnd == null) {
			ownedEnd = new SubsetEObjectContainmentWithInverseEList(Property.class, this, UML2Package.ASSOCIATION_CLASS__OWNED_END, new int[] {UML2Package.ASSOCIATION_CLASS__MEMBER_END}, UML2Package.PROPERTY__OWNING_ASSOCIATION);
		}
		return ownedEnd;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Property getOwnedEnd(String name) {
		for (Iterator i = getOwnedEnds().iterator(); i.hasNext(); ) {
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
	public Property createOwnedEnd(EClass eClass) {
		Property newOwnedEnd = (Property) eClass.getEPackage().getEFactoryInstance().create(eClass);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ASSOCIATION_CLASS__OWNED_END, null, newOwnedEnd));
		}
		getOwnedEnds().add(newOwnedEnd);
		return newOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedEnd() {
		Property newOwnedEnd = UML2Factory.eINSTANCE.createProperty();
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, 0, UML2Package.ASSOCIATION_CLASS__OWNED_END, null, newOwnedEnd));
		}
		getOwnedEnds().add(newOwnedEnd);
		return newOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getEndTypes() {
		CacheAdapter cache = getCacheAdapter();

		if (cache != null) {
			EList result = (EList) cache.get(this, UML2Package.eINSTANCE
				.getAssociation_EndType());

			if (result == null) {
				Set endType = AssociationOperations.endType(this);
				cache.put(this, UML2Package.eINSTANCE.getAssociation_EndType(),
					result = new EcoreEList.UnmodifiableEList(this,
						UML2Package.eINSTANCE.getAssociation_EndType(), endType
							.size(), endType.toArray()));
			}

			return result;
		}

		Set endType = AssociationOperations.endType(this);
		return new EcoreEList.UnmodifiableEList(this, UML2Package.eINSTANCE
			.getAssociation_EndType(), endType.size(), endType.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Type getEndType(String name) {
		for (Iterator i = getEndTypes().iterator(); i.hasNext(); ) {
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
	public EList getMemberEnds() {
		if (memberEnd == null) {
			memberEnd = new SupersetEObjectWithInverseResolvingEList(Property.class, this, UML2Package.ASSOCIATION_CLASS__MEMBER_END, new int[] {UML2Package.ASSOCIATION_CLASS__OWNED_END}, UML2Package.PROPERTY__ASSOCIATION);
		}
		return memberEnd;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    public Property getMemberEnd(String name) {
		for (Iterator i = getMemberEnds().iterator(); i.hasNext(); ) {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.ASSOCIATION_CLASS__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicAdd(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE:
					if (ownedTemplateSignature != null)
						msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UML2Package.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE, null, msgs);
					return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicAdd(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicAdd(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicAdd(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicAdd(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__TEMPLATE_PARAMETER:
					if (templateParameter != null)
						msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
					return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNING_PARAMETER:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, UML2Package.ASSOCIATION_CLASS__OWNING_PARAMETER, msgs);
				case UML2Package.ASSOCIATION_CLASS__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicAdd(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicAdd(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicAdd(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__USE_CASE:
					return ((InternalEList)getUseCases()).basicAdd(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicAdd(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicAdd(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicAdd(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_END:
					return ((InternalEList)getOwnedEnds()).basicAdd(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
					return ((InternalEList)getMemberEnds()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	public NotificationChain eDynamicInverseAdd(InternalEObject otherEnd, int featureID, Class inverseClass, NotificationChain msgs) {
		switch (eDerivedStructuralFeatureID(featureID, inverseClass)) {
			case UML2Package.ASSOCIATION_CLASS__OWNED_STATE_MACHINE:
				return ((InternalEList)getOwnedStateMachines()).basicAdd(otherEnd, msgs);
			default :
				return super.eDynamicInverseAdd(otherEnd, featureID, inverseClass, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case UML2Package.ASSOCIATION_CLASS__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_COMMENT:
					return ((InternalEList)getOwnedComments()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__TEMPLATE_BINDING:
					return ((InternalEList)getTemplateBindings()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE:
					return basicSetOwnedTemplateSignature(null, msgs);
				case UML2Package.ASSOCIATION_CLASS__CLIENT_DEPENDENCY:
					return ((InternalEList)getClientDependencies()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__NAME_EXPRESSION:
					return basicSetNameExpression(null, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_RULE:
					return ((InternalEList)getOwnedRules()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__ELEMENT_IMPORT:
					return ((InternalEList)getElementImports()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__PACKAGE_IMPORT:
					return ((InternalEList)getPackageImports()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__TEMPLATE_PARAMETER:
					return basicSetTemplateParameter(null, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNING_PARAMETER:
					return eBasicSetContainer(null, UML2Package.ASSOCIATION_CLASS__OWNING_PARAMETER, msgs);
				case UML2Package.ASSOCIATION_CLASS__GENERALIZATION:
					return ((InternalEList)getGeneralizations()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__SUBSTITUTION:
					return ((InternalEList)getSubstitutions()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__POWERTYPE_EXTENT:
					return ((InternalEList)getPowertypeExtents()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_USE_CASE:
					return ((InternalEList)getOwnedUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__USE_CASE:
					return ((InternalEList)getUseCases()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OCCURRENCE:
					return ((InternalEList)getOccurrences()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_BEHAVIOR:
					return ((InternalEList)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__IMPLEMENTATION:
					return ((InternalEList)getImplementations()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_TRIGGER:
					return ((InternalEList)getOwnedTriggers()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_STATE_MACHINE:
					return ((InternalEList)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_ATTRIBUTE:
					return ((InternalEList)getOwnedAttributes()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_CONNECTOR:
					return ((InternalEList)getOwnedConnectors()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_PORT:
					return ((InternalEList)getOwnedPorts()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_OPERATION:
					return ((InternalEList)getOwnedOperations()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__NESTED_CLASSIFIER:
					return ((InternalEList)getNestedClassifiers()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_RECEPTION:
					return ((InternalEList)getOwnedReceptions()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__OWNED_END:
					return ((InternalEList)getOwnedEnds()).basicRemove(otherEnd, msgs);
				case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
					return ((InternalEList)getMemberEnds()).basicRemove(otherEnd, msgs);
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
				case UML2Package.ASSOCIATION_CLASS__OWNING_PARAMETER:
					return eContainer.eInverseRemove(this, UML2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
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
			case UML2Package.ASSOCIATION_CLASS__EANNOTATIONS:
				return getEAnnotations();
			case UML2Package.ASSOCIATION_CLASS__OWNED_ELEMENT:
				return getOwnedElements();
			case UML2Package.ASSOCIATION_CLASS__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case UML2Package.ASSOCIATION_CLASS__OWNED_COMMENT:
				return getOwnedComments();
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_BINDING:
				return getTemplateBindings();
			case UML2Package.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case UML2Package.ASSOCIATION_CLASS__NAME:
				return getName();
			case UML2Package.ASSOCIATION_CLASS__QUALIFIED_NAME:
				return getQualifiedName();
			case UML2Package.ASSOCIATION_CLASS__VISIBILITY:
				return getVisibility();
			case UML2Package.ASSOCIATION_CLASS__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case UML2Package.ASSOCIATION_CLASS__NAME_EXPRESSION:
				return getNameExpression();
			case UML2Package.ASSOCIATION_CLASS__MEMBER:
				return getMembers();
			case UML2Package.ASSOCIATION_CLASS__OWNED_RULE:
				return getOwnedRules();
			case UML2Package.ASSOCIATION_CLASS__IMPORTED_MEMBER:
				return getImportedMembers();
			case UML2Package.ASSOCIATION_CLASS__ELEMENT_IMPORT:
				return getElementImports();
			case UML2Package.ASSOCIATION_CLASS__PACKAGE_IMPORT:
				return getPackageImports();
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case UML2Package.ASSOCIATION_CLASS__OWNING_PARAMETER:
				return getOwningParameter();
			case UML2Package.ASSOCIATION_CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility();
			case UML2Package.ASSOCIATION_CLASS__PACKAGE:
				return getPackage();
			case UML2Package.ASSOCIATION_CLASS__REDEFINITION_CONTEXT:
				return getRedefinitionContexts();
			case UML2Package.ASSOCIATION_CLASS__IS_LEAF:
				return isLeaf() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ASSOCIATION_CLASS__FEATURE:
				return getFeatures();
			case UML2Package.ASSOCIATION_CLASS__IS_ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ASSOCIATION_CLASS__INHERITED_MEMBER:
				return getInheritedMembers();
			case UML2Package.ASSOCIATION_CLASS__GENERAL:
				return getGenerals();
			case UML2Package.ASSOCIATION_CLASS__GENERALIZATION:
				return getGeneralizations();
			case UML2Package.ASSOCIATION_CLASS__ATTRIBUTE:
				return getAttributes();
			case UML2Package.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case UML2Package.ASSOCIATION_CLASS__SUBSTITUTION:
				return getSubstitutions();
			case UML2Package.ASSOCIATION_CLASS__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case UML2Package.ASSOCIATION_CLASS__OWNED_USE_CASE:
				return getOwnedUseCases();
			case UML2Package.ASSOCIATION_CLASS__USE_CASE:
				return getUseCases();
			case UML2Package.ASSOCIATION_CLASS__REPRESENTATION:
				return getRepresentation();
			case UML2Package.ASSOCIATION_CLASS__OCCURRENCE:
				return getOccurrences();
			case UML2Package.ASSOCIATION_CLASS__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case UML2Package.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR:
				return getClassifierBehavior();
			case UML2Package.ASSOCIATION_CLASS__IMPLEMENTATION:
				return getImplementations();
			case UML2Package.ASSOCIATION_CLASS__OWNED_TRIGGER:
				return getOwnedTriggers();
			case UML2Package.ASSOCIATION_CLASS__OWNED_STATE_MACHINE:
				return getOwnedStateMachines();
			case UML2Package.ASSOCIATION_CLASS__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case UML2Package.ASSOCIATION_CLASS__PART:
				return getParts();
			case UML2Package.ASSOCIATION_CLASS__ROLE:
				return getRoles();
			case UML2Package.ASSOCIATION_CLASS__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case UML2Package.ASSOCIATION_CLASS__OWNED_PORT:
				return getOwnedPorts();
			case UML2Package.ASSOCIATION_CLASS__OWNED_OPERATION:
				return getOwnedOperations();
			case UML2Package.ASSOCIATION_CLASS__SUPER_CLASS:
				return getSuperClasses();
			case UML2Package.ASSOCIATION_CLASS__EXTENSION:
				return getExtensions();
			case UML2Package.ASSOCIATION_CLASS__NESTED_CLASSIFIER:
				return getNestedClassifiers();
			case UML2Package.ASSOCIATION_CLASS__IS_ACTIVE:
				return isActive() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ASSOCIATION_CLASS__OWNED_RECEPTION:
				return getOwnedReceptions();
			case UML2Package.ASSOCIATION_CLASS__RELATED_ELEMENT:
				return getRelatedElements();
			case UML2Package.ASSOCIATION_CLASS__IS_DERIVED:
				return isDerived() ? Boolean.TRUE : Boolean.FALSE;
			case UML2Package.ASSOCIATION_CLASS__OWNED_END:
				return getOwnedEnds();
			case UML2Package.ASSOCIATION_CLASS__END_TYPE:
				return getEndTypes();
			case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
				return getMemberEnds();
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
			case UML2Package.ASSOCIATION_CLASS__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__NAME:
				setName((String)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility((VisibilityKind)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_LEAF:
				setIsLeaf(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_ABSTRACT:
				setIsAbstract(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ASSOCIATION_CLASS__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OCCURRENCE:
				getOccurrences().clear();
				getOccurrences().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__IMPLEMENTATION:
				getImplementations().clear();
				getImplementations().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				getOwnedTriggers().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_PORT:
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_ACTIVE:
				setIsActive(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_DERIVED:
				setIsDerived(((Boolean)newValue).booleanValue());
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_END:
				getOwnedEnds().clear();
				getOwnedEnds().addAll((Collection)newValue);
				return;
			case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
				getMemberEnds().clear();
				getMemberEnds().addAll((Collection)newValue);
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
			case UML2Package.ASSOCIATION_CLASS__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case UML2Package.ASSOCIATION_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UML2Package.ASSOCIATION_CLASS__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ASSOCIATION_CLASS__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNING_PARAMETER:
				setOwningParameter((TemplateParameter)null);
				return;
			case UML2Package.ASSOCIATION_CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				setPackageableElement_visibility(PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT);
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case UML2Package.ASSOCIATION_CLASS__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__USE_CASE:
				getUseCases().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__REPRESENTATION:
				setRepresentation((CollaborationOccurrence)null);
				return;
			case UML2Package.ASSOCIATION_CLASS__OCCURRENCE:
				getOccurrences().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case UML2Package.ASSOCIATION_CLASS__IMPLEMENTATION:
				getImplementations().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_TRIGGER:
				getOwnedTriggers().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_STATE_MACHINE:
				getOwnedStateMachines().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_PORT:
				getOwnedPorts().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case UML2Package.ASSOCIATION_CLASS__OWNED_END:
				getOwnedEnds().clear();
				return;
			case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
				getMemberEnds().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSetGen(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.ASSOCIATION_CLASS__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_ELEMENT:
				return eIsSet(UML2Package.eINSTANCE.getElement_OwnedComment())
					|| eIsSet(UML2Package.eINSTANCE.getTemplateableElement_TemplateBinding())
					|| eIsSet(UML2Package.eINSTANCE.getTemplateableElement_OwnedTemplateSignature())
					|| eIsSet(UML2Package.eINSTANCE.getNamedElement_NameExpression())
					|| eIsSet(UML2Package.eINSTANCE.getNamespace_OwnedRule())
					|| eIsSet(UML2Package.eINSTANCE.getNamespace_ElementImport())
					|| eIsSet(UML2Package.eINSTANCE.getNamespace_PackageImport())
					|| eIsSet(UML2Package.eINSTANCE.getClassifier_Generalization())
					|| eIsSet(UML2Package.eINSTANCE.getClassifier_Substitution())
					|| eIsSet(UML2Package.eINSTANCE.getClassifier_OwnedUseCase())
					|| eIsSet(UML2Package.eINSTANCE.getClassifier_Representation())
					|| eIsSet(UML2Package.eINSTANCE.getClassifier_Occurrence())
					|| eIsSet(UML2Package.eINSTANCE.getBehavioredClassifier_OwnedBehavior())
					|| eIsSet(UML2Package.eINSTANCE.getBehavioredClassifier_ClassifierBehavior())
					|| eIsSet(UML2Package.eINSTANCE.getBehavioredClassifier_Implementation())
					|| eIsSet(UML2Package.eINSTANCE.getBehavioredClassifier_OwnedTrigger())
					|| eIsSet(UML2Package.eINSTANCE.getStructuredClassifier_OwnedAttribute())
					|| eIsSet(UML2Package.eINSTANCE.getStructuredClassifier_OwnedConnector())
					|| eIsSet(UML2Package.eINSTANCE.getEncapsulatedClassifier_OwnedPort())
					|| eIsSet(UML2Package.eINSTANCE.getClass_OwnedOperation())
					|| eIsSet(UML2Package.eINSTANCE.getClass_NestedClassifier())
					|| eIsSet(UML2Package.eINSTANCE.getClass_OwnedReception())
					|| eIsSet(UML2Package.eINSTANCE.getAssociation_OwnedEnd());
			case UML2Package.ASSOCIATION_CLASS__OWNER:
				return eIsSet(UML2Package.eINSTANCE.getParameterableElement_OwningParameter())
					|| eIsSet(UML2Package.eINSTANCE.getType_Package());
			case UML2Package.ASSOCIATION_CLASS__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case UML2Package.ASSOCIATION_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UML2Package.ASSOCIATION_CLASS__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case UML2Package.ASSOCIATION_CLASS__VISIBILITY:
				return getVisibility() != VISIBILITY_EDEFAULT;
			case UML2Package.ASSOCIATION_CLASS__CLIENT_DEPENDENCY:
				return clientDependency != null && !clientDependency.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__NAME_EXPRESSION:
				return nameExpression != null;
			case UML2Package.ASSOCIATION_CLASS__MEMBER:
				return eIsSet(UML2Package.eINSTANCE.getNamespace_OwnedRule())
					|| eIsSet(UML2Package.eINSTANCE.getNamespace_ImportedMember())
					|| eIsSet(UML2Package.eINSTANCE.getClassifier_InheritedMember())
					|| eIsSet(UML2Package.eINSTANCE.getClassifier_OwnedUseCase())
					|| eIsSet(UML2Package.eINSTANCE.getBehavioredClassifier_OwnedBehavior())
					|| eIsSet(UML2Package.eINSTANCE.getBehavioredClassifier_ClassifierBehavior())
					|| eIsSet(UML2Package.eINSTANCE.getBehavioredClassifier_OwnedTrigger())
					|| eIsSet(UML2Package.eINSTANCE.getStructuredClassifier_OwnedAttribute())
					|| eIsSet(UML2Package.eINSTANCE.getStructuredClassifier_OwnedConnector())
					|| eIsSet(UML2Package.eINSTANCE.getEncapsulatedClassifier_OwnedPort())
					|| eIsSet(UML2Package.eINSTANCE.getClass_OwnedOperation())
					|| eIsSet(UML2Package.eINSTANCE.getClass_NestedClassifier())
					|| eIsSet(UML2Package.eINSTANCE.getClass_OwnedReception())
					|| eIsSet(UML2Package.eINSTANCE.getAssociation_OwnedEnd())
					|| eIsSet(UML2Package.eINSTANCE.getAssociation_MemberEnd());
			case UML2Package.ASSOCIATION_CLASS__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case UML2Package.ASSOCIATION_CLASS__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case UML2Package.ASSOCIATION_CLASS__OWNING_PARAMETER:
				return getOwningParameter() != null;
			case UML2Package.ASSOCIATION_CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				return getPackageableElement_visibility() != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.ASSOCIATION_CLASS__PACKAGE:
				return getPackage() != null;
			case UML2Package.ASSOCIATION_CLASS__REDEFINITION_CONTEXT:
				return !getRedefinitionContexts().isEmpty();
			case UML2Package.ASSOCIATION_CLASS__IS_LEAF:
				return ((eFlags & IS_LEAF_EFLAG) != 0) != IS_LEAF_EDEFAULT;
			case UML2Package.ASSOCIATION_CLASS__FEATURE:
				return eIsSet(UML2Package.eINSTANCE.getStructuredClassifier_OwnedAttribute())
					|| eIsSet(UML2Package.eINSTANCE.getStructuredClassifier_OwnedConnector())
					|| eIsSet(UML2Package.eINSTANCE.getEncapsulatedClassifier_OwnedPort())
					|| eIsSet(UML2Package.eINSTANCE.getClass_OwnedOperation())
					|| eIsSet(UML2Package.eINSTANCE.getClass_OwnedReception())
					|| eIsSet(UML2Package.eINSTANCE.getAssociation_OwnedEnd());
			case UML2Package.ASSOCIATION_CLASS__IS_ABSTRACT:
				return isAbstract() != IS_ABSTRACT_EDEFAULT;
			case UML2Package.ASSOCIATION_CLASS__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case UML2Package.ASSOCIATION_CLASS__GENERAL:
				return !getGenerals().isEmpty();
			case UML2Package.ASSOCIATION_CLASS__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__ATTRIBUTE:
				return eIsSet(UML2Package.eINSTANCE.getStructuredClassifier_OwnedAttribute());
			case UML2Package.ASSOCIATION_CLASS__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__USE_CASE:
				return useCase != null && !useCase.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__REPRESENTATION:
				return representation != null;
			case UML2Package.ASSOCIATION_CLASS__OCCURRENCE:
				return occurrence != null && !occurrence.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_BEHAVIOR:
				return !getOwnedBehaviors().isEmpty();
			case UML2Package.ASSOCIATION_CLASS__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case UML2Package.ASSOCIATION_CLASS__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_TRIGGER:
				return ownedTrigger != null && !ownedTrigger.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_STATE_MACHINE:
				return !getOwnedStateMachines().isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_ATTRIBUTE:
				return !getOwnedAttributes().isEmpty();
			case UML2Package.ASSOCIATION_CLASS__PART:
				return !getParts().isEmpty();
			case UML2Package.ASSOCIATION_CLASS__ROLE:
				return eIsSet(UML2Package.eINSTANCE.getStructuredClassifier_OwnedAttribute());
			case UML2Package.ASSOCIATION_CLASS__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_PORT:
				return ownedPort != null && !ownedPort.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__SUPER_CLASS:
				return !getSuperClasses().isEmpty();
			case UML2Package.ASSOCIATION_CLASS__EXTENSION:
				return !getExtensions().isEmpty();
			case UML2Package.ASSOCIATION_CLASS__NESTED_CLASSIFIER:
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__IS_ACTIVE:
				return ((eFlags & IS_ACTIVE_EFLAG) != 0) != IS_ACTIVE_EDEFAULT;
			case UML2Package.ASSOCIATION_CLASS__OWNED_RECEPTION:
				return ownedReception != null && !ownedReception.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__RELATED_ELEMENT:
				return eIsSet(UML2Package.eINSTANCE.getAssociation_EndType());
			case UML2Package.ASSOCIATION_CLASS__IS_DERIVED:
				return ((eFlags & IS_DERIVED_EFLAG) != 0) != IS_DERIVED_EDEFAULT;
			case UML2Package.ASSOCIATION_CLASS__OWNED_END:
				return ownedEnd != null && !ownedEnd.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__END_TYPE:
				return !getEndTypes().isEmpty();
			case UML2Package.ASSOCIATION_CLASS__MEMBER_END:
				return memberEnd != null && !memberEnd.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case UML2Package.ASSOCIATION_CLASS__VISIBILITY:
				return false;
			case UML2Package.ASSOCIATION_CLASS__PACKAGEABLE_ELEMENT_VISIBILITY:
				return visibility != PACKAGEABLE_ELEMENT_VISIBILITY_EDEFAULT;
			case UML2Package.ASSOCIATION_CLASS__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_STATE_MACHINE:
				return ownedStateMachine != null && !ownedStateMachine.isEmpty();
			case UML2Package.ASSOCIATION_CLASS__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
		}
		return eIsSetGen(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case UML2Package.ASSOCIATION_CLASS__RELATED_ELEMENT: return UML2Package.RELATIONSHIP__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case UML2Package.ASSOCIATION_CLASS__IS_DERIVED: return UML2Package.ASSOCIATION__IS_DERIVED;
				case UML2Package.ASSOCIATION_CLASS__OWNED_END: return UML2Package.ASSOCIATION__OWNED_END;
				case UML2Package.ASSOCIATION_CLASS__END_TYPE: return UML2Package.ASSOCIATION__END_TYPE;
				case UML2Package.ASSOCIATION_CLASS__MEMBER_END: return UML2Package.ASSOCIATION__MEMBER_END;
				default: return -1;
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
				case UML2Package.RELATIONSHIP__RELATED_ELEMENT: return UML2Package.ASSOCIATION_CLASS__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case UML2Package.ASSOCIATION__IS_DERIVED: return UML2Package.ASSOCIATION_CLASS__IS_DERIVED;
				case UML2Package.ASSOCIATION__OWNED_END: return UML2Package.ASSOCIATION_CLASS__OWNED_END;
				case UML2Package.ASSOCIATION__END_TYPE: return UML2Package.ASSOCIATION_CLASS__END_TYPE;
				case UML2Package.ASSOCIATION__MEMBER_END: return UML2Package.ASSOCIATION_CLASS__MEMBER_END;
				default: return -1;
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
		if (eIsProxy()) return super.toString();

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
	protected EList getRelatedElementsHelper(EList relatedElement) {
		EList endType = getEndTypes();
		if (!endType.isEmpty()) {
			for (Iterator i = ((InternalEList) endType).basicIterator(); i.hasNext(); ) {
				relatedElement.add(i.next());
			}
		}
		return relatedElement;
	}

	// <!-- begin-custom-operations -->

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.Association#isBinary()
	 */
	public boolean isBinary() {
		return AssociationOperations.isBinary(this);
	}
	
	// <!-- end-custom-operations -->

} //AssociationClassImpl
