package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        /*
        assignment: x=y    yani  x=y
        addition assignment: x+=y      yani    x=x+y
        substraction assignment=  x-=y   yani   x=x-y
        multiplication assignment:  x*=y  yani   x=x*y
        division assignment:  x/=y    yani  x=x/y
        remainder assignment: x%=y   yani  x=x%y
         */

        //assignment=basit zaten hep yaptığımız
        int number = 100;
        System.out.println("number = " + number);//100

        String word = "Java Programming";
        System.out.println("word = " + word);//"Java Programming"

        word = "Wooden Spoon";
        System.out.println("word = " + word);//woooden spoon--böyle de oluyormuş--asignment dan dolayı sanırım

        word = "123";
        System.out.println("word = " + word);//"" işareti koymak gerekir

        word = "123"+1;//1231
        System.out.println("word = " + word);
        word = "123"+"1";//1231// çünkü int işlemleri lazım
        System.out.println("word = " + word);

        int a = 123+1;
        System.out.println("a = " + a);//124 verir çünkü sayılarda "" işareti olmaz!!!
        //sadece stringde yani kelimelerde "" işareti olur!!1

        System.out.println("---------------------");

        //addition assignment

        int x = 100;
        System.out.println("x = " + x);
        System.out.println(x+200);//300

        //x=x+200 --- formül bu
        x+=200;//işte bu addition assignment işareti yani x+=y  gelince x=x+y işlemi yapıyoruz
        // yani x kendisi artı y sayısına eşit oluyor
        //Önemli not!!! normalde = işaretinin önüne arkasına boşluk bırakıyorum ama burada önüne boşluk bırakılmaz.
        //-hata verir
        System.out.println("x = " + x);//300

        String str = " Wooden";
        str+= "Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1);//2.5

        num1+= 5.5;
        System.out.println("num1 = " + num1);//8.0

        double availableBalance = 1000.5;
        //deposit 300$
        availableBalance+= 300;  // availableBalance=availableBalance(1000.5)+300
        System.out.println("availableBalance = " + availableBalance);//1300.5

        System.out.println("---------------------------");

        //substraction assignment //aynısının çıkarma işlemlisi
        //withdrawing 500$
        availableBalance-= 500;
        System.out.println("availableBalance = " + availableBalance);//800.5//birikerek geldi
        availableBalance-= 200;//600.5
        availableBalance+= 400;//1000.5
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("------------------------------");

        //multiplication assignment aynısının çarpmalısı

        double salary = 50000.5;
        salary*= 2;
        System.out.println("salary = " + salary);//100001.0

        double dodge = 0.00000001;
        dodge*= 1000000;
        System.out.println("dodge = " + dodge);//0.01

        System.out.println("--------------------------");

        //division assignment aynısının bölmelisi

        double num2 = 25000.0;// bu sonlardaki .0 unutulmamalı ondalık yapmak için
        num2 /= 2;
        System.out.println("num2 = " + num2);//12500.0

        System.out.println("--------------------------");

        //modulus assignment aynısını kalanlı yapacağız

        double num3 = 100;
        num3 %= 3;
        System.out.println("num3 = " + num3);//1.0

        System.out.println("--------------------------");

        int amount =127;
        int quarters = amount/25;
        int cents = amount%25;
        System.out.println("quarters = " + quarters);//5
        System.out.println("cents = " + cents);//2 kalan

        System.out.println("--------------------------");

        int cents2 = 127;
        cents2 %=25;
        System.out.println("cents2 = " + cents2);

        int y = 300;
        y %=16;
        System.out.println("y = " + y);

        int balance = 3500;
        balance %=153;
        System.out.println("balance = " + balance);

        System.out.println("--------------------------");













    }
}
