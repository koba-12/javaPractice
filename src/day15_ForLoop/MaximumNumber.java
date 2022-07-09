package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        /*
        write a program that asks the user to enter a number for 5 times.return the maximum number
         */

        Scanner scan = new Scanner(System.in);
        int max = -2147483648;//int in range i

        for (int i = 0; i < 5; i++) {//burada fori yaptım ama fori yapınca 0 çıkmasına rağmen bazen muhtar 1 yazıyor sebebi nedir sevnura sor
            //burada koşulumuzu yazdık
            System.out.println("Enter a number");//outta soracağı soru
            int num = scan.nextInt();//burası out a bizim yazacağımız sayılar nextInt() metodu unutma

            if (num>max){//ve burada diyorki eğer num maxdan büyük ise(yani out a yazacağımız sayı maxdan büyükse)
                //ki max - değer olduğu için büyük
                max = num;//max = num olur ve yazacağımız değerlerden en büyüğünü bize verir.
                //yani üstteki "-" ile başlayan sayı num a yani yazdığımız sayıya dönüşüyor
                // şu şekilde düşünürsek diyelimki out a 10 yazdım.bu 10 sayısı num un değeri ama üstteki işlemle
//eğer num değeri max dan büyükse eşitlenir dedik.10 sayısı max ın değerinden büyük yani böylece max = 10 oldu
//sonra 9 sayısını girdik diyelim.9,10 dan büyük değil yani max hala 10 ve bizim şuana kadarki elimizdeki max sayı 10
// yani cevap 10 olarak devam ediyor.işlem bu şekilde sürer ve yazdığımız sayılardan en büyüğü hangisi ise o ceavp olarak gelir

            }//max = girdiğim en büyük sayı yani max sayı
            System.out.println("max = " + max);
            //minimum number da önemli devam bilgileri var.
            
        }
    }
}
