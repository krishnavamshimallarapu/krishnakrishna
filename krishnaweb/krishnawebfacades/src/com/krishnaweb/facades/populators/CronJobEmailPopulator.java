/**
 *
 */
package com.krishnaweb.facades.populators;


import de.hybris.platform.commerceservices.converter.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.krishnaweb.core.data.CronJobEmailData;




/**
 * @author krishnavamsi
 *
 */
public class CronJobEmailPopulator implements Populator<CustomerModel, CronJobEmailData>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final CustomerModel source, final CronJobEmailData target) throws ConversionException
	{
		// YTODO Auto-generated method stub
		target.setCustomerID(source.getCustomerID());
		target.setContactEmail(source.getContactEmail());

	}

}
