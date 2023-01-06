package Employees;

import java.time.LocalDate;

public class Alchemist extends Employee implements PartTime{


    public Alchemist(String name, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, DOB, jobTitle, employeeId, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " chrysopoeia");
    }

    @Override
    public String toString() {
        return "Alchemist{" + getName()+
                "job title =" + getJobTitle()+
                "salary = " + getSalary()+ "}";
    }

    @Override
    public void worksPartTime() {
        System.out.println(getJobTitle()+ " " + getJobTitle() + " is works when ever he/she wants");
    }
}

    //new class

    //..

