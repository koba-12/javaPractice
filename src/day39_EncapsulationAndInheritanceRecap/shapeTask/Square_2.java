package day39_EncapsulationAndInheritanceRecap.shapeTask;

public class Square_2 extends Shape_1{

    private double side;//variables

    public double getSide() {//getter kullanmak için
        return side;
    }

    public void setSide(double side) {//getter and setter oluşturduk.condition yazdık
        if (side<=0){
            System.err.println("invalid side"+side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square_2(double side) {//shortcutta bu constructorda çıkan name i silip aşağıya square yazdık
//bu constructor sayesinde oluşturacağımız objectte side kısmını göreceğiz ve oraya değer yazabileceiğiz.(name zaten belli yazdım)
//yazdığımız side değeri sayesinde methodlardaki side yerine koyduğum değer gelecek ve formüller işleyecek
        super("square");
        setSide(side);
    }
//altta da 3 methodumuz var
    @Override
    public double area() {
        return side*side;//burada oto çıkanı silip formülü yazdık
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square_2{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
quare extends Shape:
	variables:
		side;

	Encapsulate the field

	Add a constructor to set the filed

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */
