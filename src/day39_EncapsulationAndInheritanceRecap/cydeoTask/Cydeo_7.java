package day39_EncapsulationAndInheritanceRecap.cydeoTask;

public class Cydeo_7 {

    public static void main(String[] args) {

        Developer_4 developer=new Developer_4("korkmaz",29,'M',1,"java developer",125000);;

        Tester_3 tester=new Tester_3("olga",27,'F',2,"sdet",110000);

        Teacher_5 teacher=new Teacher_5("daniel",32,'M',3,"math teacher",100000);

        Student_6 student=new Student_6("suhaib",30,'M',4,"sdet");

        System.out.println(developer);//Employee_2{name='korkmaz', age=29, gender=M, employeID=1, jobTitle='java developer', salary=125000.0}
        System.out.println(tester);//Employee_2{name='olga', age=27, gender=F, employeID=2, jobTitle='sdet', salary=110000.0}
        System.out.println(teacher);//Employee_2{name='daniel', age=32, gender=M, employeID=3, jobTitle='math teacher', salary=100000.0}
        System.out.println(student);//Student_6{name='suhaib', age=30, gender=M, studentID=4, fieldOfStudy='sdet'}

        System.out.println("-----------------------------------------------------");

        developer.setAge(39);

        System.out.println(developer.getAge());//39

        System.out.println(developer);//Employee_2{name='korkmaz', age=39, gender=M, employeID=1, jobTitle='java developer', salary=125000.0}

        System.out.println("----------------------------------------------");

        developer.work();//java developer korkmaz is developing the applicate
        tester.work();//sdet olga is testing the application
        teacher.work();//math teacher daniel is teaching
        //student.work-yok

        System.out.println("----------------------------");

        developer.eat();//korkmaz eating
        developer.drink();//korkmaz is drinking
        developer.sleep();//korkmaz is sleeping

        developer.fixingBugs();//java developer korkmaz is fixing the bug

        System.out.println("------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        //tester.fixingbugs-olmaz çünkü bu developera özel method
        tester.createTicket();

        System.out.println("----------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        //teacher.fixingBugs;-bu ve alttaki olmaz çünkü başka classın özel methodu
        //teacher.createTicket

        System.out.println("---------------------------------------");

        student.eat();
        student.drink();
        student.sleep();

        student.study();
    }
}
