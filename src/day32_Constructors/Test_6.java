package day32_Constructors;

public class Test_6 {

    public Test_6(){
        System.out.println("A");
    }

    public Test_6(int a){//A B
        this();
        System.out.println("B");
    }

    public Test_6(double a){//A B C
        this(10);
        System.out.println("C");
    }

    public Test_6(String str){//A B C D
        this(2.5);
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Test_6("java");//alt alta A B C D out olur.mesela buraya 5.5 yazsam double olduğu için A B C çıkar son constuctoru almazdı.
    }
}
