package day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword_6 {

    public static void main(String[] args) {

        System.out.println("enter your age");//-20
        int age=new Scanner(System.in).nextInt();

        if (age<0){
            throw new InputMismatchException("age can not be negative");
//alttaki koşulla ters düşeceği için buraya normalde serr,sexit vs yazardık ama onun yerine throw keyword kullandık.
//0 dan küük değer girince InputMissMatch hatası veriyor.(parantez içiyle birlikte)
        }

        if (age>21){
            System.out.println("u r eligible");
        }else {
            throw new RuntimeException("u must be at least 21 years old.");
//yahut bu şekilde elsete de kullanılabilir.21den küçük sayı girince RuntimeException hatasıyla birlikte parantez içini verir.

        }
    }
}
