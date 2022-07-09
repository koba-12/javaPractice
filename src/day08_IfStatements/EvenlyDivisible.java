package day08_IfStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {

        int number = 100;

        boolean divisibleBy2 = number % 2 == 0;//true
        boolean divisibleBy3 = number % 3 == 0;//false
        boolean divisibleBy5 = number % 5 == 0;//true

        System.out.println(number + " is divisible by 2: " + divisibleBy2);
        System.out.println(number + " is divisible by 3: " + divisibleBy3);
        System.out.println(number + " is divisible by 5: " + divisibleBy5);

        int year  = 2000;
        boolean leapYear = year % 4 == 0;
        System.out.println(year + " is leap year: " + leapYear);

    }
}
