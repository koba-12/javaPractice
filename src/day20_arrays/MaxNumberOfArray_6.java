package day20_arrays;

public class MaxNumberOfArray_6 {

    public static void main(String[] args) {

        int[]numbers= {10,5,4,20,1,0};//tek tek bu sayıları 0 index nolu sayıdan (10)büyük mü diye sorduğumuzu düşünelim(if koşulu dolayısıyla)
        int max = numbers[0];//numbersın 0. index nosu-bunun yolu bu üste sayıları yazdıktan sonra buraya 0 index no girilecek

        for (int i = 0; i < numbers.length; i++) {//
            if (numbers [i]>max){//arrayde geçerli maksimum sayıdan büyük bir elemet varsa-
                max=numbers[i];//max değişkenine daha büyük sayı atama
            }
        }
        System.out.println(max);


    }
}
