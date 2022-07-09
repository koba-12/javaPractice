package day21_ArraysUtilityAndForEachLoop;

public class MaxNumber_3 {

    public static void main(String[] args) {

        int[]numbers= {10,5,4,20,1,0};
        int max = numbers[0];

        /*for (int i = 0; i < numbers.length; i++) {//
            if (numbers [i]>max){//arrayde geçerli maksimum sayıdan büyük bir elemet varsa-
                max=numbers[i];//max değişkenine daha büyük sayı atama
            }
        }

         */

        for (int number : numbers) {//numbers.for kısayolu
            if (number>max){//number maxtan büyük mü diye sorarız.yani sıradaki number bu.(10,5,4,20,1,0)
                max=number;//eğer büyükse max sayı bulduğumuz büyük olan sayıdır
            }//burada max numberı bulduk.day20 de yaptığımız soruyu sordurma tekniğinin aynısı oradan da tekrar bakılabilir
        }
        System.out.println(max);
    }
}
