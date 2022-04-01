package com.example.week5.bank.system.bank.accounts.creditaccount;

import com.example.week5.bank.system.bank.accounts.creditaccount.factory.AddCreditAccountFactory;
import com.example.week5.common.basemodules.AbstractJavaFactory;
import com.example.week5.common.entities.dto.MessageResponse;

public class CreditAccountService {

    public MessageResponse create(Double balance, Double interestRate, String ownerAccountId) {
        AbstractJavaFactory factory = new AddCreditAccountFactory(balance, interestRate, ownerAccountId);

        return factory.create();
    }
}
