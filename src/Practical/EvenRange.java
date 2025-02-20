import java.util.Scanner;

public class EvenRange {
    public static void main(String[] args){
        int startRange;
        int endRange;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start Range : ");
        startRange = sc.nextInt();
        System.out.println("Enter End Range : ");
        endRange = sc.nextInt();

        System.out.print("Even Series : ");
        for(int i = startRange; i <= endRange; i++){
            if((i % 2 == 0) && (i % 5 == 0)) {
                System.out.print(" " + i);
            }
        }
        sc.close();
    }
}
