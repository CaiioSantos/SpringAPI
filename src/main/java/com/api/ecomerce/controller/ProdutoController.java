package com.api.ecomerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.ecomerce.model.Product;
import com.api.ecomerce.repository.ProductRepository;
import com.api.ecomerce.service.serviceImpl.ProductServiceImpl;

@RestController
public class ProdutoController {
	
	@Autowired
	ProductServiceImpl productServiceImpl;
	
	@GetMapping(path = "/consultarProdutos/{id}")
	public Product find(@PathVariable Integer id) {
		//return (ResponseEntity<Product>) produtoRepository.findById(id).map(record  -> ResponseEntity.ok()).orElse((BodyBuilder) ResponseEntity.notFound().build());
		return productServiceImpl.findById(id);
	}
	
	@PostMapping(path = "/product/create")
	public Product create(@RequestBody Product product){
		productServiceImpl.save(product);
		return product;
		
	}
	
	@GetMapping(path = "/products")
	public List<Product> list(){
		return (List<Product>) productServiceImpl.findAll();
		
	}
	
	@PutMapping(path = "/product/edit/{id}")
	public Product update(@RequestBody Product product){
		productServiceImpl.update(product);
		return product;
		
	}
	
	@DeleteMapping(path = "/product/delete/{id}")
	public String  delete(@PathVariable Integer id){
		productServiceImpl.delete(id);
		return "Deletado com Successo";
		
	}
}
