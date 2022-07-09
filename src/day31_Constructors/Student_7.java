package day31_Constructors;

public class Student_7 {

    public String name;//burası instance variables,unutmayalım
    public int age;
    public char gender;
    public char grade;
    public int id;

    public Student_7(String name, int age,char gender, char grade, int id){
        //bu constructorın da kısayolunu öğrenmiştik,hatırlayalım.sağ click yapıyorduk.setInfoda Student ı silip void setInfo
        //Yazıyorduk bu sefer silmeden direkt sağ click constructor ve seçimleri yap.
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.grade=grade;
        this.id=id;
    }

    public String toString() {
        return "Student_7{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", id=" + id +
                '}';
    }
}
