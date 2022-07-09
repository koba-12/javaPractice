package day19_LoopPractices;

public class UniqueCharacters_4 {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";//bdf unique karakterleri bulmaya çalışıyoruz burada yani ilk ve son index numberı aynı olanlar

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);//j nin her karakteri
            int count = 0;//ch nin frequency(sıklığını) temsil eder

            for (int i = 0; i < str.length(); i++) {//dış döngünün seçtiği karakteri str nin her karakteriyle karşılaştrır
                char each = str.charAt(i);//each karakter of str

                if (ch == each){
                    count++;
                }
            }
            if (count == 1){//eğer frequency si yani tekrarı(sıklığı) 1 ise yani unique ise

            /*if (count != 1){//bu da diğer yolu yani count 1 değil ise skiple
                continue;
            }
             */

            }
        }
        System.out.println(result);

        /*
        2. Write a program that can find the unique characters from a string
without using indexOf() and lastIndexOf() methods
Ex:
str = "aabccdeef";
output:
bdf
         */
    }
}
