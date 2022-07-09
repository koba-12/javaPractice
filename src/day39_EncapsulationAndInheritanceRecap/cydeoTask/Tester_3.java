package day39_EncapsulationAndInheritanceRecap.cydeoTask;

public class Tester_3 extends Employee_2{

    public Tester_3(String name, int age, char gender, int employeID, String jobTitle, double salary) {
        super(name, age, gender, employeID, jobTitle, salary);
        /*
employeenin subclassı.employee ye ait tüm variableslar testera da ait
work methodu override etmemi istiyor.extends zaten yaptık,classları bağladık.sağ click generate override methods yaparak
work methodu seçip override edebiliriz.(aynı zamanda detayları da görebiliriz.)yaptıktan sonra super.work()ü silip
sout koymamız gerek!
         */
    }

    public void createTicket(){
        System.out.println(getJobTitle()+" "+getName()+" is creating title");//super classtan getterdik.
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is testing the application");
    }
}
/*
 Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()

 */