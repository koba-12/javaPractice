package day20_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers_8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[]numbers=new int[10];//10 element girebileceğimizi belirtiyor

        for (int i = 0; i < numbers.length; i++) {//i outa girdiğimiz son sayıdan küçük olduğu sürece loopla(yani 10. girdiye kadar loopla)
            System.out.println("enter a number");
            numbers[i]=scan.nextInt();//bu da outa 10 tane girdi yapmamız için eşitliyor-girilen her kullanıcı girişi array numaralarının indexlerine atanacaktır
        }
        int max=numbers[0];//şimdi bu ve alttaki kısım max ve mini bulmak için,üsttekiler loopu sağlamak içindi
        int min=numbers[0];//bu ikisiyle değer oluşturduk.bu değerler outa gireceğimiz girdilerle bunu karşılaştırmak için
//yani şöyleki 0 index nolu sayı (varsayalım 10) 1 index nolu da 20 olsun.aşağıdaki işlemler sayesinde 20,10dan büyük mü veya küçük mü sorusunu sorup max ve mini buluyoruz
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){//herhangi bir girdi maxtan(0 index noludan büyükse)
                max=numbers[i];//artık yeni max odur
            }

            if (numbers[i]<min){//bu da üstteki if conditionın küçükse li versiyonu
                max=numbers[i];
            }
        }//ama burada akıllara bir soru geliyor.
//YA 0 İNDEX NOLU SAYI EN BÜYÜK VEYA EN KÜÇÜKSE?E BİZ ZATEN MAXI VEYA MİNİ 0 İNDEX NOLUYA SABİTLEDİĞİMİZ İÇİN EN BÜYÜK VEYA EN KÜÇÜK SAYI BAŞLANGIÇTA ZATEN O
//YANİ EĞER ONDAN DAHA BÜYÜK(VEYA DAHA KÜÇÜK)SAYI YOKSA CEVAP OLARAK 0 İNDEX NOLU SAYI ÇIKACAKTIR .
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        
        /*
        3. Write a program that asks user to enter a number 10 times:
1. store all user entered numbers in an array
2. find the max number
3. find the min number
         */
    }
}
