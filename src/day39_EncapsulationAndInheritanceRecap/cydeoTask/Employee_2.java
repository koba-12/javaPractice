package day39_EncapsulationAndInheritanceRecap.cydeoTask;

public class Employee_2 extends Person_1{

/*
yine superclassta olduğu gibi bu subclassa özel instance variableslarımızı oluşturup,getter and setter yapacağız,sonra da
constructor ve methodlar.(constructor eklemeden önce de extends yapılmalı)(constructordan önce setterlara if condition eklenebilir,eğer gerekiyorsa)
constructorları da setter haline getirmeyi unutma.son olarak da toString method ekleyeceğiz.normal şekilde shortcutı yapıp
superclasstakileri de eklememiz lazım(burası özelinde name,age,gender gibi.)
 */

    private int employeID;
    private String jobTitle;
    private double salary;

    public Employee_2(String name, int age, char gender, int employeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeID(employeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getEmployeID() {
        return employeID;
    }

    public void setEmployeID(int employeID) {
        this.employeID = employeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+" is working");//subclassta namei bu şekilde yazmalıyız.çünkü name i super classtan
        //getiriyoruz.
    }

    public String toString() {
        return "Employee_2{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employeID=" + employeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
 */