package com.example.week5.bank.entities.bank.accounts.repository;

import com.example.week5.bank.entities.bank.accounts.SavingAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SavingAccountRepository extends MongoRepository<SavingAccount, String> {
}
