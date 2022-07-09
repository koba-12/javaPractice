package day37_OOPInheritance.phoneTask;

public class Samsung_3 extends Phone_1{

    public Samsung_3(String model, String size, double price, String color) {
        super("samsung", model, size, price, color);
    }

    public void freeze(){
        System.out.println(brand+" "+model+" is freezing");
    }
}
