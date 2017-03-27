/**
 *
 */
package com.krishnaweb.facades.CronJob;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.store.services.BaseStoreService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.krishnaweb.core.data.CronJobEmailData;
import com.krishnaweb.core.event.CustomerEmailCronJobEmailEvent;
import com.krishnaweb.core.model.CronJobEmailModel;
import com.krishnaweb.facades.CronJobEmail.facade.CronJobEmailFacade;


/**
 * @author krishnavamsi
 *
 */
public class CronjobEmail extends AbstractJobPerformable<CronJobEmailModel>
{
	private static final Logger LOG = Logger.getLogger(CronjobEmail.class);

	@Resource
	CronJobEmailFacade cronJobEmailFacadeImpl;

	@Resource
	EventService eventService;

	private BaseSiteService baseSiteService;
	private CommonI18NService commonI18NService;
	private BaseStoreService baseStoreService;



	@Override
	public PerformResult perform(final CronJobEmailModel cronJobModel)
	{
		// YTODO Auto-generated method stub
		for (final CronJobEmailData cronJobEmailData : cronJobEmailFacadeImpl.getcronJobEmail())
		{

			LOG.info(cronJobEmailData.getContactEmail());
			final CustomerEmailCronJobEmailEvent cronJobEmailEvent = new CustomerEmailCronJobEmailEvent();
			cronJobEmailEvent.setCurrency(cronJobModel.getSessionCurrency());
			cronJobEmailEvent.setLanguage(cronJobModel.getSessionLanguage());
			cronJobEmailEvent.setBaseStore(getBaseStoreService().getBaseStoreForUid("apparel-uk"));
			cronJobEmailEvent.setSite(getBaseSiteService().getBaseSiteForUID("apparel-uk"));
			cronJobEmailEvent.setCronJobEmail(cronJobEmailData.getContactEmail());
			LOG.info("=====Before Event Started=======");
			eventService.publishEvent(cronJobEmailEvent);
			LOG.info("=====After Event Started=====");
		}
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

	}




	/**
	 * @return the baseSiteService
	 */
	public BaseSiteService getBaseSiteService()
	{
		return baseSiteService;
	}

	/**
	 * @param baseSiteService
	 *           the baseSiteService to set
	 */
	public void setBaseSiteService(final BaseSiteService baseSiteService)
	{
		this.baseSiteService = baseSiteService;
	}

	/**
	 * @return the commonI18NService
	 */
	public CommonI18NService getCommonI18NService()
	{
		return commonI18NService;
	}

	/**
	 * @param commonI18NService
	 *           the commonI18NService to set
	 */
	public void setCommonI18NService(final CommonI18NService commonI18NService)
	{
		this.commonI18NService = commonI18NService;
	}

	/**
	 * @return the baseStoreService
	 */
	public BaseStoreService getBaseStoreService()
	{
		return baseStoreService;
	}

	/**
	 * @param baseStoreService
	 *           the baseStoreService to set
	 */
	public void setBaseStoreService(final BaseStoreService baseStoreService)
	{
		this.baseStoreService = baseStoreService;
	}


}
