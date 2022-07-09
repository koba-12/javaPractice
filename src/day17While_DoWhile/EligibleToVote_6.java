package day17While_DoWhile;

import java.util.Scanner;

public class EligibleToVote_6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scan.nextInt();//valid age 1-120

        while (!(age >= 1 && age <= 120)){//burada 2 parantez kullanıyoruz dikkat!!!//burada age 1-120 arası değilse hata ver kodu yazdık
            System.err.println("Invalid entry, please re-enter");
            System.err.println("enter your age:");
            age = scan.nextInt();
        }
        System.out.println("r u US citizen");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.err.println("Invalid entry please re-enter");
            System.err.println("r u US citizen");
            answer = scan.next().toLowerCase();
        }
        if (age >= 18 && answer.equals("yes")){
            System.out.println("u r eligible to vote");
        }else {
            System.out.println("u r not eligible to vote");
        }

    }
}
