package day39_EncapsulationAndInheritanceRecap.cydeoTask;

public class Teacher_5 extends Employee_2{

    public Teacher_5(String name, int age, char gender, int employeID, String jobTitle, double salary) {
        super(name, age, gender, employeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is teaching");
    }
}
/*
5. Create a sub class of Employee named Teacher

            Override the work method
 */