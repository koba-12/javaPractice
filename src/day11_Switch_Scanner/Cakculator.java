package day11_Switch_Scanner;

public class Cakculator {

    public static void main(String[] args) {

        double n1 = 200.5;
        double n2 = 10.5;

        char operator = '+';//BURATA ÖRNEĞİN $ İŞARETİ KOYSAK GEÇERSİZ OLURDU İNVALİD OLURDU

        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';//pre condition

        if (valid){
            switch (operator){
                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case  '*':
                    System.out.println(n1 * n2);
                    break;
                default:
                    System.out.println(n1 / n2);

            }

        }else {
            System.err.println("invalid operator : " + operator );

        }
    }
}
