package day21_ArraysUtilityAndForEachLoop;

import java.util.Arrays;

public class MergeOfTwoArrays_12 {

    public static void main(String[] args) {

        //merge:birleştirmek

        String[] group1={"ali","layan","aysenur"};//3 elements
        String[] group2={"maria","aygun","duygu","suat","valeriy"};//5 elemnets

        String []students=new String[group1.length+ group2.length];//8 elements

        int i =0;//i ye başlayacağı noktanın değerini atadık

        for (String each : group1) {
            students[i++]=each;//group1 elementleri students içinde artıya doğru looplanacak.eğer++ koymsaydık 7 null ve en sonda valeriy çıkardı
        }//altta bir başka yolunu daha çok bildiğim yolu yapacağız
        for (String each : group2) {
            students[i++]=each;
        }
        System.out.println(Arrays.toString(students));

        System.out.println("-----------------------------------");

        char[] ch1={'A','B','C'};
        char[] ch2={'D','E','F','G','H'};
        
        char[]chars=new char[ch1.length+ ch2.length];

        int j=0;

        for (char ch : ch1) {
            chars[j]=ch;
            j++;//üsttekinin başka yolu
        }
        for (char ch : ch2) {
            chars[j]=ch;
            j++;
        }
        System.out.println(Arrays.toString(chars));


    }
}
