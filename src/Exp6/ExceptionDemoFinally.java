package Exp6;

public class ExceptionDemoFinally {
    public static void main(String[] args){
        int a = 10, b = 0, c;
        try {
            c = a/b;
        }catch (ArithmeticException e){
            System.out.println("Divide By Zero Exception Raised");
        }finally {
            System.out.println("Always");
        }
    }
}
