/**
 *
 */
package com.krishnaweb.core.cronjobemail.dao.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.krishnaweb.core.cronjobemail.dao.CronJobEmailDao;


/**
 * @author krishnavamsi
 *
 */
public class CronJobEmailDaoImpl implements CronJobEmailDao
{
	private static final Logger LOG = Logger.getLogger(CronJobEmailDaoImpl.class);
	@Resource
	FlexibleSearchService flexibleSearchService;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.krishnaweb.core.cornjobemail.dao.CronJobEmailDao#getcronJobEmail()
	 */
	@Override
	public List<CustomerModel> getcronJobEmail()
	{
		LOG.info("====Cron Job Email DAO Impl Called====");
		final String queryString = "SELECT {pk} FROM {Customer}";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		return flexibleSearchService.<CustomerModel> search(query).getResult();
	}


}
