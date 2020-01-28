package com.ewaiter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ewaiter.dto.Menu;

public class MenuRowMapper implements RowMapper<Menu> 
{

	@Override
	public Menu mapRow(ResultSet rs, int rowNum) throws SQLException {
		Menu menu = new Menu();
		menu.setItemId(rs.getInt("item_id"));
		menu.setItemName(rs.getString("item_name"));
		menu.setPrice(rs.getDouble("item_price"));
		menu.setDescription(rs.getString("description"));
		menu.setcId(rs.getInt("category_id"));
		return menu;
	}

}