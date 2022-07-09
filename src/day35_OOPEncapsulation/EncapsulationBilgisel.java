package day35_OOPEncapsulation;

public class EncapsulationBilgisel {

    /*
    OOP prensipleri
4 Nesne Yönelimli Programlama (OOP) ilkesi vardır:
•Encapsulation
•Inheritance
•Abstraction
•Polymorphism

OOP: Uygulamaların organize ve modüler bir şekilde tasarlanması


            Encapsulation(data hiding)
Bir nesne, iç verilerini sınıfın dışındaki koddan gizler
Yalnızca geçerli classın methodları doğrudan erişebilir ve instance variablesta değişiklik yapabilir
private access modifier vererek ve bu alanlara erişen yöntemleri herkese açık hale getirerek bir örnek değişkenini gizleme
bu public methodlara getters & setters (accessor and mutator)(alıcılar&ayarlayıcılar) denir.


private access modifierı bir class membera uygulandığında, üyeye classın dışındaki kodla erişilemez.
access modifier bir class membera uygulandığında, üyeye classın içindeki veya dışındaki kodla erişilebilir.

        getters&setters
Her ikisi de verilerimizi korumak ve kodumuzu daha güvenli hale getirmek için kullanılan public instance methoddur.
Getter yalnızca private dataları (instance variables) okumak için kullanılır.
Setter yalnızca private dataları(instance variables) yazmak(modifying) için kullanılır.

        Getters method
private instance variableı,instance return methoda döndürür.
herhangi bir parameter geçirmiyor.
Return type,private instance variableın data typeı ile eşleşmelidir.
--private int age;
--public int getAge(){
    return age;
  }
getName vs gibi kullanıldığında getter başka bir classtan(super class) name i getirmek için kullanılır

        Setter method
void return type a sahip bir instance variable
passes a parameter,and parameter private instance variables a atanır
Parametrenin veri türü, private instance variablesın veri türüyle eşleşmelidir.

private String name;
public void setName(String name){
    this.name=name;
}

            ÖZET
Encapsulation: hiding the fileds by giving private access modifiers use getter/setter to read/write the private data

  Getter (Read Only):
public instance method
Return type is not void
Return type must match with private instance variable' data type
Does not pass any parameter
Returns the private instance variables value


  Setter (Write Only):
public instance method
Return type is void
Passes a parameter  Parameter' data type must match with private instance variable' data type
reassigns the private instance variable to given argument

use the data:
1. read
2. write

 */
}
