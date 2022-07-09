package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        /*

        System.out.println( true == !false);true
        System.out.println(!true != false);false
        System.out.println(!false == true);true
        System.out.println(!!false);false
        System.out.println(!!!true);false
        /*

         */
        int score  = 85;//harf notu sistemi
        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89;
        //boolean b = score >= 80 && !a;// if score is a, but score is greater than 80//ALTERNATİF
        boolean c = score >= 70 && score <= 79;
        //boolean c = !a && !b && score >= 70;
        boolean d = score >= 60 && score <= 69;
        boolean f = score >= 0 && score <= 59;
        //boolean f = !a && !b && !c && !d;

        if (a){//if the student mad an A
            System.out.println("Excellent");
        }
        if (b){//if the student mad an B//çocuk 85 aldığı için great çıkar
            System.out.println("Great");
        }
        if (c){//if the student mad an C
            System.out.println("Good");
        }
        if (d){//if the student mad an D
            System.out.println("Passed");
        }
        if (f){//if the student mad an F
            System.out.println("Failed");
        }




    }
}
