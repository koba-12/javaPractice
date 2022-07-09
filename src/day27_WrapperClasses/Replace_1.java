package day27_WrapperClasses;

import java.util.Arrays;

public class Replace_1 {

    public static void main(String[] args) {

        int[]arr={1,2,3,4,5};

        arr=replace(arr,2,30);//aşağıdaki açıklamalardan doğru buradaki 2 index nosu artık 30 un index nosudur

        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------------------------");

        String []arr2={"veli","fazilet","sibel","ibrahim"};

        arr2=replace(arr2,1,"cüneyt");//fazilet yerine cüneyt gelir

        System.out.println(Arrays.toString(arr2));
    }

//verilen indexteki arrayin elementini yeni elementle değiştirin
                        //  {1,2,3,4,5}       2           30
    public static int[]replace(int[]array,int index,int newElement){//replace yapmak için bu 3 parameterı girdik

        if (index<0||index> array.length-1){//replace yapılacak yani yer değiştirelecek sayının index nosunu ayarladık
            System.err.println("invalid index"+index);
            System.exit(0);
        }
        array[index]=newElement;//main methodda index bölümüne yazacağımız index nolu sayıyı newelemente eşitledik.
   //yani bu şu anlama geliyor main methodda yazacağım newelement yine main methoda yazacağım index numarasının yeni sahibi olacak.eski sahibinin yerine
        return array;
    }
//NOT: DOUBLE,CHAR VE STRİNGİ İNT'İ KOPYALAYARAK OLUŞTURDUĞUM İÇİN FAZLA YER KAPLAMASIN DİYE TÜRKÇE AÇIKLAMALARI KASITLI SİLİYORUM
    public static double[]replace(double[]array,int index,double newElement){
        //!!!index number is always an integer(int)    //index numarası her zaman tam sayıdır
        if (index<0||index> array.length-1){
            System.err.println("invalid index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    public static char[]replace(char[]array,int index,char newElement){
        //index number is always an integer(int)!!!       //index numarası her zaman tam sayıdır
        if (index<0||index> array.length-1){
            System.err.println("invalid index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    public static String[]replace(String[]array,int index,String newElement){
        //index number is always an integer(int)!!!   //index numarası her zaman tam sayıdır

        if (index<0||index> array.length-1){
            System.err.println("invalid index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }
}
/*
1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method
replaces the element of the array at given index with the new element, and returns the new array.
Ex:
arr = {1,2,3,4,5};
replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}
1.2 Create the same functions for double arrays, char
arrays, and String arrays
 */