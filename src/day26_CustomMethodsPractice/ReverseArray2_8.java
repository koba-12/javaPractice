package day26_CustomMethodsPractice;

import Utilities.ArraysUtility_2;

public class ReverseArray2_8 {
    
    public static int[]reverse(int[]array){

        int[]result={};

        for (int i = array.length - 1; i >= 0; i--) {
            result= ArraysUtility_2.addElement(result,array[i]);
        }
        return result;
    }
}
