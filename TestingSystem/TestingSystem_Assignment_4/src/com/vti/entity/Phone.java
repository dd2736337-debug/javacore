package com.vti.entity;

public abstract class Phone {
    abstract void insertContact(String name, String phone);

    abstract void removeContact(String name);

    abstract void updateContact(String name, String newPhone);

    abstract void searchContact(String name);

}
