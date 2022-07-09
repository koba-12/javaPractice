package day24_CustomMethods_Return;

public class Test_10 {

    public static void main(String[] args) {

        //burası önemli ne yaptığımız tam anlaşılamamış olabilir o yüzden day24 ün sonunu tekrar izle.
        //ÇOK ÖNEMLİ VE ÇOK BÜYÜK KOLAYLIK!!!

        String str="aaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";

        str=ReturnMethodPractice4_9.removeDuplicates(str);

        System.out.println(str);

        String name="java programming";

        String reversedName=ReturnMethodIntro_2.reverse(name);

        System.out.println(name);
    }
}
