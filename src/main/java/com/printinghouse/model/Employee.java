package com.printinghouse.model;

public abstract class Employee {
    protected double BaseSalary;
    protected String Name;

    public Employee(double baseSalary, String name) {
        BaseSalary = baseSalary;
        Name = name;
    }

    public double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        BaseSalary = baseSalary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
