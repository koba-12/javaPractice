package day39_EncapsulationAndInheritanceRecap.cydeoTask;

public class Person_1 {

/*
önce variables yazıyoruz,sonra getter and setter,sonra constructorı yazıp "this.name = name;" yazan yerleri subclasslarda
kullanabilmek için(condition vs için) "setName(name)" şeklinde yazıyoruz.sonra eat,drink gibi methodlar ve en son da toString method.
gerekirse toString methoda oradaki yazanlar gibi ekstra ekleme yapıyoruz
!sanırım toString method print için!

diagramdan bakacak olursak örneğin Person class 3 private variables ve 10 tane instance method içerir.(toString sayılmaz)
//proje bittikten sonra yazdım tabi

 */

    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person_1(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void eat(){
        System.out.println(name+" eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return "Person_1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }//üstte variableslarda ve genel toplamda hangi özellikler isteniyorsa ona göre ekleme yapabiliriz
}
/*
1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                eat()
                drink()
                sleep()
                toString()
 */
