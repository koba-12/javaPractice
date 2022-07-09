package day20_arrays;

import java.util.Arrays;

public class ArraysPractice_2 {

    public static void main(String[] args) {

        int[] numbers={10,20,50,70};//size 4
        System.out.println(Arrays.toString(numbers));

        System.out.println("----------------------------");

        int[]scores = new int[5];//0,0,0,0,0
        scores[1]= 85;//scoresun 1. index numarası 85 demek
        scores[scores.length -1]=95;//scores un scores-1 i yani 5-1 = 95 demek
        scores[3]=75;
        scores[0] = 65;
        scores[2]=55;
        System.out.println(Arrays.toString(scores));//[65, 85, 55, 75, 95]

        System.out.println("------------------------------------");

        String []months= {"jan", "feb", "mar", "apr", "may", "june","july","aug","sep","oct","nov","dec"};

        /*System.out.println(months[0]);
        System.out.println(months[1]);
        System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);
        System.out.println(months[5]);
        System.out.println(months[6]);
        System.out.println(months[7]);
        System.out.println(months[8]);
        System.out.println(months[9]);
        System.out.println(months[10]);
        System.out.println(months[11]);
        bunları yazmak yerine kısaca aşağıda loopunu yapacağız
         */

        for (int i = 0;i<months.length;i++){//0'dan başlayan array in index numaralarını temsil eder
            System.out.println(months[i]);
        }

        System.out.println("-------------------------------");

        for (int i = months.length-1; i>= 0;i--) {//last index'den başlayan array in index numaralarını temsil eder
            System.out.println(months[i]);
        }

    }
}
