package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice4 {
    public static void main(String[] args) {

        //bunu kendim açtım practice3 ün kopyası .diğerindeki notları da kopyaladıktan sonra buradan sildim karışmasın diye
        // ek yapmak için çünkü diğerinde karışacaktı

        Scanner input = new Scanner(System.in);

        System.out.println("enter your full name");
        String fullName = input.nextLine();

        System.out.println("enter your programming language");
        String programming = input.nextLine();

        System.out.println("enter your age");
        int age = input.nextInt();//eğer buraya int olarak girersek school name e bir şey yazamayız outta

        input.nextLine();//o yüzden dolayı bunu yazmamız gerekir.
        //yani farklı method yazarsak nextline ın arasına(int,double,boolean vs) sonrasında yeni satıra geçip bunu yazmalıyız

        System.out.println("enter your school name");
        String schoolName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
    }
}
