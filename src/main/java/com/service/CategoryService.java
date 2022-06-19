package com.service;

import java.util.List;

import com.entity.Category;

public interface CategoryService {

	List<Category> listCategory();

	List<Category> listCategoryByParentId(Integer parentId);

}
