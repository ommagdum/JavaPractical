package Exp1;

import java.util.Scanner;

public class EmpTest {
    static void raise(Emp e,double r){
        e.setRaise(r);
        e.setAfterRaise((AnnualSalary(e) + (AnnualSalary(e) * (r/100))));
    }
    static double AnnualSalary(Emp e){
       return (e.getSalary() * 12) ;
    }

    static void display(Emp e, double r){
        AnnualSalary(e);
        raise(e,r);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fn, ln;
        double sal;
        double raise;

        int empNum;
        System.out.println("Enter Number Of Employees : ");
        empNum = sc.nextInt();
        Emp[] emp = new Emp[empNum];

        for(int i = 0; i < empNum; i++){
            System.out.println("Enter Info For Employee  " + (i+1));
            System.out.println("Enter First Name : ");
            fn = sc.next();
            System.out.println("Enter Last Name : ");
            ln = sc.next();
            System.out.println("Enter Salary : ");
            sal = sc.nextDouble();
            System.out.println("Enter Raise : ");
            raise = sc.nextDouble();
            emp[i] = new Emp(fn, ln, sal);
            display(emp[i],raise);
        }

        for(int i = 0; i < empNum; i++){
            System.out.println(emp[i].getFn()+" \t "+emp[i].getLn()+" \t "+emp[i].getSalary()+" \t "+emp[i].getRaise()+" \t "+emp[i].getAfterRaise());
        }

        sc.close();
    }
}

class Emp{
    private String fn;
    private final String ln;
    private double raise;
    private final double salary;
    private double afterRaise = 0;

    public double getRaise() {
        return raise;
    }

    public void setRaise(double raise) {
        this.raise = raise;
    }

    public double getAfterRaise() {
        return afterRaise;
    }

    public void setAfterRaise(double afterRaise) {
        this.afterRaise = afterRaise;
    }

    Emp(String fn, String ln, double salary){
        this.fn = fn;
        this.ln = ln;
        this.salary = salary;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getFn(){
        return fn;
    }

    public String getLn(){
        return ln;
    }

    public double getSalary(){
        return salary;
    }
}
