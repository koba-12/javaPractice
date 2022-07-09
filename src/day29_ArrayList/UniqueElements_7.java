package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements_7 {

    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer>unique=new ArrayList<>();

        for (Integer each : list) {//unique a alabilmek için listi loopladık
            int frequency= Collections.frequency(list,each);//loopta frequency eşittir.list in frequencysi(method)each yaptık
            //yani finds the frequency of each elements
            if (frequency==1){//koşul koyduk unique olması için
                unique.add(each);//ve koşula uyanı unique ekledik
            }
        }
        System.out.println(unique);//[2, 4, 6, 8]

        System.out.println("-----------------------------------------------");

        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer>unique2=new ArrayList<>(list2);//içerir/add all the elements of list2

        unique2.removeIf(p -> Collections.frequency(list2,p)>1);//remove if ile de 2. bir yöntemle uniqueleri bulmuş olduk.(hayli güzel ve daha kolay)

        System.out.println("unique2 = " + unique2);//unique2 = [2, 4, 6, 8]
    }
}
