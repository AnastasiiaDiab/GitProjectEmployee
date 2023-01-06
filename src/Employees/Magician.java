package Employees;

import java.time.LocalDate;

import java.time.LocalDate;

public class Magician extends Employee{
    public Magician(String name, int DOB, String jobTitle, String employeeId, double salary) {
        super(name, LocalDate.ofEpochDay(DOB), jobTitle, employeeId, salary);
    }

    public static void main(String[] args) {
        Magician David = new Magician("Mesut",2000,"Master","Master",200000);
        David.makeMagic();


    }
    public void makeMagic(){
        System.out.println("Abracadabra !!!!");
    }

    @Override
    public void work() {

    }
}

