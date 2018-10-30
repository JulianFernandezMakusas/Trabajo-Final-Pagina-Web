package com.utn.clases.DAO;

import java.util.List;

import com.utn.modelo.CartModelo;
import com.utn.modelo.ItemCartModelo;
import com.utn.modelo.ItemModelo;

public interface ItemCartDAO {
	public List<ItemCartModelo> getAllItemCartsByCart(CartModelo cart);
	public void createItemCart(ItemModelo item, int count, double price);
}
