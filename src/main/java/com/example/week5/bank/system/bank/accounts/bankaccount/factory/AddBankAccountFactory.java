package com.example.week5.bank.system.bank.accounts.bankaccount.factory;

import com.example.week5.bank.entities.bank.accounts.BankAccount;
import com.example.week5.bank.entities.bank.accounts.repository.BankAccountRepository;
import com.example.week5.common.basemodules.AbstractJavaFactory;
import com.example.week5.common.entities.dto.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class AddBankAccountFactory extends AbstractJavaFactory {

    @Autowired
    private BankAccountRepository repository;

    private String userId;

    public AddBankAccountFactory(String userId) {
        this.userId = userId;
    }

    public MessageResponse create() {
        MessageResponse checker = checker();

        if (Objects.isNull(checker)) {
            BankAccount account = new BankAccount();
            account.setUserId(userId);
            repository.save(account);

            return messageService.createSuccessMessage("İşlem başarıyla gerçekleşmiştir");
        } else {
            return checker;
        }
    }

    @Override
    protected MessageResponse checker() {
        if (userId.isEmpty()) {
            return messageService.createErrorMessage("Bir hata meydana geldi");
        }
        return null;
    }
}
