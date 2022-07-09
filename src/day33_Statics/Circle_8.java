package day33_Statics;

import java.util.ArrayList;

public class Circle_8 {

    public double radius;
    public static double pi;
    public static String name;
    public static ArrayList<Integer> numbers;//static blok kullanabileceğimiz yere bir örnek
//mesela şuan buraya add() meyhod vs yazamayız,comp err. verir.bunun için aşağıya staticblocka yazmalıyız
//ayrıca new arrayList de yazamayız,o da farklı bir işlem gerektirir.onu da static bloka yazmalıyız

    public Circle_8(double radius) {//constructor
        this.radius = radius;
        //pi=3.14;--pi'yi bu şekilde yazamayız çünkü constructor always instance,not static.

    }
}
/*
    static {//istediği static variablesı istediği zaman kullanabilir
        //radius=5;--bunu da be şekilde yazamayız çünkü burası static.
        pi=3.14;
        name="circle";

        numbers=new ArrayList<>();
        numbers.add(10);


    public static void main(String[] args) {

        pi=3.14;
        name="circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);

}

 */
