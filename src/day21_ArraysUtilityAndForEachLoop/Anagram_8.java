package day21_ArraysUtilityAndForEachLoop;

import java.util.Arrays;

public class Anagram_8 {

    public static void main(String[] args) {

        String str1="acdb";
        String str2="dbca";

        //str1 ve str2 nin aynı karakterleri içerip içermediğini test eden program yaz

        char[]ch1=str1.toCharArray();//önce bu şekilde arraye çevirdik
        char[]ch2=str2.toCharArray();

        //System.out.println(Arrays.toString(ch1));
        //System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);//sonra da bu şekilde sıraladık ve eşledik
        Arrays.sort(ch2);

        //System.out.println(Arrays.toString(ch1));
        //System.out.println(Arrays.toString(ch2));

        boolean anagram=Arrays.equals(ch1,ch2);

        System.out.println("anagram = " + anagram);

        System.out.println("--------------------------------------------");

        /*
split(value): returns String array
"I love learning java programming language".split(" ") ===> {"I", "love", "learning" ,"java", "programming","language"}
"ABC".split(" ")  ===>  {"A", "B", "C"}
         */

        String sentence="wooden spoon";

        String [] words=sentence.split(" ");//buraya hangi karakteri koyarsak onunla alakalı işlem olur.
//eğer buraya örneğin "s" koysaydım "s" out olmaz silinirdi.o yüzden dolayı bu işi en sağlıklı şekilde yapmanın yolu"space" kullanmaktır

        System.out.println(Arrays.toString(words));//{wooden,spoon]


        System.out.println("---------------------------------------");

        String email="woodenspoon@cydeo.com";

        String []arr=email.split("@");//@ i almaz

        System.out.println(Arrays.toString(arr));//[woodenspoon, cydeo.com]

        System.out.println("-----------------------------------");

        String s="today is nice day.today is monday.we learn java.";

        String []sentences=s.split("\\. ");//bu işareti koymak gerekiyor special karakterleri de kaldırmak için

        System.out.println(Arrays.toString(sentences));//"." ve "space" ler kalktı,her nokta ve space olması gereken yerden
        //cümleler ayrıldı araya virgül koyulup ayırıldı(outa oto olarak)





    }
}
