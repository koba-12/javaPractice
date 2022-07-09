package day36_OOPInheritance.animalTask;

public class Animal_1 {

    public String name,breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {//setInfoya döndürdük constructorı
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void eat(){//her hayvan yer,içer,uyur,hareket eder
        System.out.println(name+ " is eating");
    }
    public void drink(){
        System.out.println(name+ " is drinking");
    }
    public void move(){
        System.out.println(name+ " is moving");
    }
    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public String toString() {
        return "Animal_1{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
name, breed, gender, size, age, color
setInfo(), eat(), drink(), move(), sleep(), toString()
 */
