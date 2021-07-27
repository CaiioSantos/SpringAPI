package com.api.ecomerce.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;


@Entity
@Table (name="product")
public class Product {
	
	@Id
	@Column (name ="product_id")
	@Nullable
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Nullable
	@Column (name ="product_nmproduct")
	private String name;
	
	@Nullable
	@Column (name ="product_dsproduct")
	private String description;
	
	@Nullable
	@Column (name ="product_pcproduct")
	private BigDecimal price;
	
	@Nullable
	@Column (name ="product_tmultimaalteracao")
	private Date ultimaAlteracao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
	
}
