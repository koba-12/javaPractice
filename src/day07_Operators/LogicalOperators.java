package day07_Operators;

public class LogicalOperators {

    public static void main(String[] args) {
        //&& işareti "ve" anlamı katar. iki değerden herhangi biri yanlışsa false çıkar  && logical and

        String name = "Cüneyt";
        int age = 19;
        String citizen = "UK";

        Boolean isEligible = age >= 18 && citizen == "USA";//ilki true ama 2.si false yani cevap false çıkar
                             //19 >=18 -- true  && uk == usa --false ------ out false olur
        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("-----------------------");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 19;

        boolean isEligible2 = creditScore >= 700 && age2 >= 18;//ikisi de doğru true
        // not!!! 3. değişkeni de ekleyebiliriz.biri bile yanlış olursa false çıkar

        System.out.println(name2 + " is eligible for loan: " + isEligible2);

        System.out.println("------------------------------------");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');// biri bile true olsa true out olur
                            // 21 >= 18 && F == M || F == F
                            // true    ----- false ------ true// true çıkar
        // || logical true
        System.out.println(name + " is eligible  to register: " + isEligible3);

        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;
        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true; // ikisi de yanlış yani false çıkar

        System.out.println(name4 + " is eligible to apply for US citizenship: " + isEligible4);

        String student = "Breanna";
        double gpa = 2.5;
        int familyIncome = 400000;
        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(student + "is eligible for scholarship: " + isEligible5);

        System.out.println("---------------------------------------");

        // ! logical not sanırım olumsuzluyor.false ise true--true ise false olur

        boolean result2 = true;
        System.out.println("result2 = " + result2);//true

        boolean result3 = !result2;// yani result 3 result2 değil yani true değil yani burası false çıkar
        System.out.println("result3 = " + result3);//false

        int score = 55;
        boolean passed = score >= 60;
        boolean failed = !passed;// ! işaretini not olarak düşünebiliriz.not passed yani failed passed değil
        System.out.println("passed = " + passed);//false
        System.out.println("failed = " + failed);//true








    }
}
