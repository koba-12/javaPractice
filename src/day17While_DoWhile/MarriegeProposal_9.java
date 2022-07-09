package day17While_DoWhile;

import java.util.Scanner;

public class MarriegeProposal_9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me? yes/no");
        String a =scan.next().toLowerCase();

        while (!(a.equals("yes")|| a.equals("no"))){
            System.out.println("Invalid answer,please re-enter");
            a = scan.next().toLowerCase();//sanırım toLowerCase yazmamızın sebebi büyük küçük harf farklarını görmezden gelmesi
        }
        if (a.equals("yes")){
            System.out.println("Congrats");
        }else {
            System.out.println("Goodbye");
        }
        scan.close();
    }
}
