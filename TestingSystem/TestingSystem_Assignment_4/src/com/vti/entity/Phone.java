package com.vti.entity;

public abstract class Phone {
    protected Contact[] contacts = new Contact[100];
    protected int size = 0;

    abstract void insertContact(String name, String phone);

    abstract void removeContact(String name);

    abstract void updateContact(String name, String newPhone);

    abstract void searchContact(String name);

}
