package com.company.factory;

public abstract class Employee {

    //properties
    String id;
    String name;
//    String type;
//    double rate;
//    int hoursWorked;
//    int daysWorked;

    //methods
    public abstract double calcSalary();

//        if (this.type.equals("hourly")) {
//            return this.rate * this.hoursWorked;
//        }
//        if (this.type.equals("daily")) {
//            return this.rate + this.daysWorked;
//        }
//        if (this.type.equals("monthly")) {
//            return rate;
//        }
//        return 0;

    //hourly paid -> rate*hoursWorked
    //monthly paid -> rate
    //intern -> rate
    //probationary -> rate*hoursWorked

}
