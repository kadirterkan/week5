package com.example.week5.bank.system.bank.card.factory;

import com.example.week5.bank.entities.bank.cards.CreditCard;
import com.example.week5.bank.entities.bank.cards.repository.CreditCardRepository;
import com.example.week5.common.basemodules.AbstractJavaFactory;
import com.example.week5.common.entities.dto.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class AddCreditCardFactory extends AbstractJavaFactory {

    @Autowired
    private CreditCardRepository repository;

    private Double limit;
    private Double debt;
    private String cardOwnerId;

    public AddCreditCardFactory(Double limit, Double debt, String cardOwnerId) {
        this.limit = limit;
        this.debt = debt;
        this.cardOwnerId = cardOwnerId;
    }

    @Override
    public MessageResponse create() {
        MessageResponse checker = checker();

        if (Objects.isNull(checker)) {
            CreditCard card = new CreditCard();
            card.setCardOwnerId(cardOwnerId);
            card.setDebt(debt);
            card.setLimit(limit);

            CreditCard response = repository.save(card);

            if (Objects.nonNull(response)) {
                return messageService.createSuccessMessage("İşlem başarıyla gerçekleşmiştir");
            } else {
                return messageService.createErrorMessage("Bir hata meydana geldi");
            }
        }
        return checker;
    }

    @Override
    protected MessageResponse checker() {
        if (limit < 0 || debt < 0 || cardOwnerId.isEmpty()) {
            return messageService.createErrorMessage("Bir hata meydana geldi");
        }
        return null;
    }
}
