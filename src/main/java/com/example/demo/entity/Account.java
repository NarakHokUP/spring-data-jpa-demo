package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue
    @Column(name = "ACCOUNT_ID")
    private Long id;

    @Column(name = "ACCOUNT_NAME")
    private String name;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "account")
    private List<Transaction> transactions = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

}


