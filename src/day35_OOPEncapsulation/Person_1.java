package day35_OOPEncapsulation;

public class Person_1 {

    public String name;//instance variables
    public int age;
    public char gender;
    public String language;

    public static String planet;//static variables
    public static boolean isHuman,hasNose;
    public static int numberOfWings,numberOfHead;


    public Person_1(String name, int age, char gender, String language) {//instance method
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }


    static {//static block
        planet="earth";//staticler bu şekilde yazılır,dikkat!
        isHuman=true;
        hasNose=true;
        numberOfHead=1;
        numberOfWings=0;
    }

    public static void printPlanetName(){
        System.out.println("planet name is "+planet);//buraya instance variables yazılamaz
    }

    public void eat(String food){
        System.out.println(name+"is eating"+ food);
    }

    public void drink(String drink){
        System.out.println(name+ "is drinking" + drink);
    }

    public String toString() {
        return "Person_1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
/*
1. Create a class named Person:
Variables:
name, age, gender, language, planet,isHuman, hasNose, numberOfWings, numberOfHead
Add a constructor to initialize all thefields
Add a static block to initialize all the statics
Methods:
printPlanetName()
eat(String food)
drink(String drink)
toString()
 */
