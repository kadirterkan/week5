package com.example.week5.bank.entities.bank.accounts;

public class LoanAccount extends BaseAccount {

    private Double interestRate;

    public LoanAccount(Double balance, Double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
