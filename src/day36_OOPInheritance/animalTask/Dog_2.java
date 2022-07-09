package day36_OOPInheritance.animalTask;

public class Dog_2 extends Animal_1{//dog is an animal
    //      child         parent
    //şuan dog class da animal class da 6 şar variables ve methoda sahipler.aşağıda Dog un kendi alanını(field) oluşturacağız

    public void bark(){
        System.out.println(name+ " is barking");
    }//bu methodla birlikte dog class tamamlanır.çünkü artık ekstra methodunu aldı(yani ekstra köpek özelliği(havlama)aldı.)
    //ve karakteristik yapısını oluşturmuş oldu.
    //daha önce yaptıklarımızdan farklı olarak main method da yazmadık dikkat!!!
}
