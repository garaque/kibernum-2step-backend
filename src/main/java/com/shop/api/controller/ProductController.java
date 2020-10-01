package com.shop.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.api.entity.Product;
import com.shop.api.service.impl.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> findAll() {
        return new ResponseEntity<List<Product>>(this.productService.findAll(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getById(@PathVariable("id") Integer idProduct) {
        return new ResponseEntity<Product>(this.productService.findByID(idProduct), HttpStatus.ACCEPTED);
    }

    @PostMapping("/products")
    public ResponseEntity<Product> save(@RequestBody Product product) {
        return new ResponseEntity<Product>(this.productService.save(product), HttpStatus.CREATED);
    }

    @PutMapping("/products")
    public ResponseEntity<Product> update(@RequestBody Product product) {
        return new ResponseEntity<Product>(this.productService.update(product), HttpStatus.ACCEPTED);
    }
}
