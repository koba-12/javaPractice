package day33_Statics;

public class StaticBilgisel_4 {

    /*

    SLAYTA MUTLAKA GÖZ ATALIM

Static anahtar sözcüğüyle bildirilir
classa aittir ve class aracılığıyla çağrılabilir
classın tüm objectleri için paylaşılan statiğin yalnızca bir kopyası vardır
classın tüm objectleri aynı kopyayı paylaşır

Static şunlar için geçerlidir:variables,methods,class,blocks

        Static variables
Tüm objectlerin ortak özelliğine bakın
class yükleme sırasında class alanında yalnızca bir kez bellek alır
Bir classın statik variablesının tek bir kopyası, classın tüm objectleri tarafından paylaşılır
Statik variablesta değişiklik yapılırsa, diğer tüm örnekler değişikliğin etkisini görür

public string name;
public int age;

public static string schoolName="cydeo"==>static variable


        Static methods
Herhangi bir methodu statik olarak bildirirsek, statik methods olarak bilinir
object oluşturmadan class adı kullanılarak çağrılabilen bir method
Object statik methodlar de çağırabilir
Statik methodlar yalnızca statik üyeleri kabul eder
genel olarak,instance variables kullanılıyorsa static methoddur.kullanılmıyorsa instance method.
//örn:(Iphone_5 classtan alıntı)
public static void printModelAndPrice(){
    sout(model+":"+price)--burası comp err verir.çünkü model ve price static değil instanceti.ama bu method static


    static method                          vs                      instance method

Static methods,instance methods ve instance              bu ise instance methods ve instance variablesa doğrudan erişir
variablesa doğrudan erişemez.

this keyword kullanılmaz                                 instance methods ayrıca static variables and static methodsa da
                                                         doğrudan erişebilir.


            Static block
Bu, bir class belleğe yüklendiğinde yalnızca bir kez çalıştırılan bir yönergeler kümesidir
Statik bloğa statik başlatma(initialization) bloğu da denir
public class Car{
    static{
       //static block
    }
}
statik variablesı başlatmak için kullanılır, class yüklenir yüklenmez çalıştırılır,
her şeyden önce çalışır, yalnızca bir kez çalışır.



        Sttatic imports

import yardımıyla, herhangi bir packageta bulunan sınıflara(class) ve arabirimlere(interfaces) erişebiliriz.
Ancak statik import kullanarak, bir classın tüm statik members (variables and methods) açıkça class adını çağırmadan doğrudan erişebiliriz

import static packageName.className.staticMember;-(imports 1 static member from the class)

import static packageName.className;-(imports all the static members from a class)

        static import vs regular import
regular import: imports everything from the class
import packageName.className;
import packageName.*;
static import:
import static packageName.className.staticMember;  // imports one static member of a class
import static packageName.className.*;// imports all static members of a class


     */
}
