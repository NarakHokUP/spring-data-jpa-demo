package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "AUTHOR")
public class Author {

    @Id
    @GeneratedValue
    @Column(name = "AUTHOR_ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DATE_OF_BIRTH")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;

    @JsonIgnore
    @OneToMany(mappedBy = "author")
    private List<Article> articles = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", articles=" + articles +
                '}';
    }
}
