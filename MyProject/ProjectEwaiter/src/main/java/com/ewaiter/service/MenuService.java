package com.ewaiter.service;

import java.util.List;

import com.ewaiter.dto.Menu;

public interface MenuService {

	public boolean addMenuService(Menu menu);

	public List<Menu> findAll();

	public void removeMenu(int id);

	public Menu getMenu(int id);

	public void editMenu(Menu menu);
	
	
}