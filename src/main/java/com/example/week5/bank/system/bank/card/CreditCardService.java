package com.example.week5.bank.system.bank.card;

import com.example.week5.bank.system.bank.card.factory.AddCreditCardFactory;
import com.example.week5.common.basemodules.AbstractJavaFactory;
import com.example.week5.common.entities.dto.MessageResponse;

public class CreditCardService {

    public MessageResponse create(Double limit, Double debt, String cardOwnerId) {
        AbstractJavaFactory factory = new AddCreditCardFactory(limit, debt, cardOwnerId);

        return factory.create();
    }
}
