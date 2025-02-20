import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args)
    {
        double num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        num = sc.nextDouble();
        boolean isPrime = true;

        for(double i = 2; i <= Math.sqrt(num); i++)
        {
            if(num % i == 0) {
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("Is A Prime Number");
        }else{
            System.out.println("Not A Prime Number");
        }
        sc.close();
    }
}
