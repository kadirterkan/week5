package com.example.week5.bank.system.transactions.payment.factory;

import com.example.week5.bank.entities.bank.transactions.Payment;
import com.example.week5.bank.entities.bank.transactions.PaymentType;
import com.example.week5.bank.entities.bank.transactions.repository.PaymentRepository;
import com.example.week5.common.basemodules.AbstractJavaFactory;
import com.example.week5.common.entities.dto.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class AddPaymentFactory extends AbstractJavaFactory {

    private final String payerAccountId;
    private final PaymentType paymentType;
    private final Double amount;

    @Autowired
    private PaymentRepository repository;

    public AddPaymentFactory(String payerAccountId, PaymentType paymentType, Double amount) {
        this.payerAccountId = payerAccountId;
        this.paymentType = paymentType;
        this.amount = amount;
    }

    @Override
    public MessageResponse create() {
        MessageResponse checker = checker();

        if (Objects.isNull(checker)) {
            Payment payment = new Payment();
            payment.setPaymentType(paymentType);
            payment.setAmount(amount);
            payment.setPayerAccountId(payerAccountId);

            Payment response = repository.save(payment);

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
        if (payerAccountId.isEmpty() || amount < 0) {
            return messageService.createErrorMessage("Bir hata meydana geldi");
        }

        return null;
    }
}
