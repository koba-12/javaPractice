package day33_Statics;

public class Constructor_vs_StaticBlock_9 {

    static {
        System.out.println("static block");
    }

    public Constructor_vs_StaticBlock_9(){//aşağıda main methoda object eklemezsem eğer burası çalışmaz
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new Constructor_vs_StaticBlock_9();//bunu yazarsam(object eklemiş oldum)constructordan out alırım.
    }
}
