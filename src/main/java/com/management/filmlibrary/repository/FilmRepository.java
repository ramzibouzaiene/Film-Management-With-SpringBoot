package com.management.filmlibrary.repository;

import com.management.filmlibrary.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {
    public List<Film> findByCategoryId(int id);
}
