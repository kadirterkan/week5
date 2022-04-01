package com.example.week5.bank.entities.user;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class User {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private Date birthday;

    private String tcKimlikNo; //Username
    private String password;

    public User(String firstName, String lastName, Date birthday, String tcKimlikNo, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.tcKimlikNo = tcKimlikNo;
        this.password = password;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
