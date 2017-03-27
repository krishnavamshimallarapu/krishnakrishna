/**
 *
 */
package com.krishnaweb.facades.populators;

import de.hybris.platform.commercefacades.product.converters.populator.ProductBasicPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.apache.log4j.Logger;

import com.krishnaweb.core.model.ApparelProductModel;


/**
 * @author krishnavamsi
 *
 */
public class MyProductAttributePopulator extends ProductBasicPopulator<ProductModel, ProductData>
{
	private static final Logger LOG = Logger.getLogger(MyProductAttributePopulator.class);

	@Override
	public void populate(final ProductModel productModel, final ProductData productData) throws ConversionException
	{
		super.populate(productModel, productData);
		if (productModel instanceof ApparelProductModel)
		{

			final ApparelProductModel aModel = (ApparelProductModel) productModel;
			productData.setOurAttr(aModel.getOurAttr());
		}
	}
}
