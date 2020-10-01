package com.shop.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.api.entity.Customer;
import com.shop.api.repository.CustomersRepository;
import com.shop.api.service.ICustomerService;


@Service
public class CustomerService implements ICustomerService{

	@Autowired
	private CustomersRepository customersRepo;
	
	@Override
	public List<Customer> findAll() {
		return customersRepo.findAll();
	}

	@Override
	public Customer findByID(int customerId) {
		Optional<Customer> optional = customersRepo.findById(customerId);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public Customer save(Customer customer) {
		customersRepo.save(customer);
		return customer;
	}

	@Override
	public void delete(int customerId) {
		customersRepo.deleteById(customerId);
		
	}

	@Override
	public Customer validateLoggin(String userName, String password) {
		List<Customer> customers = this.findAll();
		Customer customer = null;

        if (customers != null) {
            for (Customer customer1 : customers) {
                if (validateCredentials(customer1, userName, password)) return customer1;
            }
        }

        return customer;
	}
	
	private boolean validateCredentials(Customer customer, String userName, String password) {
        return customer.getUser().equalsIgnoreCase(userName) && customer.getPassword().equalsIgnoreCase(password);
    }

}
