package day43_OOPAbstraction.car;

public abstract class Car_1 {

    private final String brand,model;
    private String colour;
    private final int year;
    private double price;

    public Car_1(String brand, String model, String colur, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColour(colur);

        if (year<1886){//year 1886dan küçükse hata kodu verecek(serr gibi düşün)
            throw new RuntimeException("invalid year"+year);
        }
        this.year = year;
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    //sadece final instance variables olmayanlarda  setter olur.
    public void setPrice(double price) {

        if (price<=0){
            throw new RuntimeException("invalid price"+price);
        }
        this.price = price;
    }

    public void stop(){
        System.out.println("press the brake");
    }
    public abstract void start();//bunu böyle normal şekilde yazarsak kırmızı çizgi olur.o yüzden classı abstract yapmalıyız

    @Override
    public String toString() {
        return "Car_1{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
