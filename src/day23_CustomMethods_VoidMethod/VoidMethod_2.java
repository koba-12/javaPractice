package day23_CustomMethods_VoidMethod;

public class VoidMethod_2 {

    public static void main(String[] args) {

        System.out.println("test started");

        greeting();//buraya 2 greeting yazsaydım yine başta started sonda completed olur diğerleri tekrarlanırdı

        System.out.println("test completed");



    }

    public static void greeting(){//slaytta da var.bu sayfada önce maini yazdık,sonra bunu yazdık main dışına.önce
        // içerdeki greetingi yazınca olmuyor.sonra bunun altındaki soutları yazdık outa bir şey gelmedi.
        //sonra main içine soutları ve greetingi yazınca bu alttakiler de dahil out oldu.sıralaması;
        //test started
        //hello cydeo
        //how r u today
        //test completed şeklinde--sıralamaya dikkat önemli!!!


        System.out.println("hello cydeo");
        System.out.println("how r u today");
    }
}
