package com.tylets.pavial.models;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name="account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="accountid")
    private int accountId;
    @Column(name="account")
    private int account;
    @Column(name="userid")
    private int userId;

    public Account(int account, int userId) {
        this.account = account;
        this.userId = userId;
    }

    public Account() {
    }

    public int getAccountId() {
        return accountId;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
