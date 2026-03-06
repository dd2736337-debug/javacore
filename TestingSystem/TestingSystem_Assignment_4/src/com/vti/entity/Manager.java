package com.vti.entity;

public class Manager extends User {
    public Manager(String name, double salaryraito) {
        super(name, salaryraito);
    }

    @Override
    public double calculatePay() {
        return getSalaryraito() * 520;
    }


}
