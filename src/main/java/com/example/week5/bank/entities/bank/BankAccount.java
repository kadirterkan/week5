package com.example.week5.bank.entities.bank;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class BankAccount {

    @Id
    private String id;

    private String userId;
    private ArrayList<String> accountIds;
    private ArrayList<String> creditCards;
    private Integer creditRating;

    public BankAccount(String userId, Integer creditRating) {
        this.userId = userId;
        this.creditRating = creditRating;
        this.accountIds = new ArrayList<>();
        this.creditCards = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ArrayList<String> getAccountIds() {
        return accountIds;
    }

    public void setAccountIds(ArrayList<String> accountIds) {
        this.accountIds = accountIds;
    }

    public ArrayList<String> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(ArrayList<String> creditCards) {
        this.creditCards = creditCards;
    }

    public Integer getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(Integer creditRating) {
        this.creditRating = creditRating;
    }
}
