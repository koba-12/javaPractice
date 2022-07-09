package day32_Constructors;

public class CarObjects_8 {

    public static void main(String[] args) {

        Car_7 car1=new Car_7("toyota");

        Car_7 car2=new Car_7("honda","accord");

        Car_7 car3=new Car_7("lexus","rx350",2021);

        Car_7 car4=new Car_7("BMW","X6",2020,50000);

        Car_7 car5=new Car_7("tesla","model 3",2019,70000,"black");


        System.out.println(car1);//Car_7{brand='toyota', model='null', year=0, price=0.0, color='null'}
        System.out.println(car2);//Car_7{brand='honda', model='accord', year=0, price=0.0, color='null'}
        System.out.println(car3);//Car_7{brand='lexus', model='rx350', year=2021, price=0.0, color='null'}
        System.out.println(car4);//Car_7{brand='BMW', model='X6', year=2020, price=50000.0, color='null'}
        System.out.println(car5);//Car_7{brand='tesla', model='model 3', year=2019, price=70000.0, color='black'}


    }
}
