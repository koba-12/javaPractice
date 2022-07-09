package day43_OOPAbstraction.EmployeeTask;

public class EmployeeObject_7 {

    public static void main(String[] args) {

        Tester_3 tester=new Tester_3("ali",25,'M',42,"sdet",140000);
        Developer_4 developer=new Developer_4("alex",28,'M',32,"web developer",150000);
        Teacher_5 teacher=new Teacher_5("angel",28,'F',22,"english teacher",135000);
        Driver_6 driver=new Driver_6("john",34,'M',42,"lyft driver",75000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);


        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("-------------------------------");

        developer.work();
        developer.sleep();
        //developer.bugReport();
        developer.eat();
        developer.unitTest();


        System.out.println("-----------------------------------");
        teacher.work();
        teacher.sleep();
        teacher.eat();
    }
}
