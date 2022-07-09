package day26_CustomMethodsPractice;

import day25CustomMethods_OverLoading.AddElementsToArray_Overloading_5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UniqueElements_2 {

    public static void main(String[] args) {

        int[]array={1,1,2,3,3,4,5,5,6,7,7,7,};
        int[]unique=uniqueElements(array);

        System.out.println(Arrays.toString(unique));//[2,4,6]

        System.out.println("---------------------------------");

        double[]array2={1.5,1.5,2.5,3.5,3.5,4.5};
        double[]unique2=uniqueElements(array2);
        System.out.println(Arrays.toString(unique2));
    }

    public static int []uniqueElements(int[]array){
        int[]result={};//geçici bir başlangıç noktası için//new int [0]

        for (int each : array) {
            if (FrequencyOfElement_1.frequencyOfElement(array,each)==1){//unique elements i bulmak için yeni kodlar yazmadık
                //önceki yazdıklarımızı kısayol gibi ekledik
                result=AddElementsToArray_Overloading_5.addElement(result,each);

                }
            }

        return result;
    }

    public static double []uniqueElements(double[]array){
        double[]result={};//geçici bir başlangıç noktası için//new double [0]

        for (double each : array) {
            if (FrequencyOfElement_1.frequencyOfElement(array,each)==1){//unique elements i bulmak için yeni kodlar yazmadık
                //önceki yazdıklarımızı kısayol gibi ekledik
                result=AddElementsToArray_Overloading_5.addElement(result,each);

            }
        }

        return result;
    }

    public static char []uniqueElements(char[]array){
        char[]result={};//geçici bir başlangıç noktası için//new char [0]

        for (char each : array) {
            if (FrequencyOfElement_1.frequencyOfElement(array,each)==1){//unique elements i bulmak için yeni kodlar yazmadık
                //önceki yazdıklarımızı kısayol gibi ekledik
                result=AddElementsToArray_Overloading_5.addElement(result,each);

            }
        }

        return result;
    }

    public static String []uniqueElements(String[]array){
        String[]result={};//geçici bir başlangıç noktası için//new String [0]

        for (String each : array) {
            if (FrequencyOfElement_1.frequencyOfElement(array,each)==1){//unique elements i bulmak için yeni kodlar yazmadık
                //önceki yazdıklarımızı kısayol gibi ekledik
                result=AddElementsToArray_Overloading_5.addElement(result,each);

            }
        }

        return result;
    }
}
