package com.shop.api.service;

import java.util.List;

import com.shop.api.entity.Purchase;

public interface IPurchaseService {
	List<Purchase> findAll();
	Purchase findByID(int purchaseId);
	Purchase save(Purchase purchase);
	void delete(int purchaseId);
}
