package day31_Constructors;

public class Rectangle_11 {

    public double length,width;

    public Rectangle_11(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculatorArea(){
        return length*width;
    }

    public double calculatorPerimeter(){
        return 2*(length+width);
    }

    public String toString() {
        return "Rectangle_11{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calculatorArea() +
                ", perimeter=" + calculatorPerimeter() +
                '}';
    }
}
