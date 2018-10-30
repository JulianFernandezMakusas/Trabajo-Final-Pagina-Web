package com.utn.modelo;

import java.time.LocalDateTime;
import java.util.List;


public class CartModelo {
	private String user;
	private List<ItemCartModelo> itemCart;
	private String status;
	private double totalPrice;
	private LocalDateTime dateCreated;
	private LocalDateTime dateLastUpdated;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public List<ItemCartModelo> getItemCart() {
		return itemCart;
	}
	public void setItemCart(List<ItemCartModelo> itemCart) {
		this.itemCart = itemCart;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public LocalDateTime getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}
	public LocalDateTime getDateLastUpdated() {
		return dateLastUpdated;
	}
	public void setDateLastUpdated(LocalDateTime dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}
	@Override
	public String toString() {
		return "CartModelo [user=" + user + ", itemCart=" + itemCart + ", status=" + status + ", totalPrice="
				+ totalPrice + ", dateCreated=" + dateCreated + ", dateLastUpdated=" + dateLastUpdated + "]";
	}
	public CartModelo(String user, List<ItemCartModelo> itemCart, String status, double totalPrice,
			LocalDateTime dateCreated, LocalDateTime dateLastUpdated) {
		super();
		this.user = user;
		this.itemCart = itemCart;
		this.status = status;
		this.totalPrice = totalPrice;
		this.dateCreated = dateCreated;
		this.dateLastUpdated = dateLastUpdated;
	}
	
	
	
}
