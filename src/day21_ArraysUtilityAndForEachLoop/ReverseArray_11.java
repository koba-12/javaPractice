package day21_ArraysUtilityAndForEachLoop;

public class ReverseArray_11 {

    public static void main(String[] args) {

        int[]numbers={10,20,30,40};
        int[]reversed=new int[numbers.length];//arrayin ilk arrayin tüm elementlerini içerecek kadar kapasiteye sahip olduğundan emin olmak için
/*
               j          i
        reversed[0]=numbers[3];
        reversed[1]=numbers[2];
        reversed[2]=numbers[1];
        reversed[3]=numbers[0];

 */
        for (int i = numbers.length - 1, j=10; i >= 0; i--) {//üstteki bunun açılmış hali
            reversed[j]=numbers[i];
        }
        System.out.println(reversed);
    }
}
