package com.example.week5.bank.entities.user.repository;

import com.example.week5.bank.entities.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findUserByTcKimlikNo(String tcKimlikNo);
}
