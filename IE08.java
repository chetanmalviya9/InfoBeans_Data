import java.util.Scanner;

public class IE08 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        String x=(a%2==0)?"even number":"odd number";
        System.out.println(x);
    }
}
