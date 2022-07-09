package day17While_DoWhile;

import java.util.Scanner;

public class BranchingStatementsIntroBreakStatement_11 {

    public static void main(String[] args) {

        /*
        Döngünün sonlandırılmasına neden olur.
* Yorumlayıcıya döngü dışındaki bir sonraki kod ifadesine geçmesini söyler.
döngüden atlar, kaç döngü kalırsa kalsın, döngüden çıkılır

        loop{
           statement1;
           statement2
           break;//döngüden atlar, kaç döngü kalırsa kalsın, döngüden çıkılır
           statement3;
           statement4;
        };

        break statement: exits the loop and switch
        continue statement: skips the sıradaki geçerli yineleme
         */

        for (char i = 'A'; i <= 'Z'; i++) {
            if (i=='F'){//burası sout un altında olsa F de çıkardı ama bu şekilde çıkmaz.
                break;//exits the loop
            }
            System.out.print(i+" ");//A B C D E şeklinde out olur yani F ye gelince durur.eğer if ve break i yazmasaydım Z ye kadar giderdi

        }
        System.out.println();
        System.out.println("------------------------------------");
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("enter a number");//normalde aşağıdakini yazmazsak sonsuza kadar bu döngü devam eder ve bize bu soruyu sorar
            int num =scan.nextInt();

            if (num<0){
                break;//ama buraya bu kodu yazdığımız için 0 dan küçük bir sayı girdiğimizde döngüyü durdurur.
                //yani döngü KIRILIR (BREAK)


            }
        }
    }
}
