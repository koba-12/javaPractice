package day27_WrapperClasses;

public class WrapperClassMethods_5 {

    public static void main(String[] args) {

        //1. parse methods: converts String to primitive

        String str="123";

        int num= Integer.parseInt(str);//int için parse method kullandık.orada Integer yazmasına rağmen burada int e döndürdük.
                                       //burada stringi primitive e döndürdük.
        System.out.println(num+1);//124
        System.out.println(str+1);//1231



        String str2="10.5";

        double num2=Double.parseDouble(str2);//double

        System.out.println(num2+1);//11.5



        String s1="maybe";
        boolean r1=Boolean.parseBoolean(s1);
        System.out.println(s1);



        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        System.out.println("max = " + max);//intin rangeindeki max sayıyı verir
        System.out.println("min = " + min);//intin rangeindeki min sayıyı verir.


        long max2=Long.MAX_VALUE;
        long min2=Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);


        System.out.println("-----------------------------------------");

        //2. valueOf methods: converts String to wrapper class

        String s2="123";

        Integer x= Integer.valueOf(s2);//Integer
        int y= Integer.valueOf(s2);//Integer--ikisi de olur ikisi de Integer a döndürür.çünkü valueOf method kullandık.
                                 //valueOf method sadece Wrapper classa döndürür.yani bu örnek özelinde Integer a.

        System.out.println(x+1);//124
        System.out.println(y+1);//124  ikisi de INteger a döndü ikisi de aynı.



        String s3="10.5";

        Double z = Double.valueOf(s3);

        System.out.println(s3+1);//10.51


        System.out.println("-------------------------------------------");

        //ayrıca Character özelinde 3 ek method daha var isDigit() ve isLetter()

        char ch1='A';

        //isDigit()=sadece sayılar için
        boolean r2=Character.isDigit(ch1);//false verir.çünkü ch1 digit(sayı) değil

        //isLetter=sadece harfler için
        boolean r3=Character.isLetter(ch1);

        //!isLetterOrDigit()--special character
        boolean r4=!Character.isLetterOrDigit(ch1);//Character veya digit değil yaptık.! işareti sayesinde

        //isuppercase()
        boolean r5=Character.isUpperCase(ch1);

        //islowerCase()
        boolean r6=Character.isLowerCase(ch1);

        System.out.println(r2);//false
        System.out.println(r3);//true
        System.out.println(r4);//false
        System.out.println(r5);//true
        System.out.println(r6);//false

        System.out.println("-----------------------------------------------");

        String s="ab1cd2efg3hi4";

        int sum=0;

        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);//bu kodlarla Stringi ayrıştırıp sadece sayıların toplanmasını sağladık
            }
        }
        System.out.println("sum = " + sum);
    }
}
