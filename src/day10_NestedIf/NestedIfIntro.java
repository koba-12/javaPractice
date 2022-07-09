package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 400;

        if (score >= 0 && score <= 100){

            if (score >= 60){
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }

        }else {//if the score invalid
            System.out.println("Invalid Score");
        }

        System.out.println("-----------------------------------------------");

        int age = 19;
        boolean hasId = true;

        if (hasId){//if the person has ıd

            if (age >= 21){//if the person is21 years old or older
                System.out.println("Eligible to buy alcohol");
            }else {//if the person is less than 21 years old
                System.out.println("Not eligible to buy alcohol");
            }

            }else {//if the person does not have an ID
            // bu else i pre condition ın patantez sonunun yanında yazıyoruz
            System.out.println("You must have an ID to buy alcohol ");
        }

        System.out.println("--------------------------------------------");

        int number = 7;

        if (number >= 1 && number <= 7){

            if (number==1){
                System.out.println("Monday");
            }else if (number==2){
                System.out.println("tuesday");
            }else if (number==3){
                System.out.println("wedneyday");
            }else if (number==4){
                System.out.println("thursday");
            }else if (number==5){
                System.out.println("friday");
            }else if (number==6){
                System.out.println("saturday");
            }else {//sunday çıkar 7 olduğu için buna 7 yazmaya gerek yok 7 varmış gibi kabul edilir
                //üstte pre condition yaptığımız sayı 1-7 aralığındaysa bu günlerden biri değilse ınvalid number çıkar
                System.out.println("sunday");
            }
        }else{
            System.out.println("Invalid number");
        }






            }
}
