/**
 *
 */
package com.krishnaweb.core.event;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.event.AbstractCommerceUserEvent;

import org.apache.log4j.Logger;



/**
 * @author krishnavamsi
 *
 */
public class CustomerEmailCronJobEmailEvent extends AbstractCommerceUserEvent<BaseSiteModel>
{
	private static final Logger LOG = Logger.getLogger(CustomerEmailCronJobEmailEvent.class);
	private String cronJobEmail;

	/**
	 * @return the cronJobEmail
	 */
	public String getCronJobEmail()
	{
		LOG.info("+++++++ CustomerEmailCronJobEmailEvent  getCronJobEmail Called +++++++++++ ");

		return cronJobEmail;
	}

	/**
	 * @param cronJobEmail
	 *           the cronJobEmail to set
	 */
	public void setCronJobEmail(final String cronJobEmail)
	{
		LOG.info("+++++++ CustomerEmailCronJobEmailEvent setCronJobEmail Called +++++++++++ ");
		this.cronJobEmail = cronJobEmail;
	}




}
