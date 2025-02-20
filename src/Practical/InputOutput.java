import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args)
    {
        String name;
        int roll;
        double cgpa;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Roll No. : ");
        roll = sc.nextInt();
        System.out.println("Enter predicted cgpa : ");
        cgpa = sc.nextDouble();

        System.out.println("Name : " + name);
        System.out.println("Roll No. : " + roll);
        System.out.println("Predicted Cgpa : " + cgpa);
        sc.close();
    }
}
