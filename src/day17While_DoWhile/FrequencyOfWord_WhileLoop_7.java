package day17While_DoWhile;

import java.util.Locale;

public class FrequencyOfWord_WhileLoop_7 {

    public static void main(String[] args) {

        String sentence = "cat cat cat cat cat cat dog dog dog";
        int countCat =0;//burayı mesela 2 yapsak out 8 çıkar.yani doğru sonuç için burası 0 olmalı


        while (sentence.contains("cat")){//cat içerenleri aldık
            sentence = sentence.replaceFirst("cat", "");//sentence i cat içerenlere eşitledik
            countCat++;//bunu yazmazsak 0 çıkıyor
        }
        System.out.println(countCat);//6


        System.out.println("-------------------------------------");

        String s = "Java Java Java Python Python Python";
        int countJava = 0;
        int countPython = 0;

        while (s.contains("Java") || s.contains("Python")){
            if (s.contains("Java")){
                s = s.replaceFirst("Java", "");
                countJava++;
            }
            if (s.contains("Python")){
                s = s.replaceFirst("Python" , "");
                countPython++;
            }
        }
        System.out.println(countJava);//3
        System.out.println(countPython);//3

    }


}
