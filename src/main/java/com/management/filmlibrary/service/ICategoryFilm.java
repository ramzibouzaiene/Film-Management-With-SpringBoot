package com.management.filmlibrary.service;

import com.management.filmlibrary.entities.Category;

import java.util.List;

public interface ICategoryFilm {
    public Category createCategory(Category c);
    public Category findCategoryById(int id);
    public List<Category> findAllCategories();
    public Category updateCategory(Category c);
    public void deleteCategory(int id);
}
