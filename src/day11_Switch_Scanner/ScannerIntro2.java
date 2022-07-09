package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//scanner intro 2 açmamın sebebi hata almamdı.ondalık sayılarda nokta
        //yerine virgül kullandım ve sroun çözüldu

        System.out.println("Enter an integer:");

        int num1 = input.nextInt();

        System.out.println("Enter a decimal:");

        double num2 = input.nextDouble();


        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: " + (num1*num2));





    }
}
