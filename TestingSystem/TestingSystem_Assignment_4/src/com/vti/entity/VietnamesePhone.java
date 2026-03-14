package com.vti.entity;

public class VietnamesePhone extends Phone {
    public void insertContact(String name, String phone) {
        for (int i = 0; i < size; i++) {
            if (contacts[i].getName().equals(name)) {
                contacts[i].setPhone(phone);
                return;
            }
        }
        contacts[size] = new Contact(name, phone);
        size++;
    }

    public void removeContact(String name) {
        for (int i = 0; i < size; i++) {
            if (contacts[i].getName().equals(name)) {
                for (int j = i; j < size - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }
                size--;
                return;
            }
        }
    }

    public void updateContact(String name, String phone) {
        for (int i = 0; i < size; i++) {
            if (contacts[i].getName().equals(name)) {
                contacts[i].setPhone(phone);
                return;
            }
        }
    }

    public void searchContact(String name) {
        for (int i = 0; i < size; i++) {
            if (contacts[i].getName().equals(name)) {
                System.out.println("Name: " + contacts[i].getName());
                System.out.println("Phone: " + contacts[i].getPhone());
            }
        }
    }
}
