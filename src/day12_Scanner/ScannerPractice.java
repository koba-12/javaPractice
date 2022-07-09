package day12_Scanner;

//import java.util.*;//wild import:imports everything from the package

import java.util.Scanner;//regular import:import one class

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //syntax of important statement: import.package.class;-----import java.util.Scanner;
        //declare: Scanner variableName = new scanner(System.in);
        // scanner methods:  nextInt()--nextDouble()---nextBoolean()---next()
        //(devam) nextLine()  ---- close()
        System.out.println("enter a number between 1 to 7:");

        int num = scan.nextInt();
        String result = "";//geçici

        if (num >= 1 && num <= 7){

            result = (num == 1)? "monday" : (num == 2)? "tuesday": (num == 3)? "wednesday": (num == 4)? "thursday"
                    :(num == 5)? "friday" : (num == 6)? "saturday" : "sunday";


        }else {
            result = "invalid number";
        }
        System.out.println(result);//tüm bunları yazınca out a sadece enter a number between 1 to 7 çıkar.
        //o yazının altına ben sayı yazarsam.(yani daha önce int vs gibi ifadelerle verdiğim cevap olması gereken sayı)
        //bana cevabı verir.(o sayıyı out toolbarına yazmam gerek)

        scan.close();//en son işimiz bitince de bunu yazıyoruz


    }
}
