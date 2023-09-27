package com.management.filmlibrary.repository;

import com.management.filmlibrary.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Category, Integer> {
}
