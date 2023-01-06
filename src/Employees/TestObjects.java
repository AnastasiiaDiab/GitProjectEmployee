package Employees;

import java.time.LocalDate;

public class TestObjects {

    public static void main(String[] args) {

        Employee emp1 = new Pilot("Zoe Lavender", LocalDate.of(1988, 12,1), "Pilot of Dragon",
                "RED85", 190000);

        System.out.println(emp1);

        emp1.work();

    }
}
