package com.shree.ecommerce.service.impl;

import com.shree.ecommerce.dao.ProductCategoryRepository;
import com.shree.ecommerce.dao.ProductRepository;
import com.shree.ecommerce.entity.Product;
import com.shree.ecommerce.entity.ProductCategory;
import com.shree.ecommerce.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

public class ProductServiceImpl {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    }

    public Product updateProduct(Product product){
        Optional<Product> optionalProduct = productRepository.findById(product.getId());
        if( optionalProduct.isPresent()){
            return productRepository.save(product);
        }else{
            throw new EntityNotFoundException("Product id not found exception " + product.getId() );
        }
    }

    public void deleteProductById(Long id){
        productRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Product id not found"+String.valueOf(id)));
    }

}
