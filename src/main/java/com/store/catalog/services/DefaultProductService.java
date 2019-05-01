package com.store.catalog.services;

import javax.annotation.Resource;

import com.store.catalog.models.ProductModel;
import com.store.catalog.repositories.ProductRepository;

import org.springframework.stereotype.Component;

@Component
public class DefaultProductService implements ProductService 
{
    @Resource
    private ProductRepository productRepository;

    @Override
    public ProductModel saveProduct(ProductModel productModel) 
    {
        return this.productRepository.save(productModel);
    }

    @Override
    public Iterable<ProductModel> getProducts()
    {
        return this.productRepository.findAll();
    }
}