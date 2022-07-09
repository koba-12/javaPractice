package day16_ForLoopStringPractices;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbaacc";
        String result ="";//abc yapmak istiyoruz out u

        for (int i = 0; i <= str.length()-1;i++){//str nin tüm index numberlarını temsil eder
            String  ch =""+ str.charAt(i);//str nin tüm karakterlerini temsil eder

            if (!result.contains(ch)){//içerir demek contains.! ise olumsuzlar
                result+=ch;
            }

        }
        System.out.println("result = " + result);
    }
}
