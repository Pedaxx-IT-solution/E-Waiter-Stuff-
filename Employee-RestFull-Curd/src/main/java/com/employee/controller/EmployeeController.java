package com.employee.controller;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dao.EmployeeDao;

import com.employee.dto.employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeDao empdao;

	@PostMapping("/insert")
	public void insert(employee emp) {

		this.empdao.insert(emp);
	}

	@PutMapping("/update")
	public void update(employee emp) {
		// we are not doing validations of null
		this.empdao.update(emp);
	}

	@DeleteMapping("/delete")
	public void delete(employee emp) {
		// not doing validation
		this.empdao.delete(emp);
	}

	@GetMapping("/list")
	public java.util.List<employee> list() {

		return this.empdao.list();
	}

}
