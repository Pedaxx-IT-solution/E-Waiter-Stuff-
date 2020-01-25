package com.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CustomerDao {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	
	
	public void insert( Customer cust) {
		
		String sql = "insert into customer( cust_name,cust_mobile) values(?,?) ";
		jdbctemplate.update(sql,cust.getCust_name(),cust.getCust_mobile());
		System.out.println("inserted succesfully");
	}
	
	
	
	

}
