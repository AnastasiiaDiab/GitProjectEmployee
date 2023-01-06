package Employees;

import java.time.LocalDate;

public class TestObjects {

    public static void main(String[] args) {

        Employee emp1 = new Pilot("Zoe Lavender", LocalDate.of(1988, 12,1), "Pilot of Dragon",
                "RED85", 190000);

        System.out.println(emp1);

        emp1.work();

        // ===========================Alex object starts here ================================

        System.out.println();

            Employee employee1 = new SDET("Alex",LocalDate.of(1900, 1, 1), "QA", "QA123",160_000.00);


            System.out.println("Alex you are: " + employee1.getAge() + " years old, finally you are SDET and you make a lot of money, like : $" + employee1.getSalary());

        //====================================Alex object code eds here========================

    }
}
