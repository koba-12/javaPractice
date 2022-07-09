package day43_OOPAbstraction.car;

public class CarShop_5 {

    public static void main(String[] args) {

        //Car_1 car1=new Car_1("cydeo",25,"blue",2022,100000);
//we create object from abstract class,because abstract class is not concrete

        Honda_2 honda= new Honda_2("accord","black",2019,30000);
        Audi_3 audi=new Audi_3("q7","blue",2017,45000);
        Tesla_4 tesla=new Tesla_4("model3","white",2020,60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("--------------------------------");

        honda.setColour("red");//Car_1{brand='honda', model='accord', colour='black', year=2019, price=30000.0}
        audi.setColour("pink");//Car_1{brand='audi', model='q7', colour='blue', year=2017, price=45000.0}
        tesla.setColour("green");//Car_1{brand='tesla', model='model3', colour='white', year=2020, price=60000.0}
        //renkleri set ettik.

        honda.setPrice(25000);
        audi.setPrice(45000);
        tesla.setPrice(55000);


    }
}
