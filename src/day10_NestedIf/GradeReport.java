package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
/*
90-100 excellent
80-89 great
70-79 good
60-69 passed
0-59 failed
 */
        int score = 95;

        if (score >= 0 && score <= 100){//ön koşul

            if (score>=90){//burada daha önceki grade reportlardaki gibi score>=90 && score<=100 yazmadık çünkü
                // pre conditionda bu koşul zaten sağlanmış 0-100 arası olmalı
                System.out.println("excellent");
            }else if (score >= 80){//burada da score<=90 yazmaya gerek yok pratik yol(ve gerisinde de öyle gider)
                System.out.println("great");
            }else if (score >=70){
                System.out.println("good");
            }else if (score >=60){
                System.out.println("passed");
            }else{
                System.out.println("failed");
            }

        }else {//if the score not valid
            System.out.println("Invalidscore");//üstte ön koşulu yazdıktan sonra 2. olarak bunu yazarız,gerisini araya alırız

        }

        System.out.println("--------------------------------------------------");


    }
}
