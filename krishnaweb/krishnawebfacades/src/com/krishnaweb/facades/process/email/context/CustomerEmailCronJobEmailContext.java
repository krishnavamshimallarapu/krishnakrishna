/**
 *
 */
package com.krishnaweb.facades.process.email.context;

import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.CustomerModel;

import org.apache.log4j.Logger;

import com.krishnaweb.core.model.EventsAndListenersforCronJobEmailModel;



/**
 * @author krishnavamsi
 *
 */
public class CustomerEmailCronJobEmailContext extends AbstractEmailContext<EventsAndListenersforCronJobEmailModel>
{
	private static final Logger LOG = Logger.getLogger(CustomerEmailCronJobEmailContext.class);


	@Override
	public void init(final EventsAndListenersforCronJobEmailModel storeFrontCustomerProcessModel,
			final EmailPageModel emailPageModel)
	{
		LOG.info("=======Context class is called=========");


		put(FROM_EMAIL, emailPageModel.getFromEmail());
		put(EMAIL_LANGUAGE, storeFrontCustomerProcessModel.getLanguage());
		put(FROM_DISPLAY_NAME, emailPageModel.getFromName());
		put(TITLE, "Your customer title");
		put(DISPLAY_NAME, "Your customer name");
		put(EMAIL, storeFrontCustomerProcessModel.getEmailAddressOfCustomer());

		put(BASE_SITE, storeFrontCustomerProcessModel.getSite());


	}



	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext#getSite(de.hybris.platform.
	 * processengine.model.BusinessProcessModel)
	 */
	@Override
	protected BaseSiteModel getSite(final EventsAndListenersforCronJobEmailModel businessProcessModel)
	{
		// YTODO Auto-generated method stub

		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext#getCustomer(de.hybris.platform.
	 * processengine.model.BusinessProcessModel)
	 */
	@Override
	protected CustomerModel getCustomer(final EventsAndListenersforCronJobEmailModel businessProcessModel)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext#getEmailLanguage(de.hybris.
	 * platform.processengine.model.BusinessProcessModel)
	 */
	@Override
	protected LanguageModel getEmailLanguage(final EventsAndListenersforCronJobEmailModel businessProcessModel)
	{
		// YTODO Auto-generated method stub
		return null;
	}


}
