package day22_MultiDimensioanalArray;

import java.util.Arrays;

public class ReverseSentence_1 {

    public static void main(String[] args) {

        String sentence="Today is a good day to learn Java";//cümlemizi yazdık
        String []words=sentence.split(" ");//spacelerden ayırdık.yani her kelimeyi bir elemente çevirdik

        System.out.println(Arrays.toString(words));//Java learn to day good a is Today

        String reversedSentence="";//reversed sentence oluşturduk string şeklinde

        for (int i = words.length - 1; i >= 0; i--) {//loopu kurduk negatife doğru(sondan geriye doğru element element looplayacak
            reversedSentence+=words[i]+" ";//reversed sentence i words[i]nin her bir elementine eşitledik.ve "space" koyduk
        }
        System.out.println(reversedSentence);

        /*
        1. Write a program that can reverse a sentence
Ex:
sentence = "Today is a good day to
learn Java";
output:
Java learn to day good a is Today
         */
    }
}
