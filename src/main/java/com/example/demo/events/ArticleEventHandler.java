package com.example.demo.events;

import com.example.demo.entity.Article;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler(Article.class)
public class ArticleEventHandler {

    @HandleBeforeCreate
    public void handlePersonSave(Article article) {
        System.out.println("ARTICLE: " + article);
    }

}
