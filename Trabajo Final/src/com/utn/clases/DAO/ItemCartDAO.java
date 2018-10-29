package com.utn.clases.DAO;

import java.util.List;

import com.utn.clases.pojo.Cart;
import com.utn.clases.pojo.Item;
import com.utn.clases.pojo.ItemCart;

public interface ItemCartDAO {
	public List<ItemCart> getAllItemCartsByCart(Cart cart);
	public void createItemCart(Item item, int count, double price);
}
