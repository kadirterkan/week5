package com.example.week5.bank.system.transactions.transaction.factory;

import com.example.week5.bank.entities.bank.transactions.Transaction;
import com.example.week5.bank.entities.bank.transactions.TransactionType;
import com.example.week5.bank.entities.bank.transactions.repository.TransactionRepository;
import com.example.week5.common.basemodules.AbstractJavaFactory;
import com.example.week5.common.entities.dto.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class AddTransactionFactory extends AbstractJavaFactory {

    @Autowired
    private TransactionRepository repository;

    private String performerAccountId;
    private String receiverAccountId;

    private Double transactionAmount;
    private TransactionType transactionType;

    public AddTransactionFactory(String performerAccountId, String receiverAccountId, Double transactionAmount, TransactionType transactionType) {
        this.performerAccountId = performerAccountId;
        this.receiverAccountId = receiverAccountId;
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
    }

    @Override
    public MessageResponse create() {
        MessageResponse checker = checker();
        if (Objects.isNull(checker)) {
            Transaction transaction = new Transaction();
            transaction.setTransactionType(transactionType);
            transaction.setTransactionAmount(transactionAmount);
            transaction.setReceiverAccountId(receiverAccountId);
            transaction.setPerformerAccountId(performerAccountId);

            Transaction response = repository.save(transaction);

            if (Objects.nonNull(response)) {
                return messageService.createSuccessMessage("İşlem başarıyla gerçekleştirilmiştir");
            } else {
                return messageService.createErrorMessage("Bir hata meydana geldi");
            }
        }
        return checker;
    }

    @Override
    protected MessageResponse checker() {
        if (performerAccountId.isEmpty() || receiverAccountId.isEmpty() || transactionAmount < 0 ) {
            return messageService.createErrorMessage("Bir hata meydana geldi");
        }
        return null;
    }
}
