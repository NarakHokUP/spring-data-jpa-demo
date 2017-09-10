package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "TRANSACTION")
public class Transaction {

    @Id
    @GeneratedValue
    @Column(name = "TRANSACTION_ID")
    private Long id;

    @Column(name = "TRANSACTION_TYPE")
    private String type;

    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID")
    private Account account;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
}
