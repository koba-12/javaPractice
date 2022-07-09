package day13_Strings;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        //charAt() = verileni chara döndürür

        String word = "Cydeo";
          //index =    01234

        char thirdChar = word.charAt(3);//buraya cydeonun index sayılarından büyük sayı yazılamaz hata verir
        // yani buraya en fazla "4" e kadar yazılabilir(cydeoözelinde)
        //buradaki 3 sayısı word yani cydeo nun 3 numaralı harfini out olarak verir.böylece out a "e" çıkar
        System.out.println("thirdChar = " + thirdChar);

        char tenthChar = word.charAt(4);//9 yazarsam hata verir çünkü "word" ümüz yani "cydeo" 4 indexli yani range dışı
        System.out.println("tenthChar = " + tenthChar);


        System.out.println("----------------------------------");

        //lenght() toplam karakter sayısını döndürür.int e döndürür.int kullanılmalı

        String s1 = "Batch 25 is the best batch.";// buradaki toplam character sayısını verir("" içini sadece)

        int totalCharacters = s1.length();
        System.out.println("totalCharacters = " + totalCharacters);//27

        char lastChar = s1.charAt( s1.length() -1);//s1.length() total karakteri verir yani.
        // -1 yapınca da en son karakteri verir yani cevap "." çıkar//last index number = lenght()-1
        System.out.println("lastChar = " + lastChar);


        System.out.println("-----------------------------------");

        //toUpperCase()  bu kolay en başa yazdığımız "" işareti içindeki kelimeyi full büyük harf yapıyor.
        // int,String vs gibi özel bir ifade kullanmak gerekmez
        // toLowerCase = aynısının küçük harflisi

        String str = "wooden spoon";
        str = str.toUpperCase();

        System.out.println("str = " + str);//yalnızca str yazsak da olur. bunda "str =" yazar sadece str de ise
        // direkt cevap yazar yani WOODEN SPOON



        String s = "JAVA";
        s = s.toLowerCase();

        System.out.println(s);//bunda direkt java çıkar


    }
}
