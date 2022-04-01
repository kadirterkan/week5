package com.example.week5.bank.factories.user;

import com.example.week5.bank.entities.user.repository.UserRepository;
import com.example.week5.common.basemodules.AbstractJavaFactory;
import com.example.week5.common.entities.dto.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class UserFactory extends AbstractJavaFactory {

    @Autowired
    private UserRepository userRepository;
    private String firstname;
    private String lastName;
    private Date birthday;

    private String tcKimlikNo;
    private String password;

    public UserFactory(String firstname, String lastName, Date birthday, String tcKimlikNo, String password) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.birthday = birthday;
        this.tcKimlikNo = tcKimlikNo;
        this.password = password;
    }

    public MessageResponse createNewUser() {

    }

    private MessageResponse checker() {
        
    }
}
