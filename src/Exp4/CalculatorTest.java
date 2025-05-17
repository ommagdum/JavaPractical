package Exp4;

/*
Create an interface Calculator with abstract methods add(), subtract(), multiply(), and divide(), where all
parameters are strings. Implement three subclasses: IntegerCalculator, DoubleCalculator, and StringCalculator
to handle conversions and perform operations accordingly. Write a test class CalculatorTest to verify
mathematical operations for different data types.
 */

interface Calculator{
    void add(String val1, String val2);
    void subtract(String val1, String val2);
    void multiply(String val1, String val2);
    void divide(String val1, String val2);
}

class IntegerCalculator implements Calculator{
    private int val1, val2;

    public void add(String val1, String val2){
        try{
            this.val1 = Integer.parseInt(val1);
        } catch (NumberFormatException e) {
            System.out.println("Can't convert "+ val1 + " to integer for operations.");
        }

        try{
            this.val2 = Integer.parseInt(val2);
        } catch (NumberFormatException e) {
            System.out.println("Can't convert "+ val2 + " to integer for operations.");
        }

        System.out.println("Addition : " + (this.val1+this.val2));
    }

    public void subtract(String val1, String val2){
        try{
            this.val1 = Integer.parseInt(val1);
        } catch (NumberFormatException e) {
            System.out.println("Can't convert "+ val1 + " to integer for operations.");
        }

        try{
            this.val2 = Integer.parseInt(val2);
        } catch (NumberFormatException e) {
            System.out.println("Can't convert "+ val2 + " to integer for operations.");
        }

        System.out.println("Subtraction : " + (this.val1-this.val2));
    }

    public void multiply(String val1, String val2){
        try{
            this.val1 = Integer.parseInt(val1);
        } catch (NumberFormatException e) {
            System.out.println("Can't convert "+ val1 + " to integer for operations.");
        }

        try{
            this.val2 = Integer.parseInt(val2);
        } catch (NumberFormatException e) {
            System.out.println("Can't convert "+ val2 + " to integer for operations.");
        }

        System.out.println("Multiply : " + (this.val1*this.val2));
    }

    public void divide(String val1, String val2){
        try{
            this.val1 = Integer.parseInt(val1);
        } catch (NumberFormatException e) {
            System.out.println("Can't convert "+ val1 + " to integer for operations.");
        }

        try{
            this.val2 = Integer.parseInt(val2);
        } catch (NumberFormatException e) {
            System.out.println("Can't convert "+ val2 + " to integer for operations.");
        }

        System.out.println("Division : " + (this.val1/this.val2));
    }
}

class DoubleCalculator implements Calculator{
    private double val1, val2;

    public void add(String val1, String val2){
        try{
            this.val1 = Double.parseDouble(val1);
        } catch (NumberFormatException e) {
            System.out.println("Can't convert "+ val1 + " to integer for operations.");
        }

        try{
            this.val2 = Double.parseDouble(val2);
        } catch (NumberFormatException e) {
            System.out.println("Can't convert "+ val2 + " to integer for operations.");
        }

        System.out.println("Addition : " + (this.val1+this.val2));
    }

    public void subtract(String val1, String val2){
        try{
            this.val1 = Double.parseDouble(val1);
        } catch (NumberFormatException e) {
            System.out.println("Can't convert "+ val1 + " to integer for operations.");
        }

        try{
            this.val2 = Double.parseDouble(val2);
        } catch (NumberFormatException e) {
            System.out.println("Can't convert "+ val2 + " to integer for operations.");
        }

        System.out.println("Subtraction : " + (this.val1-this.val2));
    }

    public void multiply(String val1, String val2){
        try{
            this.val1 = Double.parseDouble(val1);
        } catch (NumberFormatException e) {
            System.out.println("Can't convert "+ val1 + " to integer for operations.");
        }

        try{
            this.val2 = Double.parseDouble(val2);
        } catch (NumberFormatException e) {
            System.out.println("Can't convert "+ val2 + " to integer for operations.");
        }

        System.out.println("Multiply : " + (this.val1*this.val2));
    }

    public void divide(String val1, String val2){
        try{
            this.val1 = Double.parseDouble(val1);
        } catch (NumberFormatException e) {
            System.out.println("Can't convert "+ val1 + " to integer for operations.");
        }

        try{
            this.val2 = Double.parseDouble(val2);
        } catch (NumberFormatException e) {
            System.out.println("Can't convert "+ val2 + " to integer for operations.");
        }

        System.out.println("Division : " + (this.val1/this.val2));
    }
}

class StringCalculator implements Calculator{

    public void add(String s1 , String s2){
        System.out.println(s1+s2);
    }

    public void subtract(String s1, String s2){
        System.out.println(s1.replace(s2, ""));
    }

    public void multiply(String s1, String s2){
        try{
            int times = Integer.parseInt(s2);
            System.out.println(s1.repeat(times));
        }catch (NumberFormatException e){
            System.out.println("Invalid Multiplication");
        }
    }

    public void divide(String s1, String s2){
        System.out.println("Empty Method");
    }

}

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator intCalc = new IntegerCalculator();
        System.out.println("IntegerCalculator Tests:");
        intCalc.add("5", "3");
        intCalc.subtract("10", "4");
        intCalc.multiply("6", "2");
        intCalc.divide("8", "2");

        Calculator doubleCalc = new DoubleCalculator();
        System.out.println("\nDoubleCalculator Tests:");
        doubleCalc.add("5.5", "2.5");
        doubleCalc.subtract("10.2", "4.1");
        doubleCalc.multiply("6.3", "2.0");
        doubleCalc.divide("9.6", "3.2");

        Calculator stringCalc = new StringCalculator();
        System.out.println("\nStringCalculator Tests:");
        stringCalc.add("Hello", " World");
        stringCalc.subtract("JavaProgramming", "Programming");
        stringCalc.multiply("Repeat", "3");
        stringCalc.divide("HelloWorld", "World");
    }
}
