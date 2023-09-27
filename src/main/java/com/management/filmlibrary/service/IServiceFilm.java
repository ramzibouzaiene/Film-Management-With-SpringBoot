package com.management.filmlibrary.service;

import com.management.filmlibrary.entities.Film;

import java.util.List;

public interface IServiceFilm {
    public Film createFilm(Film f);
    public Film findFilmById(int id);
    public List<Film> findAllFilms();
    public Film updateFilm(Film f);
    public void deleteFilm(int id);
    public List<Film> findFilmByCategory(int id);
}
