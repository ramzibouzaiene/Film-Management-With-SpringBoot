package com.management.filmlibrary.service;

import com.management.filmlibrary.entities.Category;
import com.management.filmlibrary.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCategory implements ICategoryFilm{
    @Autowired
    CategorieRepository categorieRepository;
    @Override
    public Category createCategory(Category c) {
        return categorieRepository.save(c);
    }

    @Override
    public Category findCategoryById(int id) {
        return categorieRepository.findById(id).get();
    }

    @Override
    public List<Category> findAllCategories() {
        return categorieRepository.findAll();
    }
    @Override
    public void deleteCategory(int id) {
        categorieRepository.deleteById(id);
    }
    @Override
    public Category updateCategory(Category c) {
        return categorieRepository.save(c);
    }
}
