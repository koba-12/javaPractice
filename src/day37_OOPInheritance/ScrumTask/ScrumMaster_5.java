package day37_OOPInheritance.ScrumTask;

public class ScrumMaster_5 extends Employee_2{

    public ScrumMaster_5(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender,"scrum master", id, salary, companyName);

        //örneğin scrum masterın altına eklenecek iş kollarında,scrum masterın sabit kalması için bu şekilde yazabiliriz
    }
}
