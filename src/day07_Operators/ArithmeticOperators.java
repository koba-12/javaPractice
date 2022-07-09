package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        // % işaretinin formülü =  ---- remainder=numerator -(denominator*result)
                                       //kalan = pay-(payda*sonuç)
        //     45/8=5.625       ----   45-(8.5)=5 olur. yani 45 % 8 = 5

        int num1 = 10;
        int num2 = 3;

        int division = num1/num2;//bölme değişkeni num1 in num2 ye bölünmesinin sonuçlarını içerir
        int remainder = num1 % num2;//remainder variable contains the remainder of num1 divided by number????
        //10 bölü 3 = 3 tür. kalan 1 dir

        System.out.println(num1 + " divided by " + num2 + " is equal to " + division + " with a remainder of " + remainder);

        /*
        arithmetic operators:
        +    addition
        -    substraction
        *    multiplication
        /    division
        %    modulus
         */

        System.out.println(25%4);//1
        System.out.println(25%5);//0
    }
}
