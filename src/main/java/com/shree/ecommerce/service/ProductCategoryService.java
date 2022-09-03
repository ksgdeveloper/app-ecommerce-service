package com.shree.ecommerce.service;

import com.shree.ecommerce.dao.ProductCategoryRepository;
import com.shree.ecommerce.entity.Product;
import com.shree.ecommerce.entity.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;

public interface ProductCategoryService {
    public ProductCategory getProductCategoryById(Long id);
}
