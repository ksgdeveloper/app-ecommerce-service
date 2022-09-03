package com.shree.ecommerce.service.impl;

import com.shree.ecommerce.dao.ProductCategoryRepository;
import com.shree.ecommerce.entity.ProductCategory;
import com.shree.ecommerce.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;
    public ProductCategory getProductCategoryById(Long id){
        return (ProductCategory) productCategoryRepository.findById(id).get();
    }
}
