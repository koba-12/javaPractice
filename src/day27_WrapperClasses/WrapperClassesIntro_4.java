package day27_WrapperClasses;

public class WrapperClassesIntro_4 {

    /*
    8 primitivesden oluşan özel classlar
    java.lang paketinde sunulmuştur
    primitive data type ı o classın bir objectine “sarmak(wrap)” için kullanılır
    primitive i objeye, objeyi de primitive e dönüştürme mekanizmasını sağlar

    -bunlarla bir ilgisi var ama öğrenicez daha dur
    Data Structures:
1. Array: supports primitives & non primitives
2. Collection: ONLY support non-primitives
3. Map: ONLY support non-primitives

slayttaki tabloya bir bakalım.primitives ler yazılmış.ve yanına da wrapper classes dönmüş halleri yazılmış.
wrapper classes a dönmüş hallerinde bütün primitiveslerin ilk harfi büyük yazılmış,yani object e döndürülmüş.
yazımdaki farkı bu.(birtek char==>Character olmuş)büyük harfle yazılmasının sebebi de javada bütün classlar büyük harfle başlar


Autoboxing converts primitiveinto wrapper class object/--autoboxing,primitivesi wrapper classa döndürür.
Unboxing converts wrapper class object into primitive--unboxing wrapper classı unboxinge döndürür.
ikisinin vs si,farkı
     */

    public static void main(String[] args) {

        int num1=200;

        Integer n1=num1;//autoboxing

        int num2=n1;//unboxing

        System.out.println("-------------------------------");

        Integer integerValue=200;

        long longVAlue=integerValue;//wrapper class, herhangi bir primitivese döndürülebilir

        Byte b1=25;

        byte a1=b1;
        short a2=b1;
        int a3=b1;
        long a4=b1;

        System.out.println("------------------------------");

        int num3=200;

        //Long l2=num3;--ancak primitives herhangi bir wrappar classa döndürülemez.

        Integer num4=num3;//autoboxing-sadece kendi türündeki(int-Integer)döndürülebilir

        System.out.println("------------------------------");

        Integer z=900;
        Integer y=z;//burada wrapper class yok sadece integerı integerı döndürdük

        System.out.println("--------------------------------------------");





    }



}
