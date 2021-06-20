package com.company.factory;

public class EmployeeFactory {

    public Employee getInstance(String type, String name, int hoursWorked, double rate) {
        Employee employee = null;

        if (type.equals("Hourly")) {
            employee = new HourlyEmployee("1", name, hoursWorked, rate);
        } else if (type.equals("Monthly")) {
            employee = new MonthlyEmployee("2", name, rate);
        } else if (type.equals("Daily")) {
            //todo - create the daily employee
        } else if (type.equals("Contract")) {
            return new ContractBasisEmployee("5", name, rate);
        }

        return employee;

    }

}
