package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll_2 {

    public static void main(String[] args) {

        int[]arr={10, 10, 20, 30, 40, 30, 30, 30};

        arr=replaceAll(arr,30,300);//aşağıda yaptığım açıklamadan doğru.arr kümesi loopa girdiği zaman
 //eğer old value ya(bu örnek özelinde 30'a) denk gelirse yani i 30 a eşit olduğu zaman.i artık newValue olur.(bu örnek özelinde 300)
//ayrıca diğer replace örneğinde index no girmiştik ama burada değer(value)girecek şekilde kod yazdık.bunu sebebi "30" sayısının birden fazla kez tekrarlanması
        System.out.println(Arrays.toString(arr));// {10, 10, 20, 300, 40, 300, 300, 300}

        arr=replaceAll(arr,300,500);
        System.out.println(Arrays.toString(arr));//300ler yerine 500 gelir ve yeni bir tane daha out oluşur yani toplam 2 out olur.
    }
//eşleşen tüm old value ları new value ile değiştir.
    public static int[]replaceAll(int[]array,int oldValue,int newValue){

        for (int i = 0; i < array.length; i++) {//yazacağımız şeyi looplatmak için yazdık bu kodu
            if (array[i]==oldValue){//bir de condition koyduk.eğer loopa giren array üyeleri old value ise
                array[i]=newValue;//o element artık newvalueya eşit olur.
            }
        }
        return array;
    }

    //eşleşen tüm old value ları new value ile değiştir.
    public static double[]replaceAll(double[]array,double oldValue,double newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }

    //eşleşen tüm old value ları new value ile değiştir.
    public static char[]replaceAll(char[]array,char oldValue,char newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }

    //eşleşen tüm old value ları new value ile değiştir.
    public static String[]replaceAll(String[]array,String oldValue,String newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)){//buraya dikkat String olduğu için .equals kullandık
                array[i]=newValue;
            }
        }
        return array;
    }
}
/*
arr = {10, 10, 20, 30, 40, 30, 30, 30};
replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}
 */