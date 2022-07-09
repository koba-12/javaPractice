package day37_OOPInheritance.ScrumTask;

public class Developer_4 extends Employee_2{


    public Developer_4(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is crying");
    }
}
