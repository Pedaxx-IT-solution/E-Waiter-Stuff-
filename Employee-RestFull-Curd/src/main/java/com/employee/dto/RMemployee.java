package com.employee.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RMemployee implements RowMapper<employee> {

	@Override
	public employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		employee emp = new employee();
		emp.setId(rs.getInt("id"));
		emp.setName(rs.getString("name"));
		emp.setU_name(rs.getString("u_name"));
		emp.setU_pass(rs.getString("u_pass"));
		
		return emp;
		
		
		
	}

}
