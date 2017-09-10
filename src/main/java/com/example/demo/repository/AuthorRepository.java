package com.example.demo.repository;

import com.example.demo.entity.Author;
import com.example.demo.entity.projection.AuthorPj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
//@RepositoryRestResource(excerptProjection = AuthorPj.class)
public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
