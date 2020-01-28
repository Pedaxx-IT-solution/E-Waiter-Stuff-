package com.ewaiter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ewaiter.dto.User;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setUserId(rs.getInt("user_id"));
		user.setUserName(rs.getString("user_name"));
		user.setPassword(rs.getString("password"));
		user.setName(rs.getString("name"));
		user.setSalary(rs.getInt("salary"));
		user.setUserTypeId(rs.getInt("user_type_id"));	
		return user;
	}

}
