package com.example.week5.bank.entities.bank.cards.repository;

import com.example.week5.bank.entities.bank.cards.CreditCard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CreditCardRepository extends MongoRepository<CreditCard, String> {
}
