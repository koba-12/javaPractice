package day12_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the radius of the circle");//out da bunu altındaki boşluğa r=değer yazıyoruz

        double r = input.nextDouble();//üstte scannerla başlayan blokta scannerın yanında ne yazıyorsa burada da o yazmalı (input)

        double area = r * r * 3.14;
        double perimeter = 2 * r *3.14;

        System.out.println("area = " + area);//r= değer yazınca bu ve altındaki soutun cevabı çıkıyor
        System.out.println("perimeter = " + perimeter);

        input.close();
    }
}