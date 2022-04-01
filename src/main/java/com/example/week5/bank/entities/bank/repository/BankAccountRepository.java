package com.example.week5.bank.entities.bank.repository;

import com.example.week5.bank.entities.bank.BankAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BankAccountRepository extends MongoRepository<BankAccount, String> {
}
