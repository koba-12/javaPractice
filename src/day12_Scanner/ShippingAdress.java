package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your full name");
        String name = scan.nextLine();

        System.out.println("enter your building number");
        String building = scan.next();

        scan.nextLine();//next() ten sonra da bunu yazmamız gerekir

        System.out.println("enter your street name");
        String street = scan.nextLine();

        System.out.println("enter your city name");
        String city = scan.nextLine();

        System.out.println("enter your state");
        String state = scan.next();


        System.out.println("enter your zip code");
        String zipCode = scan.next();

        scan.nextLine();//state deki de next() olduğu için ikisinin yerine sadece bunu yazdım ve geçerli oldu.

        System.out.println("name = " + name);
        System.out.println("building = " + building);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);

        scan.close();


    }
}
