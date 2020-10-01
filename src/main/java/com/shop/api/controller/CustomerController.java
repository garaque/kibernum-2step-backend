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

import com.shop.api.entity.Customer;
import com.shop.api.service.impl.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
    private CustomerService customerService;

	@GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAll() {
        return new ResponseEntity<List<Customer>>(this.customerService.findAll(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getById(@PathVariable("id") Integer customerId) {
        return new ResponseEntity<Customer>(this.customerService.findByID(customerId), HttpStatus.ACCEPTED);
    }

    @PostMapping("/customers") 
    public ResponseEntity<Customer> save(@RequestBody Customer customer) {
        return new ResponseEntity<Customer>(this.customerService.save(customer), HttpStatus.CREATED);
    }

   
    @PostMapping(value = "/customers/check")
    public ResponseEntity<Customer> checkCredentials(@RequestBody Customer customer) {
        return new ResponseEntity<Customer>(this.customerService.validateLoggin(customer.getUser(), customer.getPassword()),
                HttpStatus.ACCEPTED);
    }
}
