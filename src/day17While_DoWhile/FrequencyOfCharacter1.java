package day17While_DoWhile;

public class FrequencyOfCharacter1 {

    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';
        int frequency = 0;//sıklık,şöyleki a nın sıklığını soruyor.+1+1+1 gider ve a'nın sıklığı 3 tür.

        for (int i = 0; i < str.length(); i++) {//i= indexes of str
            char eachChar = str.charAt(i);//str nin herhangi bir karakteri

            if (ch == eachChar){//eğer verilen ch eachChar ile eşleşiyorsa,stringde ch görünür
                //eğer ch eachChar a eşit olduğu sürece döndürür
                frequency++;//frequency += 1 şeklinde yazdığımızla aynı

            }
        }
        System.out.println(frequency);//3
    }
}
