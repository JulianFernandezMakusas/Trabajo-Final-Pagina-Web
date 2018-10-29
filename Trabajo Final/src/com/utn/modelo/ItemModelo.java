package com.utn.modelo;

import java.util.List;

import com.utn.clases.DAO.ItemDAO;

public class ItemModelo {
	private String name;
	private String decription;
	private int price;
	private int category;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "ItemModelo [name=" + name + ", decription=" + decription + ", price=" + price + ", category=" + category
				+ "]";
	}
	public ItemModelo(String name, String decription, int price, int category) {
		super();
		this.name = name;
		this.decription = decription;
		this.price = price;
		this.category = category;
	}

}
