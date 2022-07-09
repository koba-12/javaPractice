package day30_CustomClass;

public class CustomClassIntro_2 {

    public static void main(String[] args) {

        /*
        yine baştan söyleyeyim pdf e göz atalım

        Class:
objectlerin nereden geldiği--her object classtan gelir
Bir nesnenin nasıl davranacağını ve ne içereceğini belirleyen bir varlık
Belirli bir Nesne türü oluşturmak için bir plan veya talimat kümesi

pdfteki şemayı anlatmaya çalışıcam:
 elimizde bir DOG kümesi var.(köpek yani).bu DOG classtır.  ve onun da 2 alt kümesi var.
 ilk olarak, size,age,color gibi özellikleri içeren data members(veri üyeleri)
 bir de eat(),sleep(),sit(),run() gibi özellikleri içeren 2. bir alt küme var.bu alt kümedekiler de methods olarak adlandırılır.(parantezli olmasından anlayalım)


            Object:
Bir sınıfın örneği
* Bir object veri depolayabilir
* Bir objectte depolanan verilere alan(fields) adı verilir
* Bir classta birden çok object oluşturulabilir

objecti de şöyle açarsak.size:large,age:5 years,color:black gibi düşünebiliriz

ya da class=car, object=bmw,mercedes,ferrari
(PDF E BAKALIM MUTLAKA ÖNEMLİ GÖRSELLER VAR)



            Instance Variables:örnek değişkenler
classın içinde ve herhangi bir methodun/blockun dışında bildirilir
objecte aittir ve her objectin kendi hafızası vardır
Her objectin Instance Variablesının ayrı bir kopyası vardır



               Instance Methods:
Does not have static keyword
objecte aittir
Each Object has a separate copy of the instance methods



new keyword, bir classın örneğini(instance,olarak geçiyor,örnek,kopya anlamlarında kullanılıyor) oluşturmak için kullanılır

class name-                 keyword
dog         dog1 =           new         dog()
           object name                  constructor(inşa edici)


Custom class:
    1.instance variables & instance methods
    2.toString
    3.constructor(inşa edici)
    4.statics
    ...


    pdften şema anlatımı.mutlaka pdf e bakalım yine:
dog kümesinin içinde 2 farklı küme vardı malum.bunların hepsi tek bir küme oluşturur. o da dog kümesi.bu 2 küme birleşerek
daha fazla küme de oluşturabilir.dog1, dog2, dog3 gibi.ama tabiki hepsinin özellikleri farklı olur.size,color,eat() vs.


Class Name                      Dog

Fields                        name
(Attributes)                  breed
(öznitelikleri)               size
                              age
                              color
                              ...


Methods                       eat()
(Actions)                     drink()
                              play()
                              ...

                              pdfte de var şeması



Bir Nesnenin üyeleri, veri alanlarına ve yöntemlerine başvurur. Nesne oluşturulduktan sonra
verilere erişilebilir ve yöntemleri nokta işleci kullanılarak çağrılabilir (.)

dog1.breed="maltese";
dog1.size="small";
dog1.age="5 years";

dog1.eat();
dog1.play();
gibi




class vs object:


           Class                                                        Object

Class benzer objectlerin koleksiyonudur.                        Object bir classın örneğidir
Classkavramsaldır (şablondur)                                   Object gerçektir
Class için bellek ayrılmıyor                                    her objectin kendi hafızası(belleği) vardır
class herhangi bir object olmadan var olabilir.                 Objectler bir class olmadan varolamaz



sanırım setINfolar birer object
                    */
    }
}
