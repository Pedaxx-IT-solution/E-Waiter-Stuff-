package com.employee.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.employee.dto.RMemployee;
import com.employee.dto.employee;

@Component
public class EmployeeDao {
	@Autowired
	private JdbcTemplate jdbctemplate;

	public void insert(employee emp) {

		String sql = "insert into employee values (?,?,?,?)";
		jdbctemplate.update(sql, emp.getId(), emp.getName(), emp.getU_name(), emp.getU_pass());
		System.out.println("inseted");
	}

	public void update(employee emp) {

		String sql = "update employee set u_name=? where id=?";
		jdbctemplate.update(sql, emp.getU_name(), emp.getId());
		System.out.println("updated");
	}

	public void delete(employee emp) {

		String sql = "delete from employee where id =?";
		jdbctemplate.update(sql, emp.getId());
		System.out.println("deleted");
	}

	public List<employee> list() {

		// List<employee> list = new ArrayList<employee>();
		String sql = "select * from employee";
		List<employee> emplist = jdbctemplate.query(sql, new RMemployee());
		return emplist;
	}

}
