package day08_IfStatements;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 50, // virgül koydum alta int yazmaya gerek kalmadı
            weeklyHours = 45;

        double stateTaxRate = 6.5,
               federalTaxRate = 26.2;

        int salaryBeforeTask = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTask * stateTaxRate / 100;
        double federalTax = salaryBeforeTask * federalTaxRate /100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTask - totalTax;


        System.out.println("Gross pay is :" + salaryBeforeTask);//$117000
        System.out.println("State tax is = $" + stateTax);//$7605.0
        System.out.println("Federal tax is = $" + federalTax);//$30654.0
        System.out.println("Total tax = $ " + totalTax);//$38259.0
        System.out.println("Net income = $ " + salaryAfterTax);//$78741.0

    }
}
