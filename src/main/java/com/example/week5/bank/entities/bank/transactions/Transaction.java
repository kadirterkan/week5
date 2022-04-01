package com.example.week5.bank.entities.bank.transactions;

import org.springframework.data.annotation.Id;

public class Transaction {

    @Id
    private String id;

    private String performerAccountId;
    private String receiverAccountId;

    private Double transactionAmount;
    private TransactionType transactionType;

    public Transaction() {
        super();
    }

    public String getId() {
        return id;
    }

    public String getPerformerAccountId() {
        return performerAccountId;
    }

    public void setPerformerAccountId(String performerAccountId) {
        this.performerAccountId = performerAccountId;
    }

    public String getReceiverAccountId() {
        return receiverAccountId;
    }

    public void setReceiverAccountId(String receiverAccountId) {
        this.receiverAccountId = receiverAccountId;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
}
