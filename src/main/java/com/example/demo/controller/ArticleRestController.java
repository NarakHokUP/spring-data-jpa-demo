package com.example.demo.controller;

import com.example.demo.entity.Article;
import com.example.demo.repository.ArticleRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;

@RepositoryRestController
public class ArticleRestController {

    private ArticleRepository articleRepository;

    public ArticleRestController(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
    }

    @Transactional
    @PostMapping(value = "/articles")
    public @ResponseBody
    ResponseEntity<?> save(@RequestBody Article article){
        System.out.println("<<>>" + article);
        articleRepository.save(article);
        return ResponseEntity.ok(article);
    }

}
