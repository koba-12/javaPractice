package day26_CustomMethodsPractice;

import day25CustomMethods_OverLoading.AddElementsToArray_Overloading_5;

import java.util.Arrays;

public class MergeTwoArrays2_6 {

    //2.yöntem

    public static void main(String[] args) {

        int[]arr1={1,2,3,4};
        int[]arr2={5,6,7,8};

        int[]arr3=merge(arr1,arr2);

        System.out.println(Arrays.toString(arr3));


        System.out.println("-----------------------------------");

        String []a1={"A","B","C"};
        String []a2={"D","E","F"};

        String[]a3=merge(a1,a2);

        System.out.println(Arrays.toString(a3));
    }

    public static int[]merge(int[]arr1,int[]arr2){
        int[]result={};

        for (int each : arr1) {
            result=AddElementsToArray_Overloading_5.addElement(result,each);//controle basılı tutup üstüne gelmeyi dene,kısayol var yine
        }
        for (int each : arr2) {
            result=AddElementsToArray_Overloading_5.addElement(result,each);
        }
        return result;
    }

    public static double[]merge(double[]arr1,double[]arr2){
        double[]result={};

        for (double each : arr1) {
            result=AddElementsToArray_Overloading_5.addElement(result,each);//controle basılı tutup üstüne gelmeyi dene,kısayol var yine
        }
        for (double each : arr2) {
            result=AddElementsToArray_Overloading_5.addElement(result,each);
        }
        return result;
    }

    public static char[]merge(char[]arr1,char[]arr2){
        char[]result={};

        for (char each : arr1) {
            result=AddElementsToArray_Overloading_5.addElement(result,each);//controle basılı tutup üstüne gelmeyi dene,kısayol var yine
        }
        for (char each : arr2) {
            result=AddElementsToArray_Overloading_5.addElement(result,each);
        }
        return result;
    }

    public static String[]merge(String[]arr1,String[]arr2){
        String[]result={};

        for (String each : arr1) {
            result=AddElementsToArray_Overloading_5.addElement(result,each);//controle basılı tutup üstüne gelmeyi dene,kısayol var yine
        }
        for (String each : arr2) {
            result=AddElementsToArray_Overloading_5.addElement(result,each);
        }
        return result;
    }
}
