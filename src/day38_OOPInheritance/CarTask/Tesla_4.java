package day38_OOPInheritance.CarTask;

public class Tesla_4 extends Car_1{


    public Tesla_4( String model, int year, double price, String color, int miles) {
        super("tesla", model, year, price, color, miles);
    }

    @Override
    public void start() {
        //super.start();-bunu silip sout yazalım
        System.out.println("Say\"Start\" to start"+brand+model);//manuel
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+" in autopilot mode");

        //sağ click generate override methods yapınca 2 bölüm çıkar.biri java.lang.object(implicitlydir-dolaylo)
//biri de superclasstır(burada Car_1).oradan methodları seçeriz.örneğin aşağıdaki start methodu gibi.!shortcut!
//override ı silmeye gerek yok.(neden oldu bilmiyorum ama yapınca üstte çıkıyor method.)





    }
}
