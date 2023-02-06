package com.springwebapp.SpringWebApp.controllers;

import com.springwebapp.SpringWebApp.repositories.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller @AllArgsConstructor
public class AuthorController {

    private AuthorRepository authorRepository;

    @RequestMapping("/authors")
    public String getList (Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors/list";
    }
}
