package day23_CustomMethods_VoidMethod;

public class CustomMethodsPractice_3 {

    public static void main(String[] args) {

        helloWorld5Times();

        System.out.println("----------------------");

        helloCydeo5Times();

        System.out.println("-------------------------");

        evenNumbers();
    }//bunları aç çalışırken.üstüne gelince de içeriğini gösteriyor


//create a function tjat can print hello world 5 times-----helloWorld5Times()---functionı burada çok kullanacağız anlamı işlev,fonksiyon demek
    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("hello world");
        }
    }
// create a function that can print wooden spoon 5 times----helloCydeo5Times
    public static void helloCydeo5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("wooden spoon");
        }
    }
//create a function that can print all the even numbers from 1-10-----evenNumbers

    public static void evenNumbers(){
        for (int i=2;i<11;i+=2){
            System.out.println(i);
        }
    }
}
