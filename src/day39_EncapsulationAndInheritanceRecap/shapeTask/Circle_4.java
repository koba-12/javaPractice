package day39_EncapsulationAndInheritanceRecap.shapeTask;

public class Circle_4 extends Shape_1{

    private double radius;
    private static double pi=3.14;//pi,3.14 sabit olmasını istedipğimiz için static yaptık
    //ayrıca pi static olduğu için getter and setter da olmaz

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {//if conditionlar settera yazılır
        if (radius<=0){
            System.err.println("invalid radius"+radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle_4(double radius) {//shortcutta burada çıkan string "name" i siliyoruz
        super("circle");//ve buradaki "name" i de silip istediğimiz sabit bir name(örn:circle) atıyoruz.
        setRadius(radius);//setterın getirdiği avantajdan (burada if condition) yararlanmak için thisi silipböyle yazıyoruz.
    }

    @Override
    public double area() {
        return radius*radius*pi;//shortcutta çıkanı silip formülü yazdık.
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle_4{" +
                "radius=" + radius +
                "pi=" + pi +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Circle extends Shape:
		variables:
			radius
			pi (static)

		Encapsulate the field

		Add a constructor to set the filed

		area(): radius * radius * pi
		perimeter(): 2 * radius * pi
		toString(): r, pi, area, perimeter
 */