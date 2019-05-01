package com.store.catalog.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.annotation.Resource;

import com.store.catalog.forms.ProductForm;
import com.store.catalog.forms.validations.ProductFormValidation;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

import com.store.catalog.dtos.ProductData;
import com.store.catalog.facades.ProductFacade;

@RequestMapping("/product")
@RestController
public class ProductController 
{
    @Resource
    private ProductFormValidation productFormValidation;
    @Resource
    private ProductFacade productFacade;

    @PostMapping
    public ProductData addProduct(@RequestBody final ProductForm productForm, 
        final BindingResult bindingResult) 
    {
        this.productFormValidation.validate(productForm, bindingResult);
        final boolean hasErrors = bindingResult.hasErrors();
        if(!hasErrors) {
            return this.productFacade.createProduct(productForm);
        }
        return null;
    }

    @GetMapping
    public List<ProductData> getProducts() 
    {
        return this.productFacade.getProducts();
    }
}