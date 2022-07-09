package day37_OOPInheritance.phoneTask;

public class Phone_1 {

    //Hierarchical Inheritance
    //package altındaki classları seçip sağ click ile diagram a basıp ne tür bit inheritence olduğunu gösteren diyagramı görebiliriz.

    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery;//=true;--aşağıya static blok yazmak yerine böyle yazmak daha kolaylık olur.

    public Phone_1(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
        //static instance variable için 3. bir seçenek olarak buraya da yazılabilir.-hasBattery=true; şeklinde
    }

    static {
        hasBattery=true;//üste static inctance variables koyuyorsak,buraya da static blok koymak gerekir.
        //ya da bunun kısayolu vardır.o da static satırına yazdığım gibidir.
    }

    public void call(long phoneNumber){
        System.out.println(brand+" "+model+" is calling"+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand+" "+model+" is texting"+phoneNumber);
    }

    public String toString() {
        return "Phone_1{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", has battery'" + hasBattery + '\'' +
                '}';
    }
}
