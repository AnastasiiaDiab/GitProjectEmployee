package Employees;

import java.time.LocalDate;

public class DesignerTest {


        public static void main(String[] args) {
            Employee designer1 = new Designer3D("Ismail", LocalDate.of(1995, 6, 5), "Solidworks", "SW123",120_000.00);


            System.out.println( ((Designer3D)designer1).getJobTitle());
    }
}
