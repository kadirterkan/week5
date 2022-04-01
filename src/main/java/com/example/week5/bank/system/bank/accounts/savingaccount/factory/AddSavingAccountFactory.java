package com.example.week5.bank.system.bank.accounts.savingaccount.factory;

import com.example.week5.bank.entities.bank.accounts.SavingAccount;
import com.example.week5.bank.entities.bank.accounts.repository.SavingAccountRepository;
import com.example.week5.common.basemodules.AbstractJavaFactory;
import com.example.week5.common.entities.dto.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class AddSavingAccountFactory extends AbstractJavaFactory {

    private final Double balance;
    private final Double interestRate;
    private final String ownerAccountId;

    @Autowired
    private SavingAccountRepository repository;

    public AddSavingAccountFactory(Double balance, Double interestRate, String ownerAccountId) {
        this.balance = balance;
        this.interestRate = interestRate;
        this.ownerAccountId = ownerAccountId;
    }

    @Override
    public MessageResponse create() {
        MessageResponse checker = checker();

        if (Objects.isNull(checker)) {
            SavingAccount account = new SavingAccount();
            account.setInterestRate(interestRate);
            account.setBalance(balance);
            account.setOwnerAccountId(ownerAccountId);

            SavingAccount response = repository.save(account);

            if (Objects.nonNull(response)) {
                return messageService.createSuccessMessage("İşlem başarıyla gerçekleşti");
            } else {
                return messageService.createErrorMessage("Bir hata meydana geldi");
            }
        }
        return checker;
    }

    @Override
    protected MessageResponse checker() {
        if (balance < 0 || ownerAccountId.isEmpty()) {
            return messageService.createErrorMessage("Bir hata meydana geldi");
        }
        return null;
    }
}
