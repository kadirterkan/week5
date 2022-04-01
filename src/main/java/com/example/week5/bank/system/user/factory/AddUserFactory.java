package com.example.week5.bank.system.user.factory;

import com.example.week5.bank.entities.user.User;
import com.example.week5.bank.entities.user.repository.UserRepository;
import com.example.week5.common.basemodules.AbstractJavaFactory;
import com.example.week5.common.entities.dto.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class AddUserFactory extends AbstractJavaFactory {

    private static final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @Autowired
    private UserRepository userRepository;

    private String firstname;
    private String lastName;
    private Date birthday;

    private String tcKimlikNo;
    private String password;

    public AddUserFactory(String firstname, String lastName, Date birthday, String tcKimlikNo, String password) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.birthday = birthday;
        this.tcKimlikNo = tcKimlikNo;
        this.password = password;
    }

    @Override
    public MessageResponse create() {
        MessageResponse checker = checker();
        if (Objects.isNull(checker)) {
            User user = new User();
            user.setFirstName(firstname);
            user.setLastName(lastName);
            user.setTcKimlikNo(tcKimlikNo);
            user.setPassword(password);
            user.setBirthday(birthday);
            userRepository.save(user);
            return messageService.createSuccessMessage("İşlem başarıyla gerçekleşmiştir");
        } else {
            return checker;
        }
    }

    @Override
    protected MessageResponse checker() {
        if (password.contains(dateFormat.format(birthday))) {
            return messageService.createErrorMessage("Şifreniz doğum tarihinizi içermemeli");
        } else {
            return null;
        }
    }
}
