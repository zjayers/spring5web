package io.ayers.spring5web.controllers;

import io.ayers.spring5web.repositories.IAuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    private final IAuthorRepository authorRepository;

    public AuthorController(IAuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping
    public String getAuthorList(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors/list";
    }

}
