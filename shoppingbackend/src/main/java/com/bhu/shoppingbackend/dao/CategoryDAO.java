package com.bhu.shoppingbackend.dao;

import java.util.List;

import com.bhu.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
