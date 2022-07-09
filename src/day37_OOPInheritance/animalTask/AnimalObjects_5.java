package day37_OOPInheritance.animalTask;

public class AnimalObjects_5 {

    public static void main(String[] args) {

        Dog_2 dog1=new Dog_2("alex","husky",'M',1,"small","white");
        System.out.println(dog1);

        dog1.bark();
        //dog1.sing;-bu ikisi olmaz çünkü classlarda yazmadık
        //dog1.scratch;

        Cat_3 cat1=new Cat_3("love","siamese",'F',2,"large","black");
        System.out.println(cat1);

        cat1.scratch();

        Parrot_4 parrot1=new Parrot_4("king","macaw",'M',3,"small","blue");
        System.out.println(parrot1);

        parrot1.sing();

    }


}
