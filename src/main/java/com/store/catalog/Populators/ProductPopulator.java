package com.store.catalog.Populators;

import com.store.catalog.dtos.ProductData;
import com.store.catalog.models.ProductModel;

import org.springframework.stereotype.Component;

@Component
public class ProductPopulator implements Populator<ProductModel, ProductData> 
{
    @Override
    public void populate(final ProductModel source, final ProductData target) 
    {
        target.setCode(source.getCode());
        target.setName(source.getName());
        target.setDescription(source.getDescription());
    }
}