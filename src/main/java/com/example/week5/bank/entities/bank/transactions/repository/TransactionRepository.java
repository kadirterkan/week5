package com.example.week5.bank.entities.bank.transactions.repository;

import com.example.week5.bank.entities.bank.transactions.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
}
