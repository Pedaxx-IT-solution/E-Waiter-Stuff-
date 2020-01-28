package com.ewaiter.dao;

import java.util.List;

import com.ewaiter.dto.Menu;

public interface MenuRepository {

	boolean addMenuRepo(Menu menu);

	List<Menu> findAll();

	void removeMenu(int id);

	Menu getMenu(int id);

	void editMenu(Menu menu);

}
