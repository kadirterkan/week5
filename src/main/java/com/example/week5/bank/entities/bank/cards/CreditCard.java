package com.example.week5.bank.entities.bank.cards;

import org.springframework.data.annotation.Id;

public class CreditCard {

    @Id
    private String id;

    private Double limit;
    private Double debt;

    public CreditCard(Double limit, Double debt) {
        this.limit = limit;
        this.debt = debt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public Double getDebt() {
        return debt;
    }

    public void setDebt(Double debt) {
        this.debt = debt;
    }
}
