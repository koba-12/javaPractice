package day42_Exceptions;

import java.util.Scanner;

public class ThrowVsThrows_8 {

    public static void main(String[] args) {

        System.out.println("enter ur score");
        int score =new Scanner(System.in).nextInt();

        if (score<0||score>100){
            throw new RuntimeException("invalid score "+score);//conditiona uymazsa hata kodu verecek
        }
        if (score>=90){
            System.out.println("A");
        }else if (score>=80){
            System.out.println("B");
        }else if (score>=70){
            System.out.println("C");
        }else if (score>=60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
    public static void method1() throws InterruptedException{
        Thread.sleep(5000);
    }
//biri methodun yanına yazılır diğeri ise method bodye yazılır.
}
