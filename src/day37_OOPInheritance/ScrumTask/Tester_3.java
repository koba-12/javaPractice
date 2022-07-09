package day37_OOPInheritance.ScrumTask;

public class Tester_3 extends Employee_2{//tester is a employee,tester is a person

//employeenin subclassı
    public Tester_3(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void createTicket(){
        System.out.println(jobTitle +" "+name+" is creating ticket");
    }
    //instance variables eklemdiğimiz için toString method koymadık
}
