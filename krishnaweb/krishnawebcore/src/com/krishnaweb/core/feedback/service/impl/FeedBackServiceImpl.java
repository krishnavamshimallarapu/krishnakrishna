/**
 *
 */
package com.krishnaweb.core.feedback.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.krishnaweb.core.feedback.dao.FeedBackDao;
import com.krishnaweb.core.feedback.service.FeedBackService;
import com.krishnaweb.core.model.FeedBackModel;


/**
 * @author krishnavamsi
 *
 */
public class FeedBackServiceImpl implements FeedBackService
{
	protected static final Logger LOG = Logger.getLogger(FeedBackServiceImpl.class);

	@Resource
	FeedBackDao feedBackDao;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.ldr.core.feedback.service.FeedBackService#getFeedBackData(com.ldr.core.model.FeedBackModel)
	 */
	@Override
	public void getFeedBackData(final FeedBackModel feedBackModel)
	{
		LOG.info("FeedBackServiceImpl==getFeedBackData()==STARTED");
		// YTODO Auto-generated method stub
		feedBackDao.getFeedBackData(feedBackModel);
	}
}
