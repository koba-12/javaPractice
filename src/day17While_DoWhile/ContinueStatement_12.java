package day17While_DoWhile;

public class ContinueStatement_12 {

    public static void main(String[] args) {

        /*
        loop un geçerli yinelemesini(iteration) atlar ve bir sontaki iteration a geçer

        loop{
           statement1;
           statement2
           continue;//
           statement3;
           statement4;

         */

        for (char i = 'A'; i <= 'E'; i++) {

            if (i=='C'){
                continue;//bunu yazdığımız loopta 'C' yi atlar ve sonraki iterationa geçer
            }
            System.out.println(i);//C yi almaz.out şöyle olur.A B D E
        }

        System.out.println("------------------------------------");
        //print all even numbers 1-10

        for (int i = 1; i <= 10; i++) { //i= 1 2 3 4 5 6 7 8 9 10
            if (i%2 !=0){//dikkat!!! 1 3 5 7 9
                continue;//skip
            }
            System.out.println(i);//2 4 6 8 10
        }

        System.out.println("-----------------------------");
        //print all odd numbers 1-10

        for (int i = 1; i <= 10 ; i++) {

            if (i%2 == 0){
                continue;
            }
            System.out.println(i);//kendim yazdım :)
        }

    }
}
