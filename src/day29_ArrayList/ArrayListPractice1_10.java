package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1_10 {

    public static void main(String[] args) {

        String[]countries={"japan","korea","united states","united kingdom","turkey","vietnam","sscb"};

        //converting array to arrayList

        ArrayList<String>list=new ArrayList<>(Arrays.asList(countries));//burada arrayi arrayListe döndürdük

        list.removeIf(p-> p.length()>=10);//ve 10 harften uzun ülke isimlerini remove etmek istedik.

        //converting arrayList to array

        countries=list.toArray(new String[0]);//burada da arrayListi arraye döndürdük.bu yazdığım kuralıdır bu işin(toArray method)
        //[0] yazan yere başka bir index no yazsam da doğru olurdu doesn't matter.

        System.out.println(Arrays.toString(countries));//[japan, korea, turkey, vietnam, sscb]

    }
}
