package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        /*
        Warmup tasks:
1. Write a program that asks user to enter a word. If the work
starts with x, replace it with a.
Input:
xcodex
Output:
acodex
         */

        System.out.println("enter a word");//out a bu çıkacak
        String word = new Scanner(System.in).next();//xcodex  kelimemiz ---new scanner olduğundan üstteki outa çıkar

        if (word.charAt(0) == 'x'){//x in index numberını seçtik burada ön koşulda
            word = word.replaceFirst("x", "a");//x yerine de a koymuş olduk ama replaceFirst olduğundan
            // sadece ilk x yerine
        }
        System.out.println(word);






    }
}
