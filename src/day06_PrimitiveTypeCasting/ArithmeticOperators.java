package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(10 + 20);// addition //in java.... in kelime ....da anlamı verir unutma
        System.out.println("10" + 20); //concatenation (birleştirme) tırnak içine alırsan toplamazonun yerine
        //iki sayının birleşimi out olur.yani buradan 1020 çıkar.
        System.out.println(100 - 50); //substraction
        System.out.println(10 * 6);//multiplication

        //in math 10/4=2.5
        //in java 10/4=2
        //bu yüzden şu şekilde yazmam lazım (10.0/4=2.5)
        // böyle yaparak "int" olan 10 sayısını "double" a dönüştürüyoruz.
        System.out.println(10.0 / 4);
        System.out.println(10 / 4.0);// her iki şekilde de olur burada amaç sayıları ondalık sayı yani "double" yapmak.
        System.out.println(10d / 4);// bu da bir yöntem olmasa da olur kenarda dursun
        /*kısaca formülize edersek
        integer/integer=integer
        decimal/integer=decimal
        integer/decimal=decimal
        decimal/decimal=decimal

        not:integer(tam sayı)--- decimal(ondalık sayı)
        not2: /* işareti ile not yazacağım büyük bir alanı kullanabilirim // işareti gibi tek satırlık değil,alanlıktır.

         */

        int a = 100;
        double b = a/6; //16 çıkar
        System.out.println(b);

        //double c = a/6.0; // 16.66666.... çıkar// a.0/6 denedim olmadı
        double c = (double)a/6; // böyle de oluyor
        System.out.println(c);

        //son bir ek
        System.out.println(100d); // d harfi .0 olarak çıkıyor

    }
}
