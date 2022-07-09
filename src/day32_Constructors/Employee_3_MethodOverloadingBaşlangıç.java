package day32_Constructors;

public class Employee_3_MethodOverloadingBaşlangıç {

    /*
    constructor calls:
1-constructor adıyla çağırılamaz.this() kullanılması gerekir.(yani; Employee_3(name) şekilde yazılamaz)
2-yalnızca bir constructor, başka bir constructor çağırabilir.(yani public void vs yazarsa, o, constructor olmadığı için,comp error)
3-constructor, ilk adımda çağırılmalıdır.(comp error verir)
4-bir constructor, birden fazla constructor çağıramaz.(sadece ilk adımda çağırmasından dolayı)
5-Constructor, kendini çağıramaz veya kendini içeremez.


        this:instanceslerle alakalıdır.2 türü vardır.
this. = instance variables ve instance methods çağırır.
this() = constructors çağırmak için kullanılır.


     */

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee_3_MethodOverloadingBaşlangıç(String name){
        this.name=name;
    }

    public Employee_3_MethodOverloadingBaşlangıç(String name, char gender){
        this(name);//ilk methoddaki name i çağırıyoruz.-bu da bir yöntem
        // bu this() methodu -this.name=name yerine kullanılıyor burada overloadingte
        this.gender=gender;
    }

    public Employee_3_MethodOverloadingBaşlangıç(String name, char gender, String jobTitle){
        this(name,gender);//burada da 2 tane parameter koyduk.basit gördüğüm gibi
        this.jobTitle=jobTitle;
    }

    public Employee_3_MethodOverloadingBaşlangıç(String name,char gender, String jobTitle, double salary){
        this(name, gender, jobTitle);
        this.salary=salary;
    }

    public String toString() {
        return "Employee_3_MethodOverloadingBaşlangıç{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
