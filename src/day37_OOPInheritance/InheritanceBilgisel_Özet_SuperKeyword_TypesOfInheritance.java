package day37_OOPInheritance;

public class InheritanceBilgisel_Özet_SuperKeyword_TypesOfInheritance {

    /*
            Özet:
OOP Inheritance:classlar arası bir ilişki inşa etmek temel amacıdır.(is a relation)(super and sub)
easiest way to get rich ===> extends

sub class(child class):üst sınıftan tüm variables  ve methodları (visible) devralabilir.
super class(parent class): alt sınıftan hiçbir şey devralınamaz. devralınması gereken tüm ortak özellikleri içerir.

Advantages:
less codes
improves the reusability(yeniden kullanılabilirliği arttırır.)
clean(karışık değil, işleri karıştırmıyor.anlamında)
less memory usage
easy to maintain(bakımı kolay, sürdürülebilirliği kolay).

A Sınıfı B Sınıfını genişletir(extends)-extendeddan aklımızda kalsın.
bir sınıf yalnızca bir sınıfı genişletir(extends)
bir sınıf birden çok sınıf tarafından genişletilebilir


        Super keyword
        Calling the Super Class Constructor
-Üst sınıfın default constructorı varsa, alt sınıf onu örtük(implicitly) olarak çağırır,
aksi takdirde(otherwise) süper sınıfın constructorının alt sınıfta açıkça(explicitly) çağrılması gerekir
-Süper keyword, bir objectin süper sınıfını ifade eder. Bir superclass constructorını çağırmak için süper keyword kullanabiliriz.


this keyword:instanceleri ifade eder. Geçerli sınıf(current class)
this. : calls instance variables & instance methods
this() : calls the constructor of current class

super keyword:instanceleri ifade eder. üst sınıf(super class)
super. :calls instance variables & instance methods of super class
super() : calls the constructor of super class

        Super keyword
super classtaki constructorı,alt classa çağırmak için super() kullanılır.
If parent class has default (No-Argument) constructor, compiler will put super() automatically
If parent class only has constructor with parameters, then child  constructor MUST make a matching super(params) call

        Constructor calls in inheritance:
alt sınıf,üst sınıfın constructorını çağırmalıdır.
Parent classın' default constructor(argümentsiz demek),child classta her zaman implicitly olarak adlandırılır.
Argümentli super class constructorın(defaultun zıttı) constructırın açıkça(explicitly) çağırılması gerekir


        Types of inheritence
single inheritence:bir super classsın bir sub classa inherit edilmesi

Hierarchical Inheritance:bir super classın birden fazla subclassa inherit edilmesi.

Multi Level Inheritance:nested(iç içe) olarak düşünebiliriz.bir super classtan inherit alan subclassın,
aynı zamanda başka bir subclassın da,superclassı olmasıdır.zincirleme yani.(alt alta subclasslar oluşturma)
!her subclass üstteki tüm superclassların özelliklerini alır.!

NOT:Java DOES NOT support multiple inheritance with classes.One class cannot have more than one superclass
and inherit features(özellik) from all parent class(kısaca,bir subclassın birden fazla superclassı olamaz)
one class only extends one class//one class can be extended by multiple classes
NOT2:bu types of inheritencein syntaxlı şekilde hali class notesta var.anlaşılması çok zor olmadığı için çok yer
kaplamasın ve karıştırılmasın diye buraya yazmadım.ihtiyaç halinde oraya bakılabilir.(detaylı güzel yazılmış)
(videoda da yaklaşık 1:30.saatten başlıyor anlatmaya,bakılabilir.)




     */
}
