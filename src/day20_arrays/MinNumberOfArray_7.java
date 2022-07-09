package day20_arrays;

public class MinNumberOfArray_7 {

    public static void main(String[] args) {

        int[] numbers={100,500,30,40,600,80,90};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {//i 0dan başlayaıp numbers ın son lengthine artıya doğru looplayacak-arrayde daha küçük bir element varsa
            min=numbers[i];//min değişkenine daha küçük bir sayı atanacaktır
        }
    }
}
