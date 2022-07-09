package day09_IfStatements;

public class IfElseStatementsLeapYear {
    public static void main(String[] args) {

        /*
        if else de is durum farklı hava soğuk mu sorusuna cevap evet ise mont giy ceket giy gibi yanıtlar alırız
        ama cevap hayır ise tişört giy gibi yanıtlar alırız (single if de cevap hayır isee yanıt yani out almıyorduk)
        !!!düzeltme yapıyorum burada da out almıyoruz.burayı sadece 2 cevaplı olduğunda kullanıyoruz!!!
        if & else sadece iki olasılık olduğunda kullanılır yani en fazla 2 koşul olmalıdır
        yani şu şekilde formülize edebiliriz:

        if(condition){
           statementA
        } else { // otherwise
             statementB
        }
        statementA = koşulun doğru olması gerekiyorsa(koşul doğru olmalı da olabilir emin değilim)
        statementB = koşulun yanlış olması gerekşyorsa(koşul yanlış olmalı da olabilir)
        yes or no -- pass or fail ---- married or not married   gibi

         */

        int year = 2000;
        boolean leapYear = year % 4 == 0;

        if (leapYear){
            System.out.println(" Year " + year + " is a Leap Year ");//burada sadece 2000 is leap year çıkar.
        }
        if (!leapYear){
            System.out.println(" Year " + year + " is not a leap year ");//bu çıkmaz çünkü bu single if
        }

        System.out.println("-----------------------------");

        if (leapYear){
            System.out.println(" Year " + year + " is a leap year ");
            // bu denklemde de sadece year 2000 is leap year çıkar.
        }else{
            System.out.println(" Year " + year + " is not a leap year ");
            // buranın outu olmaz else in kullanılma sebebi sadece 2 cevaplı soru olması yani
            // leap year ya da not leap year
        }
    }
}
