/**
 *
 */
package com.krishnaweb.facades.populators;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;


/**
 * @author krishnavamsi
 *
 */
public class CustomerMobileNumberPopulate extends CustomerPopulator
{
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator#populate(de.hybris.platform.core.
	 * model.user.CustomerModel, de.hybris.platform.commercefacades.user.data.CustomerData)
	 */
	@Override
	public void populate(final CustomerModel source, final CustomerData target)
	{
		// YTODO Auto-generated method stub
		super.populate(source, target);
		target.setMobileNumber(source.getMobileNumber());
	}

}
