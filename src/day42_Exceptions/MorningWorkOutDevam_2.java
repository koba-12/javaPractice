package day42_Exceptions;

public class MorningWorkOutDevam_2 {

    /*
    önceki classta bazı srunlar oldu diye yeni class açtım.
     */
    public static void sleep(double seconds){//millisi, secondsa çeviren method kurduk.class 4le bağlantılı
        try {
            Thread.sleep((long)(seconds*1000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
