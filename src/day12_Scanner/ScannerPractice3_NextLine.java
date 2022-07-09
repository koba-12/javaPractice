package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//nextLine() - tüm girdiyi yeni satıra kadar okur

        System.out.println("enter your full name");//cüneyt yılmazenter
        String fullName = input.nextLine();

        System.out.println("enter your programming language");//wooden spoonenter
        String programming = input.nextLine();

        System.out.println("enter your age");//25enter
        String age = input.nextLine();//dikkat! burada sayı değeri girmemize rağmen string yazdık.Çünkü nextline method
        //sadece string olarak kullanılabilir.buraya int veya nextint yazamayız

        System.out.println("enter your school name");//egeenter
        String schoolName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        //bu şekilde outta çıkan boşluklara istenileni yazıyoruz ve her satırda diğer çıktıya geçiyor. yazdıktan sonra cevabı veriyor
        //herhangi birine bir şey yazmayıp o satırı atlarsak örn school name e bir şey yazmazsak (schoolName = ) şeklinde çıkar
        //sout yazmadan nextLine() method uygularsak boş geçer atlar onu


    }
}
