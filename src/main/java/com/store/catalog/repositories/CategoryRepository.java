package com.store.catalog.repositories;

import com.store.catalog.models.CategoryModel;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<CategoryModel, Integer> {

    CategoryModel findOneByCode(final String code);
}