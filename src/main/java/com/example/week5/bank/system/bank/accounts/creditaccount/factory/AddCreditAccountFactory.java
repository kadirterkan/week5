package com.example.week5.bank.system.bank.accounts.creditaccount.factory;

import com.example.week5.bank.entities.bank.accounts.CreditAccount;
import com.example.week5.bank.entities.bank.accounts.repository.CreditAccountRepository;
import com.example.week5.common.basemodules.AbstractJavaFactory;
import com.example.week5.common.entities.dto.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class AddCreditAccountFactory extends AbstractJavaFactory {

    @Autowired
    private CreditAccountRepository repository;

    private Double balance;
    private Double interestRate;
    private String ownerAccountId;

    public AddCreditAccountFactory(Double balance, Double interestRate, String ownerAccountId) {
        this.balance = balance;
        this.interestRate = interestRate;
        this.ownerAccountId = ownerAccountId;
    }

    @Override
    public MessageResponse create() {
        MessageResponse checker = checker();

        if (Objects.isNull(checker)) {
            CreditAccount account = new CreditAccount();
            account.setOwnerAccountId(ownerAccountId);
            account.setBalance(balance);
            account.setInterestRate(interestRate);

            CreditAccount response = repository.save(account);

            if (Objects.nonNull(response)) {
                return messageService.createSuccessMessage("İşlem başarıyla gerçekleşti");
            } else {
                return messageService.createErrorMessage("Bir hata meydana geldi");
            }
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
