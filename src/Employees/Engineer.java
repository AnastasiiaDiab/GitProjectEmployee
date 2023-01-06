package Employees;

import java.time.LocalDate;

public class Engineer extends Employee{
    public Engineer(String name, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, DOB, jobTitle, employeeId, salary);
    }

    @Override
    public void work() {

    }
}
