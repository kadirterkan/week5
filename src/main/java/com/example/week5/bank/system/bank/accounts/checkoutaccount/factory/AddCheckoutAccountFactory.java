package com.example.week5.bank.system.bank.accounts.checkoutaccount.factory;

import com.example.week5.bank.entities.bank.accounts.CheckoutAccount;
import com.example.week5.bank.entities.bank.accounts.repository.CheckoutAccountRepository;
import com.example.week5.common.basemodules.AbstractJavaFactory;
import com.example.week5.common.entities.dto.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class AddCheckoutAccountFactory extends AbstractJavaFactory {

    @Autowired
    private CheckoutAccountRepository repository;

    private Double balance;
    private String ownerAccountId;

    public AddCheckoutAccountFactory(Double balance, String ownerAccountId) {
        this.balance = balance;
        this.ownerAccountId = ownerAccountId;
    }

    @Override
    public MessageResponse create() {
        MessageResponse checker = checker();
        if (Objects.isNull(checker)) {
            CheckoutAccount account = new CheckoutAccount();
            account.setBalance(balance);
            account.setOwnerAccountId(ownerAccountId);
            repository.save(account);

            return messageService.createSuccessMessage("İşlem başarıyla gerçekleşti");
        }
        return null;
    }

    @Override
    protected MessageResponse checker() {
        if (balance < 0 || ownerAccountId.isEmpty()) {
            return messageService.createErrorMessage("Bir hata meydana geldi");
        }
        return null;
    }
}
