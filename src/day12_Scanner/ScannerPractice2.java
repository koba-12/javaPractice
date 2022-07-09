package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //nextBooleanda ise sadece true or false yazabiliriz
        //next() işleyeceğiz --girdiyi yalnızca sıradaki space e kadar okur
        System.out.println("enter your name");
        String name = input.next();//outtan çıkan bölüme isim olarak(yani kelime) boşluk bırakmadan istediğimiz kadar keime yazabiliriz.
        //ama boşluk koyarsak sadece boşluk öncesini alır.space öncesineki alt tire slash vs gibi işaretleri de okur.
        System.out.println("name = " + name);

        input.close();
    }
}
