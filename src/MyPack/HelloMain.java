package MyPack;
import SecPack.Second;
import java.util.Scanner;

public class HelloMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Second s = new Second();
        System.out.println("Enter A String : ");
        String str = sc.nextLine();
        s.display(str);
    }
}
