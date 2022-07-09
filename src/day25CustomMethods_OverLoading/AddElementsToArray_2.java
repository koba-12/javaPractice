package day25CustomMethods_OverLoading;

import java.util.Arrays;

public class AddElementsToArray_2 {

    public static void main(String[] args) {//ilk başa şunu yazayımreplace(yer değiştirme kısayolunu öğrendik burada
        //kısayollarda daha açıklamalı hali var.ctrl+r)

        int[] arr = {1, 2, 3, 4};//arrayimiz bu ama aşağıdaki yaptıklarımız sayesinde 5 i de ekledik

        arr = addInteger(arr,5);//burada 5.sayıyı eklemek için değil 5 sayısını eklemek için 5 yazdık!!!

        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

        arr2 = addDouble(arr2, 5.5);

        System.out.println(Arrays.toString(arr2));

        System.out.println("------------------------------------");

        String[] names = {"tatiana", "olga", "anna", "ekaterina"};//artı arina

        names=addString(names, "arina");//buraya sadece arina yazmamız yeterli olur,onu ekler.çünkü başta namese eşitledik
        names=addString(names,"melissa");//6.yı da eklemiş olduk

        System.out.println(Arrays.toString(names));

        System.out.println("-------------------------------");

        char[]chars={'A','B','C','D'};

        chars=addchar(chars,'E');

        System.out.println(Arrays.toString(chars));
    }

    public static int[] addInteger(int[] array, int element) {

        int[] result = new int[array.length + 1];//5 i eklemesi için

        int i = 0;
        for (int each : array) {//burada looplattık arrayin içini,diikat bu loopta neleri yazdığımıza
            result[i++] = each;
        }
        result[i] = element;//resultü elemente eşledik
        return result;
    }

    public static double[] addDouble(double[] array, double element) {//üsttekinin aynısının double ı
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {//burada looplattık arrayin içini
            result[i++] = each;
        }
        result[i] = element;//resultü elemente eşledik
        return result;
    }

    public static String[] addString(String[] array, String element) {//üsttekinin aynısının String ı
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {//burada looplattık arrayin içini
            result[i++] = each;
        }
        result[i] = element;//resultü elemente eşledik
        return result;
    }

    public static char[] addchar(char[] array, char element) {//üsttekinin aynısının char ı
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {//burada looplattık arrayin içini
            result[i++] = each;
        }
        result[i] = element;//resultü elemente eşledik
        return result;
    }
}

/*
1. create a return method called addInteger that can add
an Inteeger  after the  last index of an integer array
{1,2,3,4}, 5
new array ==> {1,2,3,4,5}
    2. create a return method called addDouble that can add a
double after the last index of a double array
    3. create a return method called addString that can add a
String after the last index of a String array
    4. create a return method called addChar that can add a
char after last index of a char array
 */
