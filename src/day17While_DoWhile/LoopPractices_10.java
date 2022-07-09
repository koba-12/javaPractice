package day17While_DoWhile;

public class LoopPractices_10 {

    public static void main(String[] args) {

        /*
         hangi döngüyü kullanmalıyım?
        Hangisi uygunsa, bir for döngüsü, bir while döngüsü veya bir do-while döngüsü kullanabilirsiniz.
** Tekrar sayısı önceden biliniyorsa bir for döngüsü kullanılabilir
* Tekrar sayısı sabit değilse while döngüsü kullanılabilir
** Döngü gövdesi olması gerekiyorsa, while döngüsünü değiştirmek için bir do-while döngüsü kullanılabilir
koşul denetlenmeden önce yürütülür.
         */

        for (int i = 1; i <= 10 ; i++) {//i++ iterator yani yineleyici.ÖNEMLİ!!!
            System.out.println(i);
        }

        System.out.println("--------------------------------");

        int j = 1;
        while (j<=10){
            j++;//iterator olarak düşün--- bu j nin değerini 1 yükseltip 2 den saymaya başlatıyor.11 e kadar
            //eğer j++ soutun altında olsa aynı fordaki gibi sıralanırdı
            System.out.println(j);


            System.out.println("--------------------------------");

            int k = 1;
            do {
                System.out.println(k);
                k++;
            }while (k<=10);
        }

        //bu 3 ününde sonuçları aynıdır
    }
}
