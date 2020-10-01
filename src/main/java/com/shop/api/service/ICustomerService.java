package com.shop.api.service;

import java.util.List;

import com.shop.api.entity.Customer;



public interface ICustomerService {
	List<Customer> findAll();
	Customer findByID(int customerId);
	Customer save(Customer customer);
	void delete(int customerId);
    public Customer validateLoggin(String userName, String password);

}
