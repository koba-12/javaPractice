package day43_OOPAbstraction.EmployeeTask;

public class Teacher_5 extends Employee_2{

    public Teacher_5(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleepping 8 hours");
    }
}
