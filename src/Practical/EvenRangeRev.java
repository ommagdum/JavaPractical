import java.util.Scanner;

public class EvenRangeRev {
    public static void main(String[] args){
        int startRange;
        int endRange;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start Range : ");
        startRange = sc.nextInt();
        System.out.println("Enter End Range : ");
        endRange = sc.nextInt();

        System.out.print("Even Series (Reversed) : ");
        for(int i = endRange; i >= startRange; i--){
            if((i % 2 == 0) && (i % 5 == 0)) {
                System.out.print(" " + i);
            }
        }
        sc.close();
    }
}
