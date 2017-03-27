/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.krishnaweb.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.krishnaweb.fulfilmentprocess.constants.KrishnawebFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class KrishnawebFulfilmentProcessManager extends GeneratedKrishnawebFulfilmentProcessManager
{
	public static final KrishnawebFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (KrishnawebFulfilmentProcessManager) em.getExtension(KrishnawebFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
