package day40_FinalKeywordAndProtectedAccesModifier;

public class Dog_4 extends Animal_3{

    public Dog_4(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    public void eat() {
        System.out.println(getName() + " is eating do food");//override ettik ve soutu değiştirdik.
    }

    //public final void drink(){//ancak bu method final method olduğu için override edilemez.kısıtladı çünkü final
      //  System.out.println(getName()+" is drinking beer");

    public void bark(){
        System.out.println(getName()+" is barking");
    }
}
