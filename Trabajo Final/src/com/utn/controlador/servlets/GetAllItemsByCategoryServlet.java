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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ItemDAOJDBCImpl metodo = new ItemDAOJDBCImpl();
		String Scategoria = request.getParameter("x");
		int Icategoria = Integer.parseInt(Scategoria);
		int id = 0;
		String name = null;
		int category = Icategoria;
		double price = 0;
		String description = null;
		String image = null;
		ItemModelo itemmodelo = new ItemModelo(id, name, category, price, description, image);
			ArrayList <ItemModelo> listaItems = metodo.getAllItemsByCategory();
			if (category == itemmodelo.getCategory()) {
				listaItems.add(itemmodelo);
			}
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
