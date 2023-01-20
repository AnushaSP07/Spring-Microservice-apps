package com.productService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.productService.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
