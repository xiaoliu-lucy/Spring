package com.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.dao.CustomerDAOInterface;
import com.springdemo.entity.Customer;

@Service
public class CustomerService implements CustomerServiceInterface {
	
	// inject DAO
	@Autowired
	private CustomerDAOInterface customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		customerDAO.saveCustomer(customer);		
	}

	@Override
	@Transactional
	public Customer getCustomer(int customerId) {
		Customer customer = customerDAO.getCustome(customerId);
		return customer;
	}

	@Override
	@Transactional
	public void deleteCustomer(int customerId) {
		customerDAO.deleteCustomer(customerId);		
	}
	
	

}
