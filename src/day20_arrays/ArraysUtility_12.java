package day20_arrays;

import java.util.Arrays;

public class ArraysUtility_12 {

    public static void main(String[] args) {

        int[]numbers={10,9,0,1,2,20,4,6,7,8};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);//arrayi küçükten büyüğe sıralar
        System.out.println(Arrays.toString(numbers));
    }
}
