package day44_OOPAbstraction.animalTask;

public final class Dog_2 extends Animal_1{

    public Dog_2(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }

    @Override
    public void eat() {//implements method
        System.out.println(getName()+" eating dog food");
    }
}
