package day04_Variables;

public class EmployeeInfo {

    public static void main(String[] args) {

        String name = "Cüneyt";
        int age = 25;   //kesme işareti yok
        char gender = 'F';    //tek kesme işareti var
        String company = "Apple Inc";
        String jobTitle = "SDET";
        double yearsofExperience = 0.5;    // kesme işareti yok
        int salary = 120000;     //kesme yok        BUNLARA DİKKAT!!!
        boolean isFullTime = true;    //yok
        String employeeID = "A101";
        boolean isMarried = false;     // yok
        String SSN ="(123)-45-6789";


        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsofExperience = " + yearsofExperience);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("employeeID = " + employeeID);
        System.out.println("isMarried = " + isMarried);
        System.out.println("SSN = " + SSN);
    }
}
