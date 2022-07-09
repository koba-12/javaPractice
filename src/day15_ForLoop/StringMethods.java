package day15_ForLoop;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        //isEmpty() Stringdeki boş mu dolu mu onu söyler.true or false çıkar cevap.o yüzden boolean kullanılır

        String str = "";

        boolean r = str.isEmpty();
        System.out.println(r);

        //isBlank() = boşluk demek.string içinde boşlyk var mı yok mu öne söyler bu da true or false verir.boolean kullanılır
        //kelime arası boşluk varsa false çıkar
        boolean r1 = str.isBlank();
        System.out.println(r1);


        System.out.println("-----------------------------------");

        //equalsIgnoreCase :ignore = görmezden gelme,yoksayma//// case=durum,dava,dosya,olay
        //küçük büyük harf uyumsuzluğunu görmezden gelir
        //YES,yes,Yes,YEs,yEs gibi

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("yes".equals("yEs"));//false
        System.out.println("yes".equalsIgnoreCase("yEs"));//TUE

        System.out.println("---------------------------------------");

        //contains() : içerir demek.bu da true or false verir.boolean kullanılır

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");//yani diyorki string içindeki cümle C# içerir mi.cevap hayırdır outa false çıkar
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");//üstteki cümle full küçük harfli "java" içeir mi? cevap true
        boolean r3 = sentence.contains("java") || sentence.contains("Java");

        System.out.println(hasCSharp);//false
        System.out.println(hasJava);//true
        System.out.println(hasJava2);//false(ilk harf küçük çünkü)
        System.out.println(hasJava3);//true
        System.out.println(r);//true


        System.out.println("--------------------------------");

        String input = "I love Java";
        String input2 = "Java";

        System.out.println(input.equals(input2));//false
        System.out.println(input.equalsIgnoreCase(input2));//false
        System.out.println(input.contains("Java"));//true




        /*String input = "I love jAvA";
        String input2 = "Java";

        System.out.println(input.toLowerCase().contains("java"));//true çıkıyor kuralı bu sanırım
        System.out.println(input.toUpperCase().contains("JAVA"));//true çıkıyor kuralı bu sanırım
        ANLADIĞIM KADARIYLA BİR ÜSTTE YAZDIĞIM SON 2 SOUT EQUALSIGNORECASE İN BAŞKA BİR YOLU

         */

        System.out.println("-----------------------------------");

        /* starsWith() burada diyorki en baştaki cümle () içindekiyle mi başlıyor(büyük küçük harf dikkat).
        out a true or false çıkar.boolean kullanılır
        endsWith() = bu da aynısının başlangıç olanı değil bitiş olanı.true or false çıkar boolean kullanılır
         */

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");//true
        boolean y = a.endsWith("Spoon");//true
        boolean z = a.toLowerCase().startsWith("wooden");//true//büyük harf duyarlılığını yoksaymak için önce lowerCase(),upperCase() yapıyoruz.
        //parantez içinde küçük harf varsa lowerCase(),büyük harf varsa upperCase() kullanırız.yani neyse o
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
