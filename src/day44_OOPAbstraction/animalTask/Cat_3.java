package day44_OOPAbstraction.animalTask;

public final class Cat_3 extends Animal_1{

    public Cat_3(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating fish");
    }
//abstraction böyleişte superclassta oluşturuyoruz ve subclasslarda o sayede classa özel özellikle veriyoruz.
}
