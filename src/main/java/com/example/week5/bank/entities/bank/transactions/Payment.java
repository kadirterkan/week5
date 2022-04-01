package com.example.week5.bank.entities.bank.transactions;

import org.springframework.data.annotation.Id;

public class Payment {

    @Id
    private String id;

    private String payerAccountId;
    private PaymentType paymentType;
    private Double amount;

    public Payment() {
    }

    public String getId() {
        return id;
    }

    public String getPayerAccountId() {
        return payerAccountId;
    }

    public void setPayerAccountId(String payerAccountId) {
        this.payerAccountId = payerAccountId;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
