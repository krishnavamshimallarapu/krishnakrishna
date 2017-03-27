package com.krishnaweb.core.jalo;

import com.krishnaweb.core.constants.KrishnawebCoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class KrishnawebCoreManager extends GeneratedKrishnawebCoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( KrishnawebCoreManager.class.getName() );
	
	public static final KrishnawebCoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (KrishnawebCoreManager) em.getExtension(KrishnawebCoreConstants.EXTENSIONNAME);
	}
	
}
