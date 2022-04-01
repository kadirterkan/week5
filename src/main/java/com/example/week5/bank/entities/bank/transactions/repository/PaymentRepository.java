package com.example.week5.bank.entities.bank.transactions.repository;

import com.example.week5.bank.entities.bank.transactions.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment,String> {
}
