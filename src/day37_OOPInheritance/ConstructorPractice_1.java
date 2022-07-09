package day37_OOPInheritance;

class A{
    public A(){//int a){//şuan bu default constructor,çünkü parantez içi boş.eğer parantez içine bir değer vs. yazsaydım.
        // yani argument koyup defaultluğunuz bozsaydım, subclass comp err verirdi ve ben de manuel olarak kırmızı uyarıdan düzeltirdim.
        //düzelttikten sonra subclassa super() keyword gelirdi.super()in içine de örn buraya agument olarak int a yazdık
        //varsayalım,int a nın değerini yazardık.
        System.out.println("A");
    }
}

class B extends A{
    public B(){
        System.out.println("B");
    }
}

public class ConstructorPractice_1 {

    public static void main(String[] args) {

        B obj=new B();//alt alta A
                               //B

    }


}
