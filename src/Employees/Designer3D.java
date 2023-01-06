package Employees;

import java.time.LocalDate;

public class Designer3D extends Employee {

    public Designer3D(String name, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, DOB, jobTitle, employeeId, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is desinging 3D.");
    }

    public void solidworks(){
        System.out.println(getName() + " is using solidworks program.");
    }
}
