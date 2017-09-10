package com.example.demo.entity;

import com.sun.javafx.beans.IDProperty;
import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table(name = "ARTICLE")
@NamedEntityGraph(name = "graph.Article", attributeNodes = {
        @NamedAttributeNode(value = "category"),
        @NamedAttributeNode(value = "author")
})
public class Article {

    @Id
    @GeneratedValue
    @Column(name = "ARTICLE_ID")
    private Integer id;

    @Column(name = "TITLE")
    private String title;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="CATEGORY_ID")
    private Category category;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "AUTHOR_ID")
    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category=" + category +
                ", author=" + author +
                '}';
    }
}
