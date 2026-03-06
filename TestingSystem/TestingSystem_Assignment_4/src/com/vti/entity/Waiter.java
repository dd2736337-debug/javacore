package com.vti.entity;

public class Waiter extends User {
    public Waiter(String name, double salaryraito) {
        super(name, salaryraito);
    }

    public double calculatePay() {
        return getSalaryraito() * 220;
    }
}
