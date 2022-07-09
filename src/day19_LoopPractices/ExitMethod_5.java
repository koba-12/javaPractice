package day19_LoopPractices;

public class ExitMethod_5 {

    public static void main(String[] args) {

        /*
        bu da bir branching statement dır
        System.exit(0): terminates the current program,
terminates the JVM//geçerli programı sonlandırır,
jvm'yi sonlandırır
         */

        for (int i = 0; i < 5; i++) {

            if (i==3){
                //break; - terminates the loop-loopu sonlandırır
                //continue; - şimdiki iterationı atlar
                System.exit(0);//terminates the program.programı sonlandırır,diğer deyişle her şeyi sonlandırır
            }
            System.out.println(i);
        }
        System.out.println("wooden spoon");
    }
}
