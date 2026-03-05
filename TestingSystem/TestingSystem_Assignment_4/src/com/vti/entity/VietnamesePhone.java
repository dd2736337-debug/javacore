package com.vti.entity;

import java.util.ArrayList;

public class VietnamesePhone extends Phone {
    ArrayList<String> contacts = new ArrayList<>();

    @Override
    void insertContact(String name, String phone) {
        contacts.add(name + "-" + phone);
    }

    void removeContact(String name) {

    }

    void updateContact(String name, String newPhone) {

    }

    void searchContact(String name) {

    }
}
