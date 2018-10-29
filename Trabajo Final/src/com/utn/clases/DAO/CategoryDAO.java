package com.utn.clases.DAO;

import java.util.List;

import com.utn.clases.pojo.Category;

public interface CategoryDAO {
	public List<Category> getAllCategories();
	public String getCategoryName(int id);
}