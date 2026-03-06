package com.vti.entity;

public class Employee extends User {

    public Employee(String name, double salaryraito) {
        super(name, salaryraito);
    }

    public double calculatePay() {
        return getSalaryraito() * 420;
    }
}
