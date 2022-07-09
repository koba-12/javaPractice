package day22_MultiDimensioanalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro_3 {

    public static void main(String[] args) {

        /*
* Bir arrayin arrayi
* array kapsayıcısı olarak kullanılan özel bir değişken
* arrayın dimensionalı 2, 3, 4 olabilir... n boyutları
• N dimensional(boyutlu) array (N-1) boyutlu arrayler için bir kapsayıcıdır
*
* Single Dimensional Array: elementi kapsar
10
20
40
int[] array = {10, 20, 30};

*Multi Dimensional Array: container for the arrays(arrayi kapsar)

*N boyutlu array (N-1) boyutlu array içerir
*
* slaytın 3.sayfasına mutlaka bak yazamayacağım şeyler var
*
* int[]array2d={{1,2},{3,4,5},{6,7,8,9}};//N boyutlu array (N-1) boyutlu array içerir yani bu array 2 boyutludur
                array,  array,  array
         */

        String [] group1={"cüneyt","veli","fazilet"};
        String [] group2={"ibrahim","sibel","muhittin"};
        String [] group3={"sow","kuyt","webo"};

        String [][]groups=new String[3][];//toplam 3 boyutlu array demek,index:0,1,2
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(Arrays.toString(groups));//hashcode-tostring() sadece tek boyutlu arrayler için
        System.out.println(Arrays.deepToString(groups));//çok boyutlu arrayler için bunu kullanıyoruz

        System.out.println("-----------------------------------");

//index of the elements:0,1,2 ,0 1 2 3 , 0 1 2  3  4
        int[][]arr2d={{1,2,3},{4,5,6,7},{8,9,10,11,12}};//int[][]deki ilk karenin içine arrayin ID indexi geliyor.(one(single)dimensional array)//ikinci karenin içine ise elements in indexi geliyor
//index of the arrays    0        1            2

        System.out.println(Arrays.deepToString(arr2d));//üstteki sayıların hepsi önceki normal arraylerdeki gibi köşelerinde[] olacal şekilde out olur

        System.out.println(Arrays.toString(arr2d[1]));//{4,5,6,7]

        System.out.println(arr2d[2][3]);//2.arrayin 3.elementi yani 11 sayısı out olur



    }
}
