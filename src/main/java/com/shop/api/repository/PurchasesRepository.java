package com.shop.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.api.entity.Purchase;



public interface PurchasesRepository extends JpaRepository<Purchase, Integer>{

}