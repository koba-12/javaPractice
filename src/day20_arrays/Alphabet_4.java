package day20_arrays;

import java.util.Arrays;

public class Alphabet_4 {

    public static void main(String[] args) {

        char[]alphabets= new char[26];//Z-A
/*
                  i   ch
        alphabets[0]='Z';//90 ascii table
        alphabets[1]='X';//89
        alphabets[2]='Y';//88
         */

        char ch = 'Z';

        for (int i = 0; i<alphabets.length;i++,ch--){//ch-- nin anlamı altta yazıyor
            alphabets[i]=ch;//önceki practicete buraya ch++(veya--) yazmıştık bu sefer yazmadık çünkü üstteki for loopunun içine yazdık
            //bu sadece başka bir yöntemdir.ikisi de olur
        }

        for (char i = 0, j='Z'; i<alphabets.length;i++,j--){//bu da üsttekiyle aynı işlem farklı yol sadece
            alphabets[i]=j;
        }
        System.out.println(Arrays.toString(alphabets));

       /* System.out.println(Arrays.toString(alphabets));//tü arrayi yazdır[Z,bilinmeyen karakterler(26 tane)]
        System.out.println(alphabets[0]);//arrayin elementini yazdır-Z

        */
    }
}
