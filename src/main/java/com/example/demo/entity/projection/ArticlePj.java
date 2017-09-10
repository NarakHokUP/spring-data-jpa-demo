package com.example.demo.entity.projection;

import com.example.demo.entity.Article;
import com.example.demo.entity.Author;
import com.example.demo.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "article", types = Article.class)
public interface ArticlePj {

    Integer getId();
    String getTitle();
    Author getAuthor();
    Category getCategory();

}
