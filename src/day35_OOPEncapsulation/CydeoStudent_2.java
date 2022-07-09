package day35_OOPEncapsulation;

public class CydeoStudent_2 {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent_2(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName="cydeo";
        programmingLanguage="java";
        secretCode="wooden spoon";
    }

    public static void printProgrammingLanguage(){
        System.out.println("language is "+ programmingLanguage);
    }

    public static void printSchoolName(){
        System.out.println("school is "+ schoolName);
    }

    public static void printScretCode(){
        System.out.println("code is "+ secretCode);
    }

    public void attendClass(){//bu ve alttakinde name kullandığımız için static koymadık
        System.out.println(name+ "is attending class");
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public String toString() {
        return "CydeoStudent_2{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", programming language='" + programmingLanguage + '\'' +
                '}';
    }
}
/*
Variables:
name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode
Add a constructor to initialize all the fields
Add a static block to initialize all the statics
methods:
printSchoolName();
printSecretCode();
attendClass():
study()
toString()
 */
