package com.ewaiter.dao;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ewaiter.dto.Customer;

@Repository
public class CustomerRepositoryImple implements CustomerRepository {

	@Autowired
	JdbcTemplate jdbctemp;
	
	@Autowired
	HttpSession session;
	
	@Override
	public boolean custLoginRepo(Customer customer) {
		
		if(customer.getName().equals("")||(customer.getTableId()==0)||customer.getMobileNo().equals(""))
			return false;
			
		String sql = "insert into customer (name,table_id,mobile_no) values(?,?,?)";
		int records = jdbctemp.update(sql,new Object[] {customer.getName(),customer.getTableId(),customer.getMobileNo()});
		String sqlIdOfCust = "SELECT LAST_INSERT_ID()";
		int idOfCust = jdbctemp.queryForObject( sqlIdOfCust,Integer.class);
		session.setAttribute("loggedCustId", idOfCust);
		session.setAttribute("loggedCustTableId", customer.getTableId());
		
		if(records!=0)
			return true;
		else
			return false;
	}

}
