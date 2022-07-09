package day43_OOPAbstraction;

public class AbstractionBilgisel {

    /*
Uygulama ayrıntılarını kullanıcıdan gizleme işlemi(süreci)
Kullanıcıya yalnızca işlevsellik sağlanacaktır
Belirli bir örnekten ziyade bir şeyin temel niteliklerine odaklanmak (Ignoring the irrelevant & unimportant)
Kullanıcı, objectin nasıl yaptığı yerine ne yaptığı hakkında bilgi sahibi olacaktır
!!!pdfte önemli tablolar var onlara bakalım.!!!

örneğin elimizde calculation class var.ve orada da addition,substraction ve multiplication adında 3 tane method var.
bu 3 method da calculate işlemi yapıyor ama heprsinin bir de alt başlığı var.meseka addition add yaparak,
substraction substrac yaparak ve multiplication da multiply yaparak,calculate yapmaktadır.


        Abstract method
A method that does not have body, only signature(Gövdesi olmayan, yalnızca imzası olan bir yöntem,yani curly braces yok)
overridden edilmesi gereken bir yöntem
Abstract keyword is used to create abstract method

public abstract void eat();(bodysi olmayan 2 method)-abstractionda body olmaz
public abstract void double area();

        Abstract method Rules
An abstract method cannot be static
An abstract method cannot be final
An abstract method can not have private access modifier
An abstract method does not have body
Abstract bir method yalnızca abstract bir sınıfta veya interfacede olabilir.


        Abstract Class
Super class olması gereken bir class.
Amaç, alt sınıflara yeniden kullanılabilir variables and methods sağlamaktır.
Abstract sınıfı oluşturmak için Abstract anahtar sözcüğü kullanılır
An abstract class can not be instantiated(instance)

public abstract class Animal{
}

        Abstract Class & abstract method
Super (parent) class, küçük ayrıntılar hakkında endişelenmeden tüm subclasslara
gereken variablesı ve methodları sağlamaktan sorumludur
subclasslar, ihtiyaç duyulan uygulamaları(implementations) sağlamaktan sorumludur



        creating object
abstract classın sadece inherit edilmesi amaçlanmıştır.instantiated(örneklenmesi)amaçlanmamıştır
abstract class somut(concrete)class değildir.ve object somut olmalıdır.
abstract classın subclassına concrete(somut)class denir ve can be instantiated(örneklenebilir)
A Concrete class must implement all the inherited abstract methods



              regular class               vs                         abstract class
can have constructors, instances and statics     -------can have constructors, instances and statics
Regular class can be instantiated               --------Abstract class can not be instantiated
Regular class can not have abstract method       -------Abstract class can have abstract method
Regular class can be declared as final              ----Abstract class can not be declared as final


                        Interface
It’s a template(şablon), a blueprint(plan) of a class
Interface keyword is used to create interface
Bir sınıfın uygulaması gereken davranış(lar)ı belirtir
subclassa ihtiyacı olan ek methodları sağlar
interfaces kullanarak yüzde yüz abstraction elde ederiz.
interface not a class

public interface flyable{
public void abstract fly()




        interface example
şimdi elimizde 3 veri var.abstract class,class ve interface.interface i şu örnekle anlatabilriiz.
dog cat parrot eagle subclasslarının hepsi de animal ve eat,drinkgender,color gibi ortak özellikleri(methodları)var.
bir de flyable(uçabilirlik)diye bir şey var bu bizim interfaceimiz.bu,classtan bağımsızdır ancak classın içinde yer alan
parrot,eagle gibi uçabilen hayvanları içine dahil eder(hayvanlar ortak kümede olur)ayrıca içerisine airplane gibi
animal olmayan elemanları da alır(almayadabilir.)ortak bir fly özellikleri(methodları)vardır.


class notes:

Exception:
checked & unchecked
try & catch
throws
throw
throw new RuntimeException("Exception Message");

OOP Encapsulation: hiding the data
OOP Inheritance: creating IS A relation between classes (parent/child  or super/sub)
method overriding: giving different implementatiosn to the method


Abstraction: focusing on the essentials without worrying about the small details(implementations) of the method
pdf ve class notesa yine mutlaka bakalım tekrar yaparken.



    day44 class notes

OOP Abstraction:temel konulara odaklanmak (ne olduğu), detaylar / uygulama hakkında endişelenmemek (nasıl yapıldığı)
override edilmesi gereken bir implementation,body si olmayan biir method
area();
perimeter();..... gibi

abstraction yapmanın 2 yolu vardır.
1. Abstract class
2. Interface

Abstract class:superclassta final olamaz,concrete(somut)olamaz. ( cannot create object)
can have all the methods, variables, and blocks of non abstract class + abstract methods


!!!!şimdi yazacağım örnek interfacele ilgili ve hayli faydalıdır.!!!!

Animal Task:

Abstract Animal:
 eat()
 drink()

interface Swimmable:
swim()

interface Flyable:
 fly();

Interface Wild:
hunt();

interface Plyable:
play();

Dog extends Animal implemnts Plyable, Swimmable
//örneğin burada dog classı ele alalım açıklama için.dog class,superclassta oluşturduğumuz abstract classlar
eat() ve drinki()içerir.
(her ne kadar kendine has eat ve drink alışkanlığı olsa da.aynı zamanda diğer tüm animallarda da eat ve drink ortaktır ama
abstract olduğu için hepsinin de eat ve drink alışkanlığı farklıdır.)
ayrıca oluşturulan ve superclassla alakası olmayan(bağımsız olan)interfacelerden de(ki interface not a class)
plyable ve swimmable özelliklerine sahiptir.
Cat extends Animal implemnts Plyable
Cow extends Animal implemnts Plyable
Horse extends Animal implemnts Plyable
Parrot extends Animal implemnts Plyable, Flyable
Tiger extends Animal implements Wild
Lion extends Animal implements Wild
Eagle extends Animal implements Wild, Flyable
Falcon extends Animal implements Wild, Flyable
Dolphin extends Animal implemnts Plyable, Swimmable
Shark extends Animal implements Wild, Swimmable
Duck extends Animal implements Swimmable, Flyable, Plyable
Java extends Animal implements Swimmable, Flyable, Plyable, Wild
...


Person implements Swimmable, Plyable
Boat implements Swimmable
Airplane implemnts Flyable
CydeoCar implements Swimmable, Flyable
     */
}
