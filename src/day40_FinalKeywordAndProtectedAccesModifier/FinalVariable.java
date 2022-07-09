package day40_FinalKeywordAndProtectedAccesModifier;

public class FinalVariable {

    final String birthDay;//mainin dışındaysa instance variable(başka belirti bilmiyorum)
//final instance variables için mutlaka constructor oluşturmak gerekir yoksa comp err.

    final static String name;//static blok koyarak buranın comp err vermesini engelleyebiliriz

    static {
        name="batch25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        double pi=3.14;

        pi=4.4;
        pi=5.8;//bu şekillerde pi nin değerideğiştirilebilir.yeniden atanabilir.bunun olmaması için final keyword kullanırız.


        final double napiers=1.41;

        //napiers=2.2;/comp err verir final koyduğumuz için.final variables can not not be reassigned

        final String name;
        name="cydeo";

        //name="wooden";-comp err
        System.out.println(name);

        System.out.println("------------------------------------------------");

        FinalVariable obj=new FinalVariable("may/01");

        //obj.birthDay="june/01";-comp err

        System.out.println(obj.birthDay);

        System.out.println("-----------------------------------------");

        System.out.println(FinalVariable.name);//batch25


    }
}
