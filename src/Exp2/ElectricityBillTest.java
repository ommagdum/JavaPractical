package Exp2;
/*
Create a class called ElectricityBill that has three instance variables: consumerNumber, consumerName, and
unitsConsumed. Provide a constructor to initialize these variables. Implement a method calculateBillAmount
to determine the bill amount based on the following slab rates: Up to 100 units: Rs 3 per unit, 101-300 units:
Rs 5 per unit, Above 300 units: Rs 8 per unit, Write a test application named ElectricityBillTest to create
objects for different consumers, calculate their bill amounts, and display their details.
 */

class ElectricityBill{
    private long consumerNumber;
    private String consumerName;
    private int unitsConsumed;

    ElectricityBill(long num, String name, int units){
        this.consumerNumber = num;
        this.consumerName = name;
        this.unitsConsumed = units;
    }

    double caluculateBillAmount(){
        double bill = 0;

        if(this.unitsConsumed < 100){
            bill = this.unitsConsumed * 3;
        }

        if(this.unitsConsumed >= 100){
            bill = this.unitsConsumed * 3;
            if(this.unitsConsumed > 100){
                bill += this.unitsConsumed * 5;
                if(this.unitsConsumed > 300){
                    bill += this.unitsConsumed * 8;
                }
            }
        }
        return bill;
    }

    public long getConsumerNumber() {
        return consumerNumber;
    }

    public void setConsumerNumber(long consumerNumber) {
        this.consumerNumber = consumerNumber;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }
}
public class ElectricityBillTest {
    public static void main(String[] args){
        ElectricityBill e1 = new ElectricityBill(101,"Om",100);
        ElectricityBill e2 = new ElectricityBill(102,"Aniket",150);
        ElectricityBill e3 = new ElectricityBill(103,"Aditya",400);

        System.out.println("Bill And Details : ");
        System.out.println("Number : "+ e1.getConsumerNumber()
                + " - " + "Name :" + e1.getConsumerName() + " - " + "Units : "
                + e1.getUnitsConsumed() + " - "+"Bill : "+
                +e1.caluculateBillAmount());

        System.out.println("Bill And Details : ");
        System.out.println("Number : "+ e2.getConsumerNumber()
                + " - " + "Name :" + e2.getConsumerName() + " - "+"Units : "
                + e2.getUnitsConsumed() + " - "+"Bill : "
                +e2.caluculateBillAmount());
    }
}
