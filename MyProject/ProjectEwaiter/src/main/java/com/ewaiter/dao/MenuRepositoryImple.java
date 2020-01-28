package com.ewaiter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ewaiter.dto.Menu;

@Repository
public class MenuRepositoryImple implements MenuRepository 
{

	@Autowired
	JdbcTemplate jdbctemp;
	
	@Override
	public boolean addMenuRepo(Menu menu)
	{
	
		String sql = "insert into menu (item_name,item_price,category_id,description) values(?,?,?,?)";
		int records = jdbctemp.update(sql, menu.getItemName()  ,menu.getPrice() ,menu.getcId() ,menu.getDescription() );
		if(records!=0)
			return true;
		else
			return false;
	}

	@Override
	public List<Menu> findAll() 
	{
		String sql = "select * from menu";
		List <Menu> li = jdbctemp.query(sql,new MenuRowMapper());
		return li;
	}

	@Override
	public void removeMenu(int id) 
	{
		 String sql="delete from menu where item_id=?";  
		 jdbctemp.update(sql, id );		
	}

	@Override
	public Menu getMenu(int id) 
	{
		Menu menu = new Menu();
		String sql = "select * from menu where item_id = ?";
		menu = (Menu)jdbctemp.queryForObject(sql,new Object[] {id},new MenuRowMapper());
		return menu;
	}

	@Override
	public void editMenu(Menu menu) {
		String sql = "update menu set item_name=?,item_price=?,category_id=?,description=? where item_id=?";
		jdbctemp.update(sql, menu.getItemName(),menu.getPrice(),menu.getcId(),menu.getDescription(),menu.getItemId());

	}
	
	
	
}
	