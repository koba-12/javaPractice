package day26_CustomMethodsPractice;

import java.util.Arrays;

public class MergeTwoArrays_5 {

    public static void main(String[] args) {

        int[]arr1={1,2,3,4,5};
        int[]arr2={6,7,8,9};

        int[]arr3=merge(arr1,arr2);

        System.out.println(Arrays.toString(arr3));
    }

    public static int[]merge(int[]arr1,int[]arr2){

        int[]result=new int[arr1.length+ arr2.length];

        int i =0;//i: new arrayin index numberı

        for (int each : arr1) {
            result[i++]=each;
        }
        for (int each : arr2) {
            result[i++]=each;
        }
        return result;
    }
}
