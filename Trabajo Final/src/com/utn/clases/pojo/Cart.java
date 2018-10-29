package com.utn.clases.pojo;

import java.time.LocalDateTime;
import java.util.List;

public class Cart {
	private String user;
	private List<ItemCart> itemCart;
	private String status;
	private double totalPrice;
	private LocalDateTime dateCreated;
	private LocalDateTime dateLastUpdated;
}
