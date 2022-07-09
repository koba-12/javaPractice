package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {

        //substring()  =  alt dize demek---substring(beginning index, ending index)
        //ending index her zaman hariç tutulur!!!


        String word = "Cydeo School";//sanırım burada kelime kelime out alıyoruz.
        String brand = word.substring(0, 4+1);//ilk index no her zaman 0 olduğundan 0 yazdık.
        // cydeo nun son index number 4 olduğundan 4 yazdık.(+1 sanırım boşluk için emin değilim henüz)
        System.out.println("brand = " + brand);//cydeo

        String str1 = word.substring(6);//buraya da school un s sinin indexini yazdık oto school verdi.anlamaya çalışıyorum
        System.out.println("str1 = " + str1);

        System.out.println("-----------------------------------------");

        String word2 = "Java Programming Language";

        String s1 = word2.substring(0 , word2.indexOf(" "));//0 index ile ilk space arası yani.lastIndexof tan ilk boşluğu seçmiş olduk
        String s2 = word2.substring(word2.indexOf(" ")+1 , word2.lastIndexOf(" "));
        //burada da ilk boşlukla ikinci boşluk arasını seçmiş olduk.+1 "P" için
        String s3 = word2.substring(word2.lastIndexOf(" ")+1);//son harfi için yani aralık için ardına bir şey koymak gerekmez burada
        //burada da son spacein +1 i yani "L" koymuş olduk ve language verdi
        //yani burada word2.lastIndexOf(str: " ")+1 eşittir "L" nin index sayısı ve "L" alınca da komple language out olur

        System.out.println(s1);//Java
        System.out.println(s2);//Programming
        System.out.println(s3);//Language
    }
}
