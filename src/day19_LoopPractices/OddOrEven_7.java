package day19_LoopPractices;

import java.util.Scanner;

public class OddOrEven_7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("enter a number");
            int num = scan.nextInt();

            if (num %2 == 0){
                System.out.println("even number");
            }else {
                System.out.println("odd number");
            }

            System.out.println("would you like to another number (yes/no");
            String a = scan.next();//string için next() kullanılır.(sınavdan bilgi)

            if (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))){
                System.err.println("invalid entry");
                System.exit(0);//cevap yes or no değilse direkt programı durduruyor.loopsuz hali gibi düşün
            }
            if (a.equalsIgnoreCase("no")){
                System.out.println("thank you");
                break;

            }
        }
    }
}
