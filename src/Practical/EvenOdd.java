import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Number Is Even.");
        }else{
            System.out.println("Number Is Odd.");
        }
        sc.close();
    }
}
