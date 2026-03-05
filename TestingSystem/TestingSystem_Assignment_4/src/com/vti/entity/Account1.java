package com.vti.entity;

public class Account1 {
    private final String id;
    private final String name;
    private int balance;

    public Account1(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void crredit(int amount) {
        balance += amount;
    }

    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Số dư không đủ");
        }
    }

    public void transfer(Account1 account1, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            account1.balance += amount;
        }
    }

    @Override
    public String toString() {
        return "Account1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
