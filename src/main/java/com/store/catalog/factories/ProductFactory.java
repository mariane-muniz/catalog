package com.store.catalog.factories;

import com.store.catalog.models.ProductModel;

import org.springframework.stereotype.Component;

@Component
public class ProductFactory {

    public ProductModel create(final String code, 
        final String name, final String description) throws Exception 
    {
        try {
            final ProductModel model = new ProductModel();
            model.setCode(code);
            model.setName(name);
            model.setDescription(description);
            return model;
        } 
        catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
} 