/*
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 * 
 * $Id: EMOF2EcoreResource.java,v 1.1 2004/12/21 21:22:00 khussey Exp $
 */
package org.eclipse.uml2.examples.emof2ecore.util;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.uml2.examples.emof2ecore.internal.util.EMOF2EcoreResourceFactoryImpl;

/**
 * 
 */
public interface EMOF2EcoreResource
		extends XMIResource {

	public static final String copyright = "Copyright (c) 2004 IBM Corporation and others."; //$NON-NLS-1$

	public interface Factory
			extends Resource.Factory {

		public static final Factory INSTANCE = new EMOF2EcoreResourceFactoryImpl();

	}

	public abstract class PostProcessor {

		public void postLoad(EMOF2EcoreResource resource, Map options) {
			// do nothing
		}

	}

	public static final String FILE_EXTENSION = "emof2ecore"; //$NON-NLS-1$

	public static final String DEFAULT_ENCODING = "UTF-8"; //$NON-NLS-1$

	public static final String OPTION_PRE_PROCESSOR = "PRE_PROCESSOR"; //$NON-NLS-1$

	public static final String OPTION_POST_PROCESSOR = "POST_PROCESSOR"; //$NON-NLS-1$

}
