package day16_ForLoopStringPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabccc";
        String result = "";

        for (int i = 0; i < str.length();i++){
            //char ch = str.charAt(i);//strnin her karakteri
            //System.out.println(ch);//strnin içi alt alta out olarak çıkar
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)){//eğer firstindex ve lastindex aynıysa burada olduğu gibi.karakter unique dir
                result += ch;

            }
        }
        System.out.println(result);//b




    }
}
