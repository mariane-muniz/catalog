package com.store.catalog.repositories;

import java.util.List;

import com.store.catalog.models.ProductModel;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductModel, Integer> {

    public ProductModel findOneByCode(final String code);
    public List<ProductModel> findByCodeIn(List<String> codes);
}