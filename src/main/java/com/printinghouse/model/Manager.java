package com.printinghouse.model;

public class Manager extends Employee{
    private double treashold;
    private double percent;



    public Manager(double baseSalary, String name , double treashold, double percent) {
        super(baseSalary, name);
        this.treashold = treashold;
        this.percent = percent;
    }
}
