package com.daykal.typeblog.services;

import com.daykal.typeblog.domain.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> listCategories();
    Category createCategory(Category category);
}
