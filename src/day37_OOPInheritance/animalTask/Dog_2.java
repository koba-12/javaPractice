package day37_OOPInheritance.animalTask;

public class Dog_2 extends Animal_1 {

    //public int a;//buraya bunu ekleyip aşağıda this. ile ekleme de yapabiliriz.

    public Dog_2(String name, String breed, char gender,int age, String size,String color){//,int a){
        super(name,breed,gender,age,size,color);
//super keywordün kullanım şekli böyledir.
//ayrıca methodun hemen altına yazılmalıdır,araya başka şey girmemelidir.
    }

    public void bark(){//unutmayalımki sadece bir consturctor başka bir constructorı çağırabilir.8super keyword ise özel durum)
        System.out.println(name+" is barking");
    }
}
