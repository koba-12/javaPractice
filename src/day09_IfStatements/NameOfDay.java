package day09_IfStatements;

public class NameOfDay {
    public static void main(String[] args) {

        int n = 5;//haftanın beşinci günü yani cuma

        if (n == 1){//burayı kafamda şöyle kurarak daha rahat anlayabilirim!//||eğer(n==1) ise sout p.tesi||
            System.out.println("Monday");
        }else if (n == 2){
            System.out.println("Tuesday");//n==2 ise tuesday
        }else if (n == 3){
            System.out.println("Wednesday");//n==3 ise wednesday
        }else if (n == 4){
            System.out.println("Thursday");//n==4 ise thursday
        }else if (n == 5){
            System.out.println("Friday");//n==5 ise friday
        }else if (n == 6){
            System.out.println("Saturday");//n==6 ise saturday
        }else{
            System.out.println("Sunday");//n==7 ise sunday//böyle kafamda daha rahat çözümlerim
            //n=7 olsa idi buraya else if(n==7) yazmamamıza rağmen cevap sunday çıkardı.
            // çünkü sıralama gereği sırada o var.


        }




        /*int n = 10;//haftanın beşinci günü yani cuma

        if (n == 1){//burayı kafamda şöyle kurarak daha rahat anlayabilirim!//||eğer(n==1) ise sout p.tesi||
            System.out.println("Monday");
        }else if (n == 2){
            System.out.println("Tuesday");//n==2 ise tuesday
        }else if (n == 3){
            System.out.println("Wednesday");//n==3 ise wednesday
        }else if (n == 4){
            System.out.println("Thursday");//n==4 ise thursday
        }else if (n == 5){
            System.out.println("Friday");//n==5 ise friday
        }else if (n == 6){
            System.out.println("Saturday");//n==6 ise saturday
        }else if ( n== 7){
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid");//böyle yaparsak yani n sayısı 1-7 arası bir sayı değilse en alttaki çıkar
        }

         */

        /*int n = 5;//haftanın beşinci günü yani cuma
        String day ;

        if (n == 1){//burayı kafamda şöyle kurarak daha rahat anlayabilirim!//||eğer(n==1) ise sout p.tesi||
            //System.out.println("Monday");
            day = "Monday";
        }else if (n == 2){
            //System.out.println("Tuesday");//n==2 ise tuesday
            day = "Tuesday";
        }else if (n == 3){
            //System.out.println("Wednesday");//n==3 ise wednesday
            day = "Wednesday";
        }else if (n == 4){
            //System.out.println("Thursday");//n==4 ise thursday
            day = "Thursday";
        }else if (n == 5){
            //System.out.println("Friday");//n==5 ise friday
            day = "Friday";
        }else if (n == 6){
            //System.out.println("Saturday");//n==6 ise saturday
            day = "Saturday";
        }else{
            //System.out.println("Sunday");
            day = "Sunday";
            System.out.println("day = " + day);

            bu şekilde de cevap day=friday çıkar bu da bir yöntemdir


        }
       
         */






    }
}
