package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElement1_3 {

    public static void main(String[] args) {

        int[]numbers={100,200,300,400,500,600};

        numbers=removeElement(numbers,1);//1 nolu index--yeni array yaratır.{100,300,400,500,600}

        numbers=removeElement(numbers,1);//{100,400,500,600}-yaratılan yeni arrayin 1 nolu indexini çıkardı.
        //ama bize out olarak 2 tane array vermedi.en sonuncuyu out olarak verdi yani sadece {100,400,500,600} out oldu.

        System.out.println(Arrays.toString(numbers));
    }
//removes the index from the array returns new array
    //                              {1,2,3,4]     2(index no)
    public static int[]removeElement(int[]array,int index){

        if (index<0||index> array.length-1){//bunu en son ekledik.bu da eğer geçerli olmayan bir index no girersek hata vermesi için
            System.err.println("invalid index"+index);
            System.exit(0);
        }
        int[]result=new int[array.length-1];//result=yukarıda yazacağım array

        int j=0;//burası şuanki resultümüzün index numberı(başlama noktası)

        for (int i=0;i< array.length;i++) {//arrayi looplatıyoruz
//buraya ilk önce for each loop yazdık ama sonra hatalı olduğunu gark edip değiştirdik.çükü for each loop only checks elements dedi
//ama biz burada index number arıyoruz
            if (i==index){//eğer loopta arrayin yazılan indexi gelirse onu atlıyoruz.(continue ile)
                //if the index of array is matching with at given index

                continue;//skip
            }
            result[j++]=array[i];//yeni resultümüz looplanan arrayin içinden çıkarılan sayı ile gelen yeni sonuç
        }
        return result;
    }


}

/*
2. Create a class named RemoveElements:
2.1 Create a method that passes two parametetrs: an integer array and an integer index. the method removes the
element at the given index of the array and returns the new array


Ex:
int[] arr =
{10,20,30,40}
removeElement(arr, 2) ==> {10, 20, 40}


2.2 Create a method that passes two parametetrs: a double array and an integer index. the method removes the
element at the given index of the array and returns the new array

2.3 Create a method that passes two parametetrs: a char array and an integer index. the method removes the
element at the given index of the array and returns the new array

2.4 Create a method that passes two parametetrs: a String array and an integer index. the method removes the
element at the given index of the array and returns the new array
 */
