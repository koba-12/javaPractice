package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {//ön bilgiler maximumnumberda

        Scanner scan = new Scanner(System.in);//mini de max ın tersi gibi yorumlayabiliriz bazı noktalarda
        int min = 2147483647;//maxda int in eksi range ini kullandık min de artı range ini kullanıyoruz

        for (int i = 10; i < 15; i++){//5 girdi yapmak için rastgele 15-15 arası diye yazdık
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num<min){//örn:67 yazdık ilk outa eğer 67 min sayısından küçükse eşit olur ve artık min sayısı 67
//sonra 23 yazdık 67 den küçük olduğu için min 23 oldu.42 yazdık 23 den küçük değil.min hala 23.5 yazdık min artık 5
// -10 yazdık min sayısı artık -10.yani artık en küçük sayımız yani minimum sayımız -10.cevap olarak -10 çıkar
                min=num;
            }
        }

        System.out.println("min = " + min);
    }
}
