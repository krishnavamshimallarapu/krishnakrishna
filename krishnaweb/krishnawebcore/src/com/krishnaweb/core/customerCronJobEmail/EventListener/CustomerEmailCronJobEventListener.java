/**
 *
 */
package com.krishnaweb.core.customerCronJobEmail.EventListener;

import de.hybris.platform.acceleratorservices.site.AbstractAcceleratorSiteEventListener;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.util.ServicesUtil;

import org.apache.log4j.Logger;

import com.krishnaweb.core.event.CustomerEmailCronJobEmailEvent;
import com.krishnaweb.core.model.EventsAndListenersforCronJobEmailModel;


/**
 * @author krishnavamsi
 *
 */
public class CustomerEmailCronJobEventListener extends AbstractAcceleratorSiteEventListener<CustomerEmailCronJobEmailEvent>
{
	private static final Logger LOG = Logger.getLogger(CustomerEmailCronJobEventListener.class);

	private ModelService modelService;

	private BusinessProcessService businessProcessService;

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	/**
	 * @return the businessProcessService
	 */
	public BusinessProcessService getBusinessProcessService()
	{
		return businessProcessService;
	}

	/**
	 * @param businessProcessService
	 *           the businessProcessService to set
	 */
	public void setBusinessProcessService(final BusinessProcessService businessProcessService)
	{
		this.businessProcessService = businessProcessService;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.acceleratorservices.site.AbstractAcceleratorSiteEventListener#getSiteChannelForEvent(de.hybris.
	 * platform.servicelayer.event.events.AbstractEvent)
	 */
	@Override
	protected SiteChannel getSiteChannelForEvent(final CustomerEmailCronJobEmailEvent event)
	{
		// YTODO Auto-generated method stub
		LOG.info("====CustomerEmailCronJob EventListener SiteChannel Called====");
		final BaseSiteModel site = event.getSite();
		ServicesUtil.validateParameterNotNullStandardMessage("event.site", site);
		return site.getChannel();

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.commerceservices.event.AbstractSiteEventListener#onSiteEvent(de.hybris.platform.servicelayer.
	 * event.events.AbstractEvent)
	 */
	@Override
	protected void onSiteEvent(final CustomerEmailCronJobEmailEvent event)
	{
		// YTODO Auto-generated method stub
		final EventsAndListenersforCronJobEmailModel eventsAndListenersforCronJobModel = (EventsAndListenersforCronJobEmailModel) getBusinessProcessService()
				.createProcess("CustomerEmailCronJobProcess" + event.getCronJobEmail() + "-" + System.currentTimeMillis(),
						"CustomerEmailCronJobProcess");
		LOG.info("===CustomerEmailCronJob EventListener onSiteEvent Called ======");

		eventsAndListenersforCronJobModel.setSite(event.getSite());
		eventsAndListenersforCronJobModel.setStore(event.getBaseStore());
		eventsAndListenersforCronJobModel.setLanguage(event.getLanguage());
		eventsAndListenersforCronJobModel.setCurrency(event.getCurrency());
		eventsAndListenersforCronJobModel.setEmailAddressOfCustomer(event.getCronJobEmail());
		getModelService().save(eventsAndListenersforCronJobModel);

		LOG.info("CustomerEmailCronJob EventListener onSiteEvent 2 Called====== ");
		getBusinessProcessService().startProcess(eventsAndListenersforCronJobModel);




	}



}
