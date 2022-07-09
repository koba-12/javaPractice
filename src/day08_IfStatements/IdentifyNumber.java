package day08_IfStatements;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = 200;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;// == olmak zorunda

        System.out.println(number + " is positive number: " + isPositive);//true
        System.out.println(number + " is negative number: " + isNegative);//false
        System.out.println(number + " is zero: " + isZero);//false
    }
}
