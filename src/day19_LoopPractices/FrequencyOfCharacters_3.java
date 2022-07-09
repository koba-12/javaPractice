package day19_LoopPractices;

public class FrequencyOfCharacters_3 {

    public static void main(String[] args) {

        /*String str = "aabcccd";//bu değişkenimiz

        char ch = str.charAt(0);//bu tekrarlamak istediğim harfin index numberı-yani buraya başka bir index number yazsam onun tekrar sayısını verir.
        int count = 0;//bu tekrarını istediğimiz sayı için 0 dan başlaması gerektiğinin sabiti

        for (int i = 0; i < str.length(); i++) {//değişken 0'dan son harfe kadar tekrarlansın komutu verdik.
            char each = str.charAt(i);//değişkenin içindeki herhangi bir harfi i'nin index numberına eşitledik-each character of str
            if (ch == each){//loop devam edecek ancak ch yani 0 index numberlı 'a' = 'i' olduğu sürece
                count++;//ileriye doğru looplatır
            }
        }
        System.out.println(count);//2-- şimdi bu kenarda dursun aşağıdaki task için burayı kapatacağım.kopyalayıp üstüne eklemeler yapacağım

         */

        String str = "aabcccd";
        String result = "";//a2b1c3d1 ---sanırım burayı yazınca karakter değişkeni elde ediyoruz

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);//burası üstte 0 dı şimdi j yaptık
            int count = 0;

            for (int i = 0; i < str.length(); i++) {//her karakterin sıklığını bulmak için
                char each = str.charAt(i);
                if (ch == each){
                    count++;
                }
            }

            if (result.contains(""+ ch)){//eğer result.String + karakter içeriyorsa skiple
                continue;
            }
            result += ch;// result = result+ch yanı tekrar sayısı
            result += count;//result = result + count yani artıya doğru tekrarlatma

        }
        System.out.println(result);

        /*
        1. Write a program that can find the frequency of the characters
from a string
 Ex:
str = "aabcccd";
output:
a2b1c3d1
         */


    }
}
