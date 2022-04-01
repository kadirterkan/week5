package com.example.week5.bank.system.bank.accounts.savingaccount;

import com.example.week5.bank.system.bank.accounts.savingaccount.factory.AddSavingAccountFactory;
import com.example.week5.common.basemodules.AbstractJavaFactory;
import com.example.week5.common.entities.dto.MessageResponse;

public class SavingAccountService {

    public MessageResponse create(Double balance, Double interestRate, String ownerAccountId ) {
        AbstractJavaFactory factory = new AddSavingAccountFactory(balance, interestRate, ownerAccountId);

        return factory.create();
    }
}
