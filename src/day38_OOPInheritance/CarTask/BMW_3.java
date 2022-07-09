package day38_OOPInheritance.CarTask;

public class BMW_3 extends Car_1{


    public BMW_3(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){//extra methods
        System.out.println(brand+" "+model+" is breaking down");
    }
    public void racing(){
        System.out.println(brand+" "+model+" is a racing car");
    }

    public void start(){
        System.out.println("call mechanic to jump start"+brand+model);
        //burası da method overriding ama manuel yazdım.
    }
}
