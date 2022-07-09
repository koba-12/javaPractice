package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers_4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("enter your first number");
            int num1 = scan.nextInt();

            System.out.println("enter your second number");
            int num2 = scan.nextInt();

            System.out.println("Addition" + (num1+num2));

            System.out.println("Would you like to continue");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))){//if the answer invalid
                System.out.println("Invalid entry");
                a = scan.next().toLowerCase();
            }
            if (a.equals("no")){
                break;//exits the loop
            }
        }




    }
}
