package com.example.week5.bank.entities.bank.accounts.repository;

import com.example.week5.bank.entities.bank.accounts.BaseAccount;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BaseAccountRepository extends MongoRepository<BaseAccount, String> {
}
