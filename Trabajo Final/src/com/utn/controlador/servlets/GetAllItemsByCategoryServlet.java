package com.utn.controlador.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.utn.modelo.ItemModelo;

@WebServlet("/GetAllProductsServlet")
public class GetAllItemsByCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GetAllItemsByCategoryServlet() {
        super();
    }
    String query;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ItemDAOJDBCImpl metodo = new ItemDAOJDBCImpl();
		ItemModelo itemmodelo = null;
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ArrayList <ItemModelo> listaItems = metodo.getAllItemsByCategory(itemmodelo);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
