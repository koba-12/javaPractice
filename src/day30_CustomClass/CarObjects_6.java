package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects_6 {

    public static void main(String[] args) {

        Car_5 car1=new Car_5();
        car1.setInfo("toyota","camry","white",2021,35000);
        System.out.println(car1);//Car_5{brand='toyota', model='camry', colour='white', year=2021, price= $ 35000.0}

        Car_5 car2=new Car_5();
        car2.setInfo("BMW","335is","black",2020,45000);
        System.out.println(car2);//Car_5{brand='BMW', model='335is', colour='black', year=2020, price= $ 45000.0}

        Car_5 car3=new Car_5();
        car3.setInfo("audi","q7","red",2020,40000);
        System.out.println(car3);//Car_5{brand='audi', model='q7', colour='red', year=2020, price= $ 40000.0}


        ArrayList<Car_5>carsList=new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));

        for(Car_5 each: carsList){
            System.out.println(each.brand+" "+ each.price);
            /*

toyota 35000.0
BMW 45000.0
audi 40000.0
             */

            System.out.println("-------------------------------------------------");

            carsList.removeIf(p-> p.brand.equals("bmw")&& p.year>=2005&& p.year<= 2008);//eligible vs dedi onun için
            carsList.removeIf(p-> p.brand.equals("toyota")&&p.year>= 1995&& p.year <= 1998);
        }


    }
}
