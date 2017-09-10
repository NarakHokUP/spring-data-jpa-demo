package com.example.demo.repository;

import com.example.demo.entity.Article;
import com.example.demo.entity.projection.ArticlePj;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@RepositoryRestResource(excerptProjection = ArticlePj.class)
public interface ArticleRepository extends JpaRepository<Article, Integer>{

    @EntityGraph(value = "graph.Article", type = EntityGraph.EntityGraphType.FETCH)
    List<Article> findAll();
}
