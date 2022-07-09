package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray_7 {

    public static void main(String[] args) {

        int[]arr={1,2,3,4,5};//bu arrayimiz yani "i"

        int[]result=reverse(arr);//yeni arrayimiz result = aşağıda yapılan işlem sonucu "i" nin sondan başa loopu

        System.out.println(Arrays.toString(result));
    }
//arrayi tersine çevirir,yeni bir arraye dönüştürür
    public static int[]reverse(int[]array){

        int[]result=new int[array.length];//bu yeni array için
        int j=0;//j yi oluşturmuş olduk bu reverse ü temsil edecek
        for (int i = array.length - 1; i >= 0; i--) {//i yi yani arrayimizi sondan başa doğru loopladık
            result[j++]=array[i];//böylece yeni arrayimiz = i nin yani önceki arrayin sondan başa doğru loopudur
        }
        return result;
    }

    //arrayi tersine çevirir,yeni bir arraye dönüştürür
    public static double[]reverse(double[]array){

        double[]result=new double[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];
        }
        return result;
    }

    //arrayi tersine çevirir,yeni bir arraye dönüştürür
    public static char[]reverse(char[]array){

        char[]result=new char[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];
        }
        return result;
    }

    //arrayi tersine çevirir,yeni bir arraye dönüştürür
    public static String[]reverse(String[]array){

        String[]result=new String[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];
        }
        return result;
    }


}
