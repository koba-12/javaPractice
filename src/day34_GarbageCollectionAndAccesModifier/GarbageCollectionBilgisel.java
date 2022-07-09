package day34_GarbageCollectionAndAccesModifier;

public class GarbageCollectionBilgisel {

    /*
    pdf e bakalım

    Garbage Collection
-JVM, düzenli aralıklarla, aktarılmamış nesneleri(unreferenced objects) bellekten kaldıran,
 çöp toplayıcı(garbage collector) olarak bilinen bir işlemi çalıştırır
-Çöp toplayıcı(garbage collector) (jvm'nin bir parçası) tarafından otomatik olarak yapılır.

object nasıl unreferenced yapılır?
1-referansı geçersiz kılarak
Dog d = new Dog();
d=null;
!!!  null sadece non primitiveslerde kullanılır.
2-by assigning a reference to another(başka birine başvuru atayarak)
Dog d1=new Dog();
dog d2=new Dog();
d1=d2;//now the first object referred by d1 is available for garbage collection(şimdi d1 tarafından başvurulan ilk nesne çöp toplama için kullanılabilir)


Garbage Collection: Collection of unreferenced objectsunreferenced objects:
1. null keyword:
String str = "Java";
str = null;
2. creating a new object
String str = "Java";
str = "Python";


Garbage Collector: responsible for collecting the unreferenced objects
from java heap. and destroys it ( finalize())
çeviri(unreferenced objects toplanmasından(collecting) sorumludur
java yığınından. ve onu yok eder)
     */
}
