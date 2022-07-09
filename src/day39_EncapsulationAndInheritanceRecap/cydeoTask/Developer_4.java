package day39_EncapsulationAndInheritanceRecap.cydeoTask;

public class Developer_4 extends Employee_2{//önceki classın aynısı sayılır

    public Developer_4(String name, int age, char gender, int employeID, String jobTitle, double salary) {
        super(name, age, gender, employeID, jobTitle, salary);
    }

    public void fixingBugs(){
        System.out.println(getJobTitle()+" "+getName()+" is fixing the bug");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is developing the applicate");
    }
}
/*
 4. Create a sub class of Employee named Developer

            Override the work method

            Extra methods:
                fixingBugs()
 */