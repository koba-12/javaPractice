package day08_IfStatements;

public class SingleIfStatements {
    public static void main(String[] args) {

        //if ifadesi bir koşulu değerlendirir--
        // koşul doğru olarak değerlendirilirse, sonraki kod bloğundaki tüm ifadeler yürütülür
        // single if şu şekilde işler=
        // hava soğuk mu? evet ise mont giy ceket giy gibi cevaplar gelir.eğer hayır ise cevap gelmez yani
        // out olarak bir şey çıkmaz.diğer if lerde durum farklı onları orada yazacğım

        int number = 300;
        boolean evenNumber = number%2 == 0; //even number çift sayı demek
        boolean oddNumber = ! evenNumber; // direkt even number ın olumsuzu yaptık kısaca
        // çünkü zaten bir sayı ya tek sayıdır ya da çift

        if (evenNumber){ // if den sonra bu işaret koyulmalı (alt+7)
            System.out.println(number + " is even number ");// burada 300 is even number çıkar
            //eğer 300 yerine 301(tek sayı) yazıp run yaparsak hiçbir şey yazmaz çünkü 301 çift sayı değil ve
            //if ifadesi bize bunu sağlar
        }
        if (oddNumber){
            System.out.println(number + " is odd number ");//buradan bir şey out olmaz çünkü yanlış ifade
            //1 olası sonuç için durum yaratmak için kullanılabilir yani 1 olası sonuç çıkar

            System.out.println("----------------------------------------");

            //multi-branch

            int n = 200;

            //positive
            if(n > 0){
                System.out.println(n+ " is positive");
            }
            //negative
            if (n < 0){
                System.out.println(n + " is positive");
            }
            //zero
            if (n == 0){
                System.out.println(n + " is zero ");
            }
        }


    }
}
