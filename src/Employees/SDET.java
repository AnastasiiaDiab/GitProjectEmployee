package Employees;

import java.time.LocalDate;

public class SDET extends Employee{
    public SDET(String name, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, DOB, jobTitle, employeeId, salary);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public LocalDate getDOB() {
        return super.getDOB();
    }

    @Override
    public void setDOB(LocalDate DOB) {
        super.setDOB(DOB);
    }

    @Override
    public String getJobTitle() {
        return super.getJobTitle();
    }

    @Override
    public void setJobTitle(String jobTitle) {
        super.setJobTitle(jobTitle);
    }

    @Override
    public String getEmployeeId() {
        return super.getEmployeeId();
    }

    @Override
    public void setEmployeeId(String employeeId) {
        super.setEmployeeId(employeeId);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    @Override
    public void work() {

    }


// Creating an object

    public static void main(String[] args) {
        Employee employee1 = new SDET("Alex",LocalDate.of(1900, 1, 1), "QA", "QA123",160_000.00);


        System.out.println( ((SDET)employee1).getAge());


    }




}
