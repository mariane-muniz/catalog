package com.store.catalog.forms.validations;

import com.store.catalog.forms.ProductForm;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class ProductFormValidation implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return ProductForm.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}