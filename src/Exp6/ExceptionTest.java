package Exp6;

public class ExceptionTest {
    public static void main(String[] args){
        int a = 10, b = 0, c;
        String str = null;
        String str2 = "TKIET";
        int[] arr = {1, 2, 3};

        c = a + b;
        System.out.println("c = " + c);
        try{
            c = a/b;
            System.out.println("c = " + c);
            System.out.println("Length : " + str.length());
            int num2 = Integer.parseInt(str2);
            System.out.println(arr[8]);
        } catch (ArithmeticException e) {
            System.out.println("Divide By Zero Exception Caught");
        } catch (NullPointerException e){
            System.out.println("String Is Empty");
        } catch (NumberFormatException e){
            System.out.println("Can't Convert String To Integer");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Can't Access Index Out Of Range");
        }
        c = a - b;
        System.out.println("c = " + c);
        c = a*b;
        System.out.println("c = " + c);
    }
}
