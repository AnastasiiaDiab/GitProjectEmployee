package Employees;

import java.time.LocalDate;

public abstract class Employee {

    private String name;
    private int age;
    private LocalDate DOB;
    private String jobTitle, employeeId;
    private double salary;

    public Employee(String name, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        setName(name);
        this.age = DOB.getYear() - LocalDate.now().getYear();
        setDOB(DOB);
        setJobTitle(jobTitle);
        setEmployeeId(employeeId);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   

    public abstract void work();
}
