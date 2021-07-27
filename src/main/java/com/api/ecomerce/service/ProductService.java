package com.api.ecomerce.service;

import java.util.List;

import com.api.ecomerce.model.Product;

public interface ProductService {

	List<Product> findAll();
	
	 Product findById(Integer id);
	 Product save(Product product);
	 Product update(Product product);
	 void  delete(Integer id);

	

}
