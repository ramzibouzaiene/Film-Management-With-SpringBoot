package com.management.filmlibrary.controller;

import com.management.filmlibrary.entities.Film;
import com.management.filmlibrary.service.ICategoryFilm;
import com.management.filmlibrary.service.IServiceFilm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/film")
public class FilmController {
    @Autowired
    IServiceFilm iServiceFilm;
    ICategoryFilm iCategoryFilm;
    @GetMapping("/all")
    public String listeFilms(Model model){
        model.addAttribute("films", iServiceFilm.findAllFilms());
        return "display";
    }
    @PostMapping("categoriy")
    public String getAllFilmsByCategoryId(Model model,int id){
        model.addAttribute("films", iServiceFilm.findFilmByCategory(id));
        return "display";
    }
    @GetMapping("/new")
    public String displayNewForm(Model model){
        model.addAttribute("category", iCategoryFilm.findAllCategories());
        return "add";
    }
    @PostMapping("add")
    public String add(Film f){
        iServiceFilm.createFilm(f);
        return "redirect:/film/all";
    }
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable int id){
        iServiceFilm.deleteFilm(id);
        return "redirect:/film/all";
    }
    @GetMapping("/film-details/{id}")
    public void getFilmById(Model model,@PathVariable int id){
        model.addAttribute("categories",iServiceFilm.findFilmByCategory(id) );
        model.addAttribute("film",iServiceFilm.findFilmById(id) );
    }
    @PostMapping("/update")
    public String update(Film f){
        iServiceFilm.updateFilm(f);
        return "update";
    }
}
