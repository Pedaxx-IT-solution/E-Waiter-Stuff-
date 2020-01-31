package com.Bill;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class billdao {

	@Autowired
	private JdbcTemplate jdbctemplate;

	public List<Order_details> readBill() {

		String sql = "select * from order_details where customer_id= ?";

		List<Order_details> li = jdbctemplate.query(sql, new Object[] {100} ,new order_details_rowmapper());

		return li;

	}

}
