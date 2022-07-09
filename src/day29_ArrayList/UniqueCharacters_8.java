package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters_8 {

    public static void main(String[] args) {

        String str="aaabcccdeeef";

        String[]arr= str.split("");//strdeki her bir harfi ayırıyor."a","a","a","b"..... şeklinde
        // (cümle olsa kelime kelime ayırırdı.)

        ArrayList<String>list=new ArrayList<>(Arrays.asList(arr));

        System.out.println("list = " + list);//list = [a, a, a, b, c, c, c, d, e, e, e, f] split sayesinde böyleoldu.


        String unique="";

        for (String each : list) {//önceki clasta da böyle bir şey yapmıştık.
            int frequency= Collections.frequency(list,each);//loopladık ve frequencyi list in her bir elementine eşitledik
            //her bir elemenetin sıklığı
            if (frequency==1){//if condition koyduk,unique olması için
                unique+=each;//şu += muhabbetini bir türlü çözemedim daha öğrenmem lazım
            }
        }
        System.out.println("unique = " + unique);
    }
}
