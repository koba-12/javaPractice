package day14_String;

public class StringMethods {

    public static void main(String[] args) {

        //trim()   string kullanır.spacei de karakter olarak alır

        String str1 = "      Batch 25      ";
        str1 = str1.trim();//normalde üstteki "" içi baştaki ve sondaki boşluklarla birlikte out olur
        // ama trim methoduyla baştaki ve sondaki boşlukları almaz.(ortadaki boşluğu alır,birden fazla boşluk olsa bile)
        System.out.println(str1);

        System.out.println("-------------------------------------");

        //indexOf()   int kullanır.
        // bunda parantez içine sayı değil harf yazılır.harf üstte "" işareti içindeki cümleden olmalıdır.
        //out olarak, yazılan harfin index numberını verir

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");

        System.out.println("n1 = " + n1);// n1 = 8 çıkar yani h harfinin "cydeo school" daki index numberı

        int n2 = str2.indexOf("o");
        System.out.println("n2 = " + n2);//burada ilk "o" yu alır.diğer "o" ları için ne yaptığımıaz aşağıda

        int n3 = str2.indexOf("ool");//eğer sadece "ol" yazarsam da 3. o yu verir ve öyle de cevap 10 çıkar
        //yani sağındaki harfi de koyuyoruz birden fazla aynı harf varsa
        //eğer sağındaki harf de kendinin aynısıysa bir sağ daha kayıyoruz.
        System.out.println("n3 = " + n3);//burada cümledeki 2. "o" yu alır.cevap 9 çıkar

        String str3 = "Java Programming Language";

        int n4 = str3.indexOf("a ");//sağından "apace" var onu koyduk
        System.out.println("n4 = " + n4);//3

        int n5 = str3.indexOf("gu");
        System.out.println("n5 = " + n5);
        
        //lastIndexOf   en sondan başlar yani index sayısı yine aynı ama örneğin sadece "g" yapınca en sondaki "g" yi verir

        int n6 = str3.lastIndexOf("g");
        System.out.println("n6 = " + n6);

        String s = "Java Nova Cava Wawa Orange";

        int firstA = s.indexOf("a");//1
        int lastA = s.lastIndexOf("a");//22
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        int fourthA = s.lastIndexOf("av");//sondan başlarken ilk "av" bu olduğu için doğru olur
        //int fourthA = s.indexOf("Ca") + 1; bu şekilde de 4. a nın index numarasına ulaşabiliriz
        int fifthA = s.lastIndexOf("aw");

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);




    }
}
