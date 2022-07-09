package Utilities;

import java.util.Arrays;

public class StringUtility_1 {

    public static void printEachChar(String str){
        //print each character of the given string
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
//reverses the given string and returns the reversed string
    public static String reverse(String str){
        String result="";

        for (int i = str.length()-1; i <=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
//check if the given string is palindrome,returns boolean
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }

//check if the given string is anagram,returns boolean

    public static boolean anagram(String str1,String str2){

        char[]ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }

    public static String removeDuplicates(String str){

        String result="";//diğer tarafta yazacağımız kelime için bunu oluşturduk.--- aaaabbbbccc===>abc

        for (int i = 0; i < str.length(); i++) {//burada kelimeyi looplattık
            char each=str.charAt(i);//aaaabbbbccc

            if (!result.contains(""+each)){//burada da yazacağımız harflerin loop içermemesini istedil(yani tek bir harf öıksın her tekrarlı harften)
                result+=each;//eşitledik
            }
        }
        return result;
    }
}
