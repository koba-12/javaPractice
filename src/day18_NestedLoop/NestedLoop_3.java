package day18_NestedLoop;

public class NestedLoop_3 {

    public static void main(String[] args) {

        /*
        nested loop: başka bir döngünün içindeki döngü (inner & outer loops)
        dış döngünün bir yinelemesi, iç döngünün tüm yinelemesini yürütür
    Bir döngü diğerinin içine yerleştirilebilir
döngü
* Bir döngüyü tekrarlamak için kullanılır
• Dış döngü her tekrarlandığında,
iç döngü (ler) yeniden girilir ve
yeni başlaBUNUN PDF İNDEKİ ŞEKLİ MUTLAKA AMA MUTLAKA TEKRAR YAPARKEN ÇİZ!!!!!

NESTED : İÇİÇE DEMEK
     */

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        System.out.println("-------------------------------------");

        for (int j = 0; j < 4; j++) {//0,1,2,3 --- diikat edersek alttaki döngü bunun curly braceinin içinde bu yüzden dolayı
            // alttaki döngü bu döngüdeki sayı kadar(yani burada 3'e kadar) döndürülür
            System.out.println("Wooden Spoon");

            for (int i = 0; i < 5; i++) {//0,1,2,3,4
                System.out.println("Wooden Spoon");
            }
        }

    }
}
