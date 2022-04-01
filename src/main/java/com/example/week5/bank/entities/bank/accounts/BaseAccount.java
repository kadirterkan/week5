package com.example.week5.bank.entities.bank.accounts;

import org.springframework.data.annotation.Id;

public abstract class BaseAccount {

    @Id
    private String id;

    private Double balance;

    public BaseAccount(Double balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
