package day43_OOPAbstraction.EmployeeTask;

public abstract class Employee_2 extends Person_1{

    private final int id;
    private String jobTitle;
    private double salary;

    public Employee_2(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        if (id<=0){
            throw new RuntimeException("invalid id"+id);
        }
        this.id = id;//setterı olmadığı için
        setJobTitle(jobTitle);
        setGender(gender);
    }

    public int getId() {
        return id;
    }
//id final olduğu için setter olmaz
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

    public abstract void work();

    public String toString() {
        return "Employee_2{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
