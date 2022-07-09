package day40_FinalKeywordAndProtectedAccesModifier;

public class Animal_3 {
    
    private String name;
    private final String breed;
    private final char gender;
    private final String color;
    private String size;
    private int age;

    public Animal_3(String name, String breed, char gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }
//----------------------getters----------------------------
    //final instance variablesa getter verilir
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    //-------------------------setters--------------------------------------


    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }
//shortcut setter yapınca sadece bu üçü çıkıyor saece bu üçüne setter yapılabilir.Çünkü setter değiştirme(write(
//işi yapıyor ama final instance variables DEĞİŞTİRİLEMEZ!!!



    public void eat(){
        System.out.println(name+" is eating");
//örneğin açacağımız dog,cat vs subclasslarda sadece köpeğe özel "is eating dog food" yazmak istiyoruz.bu methodu
//dog classta override ederek bunu yapabiliriz ama alttaki method,final method olduğu için bunu yapamayız.hepsinde"is drinking" olarak kalır.
    }
    public final void drink(){//override edilemez
        System.out.println(name+" is drinking");
    }
}
