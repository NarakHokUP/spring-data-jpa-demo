/*
package com.example.demo.controller;

import com.example.demo.entity.Article;
import com.example.demo.entity.Author;
import com.example.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/authors")
    public List<Author> findAuthors(){
        return authorRepository.findAll();
    }

    @GetMapping("/authors/{id}")
    public Author findAuthor(@PathVariable Integer id){
        return authorRepository.findOne(id);
    }

    @GetMapping("/authors/{id}/articles")
    public List<Article> findArticleAuthor(@PathVariable Integer id){
        return authorRepository.findOne(id).getArticles();
    }

}
*/
