/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jan 13, 2017 9:14:12 AM                     ---
 * ----------------------------------------------------------------
 */
package com.krishnaweb.core.jalo;

import com.krishnaweb.core.constants.KrishnawebCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.krishnaweb.core.jalo.ApparelProduct ApparelProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedApparelProduct extends Product
{
	/** Qualifier of the <code>ApparelProduct.genders</code> attribute **/
	public static final String GENDERS = "genders";
	/** Qualifier of the <code>ApparelProduct.ourAttr</code> attribute **/
	public static final String OURATTR = "ourAttr";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(GENDERS, AttributeMode.INITIAL);
		tmp.put(OURATTR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.genders</code> attribute.
	 * @return the genders - List of genders that the ApparelProduct is designed for
	 */
	public List<EnumerationValue> getGenders(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, GENDERS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.genders</code> attribute.
	 * @return the genders - List of genders that the ApparelProduct is designed for
	 */
	public List<EnumerationValue> getGenders()
	{
		return getGenders( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.genders</code> attribute. 
	 * @param value the genders - List of genders that the ApparelProduct is designed for
	 */
	public void setGenders(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, GENDERS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.genders</code> attribute. 
	 * @param value the genders - List of genders that the ApparelProduct is designed for
	 */
	public void setGenders(final List<EnumerationValue> value)
	{
		setGenders( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.ourAttr</code> attribute.
	 * @return the ourAttr
	 */
	public String getOurAttr(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OURATTR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.ourAttr</code> attribute.
	 * @return the ourAttr
	 */
	public String getOurAttr()
	{
		return getOurAttr( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.ourAttr</code> attribute. 
	 * @param value the ourAttr
	 */
	public void setOurAttr(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OURATTR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.ourAttr</code> attribute. 
	 * @param value the ourAttr
	 */
	public void setOurAttr(final String value)
	{
		setOurAttr( getSession().getSessionContext(), value );
	}
	
}
