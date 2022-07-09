package day26_CustomMethodsPractice;

import day25CustomMethods_OverLoading.AddElementsToArray_Overloading_5;

public class RemoveElements2_4 {

    //birinci çözüm ilkiydi bunda da 2. yolu deneyeceğiz

    public static int[] removeElement(int[]array, int index){

        if (index<0||index>array.length-1){
            System.err.println("invalid index number"+index);
            System.exit(0);
        }
        int[]result={};

        for (int i = 0; i < array.length-1; i++) {//i:arrays index number
            if (i!=index){//burada i yani looplananlar indexe yani main methodda yazdığımız sayıya eşit değilse out olsun.
                result= AddElementsToArray_Overloading_5.addElement(result,array[i]);
            }
        }
        return result;
    }
}
