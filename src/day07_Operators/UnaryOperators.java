package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        /*
        unary operators:
        +   unary plus operator     pozitif değeri gösterir
        -   unary minus operator    bir ifadeyi veya değeri olumsuzlar
        ++  increment operator      bir değeri 1 arttırır
        --  decrement operator      bir değeri 1 azaltır

         */
        int num1 = +25;
        int num2 = -25;

        System.out.println(num1 < 0 );//false
        System.out.println(num2 < 0);// true

        int a = 5;
        ++a;// pre increment: değeri 1 arttırdı
        System.out.println(a);//6

        --a;//pre decrement: değeri 1 düşürdü    //!! pre olunca yani değer sayının önündeyse
        // sıralı olur. yani 5 sayısı önce ++ ile 6 ya çıkar,sonra -- ile tekrar 5'e düşer.(4 olmaz yani)
        // Post için devamı altta
        System.out.println(a);//5

        //post ise kendinden sonrakine etki ediyor
        //pre vs post :
        //pre:değeri hemen değiştirir
        //post:değeri 2.adımda yani alt satırda değiştirir

        int c = 100; //post increment: kendinden sonrakine etki eder//yani ilk işlemden itibaren etki alta doğru gidiyor
        System.out.println(c++);//100
        System.out.println(c--);//101
        System.out.println(c);//100


        int x =200;
        System.out.println(--x);//pre decrement:hemen düşürür=199

        int y = 200;
        System.out.println(x--);//post increment:sonrakine etki eder=200(sonraki sout 199 a düşecek)

        int z = 45;
        System.out.println(++z);//46
        System.out.println(z++);//46
        System.out.println(z);//47

        int q = 30;
        System.out.println(--z);//29
        System.out.println(z--);//29
        System.out.println(z);//28

    }
}
