package Exp3;
/*
Create an abstract class Employee with instance variables name and salary. Define abstract methods
calculateBonus() and calculateDeductions(), and provide a concrete method display() to show employee
details. Create subclasses Manager, Engineer, Clerk, and Salesperson, each implementing their respective
salary calculations. Write a test class EmployeeTest where a reference of Employee holds objects of all
subclasses, calls their respective methods, and displays employee details.
 */

abstract class Employee{
    private String name;
    private double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    abstract void calculateBonus();
    abstract void calculateDeductions();

    void display(){
        System.out.println("Name : "+this.name + " - " + "Salary : " + this.salary + " Lakhs");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee{

    Manager(String name, double salary){
        super(name, salary);
    }

    void calculateBonus() {
        System.out.println("Salary After 2L Bonus : " + (getSalary() + 2) + " Lakhs");
    }

    void calculateDeductions() {
        System.out.println("Salary After 0.5L Deductions : " + (getSalary() - 0.5) + " Lakhs");
    }
}

class Engineer extends Employee{

    Engineer(String name, double salary){
        super(name, salary);
    }

    void calculateBonus() {
        System.out.println("Salary After 1L Bonus : " + (getSalary() + 2) + " Lakhs");
    }

    void calculateDeductions() {
        System.out.println("Salary After 0.25L Deductions : " + (getSalary() - 0.25) + " Lakhs");
    }
}

class Clerk extends Employee{

    Clerk(String name, double salary){
        super(name, salary);
    }

    void calculateBonus() {
        System.out.println("Salary After 50K Bonus : " + (getSalary() + 0.5) + " Lakhs");
    }

    void calculateDeductions() {
        System.out.println("Salary After 20K Deductions : " + (getSalary() - 0.20) + " Lakhs");
    }
}

class Salesperson extends Employee{

    Salesperson(String name, double salary){
        super(name, salary);
    }

    void calculateBonus() {
        System.out.println("Salary After 10K Bonus : " + (getSalary() + 0.10) + " Lakhs");
    }

    void calculateDeductions() {
        System.out.println("Salary After 5K Deductions : " + (getSalary() - 0.05) + " Lakhs");
    }
}

public class EmployeeTest {
    public static void main(String[] args){

        Employee[] employees = {
                new Manager("Om Magdum", 45),
                new Engineer("Kaustubh Gavali", 18),
                new Clerk("Prathamesh Patil", 6),
                new Salesperson("Shubham Gurav", 3)
        };

        for(Employee employee : employees){
            employee.display();
            employee.calculateBonus();
            employee.calculateDeductions();
            System.out.println();
        }
    }
}
