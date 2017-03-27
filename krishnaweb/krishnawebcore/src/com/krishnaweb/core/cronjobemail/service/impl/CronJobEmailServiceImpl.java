/**
 *
 */
package com.krishnaweb.core.cronjobemail.service.impl;

import de.hybris.platform.core.model.user.CustomerModel;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.krishnaweb.core.cronjobemail.dao.CronJobEmailDao;
import com.krishnaweb.core.cronjobemail.service.CronJobEmailService;


/**
 * @author krishnavamsi
 *
 */
public class CronJobEmailServiceImpl implements CronJobEmailService
{
	private static final Logger LOG = Logger.getLogger(CronJobEmailServiceImpl.class);

	@Resource
	CronJobEmailDao cronJobEmailDao;

	@Override
	public List<CustomerModel> getcronJobEmail()
	{
		LOG.info("====Cron Job Email Service Impl Called====");
		return cronJobEmailDao.getcronJobEmail();
	}
}
