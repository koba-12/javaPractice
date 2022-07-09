package day22_MultiDimensioanalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray_4 {

    public static void main(String[] args) {

        //index of the elements:0,1,2 ,0 1 2 3 , 0 1 2  3  4
        int[][]arr2d={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
//index of the arrays    0        1            2

        for (int i = 0; i < arr2d.length; i++) {//index numbers of single dimensional array
            //System.out.println(Arrays.toString(arr2d[i]));//üstteki her arrayi ayrı ayrı alt alta sıralar
            for (int j = 0; j < arr2d[i].length; j++) {//index number of elements
                System.out.println(arr2d[i][j]);//üstteki tüm sayılar alt alta out oldu
            }
            System.out.println();//böyle yapınca da arrayin elementleri bir sırada yazar sonra alt satıra geçip diğer arrayin elementlerini yazar
            //çünkü bu inner loopun dışında ama outer loopun içinde
        }





    }
}
