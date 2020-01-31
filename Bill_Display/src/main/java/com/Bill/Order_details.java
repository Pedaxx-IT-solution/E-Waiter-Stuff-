package com.Bill;

import java.sql.Date;

public class Order_details {
	private int item_id;
	private String name;
	private int quantity;
	private float price;
	private int customer_id;
	private Date date;

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Order_details [item_id=" + item_id + ", name=" + name + ", quantity=" + quantity + ", price=" + price
				+ ", customer_id=" + customer_id + ", date=" + date + "]";
	}

}
