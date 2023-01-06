package Employees;

import java.time.LocalDate;

public class Teacher extends Employee{

    private String subject;

    public Teacher(String name, LocalDate DOB, String jobTitle, String employeeId, double salary, String subject) {
        super(name, DOB, jobTitle, employeeId, salary);
        setSubject(subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (subject.isEmpty() || subject.isBlank()){
            throw new RuntimeException("Invalid Subject. Subject can not be empty or blank");
        }
        this.subject = subject;
    }

    @Override
    public void work() {
        System.out.println(getName()  + " is teaching "  + getSubject());
    }
}
