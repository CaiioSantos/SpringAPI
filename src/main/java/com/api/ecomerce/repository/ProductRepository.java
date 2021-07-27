package com.api.ecomerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.api.ecomerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
