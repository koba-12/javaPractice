package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;// ÖNEMLİ NOT:ternariesle ilgili day11 numbertowords e de bak

        if (n%2 == 0){
            System.out.println("even");//string -stringlerin ikisi de  yazı olduğundan
        }else{
            System.out.println("odd");//string
        }

        System.out.println("----------------------------------");

        String result1 = (n%2 == 0)? "even" : "odd";//üsttekiyle aynısı çıkar.bu da bir nevi kısayoldur
        System.out.println(result1);

        System.out.println("---------------------------------------------");

        int age = 23;

        /*if (age >= 21){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }

         */
        System.out.println( (age >= 21) ? "eligible" : "not eligible" );//bu da başka bir kısayol direkt sout un içine aldık

        String result2 = (age >= 21) ? "eligible" : "not eligible";//bu da başka yöntem
        System.out.println(result2);

        System.out.println("------------------------------------------");

        int number = 100;

        if (number > 0){
            System.out.println("positive");
        }else if (number < 0){
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }

        String result3 = (number > 0)? "positive" : (number < 0)? "negative" : "zero";//başka yöntem
        System.out.println(result3);





    }
}
