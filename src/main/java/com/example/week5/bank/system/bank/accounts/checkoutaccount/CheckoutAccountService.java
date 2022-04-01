package com.example.week5.bank.system.bank.accounts.checkoutaccount;

import com.example.week5.bank.system.bank.accounts.checkoutaccount.factory.AddCheckoutAccountFactory;
import com.example.week5.common.basemodules.AbstractJavaFactory;
import com.example.week5.common.entities.dto.MessageResponse;

public class CheckoutAccountService {

    public MessageResponse create(Double balance, String ownerAccountId) {
        AbstractJavaFactory factory = new AddCheckoutAccountFactory(balance, ownerAccountId);

        return factory.create();
    }
}
