package day37_OOPInheritance.phoneTask;

public class Nokia_4 extends Phone_1{

    public Nokia_4(String model, String size, double price, String color) {
        super("nokia", model, size, price, color);
    }

    public void selfDefence(){
        System.out.println("you can use "+brand+" "+ model+" as self defence tool");
    }
}
