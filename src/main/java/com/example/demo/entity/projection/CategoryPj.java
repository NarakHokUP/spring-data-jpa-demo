package com.example.demo.entity.projection;

import com.example.demo.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "category", types = Category.class)
public interface CategoryPj {

    Integer getId();
    String getName();
}
