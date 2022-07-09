package day37_OOPInheritance.ScrumTask;

public class BusinessAnalyst_6 extends Employee_2{

    public BusinessAnalyst_6(String name, int age, char gender,int id, double salary, String companyName) {
        super(name, age, gender,"business analyst", id, salary, companyName);
    }

    public void analyze(){
        System.out.println(name+" is analyzing to documents");
    }
}
