package day25CustomMethods_OverLoading;

import java.util.Arrays;

public class MethodOverloadingIntro_3 {

    /*
    slayta mutlaka bak!!!
• Aynı ada sahip birden fazla yönteme sahip olmamızı sağlar
* Parametreler farklı olmalıdır (veri türü veya parametre sayısı)
* Kod okunabilirliğini ve yeniden kullanılabilirliğini artırır
• Birden fazla yöntem adını hatırlamak yerine bir yöntem adını hatırlamak daha kolaydır

method overloading: aynı yöntem adını paylaşan birden çok farklı yöntem(örn.Array.sort(int array)---Array.sort(double array))
ikisi de .sort ama biri int biri double
same method name, different parameters
return type, access modifiers and specifiers can be same or can be different(dönüş türü, erişim değiştiricileri ve belirteçleri aynı olabilir veya farklı olabilir)

Advantage:
1. easy to memorize(ezberlemek kolay
2. easy to read(okunması kolay)
3. reusable(kullanımlık)
4. flexible(esnek)

Hatırlanması Gerekenler
* overloadingin parametreleri farklı olmalıdır
* overloadingmethodun return type ı aynı veya farklı olabilir
* method herhangi bir sayıda aşırı yüklenebilir(overloading yapılabilir)
• Herhangi bir yöntem aşırı yüklenebilir(any method can be overloaded)

     */
    public static void main(String[] args) {

        int[] intArray={5,6,0,-1,3,4};
        Arrays.sort(intArray);

        double[]doubleArray={10.5,11.5,5.5,4.5};
        Arrays.sort(doubleArray);

        char[]charArray={'E','F','B','D','C','A'};
        Arrays.sort(charArray);

        System.out.println("-----------------------------");

        int sum1=sumOfNumbers(10,20);//burada 2 int var yani 2 parameters.unutmayalımki parameters ysayısı FARKLI OLMALIDIR.

        int sum2=sumOfNumbers(10,20,30);//sumofnumbersı seçerken hangisini seçtiğimize dikkat etmeliyiz yoksa hata verir.
        //mesela burada 3 int olanı seçtik

        int sum3=sumOfNumbers(10,20,30,40);//bize aynı metodtan seçme imkanı sağlıyor.

        double sum4=sumOfNumbers(18.2,30.7);

        double sum5=sumOfNumbers(4.5,5.5,6.5);

        double sum6=sumOfNumbers(4.5,3.5,2.5,6.5);
    }

    public static int sumOfNumbers(int num1,int num2){//bunların üçü de farklı metodlardır.ama aynı isme sahip farklı metodlardır.
        return num1+num2;
    }
//örneğin buraya 2 parameterslı bir double methodu yazsaydık overloading olmazdı.çünkü 1.kural same method name different parameters
    public static int sumOfNumbers(int num1,int num2,int num3){
        return num1+num2+num3;
    }

    public static int sumOfNumbers(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }

    public static double sumOfNumbers(double num1,double num2){
        return num1+num2;
    }
    public static double sumOfNumbers(double num1,double num2,double num3){
        return num1+num2+num3;//ama bu şekilde 2 tane daha overloading kurallarına uygun double methodu yazarsak yine onlar da kendi arasında overloading olacaktır
    }

    public static double sumOfNumbers(double num1,double num2,double num3,double num4){
        return num1+num2+num3+num4;
    }


}
