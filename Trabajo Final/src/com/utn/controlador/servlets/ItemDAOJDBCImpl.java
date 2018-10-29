package com.utn.controlador.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.utn.clases.DAO.ItemDAO;
import com.utn.clases.pojo.Item;
import com.utn.modelo.ItemModelo;

public class ItemDAOJDBCImpl implements ItemDAO{
	ItemModelo item;
	private Connection con = null;
	private PreparedStatement stmt = null;
	private InitialContext ic;
	private DataSource ds;
	public ItemDAOJDBCImpl() {
		try {
		ic = new InitialContext();
		ds = (DataSource)ic.lookup("java:comp/env/jdbc/basededatostrabajofinal");
		} catch (Exception e) {
			System.out.println("Error al hacer lookup"+e.getMessage());
		}
		
	}
	@Override
	public Item getItemDetail() {
		
		return null;
	}
	@Override
	public List<Item> getAllItemsByCategory(int category) {
		int categoryItem = item.getCategory(); 
		if (categoryItem == category) {
			
		}
		return null;
	}

}
