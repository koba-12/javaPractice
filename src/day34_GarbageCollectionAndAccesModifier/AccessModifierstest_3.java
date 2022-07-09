package day34_GarbageCollectionAndAccesModifier;

public class AccessModifierstest_3 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers_2.publicData);
        System.out.println(AccessModifiers_2.defaultData);
        //System.out.println(AccessModifiers_2.privateData);//bunu vermez çünkü private aynı packagedeki başka classta görünmez
        //yani kendi yazıldığı classın dışında çalışmaz
//aynı şekilde utilities packageına yazdı bu üsttekileri,ben gözden kaçırabilirim diye buraya not olarak yazıyorum.
//öyle yapınca bu sefer hem private hem de default çalışmadı.default aynı package farklı class olunca çalışıyordu ancak
//farklı package olunca o da çalışmadı.yani default is not visible(görünmez) outside the package.



        AccessModifiers_2.method1();//public
        AccessModifiers_2.method2();//default
        //AccessModifiers_2.method3();private
        //tekrar amaçlı bu yazdıklarım da.en üstte yazdıklarımla aynı sonuç.
    }
}
