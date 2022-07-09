package day39_EncapsulationAndInheritanceRecap.shapeTask;

public class Rectangle_3 extends Shape_1{

    private double length,width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            System.err.println("invalid length"+length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            System.err.println("invalid width"+width);
            System.exit(1);
        }
        this.width = width;
    }

    public Rectangle_3(double length, double width) {
        super("name");//extends eklemeden burası comp err verir
        setLength(length);//buradaki this keywordleri silip "setLength(length);" yazmamızın sebebi,if conditionları
        // constructora dahil etmek içindir.
        setWidth(width);
    }

    @Override//override methods bunları
    public double area() {
        return length*width;//super.area();otoda burası çıkar ama işlem yapabilmek için burayı silip formül yazdık
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle_3{" +
                "length=" + length +
                ", width=" + width +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*

Rectangle extends Shape:
	variables:
		length
		width

	Encapsulate the fields

	Add a constructor to set the filed

	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter
 */
