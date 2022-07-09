package day21_ArraysUtilityAndForEachLoop;

import java.util.Arrays;

public class StringMethods_7 {

    public static void main(String[] args) {

        /*
toCharArray(): return a char array
"abc".toCharArray() ====> {'a', 'b','c'}
         */

        String str="java";
        char[]chars=str.toCharArray();//arraye döndürdü

        System.out.println(Arrays.toString(chars));//[j,a,v,a]
    }
}
