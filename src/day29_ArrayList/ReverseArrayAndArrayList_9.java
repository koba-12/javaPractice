package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList_9 {

    public static void main(String[] args) {

        /*
Array vs ArrayList:her ikisinin de index numaraları var

ArrayList: size is not fixed
           only supports non-primitives
           Can not be multi-dimensional

Array: size is fixed
       supports both primitives & non-primitives
       Can be multi-Dimensional
         */

        int[]array={1,2,3,4,5,6};

        int[]result=new int[array.length];//6,5,4,3,2,1

        int j=0;//j için başlangıç noktası oluşturduk
        for (int i = array.length - 1; i >= 0; i--,j++) {//burada arrayi sondan başa doğru looplarken aynı zamanda
                                                //j de ileri doğru looplanmış olacak(6,5,4,3,2,1)
            result[j]=array[i];//buradaki eşitlik sayesinde de j=i nin tersten looplanmış hali yani reversed hali
        }
        System.out.println(Arrays.toString(result));//[6, 5, 4, 3, 2, 1]

        System.out.println("------------------------------------------");

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        ArrayList<Integer>reversedList=new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {//bunda da benzerini yaptık üsttekinin.sondan başa doğru looplattık
            int each=list.get(i);//eachi tersten looplanan listin (i9 sine eşitledik
            reversedList.add(each);//listin tersten loopu olan eachi de reversedListe ekledik
        }
        System.out.println(reversedList);//[9, 8, 7, 6, 5, 4, 3, 2, 1]
    }
}
