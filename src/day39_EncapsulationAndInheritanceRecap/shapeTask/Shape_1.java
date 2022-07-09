package day39_EncapsulationAndInheritanceRecap.shapeTask;

public class Shape_1 {

    private String name;//variables

    public String getName() {//getter
        return name;
    }

    public void setName(String name) {//setter
        if (name==null){
            System.err.println("name can not be null");
            System.exit(1);//same thing went wrong
        }
        if (name.isEmpty()||name.isBlank()){
            System.err.println("invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape_1(String name) {//constructor
        setName(name);
    }

    public double area(){//override için yazdığımız kod
        return 0;//0'ın değeri yok sadece başlangıç naoktası için
    }
    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape_1{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
classnotesta da var.
Shape:
variables:
name
Encapsulate the field
Add a constructor to set the filed
Methods:
area(){}
perimeter(){}
Square extends Shape:
variables:
side;
Encapsulate the field
Add a constructor to set the filed
area(): side * side
perimeter(): side * 4
toString(): side, area, perimeter
Rectangle extends Shape:
variables:
length
width
Encapsulate the fields
Add a constructor to set the filed
area(): length * width
perimeter(): 2 * ( width + length)
toString(): length, width, area, perimeter
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
