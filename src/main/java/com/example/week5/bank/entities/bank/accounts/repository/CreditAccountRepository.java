package com.example.week5.bank.entities.bank.accounts.repository;

import com.example.week5.bank.entities.bank.accounts.CreditAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CreditAccountRepository extends MongoRepository<CreditAccount, String> {
}
