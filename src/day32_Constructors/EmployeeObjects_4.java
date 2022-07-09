package day32_Constructors;

public class EmployeeObjects_4 {

    public static void main(String[] args) {

        Employee_3_MethodOverloadingBaşlangıç employee1=new Employee_3_MethodOverloadingBaşlangıç("ali");
        Employee_3_MethodOverloadingBaşlangıç employee2=new Employee_3_MethodOverloadingBaşlangıç("veli",'M');
        Employee_3_MethodOverloadingBaşlangıç employee3=new Employee_3_MethodOverloadingBaşlangıç("sibel",'F',"sdet");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
