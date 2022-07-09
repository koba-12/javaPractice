package day17While_DoWhile;

import java.util.Scanner;

public class Calculator_5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator");
        char ch = scan.next().charAt(0);//bunlar zaten klasik scanner kodları

        while (!(ch == '+' || ch == '-')){//eğer(if) "+" veya "-" değilse girilen karakter aşağıdaki gibi yazacak ve tekrar girme şansı sağlayacak
            //yani tanımda yazdığım gibi false olunca loop durur.tekrar sorar
            System.err.println("Invalid operator, please re-enter");//adı üstünde hatalı giriş vs gibi durumlar için
            //doğru koşul yani "+" veya "-" yazana kadar bu sotuyu tekrarlar
            ch = scan.next().charAt(0);//bunlar zaten klasik scanner kodları
        }
        System.out.println((ch == '+')? num1+num2 : num1-num2);//burada da kısaca yazılan işaret "+" ise toplama "-" ise çıkarma yapması istenmiş
    }
}
