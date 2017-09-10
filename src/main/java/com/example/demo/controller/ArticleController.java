/*
package com.example.demo.controller;

import com.example.demo.entity.Article;
import com.example.demo.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;

    @GetMapping("/articles/{id}")
    public Article findArticle(@PathVariable Integer id){
        return articleRepository.findOne(id);
    }

    @Transactional
    @GetMapping("/articles")
    public List<Article> findUsers(){
        return articleRepository.findAll();
    }

}
*/
