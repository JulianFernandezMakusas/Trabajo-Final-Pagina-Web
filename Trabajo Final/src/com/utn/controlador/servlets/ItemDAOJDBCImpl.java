package com.utn.controlador.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.utn.clases.DAO.ItemDAO;
import com.utn.modelo.ItemModelo;

public class ItemDAOJDBCImpl implements ItemDAO{
	ItemModelo item;
	private Connection con = null;
	private PreparedStatement stmt = null;
	private InitialContext ic;
	private DataSource ds;
	String query;
	public ItemDAOJDBCImpl() {
		try {
		ic = new InitialContext();
		ds = (DataSource)ic.lookup("java:comp/env/jdbc/basededatostrabajofinal");
		} catch (Exception e) {
			System.out.println("Error al hacer lookup"+e.getMessage());
		}
		
	}
	@Override
	public ItemModelo getItemDetail() { 
		return null;
	}
	@Override
	public ArrayList<ItemModelo> getAllItemsByCategory() {
		
		try {
			con = ds.getConnection();
			stmt = con.prepareStatement("SELECT `NombreProducto`, `Descripcion`, `Precio`, `idCategoria` FROM `mercadogordo` WHERE `idcategoria` = ?");
			stmt.setInt(1, item.getCategory());
			ResultSet rs = stmt.executeQuery();
			int id = rs.getInt("idProducto");
			String name = rs.getString("nombre");
			int category = rs.getInt("categoriaID");
			double price = rs.getDouble("precio");
			String description = rs.getString("descripcion");
			String image = rs.getString("imagen");
			ItemModelo item = new ItemModelo(id, name, category, price, description, image);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList <ItemModelo> listaItemsCategoria = new ArrayList <>();
		int categoryItem = item.getCategory(); 
		if (categoryItem == item.getCategory()) {
			listaItemsCategoria.add(item);
		}
		return null;
	}
	@Override
	public ArrayList<ItemModelo> getAllItems() {
		ArrayList<ItemModelo> listaItems = new ArrayList <ItemModelo> ();
		ItemModelo item;
		query = "SELECT * FROM `mercadogordo`";
		try {
			ds.getConnection();
			stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next() == true) {
				int id = rs.getInt("idProducto");
				String name = rs.getString("nombre");
				int category = rs.getInt("categoriaID");
				double price = rs.getDouble("precio");
				String description = rs.getString("descripcion");
				String image = rs.getString("imagen");
				item = new ItemModelo(id, name, category, price, description, image);
				listaItems.add(item);
			}
		} catch (SQLException e) {
			
		}
		return listaItems;
	}

}