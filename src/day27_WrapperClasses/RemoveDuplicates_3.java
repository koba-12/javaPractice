package day27_WrapperClasses;

import Utilities.ArraysUtility_2;

import java.util.Arrays;

public class RemoveDuplicates_3 {

    public static void main(String[] args) {

        int[]arr={1,1,2,2,3,3,4,4};
        arr=removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));//1,2,3,4

        System.out.println("-----------------------------------");

        String[]words={"java","java","c++","python","python"};

        words=removeDuplicates(words);

        System.out.println(Arrays.toString(words));

        System.out.println("--------------------------------");

        int[]numbers={1,1,1,1,1,2,2,2,2,2,3,3,3,3,4,4,4,4,4};

        numbers=Arrays.stream(numbers).distinct().toArray();//ÖNEMLİ BİLGİ!!!BU KODLA KOLAYCA REMOVE DUPLİCATES YAPABİLİRİZ

        System.out.println(Arrays.toString(numbers));
    }
//verilen arraydeki kopyaları kaldırır,yeni bir arraye döndürür.
                                    //{1,1,2,2,3,3}
    public static int[]removeDuplicates(int[]array){

        int[]result={};//geçici

        for (int each : array) {
            if (!ArraysUtility_2.contains(result,each)){
                result=ArraysUtility_2.addElement(result,each);
            }
        }
        return result;
    }

    //verilen arraydeki kopyaları kaldırır,yeni bir arraye döndürür.
                                            //{1,1,2,2,3,3}
    public static double[]removeDuplicates(double[]array){

        double[]result={};//geçici

        for (double each : array) {
            if (!ArraysUtility_2.contains(result,each)){
                result=ArraysUtility_2.addElement(result,each);
            }
        }
        return result;
    }

    //verilen arraydeki kopyaları kaldırır,yeni bir arraye döndürür.
                                        //{1,1,2,2,3,3}
    public static char[]removeDuplicates(char[]array){

        char[]result={};//geçici

        for (char each : array) {
            if (!ArraysUtility_2.contains(result,each)){
                result=ArraysUtility_2.addElement(result,each);
            }
        }
        return result;
    }

    //verilen arraydeki kopyaları kaldırır,yeni bir arraye döndürür.
                                        //{1,1,2,2,3,3}
    public static String[]removeDuplicates(String[]array){

        String[]result={};//geçici

        for (String each : array) {
            if (!ArraysUtility_2.contains(result,each)){
                result=ArraysUtility_2.addElement(result,each);
            }
        }
        return result;
    }

}
