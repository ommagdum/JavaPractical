package Practice;

/*
 Develop a BankAccount class which should contain all methods of Bank i.e balanceEnquiry(),
withdraw(), transfer() and deposit(). You should create at least two objects of BankAccount using array and do all
operations mentioned above. Also generate user defined exception LowBalanceException, NegetiveNumberException
and PasswordMismatchException whenever required. To transfer amount from one account to another use two
BankAccount objects.
 */

import java.util.Scanner;

class LowBalanceException extends Exception {
    public LowBalanceException(String message){
        super(message);
    }
}

class NegetiveNumberException extends Exception {
    public NegetiveNumberException(String message){
        super(message);
    }
}

class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message){
        super(message);
    }
}

class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    private String password;

    public BankAccount (String accountHolder, int accountNumber, double balance, String password){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.password = password;
    }

    public void balanceEnquiry(String inputPassword) throws PasswordMismatchException {
        if(!this.password.equals(inputPassword)){
            throw new PasswordMismatchException("Password incorrect");
        }
        System.out.println("Balance for " +accountHolder+ " : " + balance);
    }

    public void deposit(double amount) throws NegetiveNumberException {
        if(amount < 0){
            throw new NegetiveNumberException("Amount less than zero is not allowed");
        }
        balance += amount;
        System.out.println("Amount deposited : " +amount + " New Balance : " + balance);
    }

    public void withdraw(double amount, String inputPassword) throws LowBalanceException, NegetiveNumberException, PasswordMismatchException {

        if(!this.password.equals(inputPassword)){
            throw new PasswordMismatchException("Password incorrect");
        }

        if(amount > balance) {
            throw new LowBalanceException("Insufficient Balance");
        }

        if(amount < 0){
            throw new NegetiveNumberException("Amount less than zero is not allowed");
        }

        balance -= amount;
        System.out.println("Amount withdrawn : " +amount + " New Balance : " + balance);
    }

    public void transfer(BankAccount receiver, double amount, String inputPassword) throws PasswordMismatchException, NegetiveNumberException, LowBalanceException {
        if(!this.password.equals(inputPassword)){
            throw new PasswordMismatchException("Password incorrect");
        }

        if(amount > balance) {
            throw new LowBalanceException("Insufficient Balance");
        }

        if(amount < 0){
            throw new NegetiveNumberException("Amount less than zero is not allowed");
        }

        this.balance -= amount;
        receiver.balance += amount;
        System.out.println("Amount transferred to "+receiver.accountHolder +" : " + amount);

    }
}

public class Exp7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BankAccount[] bankAccounts = new BankAccount[2];
        bankAccounts[0] = new BankAccount("Om",127,2000,"1234");
        bankAccounts[1] = new BankAccount("Aniket", 126, 3000,"5678");

        try{
            bankAccounts[0].balanceEnquiry("1234");
            bankAccounts[0].deposit(2450);
            bankAccounts[0].withdraw(100,"1234");

            bankAccounts[0].transfer(bankAccounts[1],400,"1234");
            bankAccounts[1].balanceEnquiry("5678");

        }catch (PasswordMismatchException | LowBalanceException | NegetiveNumberException e){
            System.out.println("Error : " + e.getMessage());
        }

    }
}
