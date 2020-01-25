package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class UserDao {
	@Autowired
	private JdbcTemplate jdbctemplate;

	public void CreateUser() {

		String sql = " insert into user values (?,?)";
		jdbctemplate.update(sql, 3, "navimumbai");
		System.out.println("insert succesfully");
	}

	public void UpdateUser() {

		String sql = " update user set password=?  where id = ?";
		jdbctemplate.update(sql, "mumbai123", 1);
		System.out.println("updated succesfully");
	}

	public void DisplayUser() {

		String sql = "select * from user";
		List<Map<String, Object>> list = jdbctemplate.queryForList(sql);
		System.out.println(list);

	}

	public void DisplayUser1() {

		String sql = "select * from user";
		List<User> list = jdbctemplate.query(sql, new UserRowMapper());
		System.out.println(list);

	}

	public void DisplaySingle() {

		String sql = "select * from user where id = ?";

		User use = jdbctemplate.queryForObject(sql, new Object[] { 1 }, new UserRowMapper());
		System.out.println(use);

	}

}
