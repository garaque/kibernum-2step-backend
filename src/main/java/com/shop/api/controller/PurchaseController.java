package com.shop.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.api.entity.Purchase;
import com.shop.api.service.impl.PurchaseService;


@RestController
@RequestMapping("/api")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/purchases")
    public ResponseEntity<List<Purchase>> findAll() {
        return new ResponseEntity<List<Purchase>>(this.purchaseService.findAll(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/purchases/{id}")
    public ResponseEntity<Purchase> getById(@PathVariable("id") Integer purchaseId) {
        return new ResponseEntity<Purchase>(this.purchaseService.findByID(purchaseId), HttpStatus.ACCEPTED);
    }

    @PostMapping("/purchases")
    public ResponseEntity<Purchase> save(@RequestBody Purchase compra) {
        return new ResponseEntity<Purchase>(this.purchaseService.save(compra), HttpStatus.CREATED);
    }
}