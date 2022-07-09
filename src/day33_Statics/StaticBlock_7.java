package day33_Statics;

public class StaticBlock_7 {

    //day34 konusu ama karışmaması ve bütünlük olması açısından buu packagea yazıyorum

    public static void main(String[] args) {

        System.out.println("main method");
    }

    static {//her şeyden önce runlar(yani en tepede bunun outu olur)ve sadece 1 kere run yapar,birden fazla static block varsa alt alta sıralanır
        System.out.println("static block");
    }
}
