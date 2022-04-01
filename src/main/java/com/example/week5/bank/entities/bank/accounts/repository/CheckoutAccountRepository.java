package com.example.week5.bank.entities.bank.accounts.repository;

import com.example.week5.bank.entities.bank.accounts.CheckoutAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CheckoutAccountRepository extends MongoRepository<CheckoutAccount, String> {
}
