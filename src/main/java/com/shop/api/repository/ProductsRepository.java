package com.shop.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.api.entity.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{

}
