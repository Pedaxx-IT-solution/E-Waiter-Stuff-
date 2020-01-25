package com.india;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstWebService {

	@Autowired
	private JdbcTemplate jdbctemplate;

	@RequestMapping("/")
	public String helloWorld() {

		return "HELLO WORLD";
	}

	@RequestMapping("/universe")
	public String helloUniverse() {

		return "HELLO UNIVERSE";
	}

	@PostMapping("/post")
	public String poo() {

		return "get call using postman only";
	}

	@RequestMapping("/no")
	public int number() {

		return 890;
	}

	// @RequestMapping("/list")
	@PostMapping("/list")
	public List<String> list() {

		List<String> list = new ArrayList<String>();
		list.add("abcd");
		list.add("zxcv");
		return list;
	}

	@RequestMapping("/map")
	public Map<String, String> map() {

		Map<String, String> m = new HashMap<String, String>();
		m.put("key1", "cookies");
		m.put("key2", "cook");
		m.put("key3", "watermelon");

		return m;
	}

	@RequestMapping("/user")
	public User userlist() {
		User u = new User();
		u.setId(1);
		u.setName("levee");
		u.setEmail("levee10@hi2.in");
		u.setUsername("leveekala");

		return u;

	}

	@RequestMapping("/userlist")
	public List<User> userl() {

		List<User> list = new ArrayList<User>();

		for (int i = 0; i < 9; i++) {
			User u = new User();
			u.setId(1);
			u.setName("levee");
			u.setEmail("levee10@hi2.in");
			u.setUsername("leveekala");

			list.add(u);

		}

		return list;

	}

	@RequestMapping("/dblist")
	public List dblist() {

		String sql = "select * from user";
		List<Map<String, Object>> list = jdbctemplate.queryForList(sql);

		return list;

	}

}
