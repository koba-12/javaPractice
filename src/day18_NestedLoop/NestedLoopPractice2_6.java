package day18_NestedLoop;

public class NestedLoopPractice2_6 {

    public static void main(String[] args) {

        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < 10; i++) {//burası basit şöyleki alttaki print olduğu için yanyana yazdırıyor outları
//ancak en alttaki println olduğundan yeni satıra geçiriyor.curly bracelere dikkat edersem daha iyi oturur.
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        1. Print the following shape by using a nested Loop:
* * * * * * * * *
* * * * * * * * *
* * * * * * * * *
* * * * * * * * *
* * * * * * * * *
* * * * * * * * *
* * * * * * * * *
* * * * * * * * *
         */
    }
}
