package day42_Exceptions;

public class MorningWorkOut_1 {

    public static void main(String[] args) {
        /*
        30 push-up,20 pull-up tekrarı yapmak istiyoruz
         */

        System.out.println("-----------------push up started---------------");

        for (int i = 1; i <=30 ; i++) {
            System.out.println("\rpush-up "+i);//bu sayede alr satıra geçmeden üstüne sayar
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n----------push up completed-------------");
//bu Thread.sleep geriye doğru saydırıyor bize.1500 millis her 1.5 saniyede bir sayım yaptırıyor.

        System.out.println("-------pull up started-----------");

        for (int i = 1; i <=20 ; i++) {
            System.out.println("\rpull-up "+i);
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("----------pull up completed-------------");
        
    }
}
