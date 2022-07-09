package day38_OOPInheritance.CarTask;

public class ParkingLot_5 {//parkingLot HAS A toyota,bmw and tesla

    public static void main(String[] args) {

        Toyota_2 toyota=new Toyota_2("camry",2020,20000,"gray",12753462);

        Tesla_4 tesla=new Tesla_4("model S",2022,95000,"red",0);

        BMW_3 bmw=new BMW_3("X5",2020,67350,"black",12000);


        toyota.start();//twist the key to ignition to starttoyota camry
        bmw.start();//call mechanic to jump startBMWX5
        tesla.start();//Say"Start" to startteslamodel S
    }
}
