package com.example.demo.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue
    @Column(name="USER_ID")
    private int id;

    @Column(name = "USERNAME")
    private String username;

    @ManyToMany
    private List<Account> accounts = new ArrayList<>();

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
