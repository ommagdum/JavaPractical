package Exp7;

/*
Develop a BankAccount class which should contain all methods of Bank i.ebalanceEnquery(),
withdraw(), transfer() and deposit(). You should create at least two objects of BankAccount using array and do all
operations mentioned above. Also generate user defined exception LowBalanceException, NegetiveNumberException
and PasswordMismatchException whenever required. To transfer amount from one account to another use two
BankAccount objects.
 */

import java.util.Scanner;

class BankAccount{
    private int id;
    private double balance;
    private String password;

    public BankAccount(int id, double balance, String password) {
        this.id = id;
        this.balance = balance;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double balanceEnquery(String password) throws PasswordMismatchException {
        if(password.equals(this.password)){
            return balance;
        }else {
            throw new PasswordMismatchException("Incorrect Password");
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void withdraw(double amt , String password) throws LowBalanceException, PasswordMismatchException {

        if(password.equals(this.password)){
            if(amt <= balance){
                balance -= amt;
                System.out.println("Amount Withdraw : " + amt);
            }else {
                throw new LowBalanceException("Insufficient Balance");
            }
        }else {
            throw new PasswordMismatchException("Incorrect Password");
        }
    }

    public void transfer(BankAccount bankAccount, double amt, String password) throws LowBalanceException, NegetiveNumberException, PasswordMismatchException {
       this.withdraw(amt, password);
       bankAccount.deposit(amt, password);
    }

    public void deposit(double amt, String password) throws NegetiveNumberException, PasswordMismatchException {

        if(password.equals(this.password)){
            if(amt >= 0){
                balance+=amt;
            }else{
                throw new NegetiveNumberException("Negative Inputs Not Allowed.");
            }
        }else {
            throw new PasswordMismatchException("Incorrect Password");
        }
    }


}

class LowBalanceException extends Exception{
    public LowBalanceException(String message) {
        super(message);
    }
}

class NegetiveNumberException extends Exception{
    public NegetiveNumberException(String message) {
        super(message);
    }
}

class PasswordMismatchException extends Exception{
    public PasswordMismatchException(String message) {
        super(message);
    }
}

public class BankAccountTest {
    public static void main(String[] args) throws PasswordMismatchException, LowBalanceException, NegetiveNumberException {
        Scanner scanner = new Scanner(System.in);
        BankAccount[] bankAccounts = new BankAccount[2];

        int id, id2;
        String pass;
        double amt;

        for(int i = 0; i < 2; i++){
            bankAccounts[i] = new BankAccount(1,1000,"1234");
        }


        int choice = 0;

        while (choice != 4){
            System.out.println("---- Bank Menu ----");
            System.out.println("1 - Balance Enquiry");
            System.out.println("2 - Withdraw Money");
            System.out.println("3 - Deposit Money");
            System.out.println("4 - Exit");
            System.out.print("Enter Choice : ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("----- Balance Enquiry -----");
                    System.out.println("Enter Account Id : ");
                    id = scanner.nextInt();
                    System.out.println("Enter Password : ");
                    pass = scanner.next();
                    System.out.println("Balance : " + bankAccounts[id].balanceEnquery(pass));
                    break;

                case 2:
                    System.out.println("----- Withdraw -----");
                    System.out.println("Enter Account Id : ");
                    id = scanner.nextInt();
                    System.out.println("Enter Password : ");
                    pass = scanner.next();
                    System.out.println("Enter Amount To Withdraw : ");
                    amt = scanner.nextInt();
                    bankAccounts[id-1].withdraw(amt, pass);
                    break;

                case 3:
                    System.out.println("----- Deposit -----");
                    System.out.println("Enter Account Id : ");
                    id = scanner.nextInt();
                    System.out.println("Enter Password : ");
                    pass = scanner.next();
                    System.out.println("Enter Amount To Deposit : ");
                    amt = scanner.nextInt();
                    bankAccounts[id-1].deposit(amt, pass);
                    break;
                case 4:
                    continue;
                default:
            }

        }
    }
}
