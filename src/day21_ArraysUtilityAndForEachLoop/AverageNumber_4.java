package day21_ArraysUtilityAndForEachLoop;

public class AverageNumber_4 {

    public static void main(String[] args) {

        //day20 deki average numberdan kopyalandı orada da bilgi bulabiliriz

        int[]numbers={10,20,30,40,50,60};
        double sum=0;//burayı nirengi noktası olarak düşünebiliriz.yani bir sabit oluşturuyoruz

        for (int number : numbers) {
            sum+=number;//SAYILARI TOPLAYARAK İLERLİYOR.BURASI ÇOK ÖNEMLİ BAK BİR SORUNU ÇÖZDÜM
            //NORMALDE "++" YAZIYORUZ AMA BURADA TOPLANARAK İLERLENMESİ İÇİN TOPLANMASI İSTENEN İKİ DEĞER ARASINA"+=" YAZIYORUZ
        }
        double average=sum/numbers.length;//length son elementi veriyor
        System.out.println("average = " + average);
    }
}
