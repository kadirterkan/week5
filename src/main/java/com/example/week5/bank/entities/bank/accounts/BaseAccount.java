package com.example.week5.bank.entities.bank.accounts;

import org.springframework.data.annotation.Id;

public abstract class BaseAccount {

    @Id
    private String id;

    private Double balance;
    private String ownerAccountId;

    public BaseAccount(Double balance) {
        this.balance = balance;
    }

    public BaseAccount() {
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

    public String getOwnerAccountId() {
        return ownerAccountId;
    }

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }
}
