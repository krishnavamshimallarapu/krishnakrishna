/**
 *
 */
package com.krishnaweb.facades.CustomerAddress.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNullStandardMessage;

import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.i18n.I18NFacade;
import de.hybris.platform.commercefacades.user.UserFacade;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commercefacades.user.exceptions.PasswordMismatchException;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.TitleModel;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.util.Assert;

import com.krishnaweb.core.CustomerAddress.service.CustomerAddressAccountService;
import com.krishnaweb.facades.CustomerAddress.CustomerAddressfacade;


/**
 * @author krishnavamsi
 *
 */
public class CustomerAddressfacadeImpl extends DefaultCustomerFacade implements CustomerAddressfacade
{
	@Resource(name = "i18NFacade")
	private I18NFacade i18NFacade;

	@Resource(name = "userFacade")
	private UserFacade userFacade;

	@Resource
	private CustomerAddressAccountService customerAccountService;

	@Override
	public void register(final RegisterData registerData) throws DuplicateUidException
	{
		// YTODO Auto-generated method stub
		validateParameterNotNullStandardMessage("registerData", registerData);
		Assert.hasText(registerData.getFirstName(), "The field [FirstName] cannot be empty");
		Assert.hasText(registerData.getLastName(), "The field [LastName] cannot be empty");
		Assert.hasText(registerData.getTown(), "The field [Town] cannot be empty");
		Assert.hasText(registerData.getLine1(), "The field [Line1] cannot be empty");
		Assert.hasText(registerData.getLine2(), "The field [Line2] cannot be empty");
		Assert.hasText(registerData.getCountryIso(), "The field [CountryISO] cannot be empty");
		Assert.hasText(registerData.getPostalCode(), "The field [Postal Code] cannot be empty");
		Assert.hasText(registerData.getLogin(), "The field [Login] cannot be empty");


		final CustomerModel newCustomer = getModelService().create(CustomerModel.class);

		newCustomer.setName(getCustomerNameStrategy().getName(registerData.getFirstName(), registerData.getLastName()));

		if (StringUtils.isNotBlank(registerData.getFirstName()) && StringUtils.isNotBlank(registerData.getLastName()))
		{
			newCustomer.setName(getCustomerNameStrategy().getName(registerData.getFirstName(), registerData.getLastName()));
		}

		final TitleModel title = getUserService().getTitleForCode(registerData.getTitleCode());
		newCustomer.setTitle(title);
		setUidForRegister(registerData, newCustomer);
		newCustomer.setSessionLanguage(getCommonI18NService().getCurrentLanguage());
		newCustomer.setSessionCurrency(getCommonI18NService().getCurrentCurrency());
		newCustomer.setMobileNumber(registerData.getMobileNumber());

		//Here is the logic to save customer
		customerAccountService.register(newCustomer, registerData.getPassword());
		//Here is the logic to save the address.
		addAddressToCustomer(registerData, newCustomer);

	}

	private void addAddressToCustomer(final RegisterData registerData, final CustomerModel newCustomer)
	{

		final AddressData newAddress = new AddressData();
		newAddress.setTitleCode(registerData.getTitleCode());
		newAddress.setFirstName(registerData.getFirstName());
		newAddress.setLastName(registerData.getLastName());
		newAddress.setLine1(registerData.getLine1());
		newAddress.setLine2(registerData.getLine2());
		newAddress.setTown(registerData.getTown());
		newAddress.setPostalCode(registerData.getPostalCode());
		newAddress.setBillingAddress(false);
		newAddress.setShippingAddress(true);
		newAddress.setVisibleInAddressBook(true);
		newAddress.setCountry(i18NFacade.getCountryForIsocode(registerData.getCountryIso()));
		newAddress.setPhone(registerData.getMobileNumber());

		final AddressModel newAddressModel = getModelService().create(AddressModel.class);
		getAddressReversePopulator().populate(newAddress, newAddressModel);

		// Store the address against the user
		customerAccountService.saveAddressEntryWhileRegistring(newCustomer, newAddressModel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.krishnaweb.facades.CustomerAddress.CustomerAddressfacade#changeMobile(java.lang.String, java.lang.String)
	 */
	@Override
	public void changeMobile(final String nnewMobile, final String currentPassword)
			throws DuplicateUidException, PasswordMismatchException
	{
		// YTODO Auto-generated method stub

	}
}
