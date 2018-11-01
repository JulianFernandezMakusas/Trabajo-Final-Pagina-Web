package com.utn.clases.DAO;

import java.util.ArrayList;
import com.utn.modelo.ItemModelo;

public interface ItemDAO {
	public ItemModelo getItemDetail();
	public ArrayList<ItemModelo> getAllItemsByCategory();
	public ArrayList<ItemModelo> getAllItems();
}