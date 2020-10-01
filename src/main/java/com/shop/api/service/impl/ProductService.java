package com.shop.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.api.entity.Product;
import com.shop.api.repository.ProductsRepository;
import com.shop.api.service.IProductService;

@Service
public class ProductService implements IProductService{

	@Autowired
	private ProductsRepository productsRepo;
	
	@Override
	public List<Product> findAll() {
		return productsRepo.findAll();
	}

	@Override
	public Product findByID(int productId) {
		Optional<Product> optional = productsRepo.findById(productId);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public Product save(Product product) {
		productsRepo.save(product);
		return product;
	}

	@Override
	public void delete(int productId) {
		productsRepo.deleteById(productId);
		
	}
	
	@Override
	public Product update(Product product) {
        return productsRepo.saveAndFlush(product);
    }

	@Override
	public void updateQuantity(int productId, int quantity) {
		Product product = this.findByID(productId);
		product.setQuantity(product.getQuantity() - quantity);
        this.update(product);
	}

}
