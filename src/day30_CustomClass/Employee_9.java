package day30_CustomClass;

public class Employee_9 {

    /*
    employee class:
attributes:id,gender,jobTitle,salary,isFullTime(boolean)

actions:toString()=her employee objecti yazdırabilmek için
setInfo()=tüm attributesları ayarlayabilmek için
work()
....
     */

    public String name;
    public char gender;
    public int age;
    public int ID;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;


    public void setInfo(String john) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee_9{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }
}
