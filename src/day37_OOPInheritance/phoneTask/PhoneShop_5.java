package day37_OOPInheritance.phoneTask;

public class PhoneShop_5 {

    public static void main(String[] args) {

        Iphone_2 iphone=new Iphone_2("iphone12","6.7 inches",1000,"black");
        //iphone classta brande zaten ıphone yazdığımız bu objecti oluştururken brand sormadı bize,çünkü onu zaten yazdık,belli

        Samsung_3 samsung=new Samsung_3("galaxy s19","6 inches",900,"white");

        Nokia_4 nokia=new Nokia_4("brick","4 inches",50,"gray");

        System.out.println(iphone);
        //Phone_1{brand='Apple', model='iphone12', size='6.7 inches', price=1000.0, color='black', has battery'true'}
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);//Apple iphone12 is calling911
        iphone.text(123456789);//bu ikisi ortak özelliklerden geldi.

        iphone.faceTime(987654321);//bunlar da iphoneun kendine has özelliği.iphone classa özel yazdığımız için geldi.
        //Apple iphone12 is having a facetime with987654321
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("--------------------------------------------");

        samsung.call(123455678);
        samsung.text(89876475);

        samsung.freeze();//samsung galaxy s19 is freezing

        System.out.println("--------------------------------------------------");

        nokia.call(568790);
        nokia.text(22439876);

        nokia.selfDefence();//you can use nokia brick as self defence tool

        System.out.println("--------------------------------------------------");

        System.out.println(Phone_1.hasBattery);//dördü de true
        System.out.println(Iphone_2.hasBattery);
        System.out.println(Samsung_3.hasBattery);
        System.out.println(Nokia_4.hasBattery);


    }
}
