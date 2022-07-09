package day31_Constructors;

public class BankAccount_3 {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
    }

    public String toString() {
        return "BankAccount_3{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("your available balance is:"+ balance);
    }

    public void deposit(double amount){//depposit=kasa/amount=bakiye,kalan
        if (amount<=0){
            System.out.println("depoaiting amount can not be zero or negative");
            return;//exits the method
        }
    }

    public void withdraw(double amount){//withdraw=çekilen
        if (amount>balance){//if withdrawing amount is greater than available balance
            System.out.println("insufficient balance");
            return;
        }
        if (amount<=0){//if withdrawing amount is negative or zero
            System.out.println("withdrawing amount can not be negative or zero");
            return;
        }
        balance-=amount;//eksiye doğru olarak düşünelim bunu
    }
}
