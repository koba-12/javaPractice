package day40_FinalKeywordAndProtectedAccesModifier;

public class Zoo_5 {

    public static void main(String[] args) {

        Dog_4 dog=new Dog_4("max","husky",'M',"black","large",2);

        System.out.println(dog.getBreed());//husky
        System.out.println(dog.getColor());//black

        dog.drink();//max is drinking
        //final method olan drinkten print alırız tabiki ancak sonucu değiştiremeyiz
    }
}
