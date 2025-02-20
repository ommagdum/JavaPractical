import java.util.Scanner;

public class EvenOddClass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a Number : ");
        num = sc.nextInt();

        EvenOddClass2 obj1 = new EvenOddClass2(num);
    }
}

class EvenOddClass2{
    public EvenOddClass2(int num){
        if(num % 2 == 0){
            System.out.println("Number Is Even");
        }else{
            System.out.println("Number Is Odd");
        }
    }
}
