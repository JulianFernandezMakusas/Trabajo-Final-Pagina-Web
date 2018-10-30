package com.utn.modelo;

public class ItemCartModelo {
	private ItemModelo item;
	private int itemCount;
	private double price;
	public ItemModelo getItem() {
		return item;
	}
	public void setItem(ItemModelo item) {
		this.item = item;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ItemCartModelo [item=" + item + ", itemCount=" + itemCount + ", price=" + price + "]";
	}
	public ItemCartModelo(ItemModelo item, int itemCount, double price) {
		super();
		this.item = item;
		this.itemCount = itemCount;
		this.price = price;
	}	
	
}
