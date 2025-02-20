package Exp3;
/*
Create an abstract class Vehicle with instance variables brand and speed. Define abstract methods
startEngine() and stopEngine(), and provide a concrete method display() to show vehicle details. Create
subclasses Car, Bike, Truck, and Bus, each implementing their respective engine operations. Write a test class
VehicleTest where a reference of Vehicle holds objects of all subclasses, calls their respective methods, and
displays vehicle details.
 */

abstract class Vehicle{
    private String brand;
    private int speed;

    abstract void startEngine();
    abstract void stopEngine();
    void display(){
        System.out.println("Brand : " + this.brand + " - " + "Speed : " + this.speed);
    }

    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
}

class Car extends Vehicle{

    Car(String brand, int speed){
        super(brand, speed);
    }

    void startEngine() {
        System.out.println("Car Engine Starts.....");
    }

    void stopEngine() {
        System.out.println("Car Engine Stops.");
    }
}

class Bike extends Vehicle{

    Bike(String brand, int speed){
        super(brand, speed);
    }

    void startEngine() {
        System.out.println("Bike Engine Starts.....");
    }

    void stopEngine() {
        System.out.println("Bike Engine Stops.");
    }
}

class Truck extends Vehicle{

    Truck(String brand, int speed){
        super(brand, speed);
    }

    void startEngine() {
        System.out.println("Truck Engine Starts.....");
    }

    void stopEngine() {
        System.out.println("Truck Engine Stops.");
    }
}

class Bus extends Vehicle{

    Bus(String brand, int speed){
        super(brand, speed);
    }

    void startEngine() {
        System.out.println("Bus Engine Starts.....");
    }

    void stopEngine() {
        System.out.println("Bus Engine Stops.");
    }
}
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Maruti Suzuki",180),
                new Bike("Yamaha",200),
                new Truck("Tata",140),
                new Bus("Volvo",170),
        };

        for( Vehicle vehicle : vehicles){
            vehicle.display();
            vehicle.startEngine();
            vehicle.stopEngine();
            System.out.println();
        }
    }
}
