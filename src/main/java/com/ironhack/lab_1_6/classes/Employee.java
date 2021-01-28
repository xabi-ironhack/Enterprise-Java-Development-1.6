package com.ironhack.lab_1_6.classes;

import java.math.BigDecimal;

public class Employee {

    private String name;
    private String surname;
    private long employeeId;
    private int salary;
    private String position;

    /*Constructor*/

    public Employee(String name, String surname, long employeeId, String position) {
        this.name = name;
        this.surname = surname;
        this.employeeId = employeeId;
        this.position = position;
    }

    public Employee(String name, String surname, long employeeId, int salary, String position) {
        this.name = name;
        this.surname = surname;
        this.employeeId = employeeId;
        this.salary = salary;
        this.position = position;
    }
    /*Methods*/
    public String description(){
        String description ="El empleado " +getEmployeeId() + " se llama " + getName() + " " + getSurname() +" y ocupa la posicón de " + getPosition() + "en la compañía";
        return description;
    }

    /*Getters & Setters*/
    public String getName() { return name;}
    public void setName(String name) { this.name = name;}
    public String getSurname() { return surname;}
    public void setSurname(String surname) { this.surname = surname;}
    public long getEmployeeId() { return employeeId;}
    public void setEmployeeId(long employeeId) { this.employeeId = employeeId;}
    public int getSalary() { return salary;}
    public void setSalary(int salary) { this.salary = salary;}
    public String getPosition() { return position;}
    public void setPosition(String position) {this.position = position;}
}
