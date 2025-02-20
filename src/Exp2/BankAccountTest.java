package Exp2;
/*
Create a class called BankAccount that contains three instance variables: accountNumber,
accountHolderName, and balance. Provide a constructor to initialize these variables. Implement methods to
deposit and withdraw money, ensuring that withdrawal does not exceed the balance. Also, provide a method
to display the current balance. Write a test application named BankAccountTest, instantiate two BankAccount
objects, perform deposit and withdrawal operations, and display the final account balances.
 */

class BankAccount{
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(long num, String name, double bal){
        this.accountNumber = num;
        this.accountHolderName = name;
        this.balance = bal;
    }

    public void deposit(double money){
        this.balance += money;
    }

    public void withdraw(double money){
        if(money <= this.balance){
            this.balance -= money;
        }else{
            System.out.println("Amount exceeds current balance, cannot withdraw .");
        }
    }

    public void display(){
        System.out.println("Current Balance : "+this.balance);
    }
}
public class BankAccountTest {
    public static void main(String[] args){
        BankAccount b1 = new BankAccount(12345678, "Om Magdum", 35000);
        BankAccount b2 = new BankAccount(98765432, "Aniket Magdum", 20000);

        b1.deposit(15000);
        b2.deposit(10000);

        b1.withdraw(10000);
        b2.withdraw(100000);

        b1.display();
        b2.display();

    }
}
