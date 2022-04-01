package com.example.week5.bank.entities.bank.accounts;

public class CreditAccount extends BaseAccount {

    private Double interestRate;

    public CreditAccount(Double balance, Double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public CreditAccount() {
        super();
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
