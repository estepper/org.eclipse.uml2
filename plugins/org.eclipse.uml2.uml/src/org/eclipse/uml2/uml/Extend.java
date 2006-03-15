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
 * $Id: Extend.java,v 1.6 2006/03/15 19:33:55 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This relationship specifies that the behavior of a use case may be extended by the behavior of another (usually supplementary) use case. The extension takes place at one or more specific extension points defined in the extended use case. Note, however, that the extended use case is defined independently of the extending use case and is meaningful independently of the extending use case. On the other hand, the extending use case typically defines behavior that may not necessarily be meaningful by itself. Instead, the extending use case defines a set of modular behavior increments that augment an execution of the extended use case under specific conditions.
 * 
 * 
 * 
 * Note that the same extending use case can extend more than one use case. Furthermore, an extending use case may itself be extended.
 * 
 * 
 * 
 * It is a kind of DirectedRelationship, such that the source is the extending use case and the destination is the extended use case. It is also a kind of NamedElement so that it can have a name in the context of its owning use case. The extend relationship itself is owned by the extending use case.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Extend#getExtendedCase <em>Extended Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extend#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extend#getExtensionLocations <em>Extension Location</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Extend#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getExtend()
 * @model
 * @generated
 */
public interface Extend
		extends NamedElement, DirectedRelationship {

	/**
	 * Returns the value of the '<em><b>Extended Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the use case that is being extended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Case</em>' reference.
	 * @see #setExtendedCase(UseCase)
	 * @see org.eclipse.uml2.uml.UMLPackage#getExtend_ExtendedCase()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UseCase getExtendedCase();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Extend#getExtendedCase <em>Extended Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Case</em>' reference.
	 * @see #getExtendedCase()
	 * @generated
	 */
	void setExtendedCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the condition that must hold when the first extension point is reached for the extension to take place. If no constraint is associated with the extend relationship, the extension is unconditional.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Constraint)
	 * @see org.eclipse.uml2.uml.UMLPackage#getExtend_Condition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Constraint getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Extend#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Constraint value);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint}, with the specified '<em><b>Name</b></em>', and sets the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Constraint} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getCondition()
	 * @generated
	 */
	Constraint createCondition(String name, EClass eClass);

	/**
	 * Creates a new {@link org.eclipse.uml2.uml.Constraint},with the specified '<em><b>Name</b></em>', and sets the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' for the new {@link org.eclipse.uml2.uml.Constraint}, or <code>null</code>.
	 * @return The new {@link org.eclipse.uml2.uml.Constraint}.
	 * @see #getCondition()
	 * @generated
	 */
	Constraint createCondition(String name);

	/**
	 * Returns the value of the '<em><b>Extension Location</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ExtensionPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ordered list of extension points belonging to the extended use case, specifying where the respective behavioral fragments of the extending use case are to be inserted. The first fragment in the extending use case is associated with the first extension point in the list, the second fragment with the second point, and so on. (Note that, in most practical cases, the extending use case has just a single behavior fragment, so that the list of extension points is trivial.)
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension Location</em>' reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getExtend_ExtensionLocation()
	 * @model type="org.eclipse.uml2.uml.ExtensionPoint" required="true"
	 * @generated
	 */
	EList getExtensionLocations();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>' from the '<em><b>Extension Location</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExtensionPoint} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtensionLocations()
	 * @generated
	 */
	ExtensionPoint getExtensionLocation(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>' from the '<em><b>Extension Location</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ExtensionPoint} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.ExtensionPoint} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExtensionLocations()
	 * @generated
	 */
	ExtensionPoint getExtensionLocation(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.UseCase#getExtends <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the use case that represents the extension and owns the extend relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension</em>' container reference.
	 * @see #setExtension(UseCase)
	 * @see org.eclipse.uml2.uml.UMLPackage#getExtend_Extension()
	 * @see org.eclipse.uml2.uml.UseCase#getExtends
	 * @model opposite="extend" required="true" ordered="false"
	 * @generated
	 */
	UseCase getExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Extend#getExtension <em>Extension</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' container reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(UseCase value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The extension points referenced by the extend relationship must belong to the use case that is being extended.
	 * 
	 * 
	 * 
	 * 
	 * extensionLocation->forAll (xp | extendedCase.extensionPoint->includes(xp))
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateExtensionPoints(DiagnosticChain diagnostics, Map context);

} // Extend
