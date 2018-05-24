package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ICustomerDao;
import com.app.model.Customer;

@Repository
public class CustomerDaoImpl implements ICustomerDao {
	
	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public int saveCustomer(Customer cust) {
		return (int)ht.save(cust);
	}

	@Override
	public List<Customer> getAllCusts() {
		return ht.loadAll(Customer.class);
	}

	@Override
	public void deleteCustsById(int custId) {
		ht.delete(new Customer(custId));

	}

	@Override
	public Customer getCustById(int custId) {
		return ht.get(Customer.class,custId);
	}

	@Override
	public void updateCustomer(Customer cust) {
		ht.update(cust);

	}

}
