package com.store.catalog.facades;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.store.catalog.Populators.ProductPopulator;
import com.store.catalog.dtos.ProductData;
import com.store.catalog.factories.ProductFactory;
import com.store.catalog.forms.ProductForm;
import com.store.catalog.models.ProductModel;
import com.store.catalog.services.ProductService;

import org.springframework.stereotype.Component;

@Component
public class DefaultProductFacade implements ProductFacade {

    @Resource
    private ProductFactory productFactory;
    @Resource
    private ProductService productService;
    @Resource
    private ProductPopulator productPopulator;

    @Override
    public ProductData createProduct(final ProductForm productForm) {

        try {
            final ProductData data = new ProductData();
            final ProductModel model = this.productFactory.create(
                productForm.getCode(), 
                productForm.getName(),
                productForm.getDescription());
            this.productService.saveProduct(model);
            this.productPopulator.populate(model, data);
            return data;
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ProductData> getProducts()
    {
        final List<ProductData> data = new ArrayList<>();
        final Iterable<ProductModel> products = this.productService.getProducts();
        products.forEach(product -> {
            final ProductData productData = new ProductData();
            this.productPopulator.populate(product, productData);
            data.add(productData);
        });
        return data;
    }
}