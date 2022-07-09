package day43_OOPAbstraction.car;

public final class Tesla_4 extends Car_1{

    public Tesla_4(String model, String colur, int year, double price) {
        super("tesla", model, colur, year, price);
    }

    public void start() {
        System.out.println("say\"start\"");
    }
    public void autoPilot(){
        System.out.println(getBrand()+" "+getModel()+"has auto pilot feature");
    }


}
