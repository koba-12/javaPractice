package day37_OOPInheritance.animalTask;

public class Cat_3 extends Animal_1{//buraya extends ekledikten sonra comp err çıkar.kırmızı uyarıdan düzeltip
    //oto olarak create constructor diyecek onu yapmamız lazım,shortcuttır

    public Cat_3(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);//burası constructor
    }
    public void scratch(){
        System.out.println(name+" is scratching");
    }



}
