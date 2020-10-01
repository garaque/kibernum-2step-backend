package com.shop.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.api.entity.Customer;



public interface CustomersRepository extends JpaRepository<Customer, Integer>{

}
