package com.utn.clases.DAO;

import java.time.LocalDateTime;
import java.util.List;


import com.utn.modelo.CartModelo;
import com.utn.modelo.ItemCartModelo;


public interface CartDAO {
	public List<CartModelo> getAllCartsByUser(String user);
	public CartModelo getPendingCartByUser(String user);
	public void createCart(String user, List<ItemCartModelo> itemCart, String status);
	public void updateCart(String user, List<ItemCartModelo> itemCart, String status, LocalDateTime dateLastUpdated);
	public void destroyCart(CartModelo cart);
}