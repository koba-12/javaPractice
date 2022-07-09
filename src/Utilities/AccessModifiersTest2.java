package Utilities;

import day40_FinalKeywordAndProtectedAccesModifier.ProtectedAccessModifier_2;

public class AccessModifiersTest2 extends ProtectedAccessModifier_2 {

    public static void main(String[] args) {

        //System.out.println(ProtectedAccessModifier_2.name1);-default olmaz
        System.out.println(ProtectedAccessModifier_2.name2);//subclass olduğu için bu class bu sefer görünür oldu.

        //AccessModifiersTest2.method1;-aynı şekilde default methodu da unvisible
        AccessModifiersTest2.method2();//subclass olduğu için protected method visible
    }
}
