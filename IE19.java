import java.util.Scanner;

public class IE19 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter sides of Triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b&&b==c)
        {
            System.out.println("Equilateral triangle");
        }
        else if(a==b&&b!=c||a!=b&&b==c)
        {
            System.out.println("isosceles Triangle");
        }
        else
        {
            System.out.println("scalene Triangle");
        }
    }
}
