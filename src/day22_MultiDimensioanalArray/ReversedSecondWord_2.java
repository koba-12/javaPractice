package day22_MultiDimensioanalArray;

import java.util.Arrays;

public class ReversedSecondWord_2 {

    public static void main(String[] args) {

        String sentence="i love java";
        String[]words=sentence.split(" ");
        String reverse="";

        for (int i=words[1].length()-1;i>=0;i--){
            reverse+=words[1].charAt(i);
        }
        System.out.println(reverse);

        //sentence=sentence.replaceFirst(words[1],reverse);//bu da bir yöntem

        words[1]=reverse;
        System.out.println(Arrays.toString(words));

        String result="";

        for (String word : words) {
            result+=word+" ";//bu aralardaki virgülü kaldırıp space koymak için ve array formundan çıkarmak için yani[] leri kaldırmak için
        }
        System.out.println(result);

        /*
        2. Write a program that can reverse the second word of the sentence
Ex:
sentence = "I Love Java";
output:
I evoL Java
         */
    }
}
