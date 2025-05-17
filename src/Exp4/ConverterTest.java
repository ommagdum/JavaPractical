package Exp4;
/*
Create an interface Converter with abstract methods toUpperCase(), toLowerCase(), toInteger(), and
toDouble(). Implement three subclasses: StringConverter, IntegerConverter, and DoubleConverter, where
StringConverter works on string manipulation, IntegerConverter converts strings to integers, and
DoubleConverter converts strings to doubles. Write a test class ConverterTest to check the functionality of all
converters.
 */

interface Converter{
    String toUpperCase();
    String toLowerCase();
    int toInteger();
    double toDouble();
}

class StringConverter implements Converter{
    private String value;

    StringConverter(String value){
        this.value = value;
    }

    public String toUpperCase(){
        return value.toUpperCase();
    }

    public String toLowerCase(){
        return value.toLowerCase();
    }

    public int toInteger(){
        try{
            return Integer.parseInt(value);
        }catch (NumberFormatException e){
            System.out.println("Cant Convert "+value+ " into an integer value.");
            return 0;
        }
    }

    public double toDouble(){
        try{
            return Double.parseDouble(value);
        }catch (NumberFormatException e){
            System.out.println("Cant Convert "+value+ " into an double value.");
            return 0;
        }
    }
}

class IntegerConverter implements Converter{
    private int value;

    public IntegerConverter(int value) {
        this.value = value;
    }

    public IntegerConverter(String value) {
        try {
            this.value = Integer.parseInt(value.trim());
        } catch (NumberFormatException e) {
            System.out.println("Cannot convert '" + value + "' to integer");
            this.value = 0; // Default value in case of error
        }
    }

    public String toUpperCase() {
        return String.valueOf(value).toUpperCase();
    }

    public String toLowerCase() {
        return String.valueOf(value).toLowerCase();
    }

    public int toInteger() {
        return value;
    }

    public double toDouble() {
        return (double) value;
    }
}

class DoubleConverter implements Converter {
    private double value;

    public DoubleConverter(double value) {
        this.value = value;
    }

    public DoubleConverter(String value) {
        try {
            this.value = Double.parseDouble(value.trim());
        } catch (NumberFormatException e) {
            System.out.println("Cannot convert '" + value + "' to double");
            this.value = 0.0; // Default value in case of error
        }
    }

    public String toUpperCase() {
        return String.valueOf(value).toUpperCase();
    }

    public String toLowerCase() {
        return String.valueOf(value).toLowerCase();
    }

    public int toInteger() {
        return (int) value; // This will truncate the decimal part
    }

    public double toDouble() {
        return value;
    }
}
public class ConverterTest {
    public static void main(String[] args) {
        System.out.println("Testing StringConverter:");
        StringConverter stringConverter1 = new StringConverter("Hello World");
        StringConverter stringConverter2 = new StringConverter("42");
        StringConverter stringConverter3 = new StringConverter("3.14");

        System.out.println("Original: 'Hello World'");
        System.out.println("To uppercase: " + stringConverter1.toUpperCase());
        System.out.println("To lowercase: " + stringConverter1.toLowerCase());
        System.out.println("Original: '42'");
        System.out.println("To integer: " + stringConverter2.toInteger());
        System.out.println("To double: " + stringConverter2.toDouble());
        System.out.println("Original: '3.14'");
        System.out.println("To integer: " + stringConverter3.toInteger()); // This will cause an exception to be caught
        System.out.println("To double: " + stringConverter3.toDouble());
        System.out.println();

        System.out.println("Testing IntegerConverter:");
        IntegerConverter intConverter1 = new IntegerConverter(42);
        IntegerConverter intConverter2 = new IntegerConverter("123");

        System.out.println("Original: 42");
        System.out.println("To uppercase: " + intConverter1.toUpperCase());
        System.out.println("To lowercase: " + intConverter1.toLowerCase());
        System.out.println("To integer: " + intConverter1.toInteger());
        System.out.println("To double: " + intConverter1.toDouble());
        System.out.println("Original string: '123'");
        System.out.println("After conversion: " + intConverter2.toInteger());
        System.out.println();

        System.out.println("Testing DoubleConverter:");
        DoubleConverter doubleConverter1 = new DoubleConverter(3.14);
        DoubleConverter doubleConverter2 = new DoubleConverter("2.718");

        System.out.println("Original: 3.14");
        System.out.println("To uppercase: " + doubleConverter1.toUpperCase());
        System.out.println("To lowercase: " + doubleConverter1.toLowerCase());
        System.out.println("To integer: " + doubleConverter1.toInteger());
        System.out.println("To double: " + doubleConverter1.toDouble());
        System.out.println("Original string: '2.718'");
        System.out.println("After conversion: " + doubleConverter2.toDouble());
    }
}
