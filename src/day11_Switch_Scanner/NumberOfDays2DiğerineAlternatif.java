package day11_Switch_Scanner;

public class NumberOfDays2DiğerineAlternatif {

    public static void main(String[] args) {

        int year = 2000;// numberofdays e ternaries şeklinde alternatif
        int number = 2;
        String result ="";

        if (number >= 1 && number <= 12){

            switch (number){
                case 2:
                    result = (year % 4 == 0)? "29 days" : "28 days";
                     break;
                case 4: case 6: case 9: case 11:
                    result = "30days";
                default:
                    System.out.println("31days");
            }
        }else {
            result = "invalid number";
        }
        System.out.println(result);
    }
}
