package day43_OOPAbstraction.EmployeeTask;

public class Developer_4 extends Employee_2{

    public Developer_4(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is developing application");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeps 6 hours");
    }

    public void unitTest(){
        System.out.println(getName()+" is unit testing");
    }
}
