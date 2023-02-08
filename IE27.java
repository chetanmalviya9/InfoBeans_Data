import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class IE27 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Basic Salary");
        float n= sc.nextFloat();
        System.out.println("Enter HRA");
        int HRA =sc.nextInt();
        float a = (n*HRA)/100.0f;
        System.out.println("Enter DA");
        int DA =sc.nextInt();
        float b=(n*DA)/100.0f;
        System.out.println("Total salary of employee:- "+(a+b+n));
    }
}
