package day33_Statics;

public class Iphone_5 {

    public static String brand="Iphone";//kısaca özetlemek gerekirse,staticte bir sabitlik söz konusu.yani Iphone onject classa
//farklı brandler(3-5 tane farklı mesela) de yazzsak sadece tek bir brand olacak.sabit tek bir brand.bu taski sabit
//iphone brandi altındaki değişken model, price vs olarak düşünebiliriz
//yahut bu kodun sonuna ...brand=Iphone yazmışım gibi düşünebiliriz(hatta yazayım daha anlaşılır olsun)

    public String model;
    public double price;
    public static String OS="iOS";//BU STATIC VARIABLEDIR
    public String color;
    public String size;
    public static String madeIn="china";
    public static boolean hasBattery=true;
    public static boolean isTouchScreen=true;
    public static boolean hasFaceTime=true;

    public void printOperatingSystem(){//BU DA STATİC METHODDUR
        System.out.println(OS);
    }


    //public static void printModelAndPrice(){
        //System.out.println(model+":"+price);//static methods doesnt accept instance
    public void method1(){
        System.out.println(model+":"+price);//ama instance method hem instance hem static kabul eder
        System.out.println(OS);
    }
}
