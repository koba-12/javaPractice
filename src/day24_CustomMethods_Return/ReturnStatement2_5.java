package day24_CustomMethods_Return;

public class ReturnStatement2_5 {

    public static void main(String[] args) {

        nameOfMonth(10);
    }

    public static void nameOfMonth(int number){

        if (number<1||number>12){
            System.out.println("invalid");
            return;//exits nameofmonth--methodun kalan kod parçaları hiçbir zaman çalıştırılmaz
        }

       String  name=(number==1)? "jan":(number==2)?"feb":(number==3)?"mar":(number==4)?"apr":(number==5)?"may":(number==6)?
                "june":(number==7)?"july":(number==8)?"aug":(number==9)?"sep":(number==10)?"oct"
               :(number==11)?"nov":"dec";
        System.out.println("month name ="+ name);
    }
}
