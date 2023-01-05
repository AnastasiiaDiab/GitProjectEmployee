package Employees;

import java.time.LocalDate;

public abstract class Employee {

    private String name;
    private int age;
    private LocalDate DOB;
    private String jobTitle, employeeId;
    private double salary;

    public abstract void work();
}
