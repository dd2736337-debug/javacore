package com.vti.entity;

import java.util.Date;

public class Account {
    private int id;
    private String email;
    private String userName;
    private String firstName;
    private String lastName;
    private String fullName;
    private String position;
    private Date createdDate;

    //Không có parameters
    public Account() {

    }

    //Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName)
    public Account(int id, String email, String userName, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    //Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) và
    //Position của User, default createDate = now
    public Account(int id, String email, String userName, String firstName, String lastName, String position) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createdDate = new Date();
    }
    //Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) và Position của User, createDate


    public Account(int id, String email, String userName, String firstName, String lastName, String position, Date createdDate) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
