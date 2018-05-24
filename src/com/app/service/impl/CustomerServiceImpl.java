package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ICustomerDao;
import com.app.model.Customer;
import com.app.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao dao;
	
	@Override
	public int saveCustomer(Customer cust) {
		return dao.saveCustomer(cust);
	}

	@Override
	public List<Customer> getAllCusts() {
		return dao.getAllCusts();
	}

	@Override
	public void deleteCustsById(int custId) {
		dao.deleteCustsById(custId);
	}

	@Override
	public Customer getCustById(int custId) {
		return dao.getCustById(custId);
	}

	@Override
	public void updateCustomer(Customer cust) {
		dao.updateCustomer(cust);

	}

}
