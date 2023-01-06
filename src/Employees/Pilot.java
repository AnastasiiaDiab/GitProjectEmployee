package Employees;

import java.time.LocalDate;

public class Pilot extends Employee{


    public Pilot(String name, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, DOB, jobTitle, employeeId, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is at the airport");
        }

    private void fly() {
        System.out.println(getName() + " is flying a commercial plane");
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name = " + getName() +
                "age = " + getAge() + "Job title = " + getJobTitle() +"}";
    }
}

