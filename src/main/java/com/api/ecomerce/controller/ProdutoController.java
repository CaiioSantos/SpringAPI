package com.api.ecomerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.ecomerce.model.Product;
import com.api.ecomerce.repository.ProductRepository;

@RestController
public class ProdutoController {
	
	@Autowired
	ProductRepository produtoRepository;
	
	@GetMapping(path = "/consultarProdutos/{id}")
	public Product find(@PathVariable Integer id) {
		//return (ResponseEntity<Product>) produtoRepository.findById(id).map(record  -> ResponseEntity.ok()).orElse((BodyBuilder) ResponseEntity.notFound().build());
		return produtoRepository.findById(id).get();
	}
	
	@PostMapping(path = "/product/create")
	public Product create(@RequestBody Product product){
		produtoRepository.save(product);
		return product;
		
	}
	
	@GetMapping(path = "/products")
	public List<Product> list(){
		return produtoRepository.findAll();
		
	}

}
