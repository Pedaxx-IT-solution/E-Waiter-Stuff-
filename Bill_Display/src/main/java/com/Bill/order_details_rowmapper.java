package com.Bill;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class order_details_rowmapper implements RowMapper<Order_details> {

	@Override
	public Order_details mapRow(ResultSet rs, int rowNum) throws SQLException {

		Order_details od = new Order_details();
		od.setItem_id(rs.getInt("item_id"));
		od.setDate(rs.getDate("date"));
		od.setCustomer_id(rs.getInt("customer_id"));
		od.setName(rs.getString("name"));
		od.setPrice(rs.getFloat("price"));
		od.setQuantity(rs.getInt("quantity"));

		return od;
	}

}
