package day11_Switch_Scanner;

public class Grade {

    public static void main(String[] args) {

        char ch = 'B';
        String result = "";//diğer konularda da yapmıştık.burada normalde string yokken case in altındaki result yazan
        // yerlere sout yazıyoruz.ama bu da başka bir yol.buraya stringi ekleyerek aşağıya sout yerine result yazabiliriz.
        //ama excellent vs yazan yerlerdeki parantezi kaldırmayı unutmamalıyım.
        //ayrıca en son switch curly brace inin dışına sout(result) yazmalıyım.normalde yazmıyoruz bunu resultte yazıyoruz.

        switch (ch){

            case 'A':
                result = "excellent";
                break;
            case 'B':
                result = "great";
                break;
            case 'C':
                result = "good";
                break;
            case 'D':
                result = "passed";
                break;
            case 'E':
                result = "failed";
                break;
            default:
                result = "invalid";

        }
        System.out.println(result);
    }
}
