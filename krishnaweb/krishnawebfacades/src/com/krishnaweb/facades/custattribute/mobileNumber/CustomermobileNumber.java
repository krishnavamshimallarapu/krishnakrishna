/**
 *
 */
package com.krishnaweb.facades.custattribute.mobileNumber;

import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;


/**
 * @author krishnavamsi
 *
 */
public interface CustomermobileNumber extends CustomerFacade
{
	@Override
	void register(RegisterData registerData) throws DuplicateUidException, UnknownIdentifierException, IllegalArgumentException;


}
