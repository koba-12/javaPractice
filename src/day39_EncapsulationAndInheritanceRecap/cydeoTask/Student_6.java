package day39_EncapsulationAndInheritanceRecap.cydeoTask;

public class Student_6 extends Person_1{

/*
önce variablesları koy,sonra getter and setter,sonra constructor ekle(manuel olarak yap ve new instance variablesı seç)
constructorı düzenle(setStudentID(studentID)) gibi.sonra study methodu ekle ve en son olarak toString method.
ancak toStringde sadece bu classta yeni eklenen variableslar olacağı için Persondaki toStringden kopyalayıp yapıştırmak lazım.
yeni eklenenler en altta kalmalı,studentID nin başına bir virgül ve space koyulmalı.ve hepsi de getter formunda yazılmalı.
 */

    private int studentID;
    private String fieldOfStudy;

    public Student_6(String name, int age, char gender, int studentID, String fieldOfStudy) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    public String toString() {
        return "Student_6{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentID=" + studentID +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
/*
Create a sub class of Person named Student

            Extra variables:
                studentId, fieldOfStudy

            Encapsulate all the fields(encapsulate ten kasıt getter and setter)

            Add a constructor to set all the fields

            Encapsulate all the fields

            Methods:
                study()
 */