package Exp2;

import java.util.Scanner;

class SavingsAccount
{
    static double annualIntrestRate;
    private double savingsBalance;

    SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest(){
        savingsBalance += savingsBalance*(annualIntrestRate/12);
    }

    static void modifyInterestRate(double r){
        annualIntrestRate = r/100;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
}

public class SavingsAccountTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int savers;
        double balance, rate;


        System.out.println("Enter Balance For Saver 1");
        balance = sc.nextDouble();
        SavingsAccount saver1 = new SavingsAccount(balance);

        System.out.println("Enter Balance For Saver 2");
        balance = sc.nextDouble();
        SavingsAccount saver2 = new SavingsAccount(balance);

        System.out.println("Enter Interest Rate : ");
        rate = sc.nextDouble();

        SavingsAccount.modifyInterestRate(rate);

        saver1.calculateMonthlyInterest();

        System.out.println("Balance After "+ rate+"%" +" For Saver 1"+ " : " + saver1.getSavingsBalance());
        System.out.println("Balance After "+ rate+"%" +" For Saver 2"+ " : " + saver2.getSavingsBalance());

        System.out.println("Enter Interest Rate : ");
        rate = sc.nextDouble();

        SavingsAccount.modifyInterestRate(rate);

        saver1.calculateMonthlyInterest();

        System.out.println("Balance After "+ rate+"%" +" For Saver 1"+ " : " + saver1.getSavingsBalance());
        System.out.println("Balance After "+ rate+"%" +" For Saver 2"+ " : " + saver2.getSavingsBalance());

    }

}