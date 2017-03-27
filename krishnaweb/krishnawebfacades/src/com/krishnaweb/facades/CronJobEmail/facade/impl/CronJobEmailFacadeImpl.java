/**
 *
 */
package com.krishnaweb.facades.CronJobEmail.facade.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.krishnaweb.core.cronjobemail.service.CronJobEmailService;
import com.krishnaweb.core.data.CronJobEmailData;
import com.krishnaweb.facades.CronJobEmail.facade.CronJobEmailFacade;


/**
 * @author krishnavamsi
 *
 */
public class CronJobEmailFacadeImpl implements CronJobEmailFacade
{
	private static final Logger LOG = Logger.getLogger(CronJobEmailFacadeImpl.class);
	@Resource
	private Converter<CustomerModel, CronJobEmailData> cronJobEmailPopulater;

	@Resource
	CronJobEmailService cronJobEmailService;

	@Override
	public List<CronJobEmailData> getcronJobEmail()
	{
		LOG.info("====CronJobEmailFacadeImpl called===");
		final List<CronJobEmailData> listofCronJobEmailData = new ArrayList<CronJobEmailData>();
		if (null != cronJobEmailService.getcronJobEmail())
		{

			for (final CustomerModel customerModel : cronJobEmailService.getcronJobEmail())
			{
				final CronJobEmailData cronJobEmailData = new CronJobEmailData();
				listofCronJobEmailData.add(cronJobEmailPopulater.convert(customerModel, cronJobEmailData));
			}
			System.out.println(listofCronJobEmailData.size());
			System.out.println(listofCronJobEmailData.contains(listofCronJobEmailData));
			return listofCronJobEmailData;

		}
		return null;

	}


}
