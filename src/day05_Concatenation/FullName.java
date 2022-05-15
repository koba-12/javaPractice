package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Cüneyt";
        String lastName = "Yılmaz";
        int age = 25;
        String jobTitle = "Senior SDET";
        String companyName = "Apple";
        double salary = 100000;

        String fullName = firstName + " " +  lastName;

        System.out.println("fullName = " + fullName);
        // full name of the person is ....
        System.out.println("Full of the person is " + fullName);

        // .... is .... years old
        System.out.println( fullName + " is " + 45 + " years old ");
        System.out.println(fullName + " is " + jobTitle + " , works at " + companyName + " , and " + fullName +
                " 's salary is $ " + salary);

    }
}
