package day34_GarbageCollectionAndAccesModifier;

public class AccessModifiers_2 {

    public static int publicData=100;//public
    static int defaultData=200;//default
    private static int privateData=300;//private

    public static void method1(){//bunlarda üsttekinin bi farklı yazılışı,sadece tekrar olsun diye
        System.out.println("method1");
    }
    static void method2() {
        System.out.println("method2");
    }
    private static void method3() {
        System.out.println("method3");
    }

    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);
    }
}
