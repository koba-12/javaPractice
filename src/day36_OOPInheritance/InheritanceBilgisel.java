package day36_OOPInheritance;

public class InheritanceBilgisel {

    /*
    Inheritance(is a relation)--kelime anlamı olarak miras,miras almak,devralmak gibi anlamlara gelir
Inheritance Topic:
Is A relation
extends keyword
super keyword & constructor
Types of Inheritance
Is A relation vs Has A relation
Method Overriding

Classlar arasında ”is a" ilişkisi oluşturmak için kullanılır
Objectler arasında bir ”is-a" ilişkisi olduğunda, uzmanlaşmış objectin,general objectin tüm özelliklerine sahip olduğu anlamına gelir.
Bir classın, başka bir classın özelliklerini (variables and methods) devralmasına izin verir.

kolaylık olması açısından yine slayttan yola çıkarak şöyle örneklendirelim.
tüm animalların belirli karakteristik özellikleri vardır.
Ortak hayvan özelliklerine ek olarak,köpeğin(veya kedi, balık) kendine özgü özellikleri vardır.
        hayvanların ortak özellikleri
name,body,size,weight,eat,move
    köpeğin kendine has özellikleri
legs,bark(havlamak)
    kedinin
legs,meow,scratch
    balığın
swim
-bu 3 hayvanın da kendine has özellikleri olduğu gibi,animal kümesinde olduklarından, animalalrın ortak özelliklerine de sahiplerdir.

inheritancede keyword olarak extends kullanılır.genişletmek,büyümek gibi anlamalrı vardır

        syntaxı:
                  subclass                 superclass
public class        Dog       extends       Animal{

şu şekilde düşünelim:dog,animala doğru genişletiliyor.


superclass: Özellikleri devralınan sınıf, üst sınıf (veya temel sınıf veya üst sınıf) olarak bilinir.

subclass: Diğer sınıfı devralan sınıf, alt sınıf (türetilmiş sınıf veya alt sınıf) olarak bilinir.
Alt sınıf, üst sınıf alanlarına ve methodlarına ek olarak kendi alanlarını ve methodlarını de ekleyebilir.

bu subclass ve superclassları da şöyle düşünelim.
superclass=animals ve subclass=dog.dog, animalstaki genel özellikleri(class özelinde method,variables,fields vs)
içinde barındırdığı gibi ayrıca kendi karakteristik özelliklerini de barındırır.(köpek için bark,legs gibi classlar için method,fields gibi düşünebiliriz)
yani superclasstan subclassa inherit yapılmakta.


        Alt sınıfa miras kalan(aktarılan) nedir?
Tüm erişilebilir variables and methods (access modifiera bağlı olarak)
private variables and methods are not inherited(aktarılmaz)
Constructors are not inherited,ancak alt sınıf, üst sınıfın constructorlarından birini çağırmalıdır.


    Animal:
name, breed, gender, size, age, color
setInfo(setInfo method sayesinde constructor çağıracğız), eat(), drink(), move(), sleep(), toString()

Dog extends Animal://bu şekilde hem animalın ortak özelliklerini alıyor,hem de alta kendi karakteristik özelliğini ekliyoruz.
bark()
Cat extends Animal:
scratch()
Tiger extends Animal:
roar()
Fish extends Animal:
swim()
...


       import vs extends:
import: borrowing(borçlanma)
extends: owning(sahip olmak)

inherit ->pass it through(inherit aracılığıyla pass etmek,geçmek)
import -> let using(kullanmasına izin vermek)
}
     */
}
