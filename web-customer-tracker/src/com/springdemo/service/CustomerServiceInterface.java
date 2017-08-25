package com.springdemo.service;

import java.util.List;

import com.springdemo.entity.Customer;

public interface CustomerServiceInterface {
	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
	public Customer getCustomer(int customerId);
	public void deleteCustomer(int customerId);
}
