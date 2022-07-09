package day18_NestedLoop;

public class DivideTwoNumbers_1 {

    public static void main(String[] args) {


        int a = 30;//30-7=23-7=16-7=9-7=2  --- döngü bu işlemleri yapar ta ki a,b den küçük olana dek
        int b = 7;

        int count =0;//1+1+1+1=4 //işlemi 4 kere tekrarlar

        while (a>=b){//bu while loopunu şöyle düşünelim.diğer looplar için de böyle düşünülebilir.a,b den büyük veya eşit olduğu sürece
            a-=b;//buradaki işleme yapmaya devam et
            count++;//artıya doğru
        }
        System.out.println(count + " with a remainder of " + a);//4 ve kalan da 2 out olur

        /*
        1. Write a program that can divide two positive numbers without
using / (division) and * (multiplication) and % operators
20 / 6 ==> 3 with the reaminder of 2
a = 20
b = 6;

a -= b;  // a = 14
a -= b;  // a = 8
a -= b;  // a = 2

x = 100;
y = 8;

while(a >= b){
a -= b;
count++;
}
         */
    }
}
