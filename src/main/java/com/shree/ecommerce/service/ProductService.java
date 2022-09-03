package com.shree.ecommerce.service;

import com.shree.ecommerce.dao.ProductRepository;
import com.shree.ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@Service
public interface ProductService {

    public List<Product> findAll();

    public Product createProduct(Product product);

    public Optional<Product> getProductById(Long id);

    public Product updateProduct(Product product);

    public void deleteProductById(Long id);

}
