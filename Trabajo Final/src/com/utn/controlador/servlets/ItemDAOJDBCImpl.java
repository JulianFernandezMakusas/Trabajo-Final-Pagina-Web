package com.utn.controlador.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	public ItemDAOJDBCImpl() {
		try {
		ic = new InitialContext();
		ds = (DataSource)ic.lookup("java:comp/env/jdbc/basededatostrabajofinal");
		} catch (Exception e) {
			System.out.println("Error al hacer lookup"+e.getMessage());
		}
		
	}
	String query;
	@Override
	public ItemModelo getItemDetail() { 
		return null;
	}
	@Override
	public ArrayList<ItemModelo> getAllItemsByCategory(ItemModelo categoria) {
		try {
			con = ds.getConnection();
			stmt = con.prepareStatement("SELECT `NombreProducto`, `Descripcion`, `Precio`, `idCategoria` FROM `mercadogordo` WHERE `idcategoria` = ?");
			stmt.setInt(1, item.getCategory());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList <ItemModelo> listaItemsCategoria = new ArrayList <>();
		int categoryItem = item.getCategory(); 
		if (categoryItem == categoria.getCategory()) {
			listaItemsCategoria.add(categoria);
		}
		return null;
	}

}