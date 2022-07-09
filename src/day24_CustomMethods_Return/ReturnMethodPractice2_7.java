package day24_CustomMethods_Return;

public class ReturnMethodPractice2_7 {

    //create a function that can calculate the grade
    //check the grade---A=excellent vs

    public static void main(String[] args) {

        String str=grade(95);

        if (str.equals("A")){
            System.out.println("excellent");
        }else if (str.equals("B")){
            System.out.println("great");
        }else if (str.equals("C")){
            System.out.println("good");
        }else if (str.equals("D")){
            System.out.println("passed");
        }else {
            System.out.println("try again");
        }
    }

    public static String grade(int score) {

        String result="";

        if (score<0||score>100){
            result="invalid";
        }else {
            result=(score>=90)? "A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";
        }
        return result;
    }




    }



