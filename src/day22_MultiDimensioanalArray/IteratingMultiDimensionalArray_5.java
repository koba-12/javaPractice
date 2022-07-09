package day22_MultiDimensioanalArray;

public class IteratingMultiDimensionalArray_5 {

    public static void main(String[] args) {

        /*
        task
        9 10 11 12 13
        4 5 6 7 8
        1 2 3
         */

        int[][]arr2d={{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        for (int i = arr2d.length - 1; i >= 0; i--) {//forr "-"li yapar fori"+"lı-1D arraylerin last indexten başlayıp 0 a kadarki index numaraları
            for (int j = 0; j < arr2d.length; j++) {//elementslerin o dan son indexe kadarki index numaraları
                System.out.print(arr2d[i][j]+ "");
            }
            System.out.println();//sadece outer loopa dahil olduğundan ayırıyor
        }

        System.out.println("---------------------------------");
/*
task2
3 2 1
8 7 6 5 4
13 12 11 10 9
 */
        int[][]arr2d2={{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        for (int i = 0;i<arr2d2.length;i++){//1D arraylerin last indexten başlayıp 0 a kadarki index numaraları
            for (int j = arr2d2[i].length-1;j>=0;i--){//elementslerin o dan son indexe kadarki index numaraları
                System.out.println(arr2d2[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");
        /*task3
        13 12 11 10 9
        8 7 6 5 4
        3 2 1
         */
        int[][]arr2d3={{1,2,3},{4,5,6,7},{8,9,10,11,12}};




    }
}
