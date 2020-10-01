package com.shop.api.service;

import java.util.List;

import com.shop.api.entity.Product;

public interface IProductService {
	List<Product> findAll();
	Product findByID(int productId);
	Product save(Product product);
	void delete(int productId);
	public Product update(Product product);
	public void updateQuantity(int productId, int quantity);
}
