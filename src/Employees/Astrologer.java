package Employees;

import java.time.LocalDate;

public class Astrologer extends Employee implements PartTime, failedToPayTaxes{


    public Astrologer(String name, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, DOB, jobTitle, employeeId, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is reading a natal chart");
    }

    public void forecast(){
        System.out.println(getJobTitle() + " " + getName() + " is predicting the future");
    }

    @Override
    public void worksPartTime() {
        System.out.println(getJobTitle() + " " + getName() + " is working part-time");
    }


    @Override
    public void failedToPayTaxes() {
        System.out.println(getJobTitle() + " " + getName() + ", IRS is after you!");
    }

    @Override
    public String toString() {
        return "Astrologer{" + getName()+
                "job title =" + getJobTitle()+
                "salary = " + getSalary()+ "}";
    }
}
