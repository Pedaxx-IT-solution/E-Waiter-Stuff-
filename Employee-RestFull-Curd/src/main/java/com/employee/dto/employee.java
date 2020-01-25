package com.employee.dto;

public class employee {
	private int id;
	private String name;
	private String u_name;
	private String u_pass;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_pass() {
		return u_pass;
	}

	public void setU_pass(String u_pass) {
		this.u_pass = u_pass;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", u_name=" + u_name + ", u_pass=" + u_pass + "]";
	}

}
