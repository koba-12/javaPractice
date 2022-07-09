package day38_OOPInheritance;

public class InheritanceBilgiselIsAAndHasA_Overriding {

    /*
    IS A relation vs HAS A relation:
IS A:
class Animal{
}
class Dog extends Animal{  // Dog IS A animal
}
class Employee{
}
class Tester extends Employee{ // Tester IS A Employee
}


HAS A:
class Tester extends Employee{ tester HAS A Employee(tester bir employeedir)
}
class ScrumTeam{ // ScrumTeam HAS A Tester(scrumTeam bir testera sahiptir,testera vardır)
Tester
}
class Tiger extends Animal{ // Tiger IS A animal
}
class Zoo{  // Zoo Has A Tiger
Tiger
}
class Engine{
}
class Car{ // Car HAS A Engine
Engine

örneğin day37 phone taske bakalım.iphone,nokia,samsung IS A Phone oluyor.
ancak phoneShop HAS A iphone,nokia,samsung oluyor.

NOT:diyagramı açtıktan sonra üstten methodları vs görebiliriz.



        Method Overriding(pdf e bak!!!)

Methoda farklı uygulamalar(implementations) verilmesi
Birden çok farklı uygulamaya sahip bir method
Bir methodun geçersiz kılınması(overridingi) subclassta gerçekleşmelidir
Daha az bellek kullanımı ve kodumuzun yeniden kullanılabilirliğini artırır
Inheritance MUST


        Method Overriding Rules
Must happen in the subclass
Overriding yapılan yöntemin Return type, method name and parameters aynı olmalıdır.
Access modifier of the overridden method aynı veya daha fazla görünür olması lazım?(more visible)
Methodları private access modifier, or with static & final specifiers ile override edemeyiz.
Yalnızca instance methods (not private & not final) override edilebilir.


Method Overloading: aynı ada sahip birden çok farklı method.
                    parameters MUST be different
                    ANY method can be overloaded

Method Overriding:
                    Access Modifiers:
        public > protected > default > private


        Car:
start(){car started}
Toyota extends Car:
start():
twist the key to Ignition

Audi extends Car:
start():
push start button

Tesla extends Car:
start():
say "Start"

BMW extends Car:
start():
Call mechanic
Jump start

her birinde farklı bir start yöntemi var.


Object Class: presented in "java.lang" package.//import java.lang.object
  parent of all the classes.
  implicitly extended to all classes
  tüm methodları vs ne varsa içerir.



           method overloading                      vs                       method overriding

Method overloading classiçinde gerçekleştirilir.    --- Method overriding IS A ilişkisi olan 2 sınıf arasında gerçekleştirilir.
parameter must be different                         --- parameter must be same
Access specifier değiştirilebilir                   --- Access specifier,original methodtan daha kısıtlayıcı(az)olmamalıdır
private and final methods overload yapılabilir.     --- private and final methods override edilemezler.
methodun return typeı önemli değil aynı veya farklı --- method overridingde return type aynı olmalıdır.
olabilir.

day39 ilk pratik oldukça faydalı(recordda yapıyor)inheritence ve encapsulation konusunda geniş bir tekrar gibi.
     */
}
