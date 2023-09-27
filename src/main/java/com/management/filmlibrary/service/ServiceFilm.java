package com.management.filmlibrary.service;

import com.management.filmlibrary.entities.Film;
import com.management.filmlibrary.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceFilm implements IServiceFilm{
    @Autowired
    FilmRepository filmRepository;
    @Override
    public Film createFilm(Film f) {
        return filmRepository.save(f);
    }

    @Override
    public Film findFilmById(int id) {
        return filmRepository.findById(id).get();
    }

    @Override
    public List<Film> findAllFilms() {
        return filmRepository.findAll();
    }

    @Override
    public void deleteFilm(int id) {
        filmRepository.deleteById(id);
    }

    @Override
    public Film updateFilm(Film f) {
        return filmRepository.save(f);
    }
}
