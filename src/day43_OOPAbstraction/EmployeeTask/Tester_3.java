package day43_OOPAbstraction.EmployeeTask;

public class Tester_3 extends Employee_2{//employee zaten personı da içerdiği için ona extends ettik

    public Tester_3(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override//class satırı hata verecek extends yapınca,oradan implement method diyerek bu abstract classlar çağırırız.
    public void work() {
        System.out.println(getName()+" is testing the application");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeps 8 hours");
    }

    public void bugReport(){
        System.out.println(getName()+" is creating bug reports");
    }
}
