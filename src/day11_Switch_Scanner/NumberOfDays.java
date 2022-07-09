package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {
        // burada aylardaki günleri yapıyoruz

        int year = 2000;
        int number = 2;

        if (number >= 1 && number <= 12){

            switch (number){
                case 2://şubat ayını temsilen 2

                if (year % 4 ==0){//ÖNEMLİ!!! bu şekilde üste if koşulu açıp altına switcle devam edip araya yine
                    // if koyarak katmanlandırabiliriz.böylece birden çok koşulumuz olmuş olur
                    // yani number 2 olduğundan bu bölümden çıkacak cevap o kesin.
                    // yanına bir de if adı altında yeni bir bölme açmışız gibi düşün.bir de leap year ın koşuluna uymalı
                    // sonuç da ona göre ayrıldı.
                    System.out.println("29 days");
                }else {
                    System.out.println("28 days");
                }
                break;
                case 4: case 6: case 9: case 11://nisan,haziran,eylül,kasım temsilen bu sayılar.
                    // gördüğümüz gibi hepsine ayrı case açtık
                    System.out.println("30 days");
                    break;
                default:
                    System.out.println("31 days");// ELSE GİBİ DÜŞÜN UNUTMA! o yüzden kalanlar da buraya mensup oluyor

            }

        }else {
            System.out.println("invalid number");
        }

    }
}
