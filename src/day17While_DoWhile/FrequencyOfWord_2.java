package day17While_DoWhile;

public class FrequencyOfWord_2 {

    public static void main(String[] args) {

        String str = "JavaJava";
        int frequency = 0;

        for (int i = 0; i < str.length()-4; i++) {//-4 yaptık çünkü sona 3 harf kaldığında hata verir.çünkü kelime tamamlanmaz 3 harfte kalır
            //o yüzden sondan -4. yani 2. "J" ye kadar loop yapar
            String eachSub = str.substring(i, i+4);//burada +4 yazmamızın sebebi de 4 harflik looplar yapmak istememiz
            //System.out.println(eachSub);//içeri sout yazarsak:Java,avaJ,vaJa,aJav şeklinde out verir
         if (eachSub.equals("Java")){//bunu yazınca da avaJ vs yazar çünkü aynı harfler var
             frequency++;//burası syntax ında var önemlii
         }
        }
        System.out.println(frequency);//dışarı yazarsak 1 sayısını verir//yani if koşulunun frequencyli cevabını verir


        /*
        the sentence
Ex:
sentence = "JavaJavaJava";
output: 3
Str = "JavaJava";
substrings:
1. Java  //substring(0, 4)
2. avaJ  //substring(1, 5)
3. vaJa  // substring(2, 2+4 )
4. aJav  // substring(3, 3+4)
5. Java  // substring(4, 4+4)
         */
    }
}
