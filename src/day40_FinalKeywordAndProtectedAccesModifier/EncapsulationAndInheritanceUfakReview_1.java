package day40_FinalKeywordAndProtectedAccesModifier;

import day39_EncapsulationAndInheritanceRecap.shapeTask.Circle_4;
import day39_EncapsulationAndInheritanceRecap.shapeTask.Square_2;

public class EncapsulationAndInheritanceUfakReview_1 {

    private Circle_4 circle;//day39 un circleı

    private Square_2 square;

    public Circle_4 getCircle(){//getter/reading
        return circle;
    }
    public void setCircle(Circle_4 circle){//setter/writing
        this.circle=circle;
    }

    public Square_2 getSquare() {
        return square;
    }

    public void setSquare(Square_2 square) {
        this.square = square;
    }

    /*
    Encapsulation: data hiding
                   fieldslara private access modifier verir
                   generate public getter/setters to read/write the private fields
    using the data:
reading the data
writing the data




        Inheritance: Is A relation.
                        parent & child classes ( super & sub)
                        class A  extends Class B
                        child class (sub): inherits the variables and
methods (Visible to the child class) from parent class (super)
                        parent class (super): can not inherit
anything from child (sub class)
     */
}
