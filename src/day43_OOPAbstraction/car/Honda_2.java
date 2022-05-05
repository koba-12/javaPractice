package day43_OOPAbstraction.car;

public final class Honda_2 extends Car_1{

    public Honda_2(String model, String colur, int year, double price) {
        super("honda", model, colur, year, price);
    }

    public void start() {
        System.out.println("twist the key ignition");
    }
//parent class zaten abstract class olduğu için classta comp err oluyor.oto şekilde bu methodu(sout hariç)yazıyor.
//abstract methodu bu şekilde subclassa override ediyoruz.
}
