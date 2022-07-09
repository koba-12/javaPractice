package day43_OOPAbstraction.car;

public final class Audi_3 extends Car_1{

    public Audi_3(String model, String colur, int year, double price) {
        super("audi",model, colur, year, price);
    }

    @Override
    public void start() {

    }

    public void autoPark(){
        System.out.println(getBrand()+" "+getModel()+" has auto park feature");
    }
}
