package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        //sum toplam demek

        int sum = 0;//rastgele bir değer verdik
        for (int i = 0; i < 101; i++) {//fori kısayolunu yazdık bu loop satırını oto verdi(üstte değer olduğu için)
            //sadece 101 sayısını vermedi onu biz yazdık.(sadece<olduğundan 100 değil 101)
            sum += i;//buraya bunu yazmamız lazımdı---+= ile toplam sonucu verdi yani 0-101 arası tüm sayıların toplamını
        }
        System.out.println(sum);//bunu da curly brace dışına yazdık tek tek sayıları değil direkt toplamını vermesi için

        System.out.println("-------------------------------");

        int total = 0;//rastgele sayımızı atadık(genelde 0 olur)
        Scanner scan = new Scanner(System.in);//scannerdan yapmak için bunu yazdık

        for (int i = 0; i < 5; i++) {//fori yazarak oto bunu aldık.boşluğa 5 yazdık(istediğimiz 5 sayıyı toplamak için)
            System.out.println("Enter a number");//scannner için bunu yazdık
            total += scan.nextInt();//Scannera çıkacak 5 "enter a number" a yazacağımız sayıları toplamak için bunu yazdık
            //kural bu.bu şekilde 0-5 arasını out almak yerine hepsini toplamış oluyoruz += işareti sayesinde.
        }

        System.out.println("total = " + total);//en son da yazdığımız sayıların toplamı bunun sayesinde total=... oluyor

        scan.close();
    }
}
