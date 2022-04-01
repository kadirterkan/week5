package com.example.week5.bank.entities.bank.transactions;

public enum TransactionType {
    CASH("Para Transferi"), CREDIT("Kredi Transferi"), CREDIT_CARD("Kredi Kartı Transferi");

    private final String value;

    TransactionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
