package day13_Strings;

public class StringIntro {

    public static void main(String[] args) {

        /*
        karakter dizelerini temsil eden bir nesne
        dize değişmezdir,nesne oluşturduktan sonra değiştirilemez
        string nesnesi oluşturmanın iki yolu vardır : 1-by string literal 2- by new keyword
        string literal "" ile oluşturulur,dize havuzu denen özel bellekte oluşturulur
        new keyword : yığında yeni farklı obje oluşturur

        string methodları
        charAt(),toUpperCase(),lastIndexOf(),substring(),isBlank(),contains(),lenght(),trim(),replace(),repeat()
        equals(),startsWith(),toLowerCase(),indexOf(),replaceFirst(),isEmpty(),equalsIgnoreCase(),endsWith()

        java.lang packge inde sunulur
        java. lang paketindeki herhangi bir class dolaylı olarak içe aktarılabilir

        ÖNEMLİ NOT!!! şimdi şöyleki örneğin: String s1="cat"yazınca (yani şimdiye kadar hep yazdığımız gibi
        var olan String havuzundan bu "cat" kelimesini alıyor ve elle manuel yazsak bile oraya onu işliyor.java programı işliyor bunu
        ancak String s3 = new String ("cat"); şeklinde yazarsak java bize bu String havuzunun dışından yeni bir "cat" getiriyor.
        zaten new string ve new keyworld kelimeleri de aslında bize yardımcı oluyor anlam çıkarabiliriz.
        javanın bilgi yığınını(heap) bir küme olarak düşünelim. String pool java kümesinin içinde başka bir küme
        String s1 = "cat" deki cat bu kümeden alınıyor
        new stringli denklemdeki cat ise bu string pool kümesinin dışından ama java kümesinin içinden yeni oluşturuluyor(her ne kadar aynı kelime olsa da)
        ve her yeni String s3 = new String("cat") yazdığımızda yeniden oluşturuluyor yani şu şekilde denklem yapabiliriz.

        String s1="cat" /  String s2 ="cat"  /  String s3 = new String ("cat")   /    String s3 = new String ("cat") catin önündeki original i de unutmayalım"" yapınca geliyor direkt
        s1==s2//true            s1==s3//false               s3==s4//false

        object oluşturulduktan sonra değiştirilemez???
         */

        //string literal

        String name = "Wooden Spoon";//only one diyip durdu tam anlamadım
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";

        System.out.println(name == name2);//true
        System.out.println(name2 == name3);//true
        System.out.println(name3 == name4);//true


        System.out.println("--------------------------------------------");

        //new keyword

        String str1 = new String("Wooden Spoon");//parantez içine "" koyuunca original oto çıkıyor
        String str2 = new String("Wooden Spoon");
        //son ek: kodu bu şekilde yazınca yeni bir object oluşturmuş oluyor.yani yeni bir sayfa açıyor o yüzden eşiy değil
        String str3 = new String("Wooden Spoon");
        String str4 = new String("Wooden Spoon");

        System.out.println(str1 == str2);//false //sanırım kodu bu şekilde yazınca false oluyor eşit değil yani
        System.out.println(str2 == str3);//false
        System.out.println(str3 == str4);//false

        System.out.println("-----------------------------------");

        //equals methodu boolean kullanır

        String s1 = "Java";//yani bu
        String s2 = new String("Java");//ve bu eşitmiş

        System.out.println(s1.equals(s2));//bunun yazma formatı budur eşitlik demek zaten biliyorsun ve cevap true çıkar

        String s3 = "Java";
        String s4 = new String("java");

        System.out.println(s3.equals(s4));//false çünkü 2. ifadede j küçük harf yani eşit (equals) değil

        System.out.println("-------------------------------------------");

        /*
        index numbers

        dizedeki(stringdeki) her karakterin bir index numarası vardır
        index numbers sıfırdan başlar

        String str = "Java !";
        //index =     012345  //üsttekinin altına not bu satır
         */





    }
}
