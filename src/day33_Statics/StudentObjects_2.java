package day33_Statics;

import java.util.Arrays;

public class StudentObjects_2 {

    public static void main(String[] args) {

        Student_1 student1=new Student_1("ahmet");
        Student_1 student2=new Student_1("aygün",'F');
        Student_1 student3=new Student_1("nigara",11);
        Student_1 student4=new Student_1("mert",12,'A');
        Student_1 student5=new Student_1("cihat",'M',28);
        Student_1 student6=new Student_1("suhaib",'M',27,15);
        Student_1 student7=new Student_1("ali",'M',42,30,'B');

        System.out.println(student1==student2);

        Student_1[]students={student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));
    }
}
