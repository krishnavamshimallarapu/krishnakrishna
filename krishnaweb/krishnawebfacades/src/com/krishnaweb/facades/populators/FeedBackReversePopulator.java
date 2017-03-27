/**
 *
 */
package com.krishnaweb.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.apache.log4j.Logger;

import com.krishnaweb.core.data.FeedBackData;
import com.krishnaweb.core.model.FeedBackModel;


/**
 * @author krishnavamsi
 *
 */
public class FeedBackReversePopulator implements Populator<FeedBackData, FeedBackModel>
{
	protected static final Logger LOG = Logger.getLogger(FeedBackReversePopulator.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final FeedBackData source, final FeedBackModel target) throws ConversionException
	{
		// YTODO Auto-generated method stub
		LOG.info("FeedBackReversePopulator== populate()==STARTED");
		target.setName(source.getName());
		target.setEmail(source.getEmail());
		target.setComment(source.getComment());

	}

}
