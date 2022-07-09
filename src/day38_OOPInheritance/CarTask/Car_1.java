package day38_OOPInheritance.CarTask;

public class Car_1 {

    public String brand,model;
    public int year;
    public double price;
    public String color;
    public int miles;

    public Car_1(String brand, String model, int year, double price, String color, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public void start(){
        System.out.println(brand+" "+model+" is starting");
    }
    public void drive(){
        System.out.println(brand+" "+model +" is driving");
    }

    public String toString() {
        return "Car_1{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }

    //public void fly(){
    //fly() is not common for all,the cars and parent class should only contain the common feature of all the subclasses
    //fly() herkes için ortak değildir, arabalar ve üst sınıf yalnızca tüm alt sınıfların ortak özelliğini içermelidir
}
