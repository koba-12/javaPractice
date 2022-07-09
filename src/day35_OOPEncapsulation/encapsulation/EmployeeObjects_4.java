package day35_OOPEncapsulation.encapsulation;

public class EmployeeObjects_4 {

    public static void main(String[] args) {

        Employee_3 employee1=new Employee_3("tatiana",'F',22,110000);

        employee1.setAge(29);//burayabunu yazınca üstteki objectte age=22 olmasına rağmen buradan değiştirmiş olduk ve
        //artık new age 29 oldu.
//constructorda da setName(name); şeklinde yazmamız da sanırım bununla ilgili.


        Employee_3 employee2=new Employee_3("arina",'F',18,200000);

        employee2.setName("anna");
        employee2.setSalary(employee2.getSalary()+15000);
//employee2 ye setSalary yaptık.getSalarysine yani sonuç olacak salarysinin üstüne 15000 daha ekledik.
//setter ile bir şey ekleyebiliyoruz veya değiştirebiliyoruz.
//getter ile de printte getiriyoruz sonucu
    }
}
