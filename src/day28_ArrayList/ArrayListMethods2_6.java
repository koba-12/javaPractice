package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2_6 {

    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        Integer num=2000;//burada yazdıklarımız sadece kafa karıştırmaca bir sikime yaradığı yok
        boolean r=list.remove(num);

        System.out.println(list);
        System.out.println(r);

        System.out.println("--------------------------------------------------------");

        /*
        clear():remove all the elements of the arrayList, size will be 0
        kısaca tüm arrayListi remove ediyor sıfırlıyor
         */

        System.out.println(list.size());//7

        list.clear();

        System.out.println(list.size());//0

        System.out.println(list);//[]

        System.out.println("----------------------------------------------");

        /*
indexOf(Data): returns the first matching element's index number, returns int
ilk eşleşen elementin index numarasını döndürür(verir).int kullanılır


lastIndexOf(Data): returns the last matching element's index number, returns int
son eşleşen elementin index numarasını döndürür(verir).int kullanılır
         */

        ArrayList<Character> characters=new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');//0 index no
        int b = characters.lastIndexOf('A');//4 index no

        System.out.println(a);//0
        System.out.println(b);//4


        System.out.println("-----------------------------------------------");

        /*
        contains(Data):içerir demek.element arrayListte bulunuyorsa true değerini döndürür.aksi halde false değerinin döndürür.
         */

        boolean r2=characters.contains('A');
        boolean r3=characters.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);



        System.out.println("----------------------------------------------");


        /*
        equals():eşitlik,eşittir demek.iki arrayList eşitse true değerine döndürür.değilse false
         */

        ArrayList<Integer> list1=new ArrayList<>();

        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2=new ArrayList<>();

        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2);//false
        System.out.println(list1.equals(list2));//true


        System.out.println("---------------------------------------------------");

        //isEmpty():ArrayList empty mi değil mi?

        boolean r4= list1.isEmpty();//false/mesela bunun üstüne isClear koysak true çıkardı.

        System.out.println("r4 = " + r4);


        System.out.println("-----------------------------------------------");

        //addall(): çoklu add yapmak için

        ArrayList<Integer> numbers=new ArrayList<>();

        //bulk operation:collection type
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(numbers);




    }
}
