package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		User user = new User();
		user.setUserId(rs.getInt("id"));
		user.setUserPass(rs.getString("password"));
		
		return user;
	}

}
