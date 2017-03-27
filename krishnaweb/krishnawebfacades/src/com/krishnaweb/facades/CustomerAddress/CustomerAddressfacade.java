/**
 *
 */
package com.krishnaweb.facades.CustomerAddress;

import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.user.exceptions.PasswordMismatchException;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;


/**
 * @author krishnavamsi
 *
 */
public interface CustomerAddressfacade extends CustomerFacade
{


	public void changeMobile(final String nnewMobile, final String currentPassword)
			throws DuplicateUidException, PasswordMismatchException;

}
