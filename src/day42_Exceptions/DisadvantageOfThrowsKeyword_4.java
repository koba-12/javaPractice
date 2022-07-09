package day42_Exceptions;

public class DisadvantageOfThrowsKeyword_4 {

    public static void main(String[] args) {
//aşağıda throwsun dezevantajı anlatılmaya çalışıldı ama pek anlamadım ve çok da önemli değil gibi geldi.yani biraz detay.
        System.out.println("hello");

        //sleep(2.5);

        System.out.println("hello world");

        System.out.println("------------------");

        System.out.println("hello");

        MorningWorkOutDevam_2.sleep(2.5);

        System.out.println("cydeo");

    }

    public static void sleep(double seconds)throws InterruptedException{

        Thread.sleep((long) (seconds*1000));
    }
}
