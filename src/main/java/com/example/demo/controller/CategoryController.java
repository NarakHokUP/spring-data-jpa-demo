/*
package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public List<Category> findCategories(){
        return categoryRepository.findAll();
    }

    @GetMapping("/categories/{id}")
    public Category findCategories(@PathVariable Integer id){
        return categoryRepository.findOne(id);
    }

}
*/
