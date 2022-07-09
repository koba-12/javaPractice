package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects_8 {

    public static void main(String[] args) {

        Student_7 student1=new Student_7();
        student1.setInfo("aygün",'F',39,2210,'A');//setInfo 7.class sayesinde yaptığım shortcut
        System.out.println(student1);//Student_7{name='aygün', gender=F, age=39, ID=2210, grade=A}

        Student_7 student2=new Student_7();
        student2.setInfo("hülya",'F',26,2223,'B');
        System.out.println(student2);//Student_7{name='hülya', gender=F, age=26, ID=2223, grade=B}

        Student_7 student3=new Student_7();
        student3.setInfo("elminur",'F',26,2222,'A');
        System.out.println(student3);

        Student_7 student4=new Student_7();
        student4.setInfo("ali",'M',28,5555,'B');
        System.out.println(student4);

        Student_7 student5=new Student_7();
        student5.setInfo("mert",'M',26,2252,'C');
        System.out.println(student5);


        Student_7[]students={student1,student2,student3,student4,student5};

        for (Student_7 student : students) {
            System.out.println(student);//üstteki tüm bilgiler looplanıp out olur
        }


        System.out.println("------------------------------------------------");


        ArrayList<Student_7>earlyBirds=new ArrayList<>();
        ArrayList<Student_7>angryBirds=new ArrayList<>();

        for (Student_7 each : students) {
            if (each.grade=='A'){
                earlyBirds.add(each);
            }else {
                System.out.println(angryBirds);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);
        //oluşturduklarımızı arrayListte toplayıp early ve angry birds e çevirdim. zaten dikkatli bakınca neyin ne olduğu ortada.
        //loop ve ifler vs... üstteki işlemler Student_7 classtan çağırdığımız shortcutla bağlantılı.anlayabileceğim şeyler
    }
}
