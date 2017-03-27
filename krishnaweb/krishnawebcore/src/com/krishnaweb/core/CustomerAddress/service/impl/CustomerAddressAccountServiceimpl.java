/**
 *
 */
package com.krishnaweb.core.CustomerAddress.service.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.commerceservices.customer.impl.DefaultCustomerAccountService;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.workflow.WorkflowProcessingService;
import de.hybris.platform.workflow.WorkflowService;
import de.hybris.platform.workflow.WorkflowTemplateService;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.krishnaweb.core.CustomerAddress.service.CustomerAddressAccountService;


/**
 * @author krishnavamsi
 *
 */
public class CustomerAddressAccountServiceimpl extends DefaultCustomerAccountService implements CustomerAddressAccountService
{
	private final Logger LOG = Logger.getLogger(CustomerAddressAccountServiceimpl.class);

	@Resource(name = "newestWorkflowService")
	private WorkflowService workflowService;

	@Resource
	private WorkflowTemplateService workflowTemplateService;

	@Resource
	private WorkflowProcessingService workflowProcessingService;

	@Resource
	private UserService userService;

	@Resource
	private ModelService modelService;

	@Override
	public void saveAddressEntryWhileRegistring(final CustomerModel customerModel, final AddressModel addressModel)
	{
		validateParameterNotNull(customerModel, "Customer model cannot be null");
		validateParameterNotNull(addressModel, "Address model cannot be null");
		final List<AddressModel> customerAddresses = new ArrayList<AddressModel>();
		customerAddresses.addAll(customerModel.getAddresses());
		if (customerModel.getAddresses().contains(addressModel))
		{
			getModelService().save(addressModel);
		}
		else
		{
			addressModel.setOwner(customerModel);
			getModelService().save(addressModel);
			getModelService().refresh(addressModel);
			customerAddresses.add(addressModel);
		}
		customerModel.setAddresses(customerAddresses);
		customerModel.setDefaultShipmentAddress(addressModel);
		customerModel.setDefaultPaymentAddress(addressModel);

		getModelService().save(customerModel);
		getModelService().refresh(customerModel);
	}
}


