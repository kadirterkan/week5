package com.example.week5.bank.system.bank.accounts.bankaccount;

import com.example.week5.bank.system.bank.accounts.bankaccount.factory.AddBankAccountFactory;
import com.example.week5.common.basemodules.AbstractJavaFactory;
import com.example.week5.common.entities.dto.MessageResponse;

public class BankAccountService {

    public MessageResponse create(String userId) {
        AbstractJavaFactory factory = new AddBankAccountFactory(userId);

        return factory.create();
    }
}
