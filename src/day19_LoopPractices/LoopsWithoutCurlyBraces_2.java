package day19_LoopPractices;

public class LoopsWithoutCurlyBraces_2 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++)
            System.out.println("cydeo");

        for (int i = 0; i < 5; i++)
            System.out.println("batch 25");
//eğer curly bracesler olmazsa tek tek böyle yazmam gerekir.
//üstteki gibi yazmaktansa alttaki gibi kısaca yazmamızı sağlar curly braces

        for (int i = 0; i < 5; i++) {
            System.out.println("cydeo");
            System.out.println("batch 25");
        }


    }
}
