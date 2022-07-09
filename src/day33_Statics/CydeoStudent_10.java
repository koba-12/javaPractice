package day33_Statics;

public class CydeoStudent_10 {

    public String studentName;
    public static String schoolName="cydeo school";

    public CydeoStudent_10(String studentName){
        this.studentName=studentName;

    }

    static {
        schoolName="cydeo school";
    }




}

class CydeoStudentObject{
    public static void main(String[] args) {

        CydeoStudent_10 student1=new CydeoStudent_10("jimmy");
        CydeoStudent_10 student2=new CydeoStudent_10("kathy");

        System.out.println(student1);
        System.out.println(student2);
    }
}
