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
 * $Id: ActivityParameterNodeOperations.java,v 1.1 2005/11/14 22:25:54 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ActivityParameterNode;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Activity Parameter Node</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActivityParameterNode#validateParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityParameterNode#validateSameType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Same Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityParameterNode#validateNoEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityParameterNode#validateNoIncomingEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Incoming Edges</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ActivityParameterNode#validateNoOutgoingEdges(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Outgoing Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class ActivityParameterNodeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActivityParameterNodeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity parameter nodes must have parameters from the containing activity.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateParameter(
			ActivityParameterNode activityParameterNode,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.ACTIVITY_PARAMETER_NODE__PARAMETER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateParameter", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityParameterNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{activityParameterNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of an activity parameter node is the same as the type of its parameter.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSameType(
			ActivityParameterNode activityParameterNode,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.ACTIVITY_PARAMETER_NODE__SAME_TYPE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSameType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityParameterNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{activityParameterNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An activity parameter node may have all incoming edges or all outgoing edges, but it must not have both incoming and outgoing edges.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoEdges(
			ActivityParameterNode activityParameterNode,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.ACTIVITY_PARAMETER_NODE__NO_EDGES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoEdges", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityParameterNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{activityParameterNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity parameter object nodes with no incoming edges and one or more outgoing edges must have a parameter with in or inout direction.
	 * 
	 * 
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoIncomingEdges(
			ActivityParameterNode activityParameterNode,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.ACTIVITY_PARAMETER_NODE__NO_INCOMING_EDGES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoIncomingEdges", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityParameterNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{activityParameterNode}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity parameter object nodes with no outgoing edges and one or more incoming edges must have a parameter with out, inout, or return direction.
	 * 
	 * 
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoOutgoingEdges(
			ActivityParameterNode activityParameterNode,
			DiagnosticChain diagnostics, Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.ACTIVITY_PARAMETER_NODE__NO_OUTGOING_EDGES,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateNoOutgoingEdges", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(activityParameterNode, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{activityParameterNode}));
			}
			return false;
		}
		return true;
	}

} // ActivityParameterNodeOperations