package day36_OOPInheritance.animalTask;

public class Zoo_5 {

    public static void main(String[] args) {

        Dog_2 dog=new Dog_2();
        dog.setInfo("max","husky",'M',2,"small","white");//constructor değil setInfo yazdığımız için böyle yaapıyoruz.zaten hatırlayalım,kurala göre constructor yapamayız.

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();

        //dog.hunt();bunu yazamayız mesela,bu tigera özel
        dog.bark();//bunu dog classta "dog" için yazdığım method sayesinde buraya ekleyebildim.üsttekiler ise
        // hayvanların ortak özellikleeri.zaten diğer hayvanlara da yazacağım orta olanları daha da netleşecek.

        System.out.println(dog);

        Cat_3 cat=new Cat_3();
        cat.setInfo("buffon","tekir",'M',3,"middle","black");

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();

        cat.meow();
        cat.scratch();

        System.out.println(cat);
        /*
        buffon is eating
buffon is drinking
buffon is sleeping
buffon is moving
buffon is meowing
buffon is scratching
Animal_1{name='buffon', breed='tekir', gender=M, age=3, size='middle', color='black'}
printi de böyle olur.
         */

        Tiger_4 tiger=new Tiger_4();
        tiger.setInfo("sher kan","benhal",'M',4,"large","yellow");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();

        tiger.hunt();
        tiger.roar();

        System.out.println(tiger);

    }
}
