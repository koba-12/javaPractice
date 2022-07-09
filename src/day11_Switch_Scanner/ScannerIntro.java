package day11_Switch_Scanner;

import java.util.Scanner;//scanner bu şekilde yapılıyor.oackage ve class arasına bunu yazıyoruz yani import ediyoruz

public class ScannerIntro {

    public static void main(String[] args) {

        /*
        girdi almak için yöntemler sağlar
        java.util paketinde sunulur
        import edilmesi gerekir
        kullanılmnadan önce somutlaştırılmalı???

        Scanner keyboard = new Scanner (System.in);
         */

        Scanner input = new Scanner(System.in);//başa scannerle şeyi yazmayıp buraya direkt scanner yazarsak baştaki
        // oto çıkıyor
        //out un altında yazan  process finished with exit code 0 yazmaz.oraya bir şeyller yazabiliyoruz.


        /*System.out.println("enter an integer:");// önce bu çıkıyor başka bir şey yok.

        int num1 = input.nextInt();//üsttekinin altına bunun değerini yazıp space yapıyoruz
        System.out.println("enter a decimal : ");//spaceden sonra bu çıkıyor

        double num2 = input.nextDouble();//üsttekinin altına bunun değerini yazıyoruz
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("multiplication" + (num1*num2));

         */
    }
}
