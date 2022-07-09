package day25CustomMethods_OverLoading;

import Utilities.StringUtility_1;

public class Test_7 {

    public static void main(String[] args) {

        String str="java programming language";

        StringUtility_6.printEachChar(str);//bu test classının detaylı bilgileri day01 deki test classta var.
//burada alt alta tringdeki kelimeyi looplar

        System.out.println("----------------------------------------------");

        String s1="wooden spoon";

        String reverse= StringUtility_1.reverse(s1);
        System.out.println(reverse);//bunu da split righttan utilitiesdekini getirip yaptık

        System.out.println("------------------------------------------------------");

        String word="civic";
        boolean palindrome= StringUtility_1.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);//true----bunu da aynı şekilde StringUtility(utiilities package da)
        //yazdığımız kodun kısayolunu buraya yazarak oluşturmuş olduk.buralara dikkat edelim büyük kolaylık

        System.out.println("----------------------------------------------------");

        String[] names={"anna","java","python","racecar","mom","cydeo"};

        int count=0;//bir sayma noktası başlattık

        for (String each : names) {//yukarıdaki isimleri looplamasını istedik
            if (StringUtility_1.isPalindrome(each)){//ancak bir koşul koştuk.bu if içindeki(utilities packageda yazdığımız)
//yazdığımıza uygun olmasını istedik.yani palindrome olmasını istedik
                count++;//artıya(ileriye)doğru looplattık
            }
        }
        System.out.println(count);//outa palindrome olan kelime sayısı çıktı.dikkat edelim kelimeler değil kelime sayısı yani 3

        System.out.println("--------------------------------------");

        String s2="aaaaaaaaaaabbbbbbbbbbcccccccccccccc";

        String nonDup=StringUtility_1.removeDuplicates(s2);

        System.out.println(nonDup);//abc

    }

}
