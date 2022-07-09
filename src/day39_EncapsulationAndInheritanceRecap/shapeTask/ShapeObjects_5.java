package day39_EncapsulationAndInheritanceRecap.shapeTask;

public class ShapeObjects_5 {

    public static void main(String[] args) {

        Square_2 square=new Square_2(10);
        System.out.println(square);//Square_2{side=10.0, area='100.0', perimeter='40.0'}

        square.setSide(15);
        System.out.println(square);//Square_2{side=15.0, area='225.0', perimeter='60.0'}

        System.out.println("-------------------------------------");

        Rectangle_3 rectangle=new Rectangle_3(5,6);//buralara <=0 sayı girersem serr verir.
        System.out.println(rectangle);//Rectangle_3{length=5.0, width=6.0, area='30.0', perimeter='22.0'}

        rectangle.setLength(10);
        System.out.println(rectangle.getLength());//10

        System.out.println(rectangle);//Rectangle_3{length=10.0, width=6.0, area='60.0', perimeter='32.0'}

        //System.out.println(rectangle.name);-name private olduğu için sadece get.name ile çağırılabilir.getter and setterı olması gerekir bunun için

        System.out.println(rectangle.getName());//rectangle

        System.out.println("*----------------------------------------------");

        Circle_4 circle=new Circle_4(7.5);
        System.out.println(circle);//Circle_4{radius=7.5pi=3.14, area='176.625', perimeter='47.1'}-pi static

        //circle.radius=15-setter kullanmamız lazım değiştirmek için.
        circle.setRadius(15);
        System.out.println(circle);//Circle_4{radius=15.0pi=3.14, area='706.5', perimeter='94.2'}

        System.out.println(circle.getName());//getter is public method-circle

        //diagramdan instance methodlar overridelar vs bakılabilir-pembe dairede m yazanlar instance methods



    }
}
