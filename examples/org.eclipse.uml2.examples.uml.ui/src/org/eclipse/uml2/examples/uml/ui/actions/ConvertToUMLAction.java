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
 * $Id: ConvertToUMLAction.java,v 1.1 2006/03/28 21:07:32 khussey Exp $
 */
package org.eclipse.uml2.examples.uml.ui.actions;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.examples.uml.ui.UMLExamplesUIPlugin;
import org.eclipse.uml2.examples.uml.ui.dialogs.Ecore2UMLConverterOptionsDialog;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.editor.actions.DiagnosticAction;
import org.eclipse.uml2.uml.editor.dialogs.OptionsDialog;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLValidator;

public class ConvertToUMLAction
		extends DiagnosticAction {

	public ConvertToUMLAction() {
		super();
	}

	protected AdapterFactory getAdapterFactory() {
		return workbenchPart instanceof EcoreEditor
			? ((EcoreEditor) workbenchPart).getAdapterFactory()
			: null;
	}

	protected Command createActionCommand(EditingDomain editingDomain,
			Collection collection) {

		if (collection.size() == 1
			&& collection.toArray()[0] instanceof EPackage) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final EPackage ePackage = (EPackage) collection.toArray()[0];

			final Shell shell = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getShell();

			final Map options = new HashMap();

			final String label = UMLExamplesUIPlugin.INSTANCE.getString(
				"_UI_ConvertToUMLActionCommand_label", //$NON-NLS-1$
				new Object[]{getLabelProvider().getText(ePackage)});

			OptionsDialog optionsDialog = new Ecore2UMLConverterOptionsDialog(
				shell, label, UMLExamplesUIPlugin.INSTANCE
					.getString("_UI_OptionsDialog_message"), options); //$NON-NLS-1$

			if (optionsDialog.open() == Window.OK) {
				IRunnableWithProgress runnableWithProgress = new IRunnableWithProgress() {

					public void run(final IProgressMonitor progressMonitor)
							throws InvocationTargetException,
							InterruptedException {

						try {
							final BasicDiagnostic diagnostics = new BasicDiagnostic(
								UMLValidator.DIAGNOSTIC_SOURCE, 0,
								EcorePlugin.INSTANCE.getString(
									"_UI_DiagnosticRoot_diagnostic", //$NON-NLS-1$
									new Object[]{substitutionLabelProvider
										.getObjectLabel(ePackage)}),
								new Object[]{ePackage});

							Map context = new HashMap();
							context.put(UML2Util.QualifiedTextProvider.class,
								qualifiedTextProvider);

							progressMonitor.beginTask(
								UMLExamplesUIPlugin.INSTANCE.getString(
									"_UI_ConvertingToUML_message", //$NON-NLS-1$
									new Object[]{substitutionLabelProvider
										.getObjectLabel(ePackage)}),
								IProgressMonitor.UNKNOWN);

							Resource resource = ePackage.eResource();
							ResourceSet resourceSet = resource.getResourceSet();
							URI uri = resourceSet.getURIConverter().normalize(
								resource.getURI()).trimFileExtension()
								.trimSegments(1);

							List resources = new ArrayList();

							for (Iterator packages = UMLUtil.convertFromEcore(
								ePackage, options, diagnostics, context)
								.iterator(); packages.hasNext();) {

								org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) packages
									.next();

								resources.add(resource = resourceSet
									.createResource(uri.appendSegment(
										package_.getName())
										.appendFileExtension(
											UMLResource.FILE_EXTENSION)));

								EList contents = resource.getContents();

								contents.add(package_);

								for (Iterator allContents = UMLUtil
									.getAllContents(package_, true, false); allContents
									.hasNext();) {

									EObject eObject = (EObject) allContents
										.next();

									if (eObject instanceof Element) {
										contents.addAll(((Element) eObject)
											.getStereotypeApplications());
									}
								}
							}

							for (Iterator i = resources.iterator(); i.hasNext();) {

								try {
									((Resource) i.next()).save(null);
								} catch (Exception e) {
									UMLExamplesUIPlugin.INSTANCE.log(e);
								}
							}

							handleDiagnostic(progressMonitor.isCanceled()
								? Diagnostic.CANCEL_INSTANCE
								: diagnostics, label);
						} finally {
							progressMonitor.done();
						}
					}
				};

				if (eclipseResourcesUtil != null) {
					runnableWithProgress = eclipseResourcesUtil
						.getWorkspaceModifyOperation(runnableWithProgress);
				}

				try {
					new ProgressMonitorDialog(shell).run(false, true,
						runnableWithProgress);
				} catch (Exception e) {
					UMLExamplesUIPlugin.INSTANCE.log(e);
				}
			}
		}
	}
}
