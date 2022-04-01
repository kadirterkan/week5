package com.example.week5.bank.entities.bank.accounts.repository;

import com.example.week5.bank.entities.bank.accounts.LoanAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanAccountRepository extends MongoRepository<LoanAccount, String> {
}
