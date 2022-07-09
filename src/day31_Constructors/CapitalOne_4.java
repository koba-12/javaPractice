package day31_Constructors;

public class CapitalOne_4 {

    public static void main(String[] args) {

        BankAccount_3 account1=new BankAccount_3();
        account1.setInfo("ahmet özkök",123456789);
        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();//1000

        account1.withdraw(900);
        account1.checkBalance();//100

        account1.deposit(900);
        account1.checkBalance();//1000


        System.out.println("--------------------------------------------------------");


    }
}
