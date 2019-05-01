package com.store.catalog.facades;

import java.util.List;

import com.store.catalog.dtos.ProductData;
import com.store.catalog.forms.ProductForm;

public interface ProductFacade 
{
    public ProductData createProduct(final ProductForm productForm);
    public List<ProductData> getProducts();
}