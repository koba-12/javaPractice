package day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class NestedLoopPractice_5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){//enter your age loop u için yazdık

            System.out.println("enter your age");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)){//while the age is invalid-1-120 arası değilse entry,aşağıdaki out looplar
                System.err.println("Invalid entry, please re-enter your age");
                age = scan.nextInt();
            }
            System.out.println("would you like to continue");//entryden sonra bu sorulur
            String a =scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))){//eğer cevap yes or no değilse aşağıdaki out olur.doğru cevap verene kadar looplar
                System.err.println("Invalid entry, please re-enter.Would you like to continue");
                a = scan.next().toLowerCase();// üstteki String a =scan.next().toLowerCase(); ile aynı olduğundan String yazmadık
            }

            if (a.equals("no")){//ve cevap no ise döngüyü kırar
                break;
            }
        }
        scan.close();
    }
}
