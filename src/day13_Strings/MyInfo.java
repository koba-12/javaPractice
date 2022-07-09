package day13_Strings;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your age");
        int age = scan.nextInt();

        System.out.println("enter your gender");
        String gender = scan.next();

        scan.nextLine();//enterenter

        System.out.println("enter your full name");
        String fullName = scan.nextLine();

        System.out.println("enter your phone number");
        long phoneNumber = scan.nextLong();

        System.out.println("enter your zip code");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("enter your school name");
        String schoolName = scan.nextLine();

        System.out.println("enter your city name");
        String cityName = scan.nextLine();

        System.out.println("enter your state name");
        String stateName = scan.next();

        System.out.println("enter your building number");
        int buildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("enter your street name");
        String streetName = scan.nextLine();

        scan.close();

        System.out.println("fullName = " + fullName);//outta çıkana yazma sırası yine üstteki sıraladığım sıra
        //ancak cevap sırası altta sout ta yazdığım sıra olur
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("adress \n\t" + buildingNumber + " " + streetName + "\n\t" + cityName + ", " + stateName + " " + zipCode);
        System.out.println("schoolName = " + schoolName);




        /*
        reate a class called MyInfo. Write a program that can ask the
user to:
1. Enter your age (int)
2. Enter your gender (String- One word ONLY)
3. Enter your full name (String- Multiple
words)
4. Enter your phone number (long)
5. Enter your zip code (int)
6. Enter your School name (String- Can be
Multiple words)
7. Enter your city name (String- Can be
Multiple words)
8. Enter your state name (String- One word
ONLY)
9. Enter your building number (int)
10. Enter your Street name
MAKE SURE USER CAN ENTER ALL THE INPUT
Display all the inputs that user entered in following//bu şekilde bu sırayla yazın diyor(alttaki)
order in sperate lines:1. full name
2. age
3. gender
4. phone number
5. address:
                    buildingNumber Street
                    City, State ZipCode
6. school name
         */
    }
}
