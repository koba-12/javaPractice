package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        /*>  :greater than
        >=: greater than or equal
        < : less than
        <= : less than or equal
        == : equal (sanırım sadece boolean için)
        != : not equal
        tüm relational operatörler booleana döndürür.boolean olarak yazılmalıdır
         */

        boolean result1 = 20>40;
        System.out.println("result1 = " + result1);//false

        boolean result2 = 300>=150;
        System.out.println("result2 = " + result2);//true

        boolean result3 = 100>=100;
        System.out.println("result3 = " + result3);//true

        boolean result4 = 300>=500;
        System.out.println("result4 = " + result4);//false

        //credit score of 720
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720;//if the credit score 720 or greater, then its eligible for loan

        boolean result5 = 100<120;// true
        boolean result6 = 200<180;//false

        int score = 59;
        boolean hasFailed = score <=59;//true
        System.out.println("hasFailed = " + hasFailed);

        System.out.println("------------------------------------");

        int x = 100;
        int y = 200;
        boolean equal = x==y;//false
        System.out.println("equal = " + equal);

        boolean result8 = "Cüneyt"=="Good Guy";
        System.out.println("result8 = " + result8);//false

        boolean result9 = "A"=="a";
        System.out.println("result9 = " + result9);//false

        boolean result10 = "Java"=="Java";
        System.out.println("result10 = " + result10);//true

        boolean result11 = "Java"=="Java    ";
        System.out.println("result11 = " + result11);//false
        //yani her yönüyle aynı olmalı eşitliğin tarafları boşluk dahi kabul edilemez

        System.out.println("--------------------");

        boolean result12 = 100 != 200;
        System.out.println("result12 = " + result12);//true

        boolean result13 = "Java" != "Break";
        System.out.println("result13 = " + result13);//true

        boolean result14= 300 != 300;
        System.out.println("result14 = " + result14);//false










    }
}
