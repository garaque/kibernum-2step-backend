package com.shop.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.api.entity.PurchaseProduct;

public interface PurchaseProductRepository extends JpaRepository<PurchaseProduct, Integer>{

}
