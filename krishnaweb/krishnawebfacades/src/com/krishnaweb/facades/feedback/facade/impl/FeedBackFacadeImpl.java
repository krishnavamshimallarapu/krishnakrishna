/**
 *
 */
package com.krishnaweb.facades.feedback.facade.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.krishnaweb.core.data.FeedBackData;
import com.krishnaweb.core.feedback.service.FeedBackService;
import com.krishnaweb.core.model.FeedBackModel;
import com.krishnaweb.facades.feedback.facade.FeedBackFacade;


/**
 * @author krishnavamsi
 *
 */
public class FeedBackFacadeImpl implements FeedBackFacade
{
	protected static final Logger LOG = Logger.getLogger(FeedBackFacadeImpl.class);

	@Resource
	private Converter<FeedBackData, FeedBackModel> feedBackReverseConverter;

	@Resource
	private FeedBackService feedBackService;

	@Resource
	ModelService modelService;

	@Override
	public void getFeedBackData(final FeedBackData feedBackData)
	{
		LOG.info("FeedBackFacadeImpl==getFeedBackData==STARTED");
		// YTODO Auto-generated method stub
		final FeedBackModel feedBackModel = modelService.create(FeedBackModel.class);
		feedBackReverseConverter.convert(feedBackData, feedBackModel);
		feedBackService.getFeedBackData(feedBackModel);
	}
}


