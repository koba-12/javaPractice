package day31_Constructors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering_10 {

    public static void main(String[] args) {

        ArrayList<Pizza_9>pizzas=new ArrayList<>();

        //create 100 pizza objects :size- S , cheese topping-2, pepperoni toping- 3
        //create 100 pizza objects: size- M,  cheese-3, pepperoni-4
        //create 100 pizza objects: szie-L, cheese- 4, peppe-5

        for (int i = 0; i < 100; i++) {
            Pizza_9 small=new Pizza_9('S',2,3);
            Pizza_9 medium=new Pizza_9('M',3,4);
            Pizza_9 large=new Pizza_9('L',4,5);

            pizzas.addAll(Arrays.asList(small,medium,large));
        }

        System.out.println("total number of pizzza"+ pizzas.size());//300

        double totalPrice=0;//başlangıç noktası

        for (Pizza_9 each : pizzas) {//pizzASı loopladık
            totalPrice+=each.calcCost();//loopu buraya eşitledik.
            //ÖNEMLİ!!! ŞU AMK += İ TOPLAYARAK DEVAM ANLAMINDA SANIRIM.HER LOOPTA ÜSTÜNE EKLEYEREK DEVAM ET VE EŞİTLE
        }
        System.out.println("totalPrice = " + totalPrice);
    }
}
