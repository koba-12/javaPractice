package day22_MultiDimensioanalArray;

import java.util.Arrays;

public class MultiDimensionalArray2_6 {

    public static void main(String[] args) {

        int[]arr1={1,2,3};
        int[]arr2={4,5,6};
        int[]arr3={7,8,9};

        //3 boyutlu array , 2 boyutlu array içerir

        int[][]arr2d={{1,2,3},{4,5,6},{7,8,9}};//bu 2 boyutlu array {{1,2,3},{4,5,6},{7,8,9}} bunların hepsini içerir yani bunların hepsi 1 arraydir

        //3 boyutlu array , 2 boyutlu array içerir

        //                  0       1        2         0            1        2
        int[][][]arr3d={{{1,2,3},{4,5,6},{7,8,9}},{{10,20,30},{40,50,60},{70,80,90}}};//bu 3d array ise 2 array içeriyor
        //                         0                            1

        //3d arrayde 4 karae oluyor içleri de şöyle dolmalı
        //[index num of 2d array][index num of 1d array][index num of elements]
        System.out.println(Arrays.deepToString(arr3d));

        System.out.println(Arrays.deepToString(arr3d[1]));//[[10,20,30],[40,50,60],[70,80,90]]//deeptoString kullandık DİKKAT!!!

        System.out.println(Arrays.toString(arr3d[1][1]));//[40,50,60]burada normal toString kullandık!!!

        System.out.println(arr3d[0][2][2]);//9


        for (int[][]each2d : arr3d){//gördüğümüz gibi 3 loop yazdık kullanımları bu şekildedir.böyle yazılmalıdır
            for (int[]each1d:each2d){
                for (int element:each1d){
                    System.out.println(element);
                }
            }
        }

        System.out.println("------------------------------------");

        int[][][][]arr4d={{{{1,2,3},{4,5,6},{7,8,9}},{{10,20,30},{40,50,60},{70,80,90}}}};
        //                                          0
//3d nin aynısının 1 fazlası
     for (int[][][]each3d:arr4d) {
         for (int[][] each2d : each3d) {//gördüğümüz gibi 4 loop yazdık kullanımları bu şekildedir.böyle yazılmalıdır
             for (int[] each1d : each2d) {
                 for (int element : each1d) {
                     System.out.println(element);
                 }
             }
         }
     }
    }
}