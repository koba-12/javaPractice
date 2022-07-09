package day20_arrays;

import java.util.Arrays;

public class ArraysPractice2_3 {

    public static void main(String[] args) {


        char[]letters= new char[26];

        /*for (int i = 0, j='A'; i< letters.length;i++,j++){
            letters[i]=(char) j;
        }
        System.out.println(Arrays.toString(letters));//A dan Z ye sıraladı.
        bu bir yintem şimdi başka bir yöntemi yazacağım daha basit gibi o

         */

        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i]=ch++;//bu da üsttekinin aynısı daha basit
        }
        System.out.println(Arrays.toString(letters));//A-Z

        System.out.println("---------------------------------");




    }
}
