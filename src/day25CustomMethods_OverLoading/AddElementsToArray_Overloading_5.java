package day25CustomMethods_OverLoading;

import java.util.Arrays;

public class AddElementsToArray_Overloading_5 {

    public static void main(String[] args) {

        int[]numbers={1,2,3,4,5,6};
        numbers=addElement(numbers,7);

        char[]chars={'A','B','C','D'};
        chars=addElement(chars,'E');

        String[]names={"volkan","diego","edu","deivid"};
        names=addElement(names,"guiza");

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("names = " + Arrays.toString(names));

    }


    public static int[] addElement(int[] array, int element) {

        int[] result = new int[array.length + 1];//5 i eklemesi için

        int i = 0;
        for (int each : array) {//burada looplattık arrayin içini,diikat bu loopta neleri yazdığımıza
            result[i++] = each;
        }
        result[i] = element;//resultü elemente eşledik
        return result;
    }

    public static double[] addElement(double[] array, double element) {//üsttekinin aynısının double ı
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {//burada looplattık arrayin içini
            result[i++] = each;
        }
        result[i] = element;//resultü elemente eşledik
        return result;
    }

    public static String[] addElement(String[] array, String element) {//üsttekinin aynısının String ı
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {//burada looplattık arrayin içini
            result[i++] = each;
        }
        result[i] = element;//resultü elemente eşledik
        return result;
    }

    public static char[] addElement(char[] array, char element) {//üsttekinin aynısının char ı
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {//burada looplattık arrayin içini
            result[i++] = each;
        }
        result[i] = element;//resultü elemente eşledik
        return result;
    }
}

