package Exp3;
/*
Create an abstract class Appliance with instance variables brand and powerConsumption. Define abstract
methods turnOn() and turnOff(), and provide a concrete method display() to show appliance details. Create
subclasses Refrigerator, WashingMachine, Microwave, and AirConditioner, each implementing their power
control methods. Write a test class ApplianceTest where a reference of Appliance holds objects of all
subclasses, calls their respective methods, and displays appliance details.
 */
abstract class Appliance{
    private String brand;
    private double powerConsumption;

    abstract void turnOn();
    abstract void turnOff();

    void display(){
        System.out.println("Brand : "+this.brand + " - " + "Power Consumption : " + this.powerConsumption);
    }

    Appliance(String brand, double powerConsumption){
        this.brand = brand;
        this.powerConsumption = powerConsumption;
    }
}

class Refrigerator extends Appliance{

    Refrigerator(String brand, double powerConsumption){
        super(brand, powerConsumption);
    }

    void turnOn(){
        System.out.println("Refrigerator turned On.....");
    }

    void turnOff(){
        System.out.println("Refrigerator turned Off.");
    }

}

class WashingMachine extends Appliance{

    WashingMachine(String brand, double powerConsumption){
        super(brand, powerConsumption);
    }

    void turnOn(){
        System.out.println("Washing Machine turned On.....");
    }

    void turnOff(){
        System.out.println("Washing Machine turned Off.");
    }

}

class Microwave extends Appliance{

    Microwave(String brand, double powerConsumption){
        super(brand, powerConsumption);
    }

    void turnOn(){
        System.out.println("Microwave turned On.....");
    }

    void turnOff(){
        System.out.println("Microwave turned Off.");
    }

}

class AirConditioner extends Appliance{

    AirConditioner(String brand, double powerConsumption){
        super(brand, powerConsumption);
    }

    void turnOn(){
        System.out.println("Air Conditioner turned On.....");
    }

    void turnOff(){
        System.out.println("Air Conditioner turned Off.");
    }

}

public class ApplianceTest {
    public static void main(String[] args){

        Appliance[] appliances = {
                new Refrigerator("Samsung", 47.50),
                new WashingMachine("IFB", 67.83),
                new Microwave("LG", 23.40),
                new AirConditioner("Voltas", 73.49),
        };

        for(Appliance appliance : appliances){
            appliance.display();
            appliance.turnOn();
            appliance.turnOff();
            System.out.println();
        }

    }
}
