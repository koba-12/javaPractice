package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 25 years old

        byte age = 25;

        //weight: 160 pounds
        //byte weight = 160;  // 160 is out of byte range
        short weight = 160;  // 160 is within the range of short

        int salary = 100_000; // int is the preferred data type for integer numbers // tam sayılar

        long asset = 3_333_333_333L;

        //tax: 0.26
        float tax = 0.26F;

        double PI = 3.14; // ondalık sayılar


        //#

        char ch1 = '#';      // tek kesme işareti kullanılır. // single karakterler (işaretler)
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        // ascii table da # işareti 35 sayısına denk geliyor.asciide her sayı bir işarete denk gelir.tek soruluk cevaplar vs

        char grade = 'F';
        char yesNo = 'Y';
        System.out.println(yesNo);



        boolean isEmployeed = true; // doğru yanlış için kullanılır.
        boolean isMarried = false;

        boolean result = 100 > 300;
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("result = " + result);







    }


}
