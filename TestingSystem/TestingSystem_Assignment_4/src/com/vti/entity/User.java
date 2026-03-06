package com.vti.entity;

public abstract class User {
    private final String name;
    private final double salaryraito;

    public User(String name, double salaryraito) {
        this.name = name;
        this.salaryraito = salaryraito;
    }

    public String getName() {
        return name;
    }

    public double getSalaryraito() {
        return salaryraito;
    }

    public abstract double calculatePay();

    public void displayInfor() {
        System.out.println("Name: " + name);
        System.out.println("Salary Raito: " + salaryraito);
        System.out.println("Salary: " + calculatePay());
    }
}
