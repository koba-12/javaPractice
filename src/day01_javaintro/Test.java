package day01_javaintro;

import day25CustomMethods_OverLoading.StringUtility_6;
//buraya bunu yazıp alta da eachcharlı bölümü yazarsak
//o classı kullanabiliriz.

public class Test {

    public static void main(String[] args) {

        String str="wooden spoon";

        StringUtility_6.printEachChar(str);//buraya başka classtan bölüm yazmış olduk bunu kullanabiliriz.
        //kısayol olarak sadece buraya bunu yazsak üstteki importlu bölüm de geliyor.--wooden spoonu looplar bu sayede
    }

}
