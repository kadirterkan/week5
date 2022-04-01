package com.example.week5.bank.system.user;

import com.example.week5.bank.entities.user.User;
import com.example.week5.bank.entities.user.repository.UserRepository;
import com.example.week5.bank.system.user.factory.AddUserFactory;
import com.example.week5.common.entities.dto.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public MessageResponse createNewUser(String firstName, String lastName, Date birthday, String tcKimlikNo, String password) {
        AddUserFactory addUserFactory = new AddUserFactory(firstName, lastName, birthday, tcKimlikNo, password);

        return addUserFactory.create();
    }

    public User findUserByTcKimlikNo(String tcKimlikNo) {
        return userRepository.findUserByTcKimlikNo(tcKimlikNo);
    }
}
