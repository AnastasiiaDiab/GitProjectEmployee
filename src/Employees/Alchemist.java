package Employees;

public class Alchemist extends Employee implements PartTime{


    public Astrologer(String name, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, DOB, jobTitle, employeeId, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " chrysopoeia");
    }

   
  

   

    @Override
    public String toString() {
        return "Alchemist{" + getName()+
                "job title =" + getJobTitle()+
                "salary = " + getSalary()+ "}";
    }
}

    //new class

    //..
}
