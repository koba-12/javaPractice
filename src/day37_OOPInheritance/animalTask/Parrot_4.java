package day37_OOPInheritance.animalTask;

public class Parrot_4 extends Animal_1{

    //public String parrotWingColor;

    public Parrot_4(String name, String breed, char gender, int age, String size, String color){//String parrotWingColor) {
        super(name, breed, gender, age, size, color);
        //this.parrotWingColor=parrotWingColor;-bu şekilde manuel de eklenebilir
    }

    public void sing(){
        System.out.println(name+" is singing");
    }
}
