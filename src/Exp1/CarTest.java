package Exp1;

import java.sql.SQLOutput;
import java.util.Scanner;

class Car{
    private String make;
    private String model;
    private double price;

    Car(String make, String model, double price){
        this.model = model;
        this.make = make;
        if(price < 0){
            this.price = 0;
        }else{
            this.price = price;
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
public class CarTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double discount;
        Car c1 = new Car("Maruti Suzuki","Brezza",13.50);
        Car c2 = new Car("Mahindra","XUV700",22.50);
        System.out.println(c1.getMake() +" - "+c1.getModel()+" - "+c1.getPrice() + " Lakhs");
        System.out.println(c2.getMake() +" - "+c2.getModel()+" - "+c2.getPrice() + " Lakhs");

        System.out.println("Enter Discount To Give : ");
        discount = sc.nextDouble();

        System.out.println("After Discount : ");
        System.out.println(c1.getMake() +" - "+c1.getModel()+" - "+(c1.getPrice() - (c1.getPrice() * discount/100)) + " Lakhs");
        System.out.println(c2.getMake() +" - "+c2.getModel()+" - "+(c2.getPrice() - (c2.getPrice() * discount/100)) + " Lakhs");

    }
}
