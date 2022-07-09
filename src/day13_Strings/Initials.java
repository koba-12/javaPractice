package day13_Strings;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your first name");
        String firstName = scan.next();

        System.out.println("enter your last name");
        String lastName = scan.next();

        char f = firstName.charAt(0);
        //buradaki 0 sayısı outtaki örneğin "enter your first name" kısmına yazacağımız cevabın index numarasıdır
        // yani ben outtaki "enter your first name" kısmına cüneyt yazacağım için bana cevap olarak "cüneyt" 0 index sayısı olan "c" harfini verir
        char l = lastName.charAt(0);//bu da last name in index sayısı buradan da yılmaz ın y sini verir
        //0 koyunca baş harf verdi başka sayı koysak başka harfler verirdi

        String initial = f + "." + l;//"" işareti koyulmak zorunda.hiçbir şey olmasa bile en başa koyulmalı

        System.out.println("initial = " + initial);//cevap: initial = c.y olarak çıkar

        scan.close();
    }
}
