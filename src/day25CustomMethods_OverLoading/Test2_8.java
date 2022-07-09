package day25CustomMethods_OverLoading;

import Utilities.ArraysUtility_2;

public class Test2_8 {

    public static void main(String[] args) {

        int[]arr1={1,2,3,4,5};

        ArraysUtility_2.printEachElement(arr1);//utilities packgedeki arraysutility sayesinde
//bunu yazdık. orada o kodu yazdıktan sonra bu şekilde farklı yerlerde kolayca kullanabiliriz.
//önce classın adını yazıyoruz.sonra nokta koyup uygun printeachelement i yazıyoruz.örneğin burada
//int olan printeachelement i seçtik.alttakinde double olanı sonra da char ve stringi.parantez içine de
//işleme girmessini istediğimiz değerlerin variableını yazıyoruz
        System.out.println("--------------------------------------------------");

        double[]arr2={1.5,2.5,3.5,4.5};

        ArraysUtility_2.printEachElement(arr2);

        System.out.println("-----------------------------------");

        char[]arr3={'A','B','C','D'};

        ArraysUtility_2.printEachElement(arr3);

        System.out.println("----------------------------------------");

        String []arr4={"alex","carlos","deivid","volkan"};

        ArraysUtility_2.printEachElement(arr4);

        System.out.println("--------------------------------------");








        int[]n1={1,2,3,4,5,6};//sayılarımız bunlar(unutmayalımki burada yazılanların tümü utilities packagedekilerle ilgili

        int max1=ArraysUtility_2.max(n1);//ArraysUtility classteki işlemi n1 kümesine istedik

        System.out.println("max1 = " + max1);

        System.out.println("----------------------------------");

        double[] n2={1.5,2.5,3.5,4.5,5.5};

        double max2=ArraysUtility_2.max(n2);

        System.out.println("max2 = " + max2);


        System.out.println("-------------------------------------");

        int[] d1={1,2,3,4,5,6,7};
        int min1=ArraysUtility_2.min(d1);
        System.out.println("min1 = " + min1);

        System.out.println("-------------------------------------------");

        double[]d2={1.5,2.5,3.5,4.5,5.5};
        double min2=ArraysUtility_2.min(d2);
        System.out.println("min2 = " + min2);


        System.out.println("-----------------------------------------------------");




        int[]a1={1,2,3,4,5,6,7};

        boolean r1=ArraysUtility_2.contains(a1,5);//Arraysutilityde each==element ise true demiştik.
        // each a1 in her sayısı oluyor.element bölümüne de 5 sayısını girdik.yani a1 in herhangi bir sayısı 5 içerir mi.(contains method9bunu istiyoruz
        //elementimiz 5 each kümesinde olduğundan yani eşlendiğinden(yani matching olduğundan-muhtar o kelimeyi kullanıyor-)
        // yani arrayin herhangi bir elementi olduğundan condition true çıkar.içermeyen bir sayı yazsak element olarak false çıkardı.

        System.out.println("r1 = " + r1);





    }
}
