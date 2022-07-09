package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {

        /*
        copy grade report düşünelim(tekrar yazmamak için böyle yapıyorum)
         */

        //dolution2 = use ternaries only

        int s = 135;

        String result = (s >= 0 && s <= 100) ? (s>=90)? "excellent" : (s>=80)? "great" : (s>=70) ? "good" : (s>=60)? "passed" : "failed" : "ınvalid score";
        System.out.println(result);

        System.out.println("-------------------------------------------");

        String result2 = "";

        if (s>=0 && s <=100){

            result2 = (s>=90) ? "Excellent" : (s>=80)? "great" : (s>=70)? "good" : (s>=60) ? "passed" : "failed";
        }else {
            result2 = "Invalid score";
        }
        System.out.println(result2);
    }
}
