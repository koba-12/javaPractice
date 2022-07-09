package day43_OOPAbstraction.EmployeeTask;

public class Driver_6 extends Employee_2{

    public Driver_6(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeps 10 hours");
    }
}
