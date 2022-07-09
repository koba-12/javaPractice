package day24_CustomMethods_Return;

public class Return_vs_Exit_6 {
    /*
    branching statements:
    continue: skiping the current iteration
    break: exits the loop or switch
    return: exiting the method (one method, current method)
    System.exit(0): exits the system (EVERY THING WILL BE TERMINATED)

     */

    public static void main(String[] args) {

        nameOfMonth(50);


    }

    public static void nameOfMonth(int number){

        if (number<1||number>12){//if number is invalid
            System.out.println("invalid");
            //return;//exits nameofmonth
            System.exit(0);//üstteki return sadece nameofmonth methodundan exitladı,bu ise tüm sistemden exitlar
        }

        String  name=(number==1)? "jan":(number==2)?"feb":(number==3)?"mar":(number==4)?"apr":(number==5)?"may":(number==6)?
                "june":(number==7)?"july":(number==8)?"aug":(number==9)?"sep":(number==10)?"oct"
                :(number==11)?"nov":"dec";
        System.out.println("month name ="+ name);
    }
}
