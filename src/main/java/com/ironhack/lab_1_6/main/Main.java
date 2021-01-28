package com.ironhack.lab_1_6.main;

import com.ironhack.lab_1_6.classes.Employee;
import com.ironhack.lab_1_6.classes.Intern;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        /* Write a program that creates 10 Employees and print it al the properties into a file named employees.txt.*/

            Employee emp01 = new Employee("John", "Doe", 20206661, 100000, "Tech Lead");
            Employee emp02 = new Employee("Juan", "Perez", 20206662, 70000, "Tech Lead");
            Employee emp03 = new Employee("Ana", "Matos", 20206663, 100000, "Tech Lead");
            Employee emp04 = new Intern("Nicolas", "Sanchez", 20206664, 25000, "Junior Programmer");
            Employee emp05 = new Employee("Olivia", "Lopez", 20206665, 90000, "Tech Lead");
            Employee emp06 = new Intern("Claudia", "Gonzalez", 20206666, 10000, "Junior Programmer");
            Employee emp07 = new Employee("Irene", "Hernandez", 20206667, 100000, "Tech Lead");
            Employee emp08 = new Employee("Laura", "Delgado", 20206668, 55000, "Tech Lead");
            Employee emp09 = new Employee("Hugo", "Lopez", 20206669, 30000, "Tech Lead");
            Employee emp10 = new Employee("Diego", "Torres", 20206660, 450000, "Tech Lead");

            Employee[] employees={emp01,emp02,emp03,emp04,emp05,emp06,emp07,emp08,emp09,emp10};

            FileWriter writer=new FileWriter("employees.txt",false);

            writer.write("Name,Surname,employeeId,salary,position\n");


            for (int i=0;i<=employees.length-1;i++){
                writer.write(employees[i].getName()+",\""+
                        employees[i].getSurname()+"\",\""+
                        employees[i].getEmployeeId()+"\","+
                        employees[i].getSalary()+"\","+
                        employees[i].getPosition()+"\n");
            }
            writer.close();
        }

}


