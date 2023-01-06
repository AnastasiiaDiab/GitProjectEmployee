package Employees;

import java.time.LocalDate;

public class Dentist extends Employee implements MedicalDegree{


    public Dentist(String name, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, DOB, jobTitle, employeeId, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is providing a dental treatment");
    }


    @Override
    public void hasMedicalDegree() {
        System.out.println(getJobTitle() + " " + getName() + " is graduated from University of Maryland School of Dentistry");
    }

    @Override
    public String toString() {
        return "Dentist{"+ getName()+
                "job title =" + getJobTitle()+
                "salary = " + getSalary()+ "}";
    }
}
