package com.example.demo.repository;

import com.example.demo.entity.Category;
import com.example.demo.entity.projection.CategoryPj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
//@RepositoryRestResource(excerptProjection = CategoryPj.class)
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
