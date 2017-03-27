/**
 *
 */
package com.krishnaweb.core.CustomerAddress.service;

import de.hybris.platform.commerceservices.customer.CustomerAccountService;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;


/**
 * @author krishnavamsi
 *
 */
public interface CustomerAddressAccountService extends CustomerAccountService
{

	/**
	 * @param customerModel
	 * @param addressModel
	 */
	void saveAddressEntryWhileRegistring(final CustomerModel customerModel, final AddressModel addressModel);

}
