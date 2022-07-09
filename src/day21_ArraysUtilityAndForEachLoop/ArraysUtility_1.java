package day21_ArraysUtilityAndForEachLoop;

import java.util.Arrays;

public class ArraysUtility_1 {

    public static void main(String[] args) {

        //to.String:array onjesini stringe döndürür

        int[]nums={1,2,3,4,5};

        System.out.println(nums);//hashcode karışık belirsiz karakterleri veriyor.sanırım ascii table karşılığını
        System.out.println(Arrays.toString(nums));//[1,2,3,4,5]
        System.out.println(nums[0]);//[1]


        System.out.println("---------------------------------");

        //sort(array):diziyi artan düzende sıralar artan düzen: küçükten büyüğe
        //0 ~ 9
        // -10 ~ 10
        // A ~ Z (65)-ascii table başlama yerleri
        // a ~ z (97)


        int[]scores= {95,100,55,65,85,78};

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));//[55,65,78,85,95,100}
        System.out.println(" min scores = "+ scores[0]);//55
        System.out.println("max score=" + scores[scores.length-1]);//100


        String[]names={"gunay","anna","zuhal","ahmet","maria","sinema"};

        Arrays.sort(names);//evet,isimleri de harf sırasına göre diziyor
        System.out.println(Arrays.toString(names));//[ahmet,anna,gunay,maria,sinema,zuhal]

        String []words={"Anna","ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));//[ANNA,Anna]--büyük harfler ascii tableda daha önce başladığı için onlar önceliklidir


        System.out.println("----------------------------------");

            //equals(array1, array2): iki arrayin eşit olup olmadığını denetler.booleana döndürür

        int[]arr1={1,3,2};
        int[]arr2={1,2,3};

        boolean r1=Arrays.equals(arr1,arr2);
        System.out.println(r1);//false -burada arrays.util kullanmadık


        Arrays.sort(arr1);//burada eşitledik sıralamayı{1,2,3}
        Arrays.sort(arr2);//{1,2,3}

        boolean r2=Arrays.equals(arr1,arr2);
        System.out.println(r2);//true

        System.out.println("---------------------------");

        char[]ch1={'a','c','b'};
        char[]ch2={'a','b','c'};

        Arrays.sort(ch1);//a,b,c
        Arrays.sort(ch2);//a,b,c

        boolean anagram= Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);//anagram=true

        System.out.println("-------------------------------------");

        //copyof(array,new length):arrayin elementlerini kopyalar.

        String []students={"elif","sinem","günay","cihat","david","james","aaron","daniel"};
        String[] earlybirds=Arrays.copyOf(students, 3);

        System.out.println(Arrays.toString(earlybirds));//elif,sinem,günay-ilk 3 element
        //not rangeinden yüksek bir sayı yazarsak nul,null,null çıkar


        int[]numbers={1,2,3,4,5,6,7,8,9,10};
        numbers=Arrays.copyOf(numbers,5);//üstte students,early birds diye ayırdık.aynı kelime olursa String[]yazmadan direkt böyle de yapabiliriz

        System.out.println(Arrays.toString(numbers));//[1,2,3,4,5]

        System.out.println("---------------------------------------");

        //copyOfRange(array, beginningIndex, endingIndex)

        char[]bh1={'A','B','C','D','E','F','G','H','I'};
        char[]ch = Arrays.copyOfRange(bh1,2,6);//2 İLE 6 İNDEX NO ARASI VERİR(6 dahil değil)

        System.out.println(Arrays.toString(ch));//[C,D,E,F]

        int[] sscores = {10,20,30,40,50,60,70,80,90,100};
        //index           0  1  2  3  4  5  6  7  8  9
        int []result= Arrays.copyOfRange(sscores,3,8);//buraya örneğin 7+1 de yazılabilir
        System.out.println(Arrays.toString(result));//[40,50,60,70,80]

        int []result2=Arrays.copyOfRange(sscores,5,sscores.length);
        System.out.println(Arrays.toString(result2));
    }
}
