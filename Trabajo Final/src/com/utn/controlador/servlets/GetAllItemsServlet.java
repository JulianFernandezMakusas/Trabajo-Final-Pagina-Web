package com.utn.controlador.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.utn.modelo.ItemModelo;

@WebServlet("/GetAllProductsServlet")
public class GetAllItemsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetAllItemsServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("PaginaInicial.jsp");
		ItemDAOJDBCImpl metodo = new ItemDAOJDBCImpl();
		ArrayList<ItemModelo> listaItems = metodo.getAllItems();
		request.setAttribute("listaItems", listaItems);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
