package com.eTicaret.shoppingapp.product.repository;

import com.eTicaret.shoppingapp.product.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
