package com.example.week5.bank.entities.bank.transactions;

public enum PaymentType {
    CREDIT_CARD("Kredi Kartı Ödemesi"), CREDIT("Kredi Ödemesi"), LOAN("Borç Ödemesi");

    private final String value;

    PaymentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
