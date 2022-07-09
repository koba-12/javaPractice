package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility_6 {

    public static void main(String[] args) {


        /*
sort()
reverse()
swap()
max()
min()
replaceAll()
frequency()
         */

        //sort():küçükten büyüğe sıralar

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(9,8,7,6,5,4,3,2,1));

        Collections.sort(list);
        System.out.println(list);

        System.out.println("-----------------------------------------");

        //reverse():tersten sıralar

        ArrayList<Character>list2=new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D'));

        System.out.println(list2);//[A, B, C, D]

        Collections.reverse(list2);
        System.out.println(list2);//[D, C, B, A]

        System.out.println("--------------------------------------------");

        //swap(): yer değiştirme

        ArrayList<Integer>list3=new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70,80));

        Collections.swap(list3,4,1);//list 3 ten 4 index nolu sayı ile,1 index nolu sayı yer değiştirsin
        System.out.println(list3);

        System.out.println("---------------------------------------------------");

        //max():en büyüğü verir
        //min():en küçüğü verir

        int max=Collections.max(list3);
        int min=Collections.min(list3);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-------------------------------------------------------");

        //replaceAll():çoklu replace(yer değiştirme) yapar

        ArrayList<Integer>list4=new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,10,20,30,40,50,60,10,10));

        Collections.replaceAll(list4,10,1000);//list 4 ten 10 değeri yerine 1000 değerini koy

        System.out.println(list4);//[1000, 1000, 1000, 20, 30, 40, 50, 60, 1000, 1000]

        System.out.println("----------------------------------------------------------");

        //frequency():yazılan sayının sıklığını verir

        int frequency=Collections.frequency(list4,1000);//list 4 ten 1000 in sıklığı(frequencysi)
        System.out.println("frequency = " + frequency);//5

        System.out.println("-------------------------------------------------------------------");

        ArrayList<String>words=new ArrayList<>();
        words.addAll(Arrays.asList("java","java","python","python","c++","c++"));

        int countJava=Collections.frequency(words,"java");
        int countPython=Collections.frequency(words,"python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);
    }
}
