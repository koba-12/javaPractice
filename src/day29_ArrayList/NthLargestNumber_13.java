package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber_13 {

    public static void main(String[] args) {

        /*
        1. write a program that can return the nth largest number from an
arraylist
arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
n = 5
output:4
         */

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7, 7 ,8, 8));

        int n=3;//bir n sabiti belirledik

        for (int i = 1; i < n ; i++) {//array listi döngüye aldık ve n kadar looplanacak.ancak removeif şeklinde looplanacak
            list.removeIf(p-> Collections.max(list)==p);//n kaçsa oraya kadar bu looplanacak. yani ilk loopta max number 8 ken
            //2.de 8 remove olacağı için 2.de max number 7 olacak,3.de 6 ve burada n=3 olduğu için out 6 olacaktır.
        }
        int max=Collections.max(list);//üstteki işlemler dolayısıyla max=üstteki looplar sonrası elde kalan max number olacaktır

        System.out.println(max);//6
    }
}
