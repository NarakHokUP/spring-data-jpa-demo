package com.example.demo.entity.projection;

import com.example.demo.entity.Author;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "author", types = Author.class)
public interface AuthorPj {

    Integer getId();
    String getName();
}
