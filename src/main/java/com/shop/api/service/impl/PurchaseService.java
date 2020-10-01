package com.shop.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.api.entity.Purchase;
import com.shop.api.repository.PurchasesRepository;
import com.shop.api.service.IPurchaseService;

@Service
public class PurchaseService implements IPurchaseService {
	
	@Autowired
	private PurchasesRepository purchaseRepo;
	
	@Override
	public List<Purchase> findAll() {
		return purchaseRepo.findAll();
	}

	@Override
	public Purchase findByID(int purchaseId) {
		Optional<Purchase> optional = purchaseRepo.findById(purchaseId);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public Purchase save(Purchase purchase) {
		purchaseRepo.save(purchase);
		return purchase;
	}

	@Override
	public void delete(int purchaseId) {
		purchaseRepo.deleteById(purchaseId);
	}

}
