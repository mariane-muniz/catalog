package com.store.catalog.services;

import com.store.catalog.models.ProductModel;

public interface ProductService {
    
    public ProductModel saveProduct(ProductModel productModel);
    public Iterable<ProductModel> getProducts();
}