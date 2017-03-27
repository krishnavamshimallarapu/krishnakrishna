/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jan 13, 2017 9:14:12 AM                     ---
 * ----------------------------------------------------------------
 */
package com.krishnaweb.core.jalo;

import com.krishnaweb.core.constants.KrishnawebCoreConstants;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.krishnaweb.core.jalo.EventsAndListenersforCronJobEmail EventsAndListenersforCronJobEmail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEventsAndListenersforCronJobEmail extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>EventsAndListenersforCronJobEmail.EmailAddressOfCustomer</code> attribute **/
	public static final String EMAILADDRESSOFCUSTOMER = "EmailAddressOfCustomer";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(EMAILADDRESSOFCUSTOMER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndListenersforCronJobEmail.EmailAddressOfCustomer</code> attribute.
	 * @return the EmailAddressOfCustomer
	 */
	public String getEmailAddressOfCustomer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAILADDRESSOFCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EventsAndListenersforCronJobEmail.EmailAddressOfCustomer</code> attribute.
	 * @return the EmailAddressOfCustomer
	 */
	public String getEmailAddressOfCustomer()
	{
		return getEmailAddressOfCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndListenersforCronJobEmail.EmailAddressOfCustomer</code> attribute. 
	 * @param value the EmailAddressOfCustomer
	 */
	public void setEmailAddressOfCustomer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAILADDRESSOFCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EventsAndListenersforCronJobEmail.EmailAddressOfCustomer</code> attribute. 
	 * @param value the EmailAddressOfCustomer
	 */
	public void setEmailAddressOfCustomer(final String value)
	{
		setEmailAddressOfCustomer( getSession().getSessionContext(), value );
	}
	
}
