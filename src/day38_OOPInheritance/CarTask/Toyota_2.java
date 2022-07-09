package day38_OOPInheritance.CarTask;

public class Toyota_2 extends Car_1{


    public Toyota_2(String model, int year, double price, String color, int miles) {
        super("toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand+model+" is reliable");
    }//extra method

    public void start(){//bu method overridingdir.Return type, method name and parameters aynı olmalıdır
        System.out.println("twist the key to ignition to start"+brand+" "+model);
    }
}
