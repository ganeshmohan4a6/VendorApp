package com.app.service;

import java.util.List;

import com.app.model.Customer;

public interface ICustomerService {
	public int saveCustomer(Customer cust);
	public List<Customer> getAllCusts();
	
	public void deleteCustsById(int custId);
	
	public Customer getCustById(int custId);
	public void updateCustomer(Customer cust);
}
