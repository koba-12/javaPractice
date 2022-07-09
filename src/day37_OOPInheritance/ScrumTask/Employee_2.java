package day37_OOPInheritance.ScrumTask;

public class Employee_2 extends Person_1{

    //person classı super class altına hem person özelliklerini alan hem de yeni özelliklere sahip bir subclass eklemek istedik.
//employee is a person
//phone task
    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;

    public Employee_2(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(jobTitle+" "+ name+" is working");
    }

    public String toString() {
        return "Employee_2{" +
                "jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
        //totring method seçerken subclassınkiler de çıkıyor, onları da seçmeliyiz.
    }
}
