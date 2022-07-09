package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {

        int grade = 2;
        String location = "";
        int groupNumber = 0;
        String teacher = "";

        if (grade >= 1 && grade <= 6){

            if (grade == 1){
                location = "apple orchard";
                groupNumber = 3;
                teacher = "ms. smith";
            }else if (grade == 2){
                location = "zoo";
                groupNumber = 7;
                teacher = "mr. lee";
            }else if (grade == 3){
                location = "aquarium";
                groupNumber = 5;
                teacher = "ms.wilson";
            }

        }else {
            System.out.println("invalid grade");
        }
        System.out.println("location - " + location + "\nnumber of groups - " + groupNumber + "\nteacher in charge - " + teacher);
    }
}
