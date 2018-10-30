package com.utn.clases.DAO;

import java.util.List;

import com.utn.modelo.CategoryModelo;

public interface CategoryDAO {
	public List<CategoryModelo> getAllCategories();
	public String getCategoryName(int id);
}