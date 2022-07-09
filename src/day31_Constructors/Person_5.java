package day31_Constructors;

public class Person_5 {

    public String name;
    public char gender;
    public int age;

    public Person_5(String name,char gender,int age){//bu bir constructor'dır.
        this.name=name;
        this.gender=gender;
        this.age=age;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
