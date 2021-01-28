package com.ironhack.lab_1_6.classes;

import java.math.BigDecimal;

public class Intern extends Employee{

    private final int MAX_SALARY = 20000;

    // Constructor
    public Intern(String name, String surname, long employeeId, int salary, String position) {
        super(name, surname, employeeId,position);
        setSalary(salary);
    }

    //SetSalary
    public void setSalary(int salary){

        if (salary <= MAX_SALARY) {
            super.setSalary(salary);
        } else {
            System.err.println("Intern's salary can't be over " + MAX_SALARY + ". Set to max.");
            super.setSalary(MAX_SALARY);
        }

    }
}
