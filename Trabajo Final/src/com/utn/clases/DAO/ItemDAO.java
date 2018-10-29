package com.utn.clases.DAO;

import java.util.List;

import com.utn.clases.pojo.Item;

public interface ItemDAO {
	public Item getItemDetail();
	public List<Item> getAllItemsByCategory(int category);
}