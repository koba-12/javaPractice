package day30_CustomClass;

public class Car_5 {

    /*
    car class:

        Attributes:brand,mpdel,colour,years,price

        Actions:drive(),start(),stop(),toString(),setInfo()
     */

    public String brand;
    public String model;
    public String colour;
    public int year;
    public double price;

    public void setInfo(String carBrand, String carModel, String carColour, int carYear, double carPrice){//5 arguments

        brand=carBrand;
        model=carModel;
        colour=carColour;
        year=carYear;
        price=carPrice;
        //diğer classta bu setInfo methodunu kullanabilmek için böyle eşledik

    }


    public String toString() {
        return "Car_5{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", price= $ " + price +//toString shortcuti sayesinde yazdık.sadece $ ı ben ekledim
                '}';
    }

    public void drive(){
        System.out.println("driving"+ model + brand);
    }


    public void start(){
        System.out.println(brand+" "+ model+"has started");
    }


    public void stop(){
        System.out.println(brand+" "+ model+"has stopped");
    }
}

