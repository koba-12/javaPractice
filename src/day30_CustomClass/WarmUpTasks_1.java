package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks_1 {

    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers,0,numbers.size()-1);
        //Collection data structure, data storedur
        //Collections ise utility classtır.karışmasın

        System.out.println(numbers);//1 ve 8 yer değiştirmiş oldu

        System.out.println("------------------------------------------");

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println(list);

        int size=list.size();

        list.removeAll(Arrays.asList(0));

        System.out.println(list);

        int newSize=list.size();

        int totalNumberOfZeros=size-newSize;//4

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);//4

        for (int i = 0; i < totalNumberOfZeros; i++) {//totalNumberOfZeros(4) kadar looplatıp her loop için
            list.add(0);//bir tane 0 ekledik
        }
        System.out.println(list);//[1, 2, 3, 4, 0, 0, 0, 0]

        System.out.println("-------------------------------------------------");

        //üsttekinin başka yöntemi

        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer>result=new ArrayList<>();

        for (Integer each : list2) {//list2 yi loopluyoruz ve 0 a eşit olmayan her elementi resulte alıyoruz
            if (each!=0){
                result.add(each);
            }
        }

        for (Integer each : list2) {//burada da yine list2 yi looplatıp bu sefer de 0 a eşit olanları aldık.
            if (each==0){
                result.add(each);
            }
        }
        System.out.println(result);//[1, 2, 3, 4, 0, 0, 0, 0]
        //sanki bu yöntemi daha kolay anladım gibi

        System.out.println("------------------------------------------------------");

        //harf,sayı,char ayırmam isteniyor

        String str="ABCD123$%#@&456EFG";

        ArrayList<Character>chars=new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {//str yi loopa aldık
            chars.add(str.charAt(i));//herbirini chars a ekledik.
        }
        ArrayList<Character>letters=new ArrayList<>(chars);//add all the characters
        letters.removeIf(p-> !Character.isLetter(p));//harf olmayanları çıkardık

        System.out.println("letters = " + letters);//letters = [A, B, C, D, E, F, G]



        ArrayList<Character>digits=new ArrayList<>(chars);//add all the characters
        digits.removeIf(p-> !Character.isDigit(p));//sayı olmayanları çıkardık

        System.out.println("digits = " + digits);//digits = [1, 2, 3, 4, 5, 6]



        ArrayList<Character>specialChar=new ArrayList<>(chars);//add all the characters
        specialChar.removeAll(letters);//buralarda tekrar üstte yaptığım gibi de yapabilirim ancak bu da farklı bir yöntem
        //en sona bu kaldığı için direkt diğerlerini removeAll yapıyorum.(ya da dur altta örnek yapayım)
        specialChar.removeAll(digits);
        //specialChar.removeIf(p->Character.isLetterOrDigit(p)); böyle de yazabiliriz

        System.out.println("specialChar = " + specialChar);//specialChar = [$, %, #, @, &]
    }
}
