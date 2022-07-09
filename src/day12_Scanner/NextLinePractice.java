package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//enter???

        System.out.println("enter your age");//25
        int age = input.nextInt();

        input.nextLine();//gördüğümüz gibi üstte String değil de başka bir method olduğu için araya bunu koyduk(altına)

        System.out.println("enter your full name");//cüneyt
        String  fullName = input.nextLine();

        System.out.println("enter your GPA");
        double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("enter your school name");
        String schoolName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);

        input.close();


    }
}


/*
1-ask the user to enter age (nextInt())
2-ask the user to enter full name (nextLine())
 */
