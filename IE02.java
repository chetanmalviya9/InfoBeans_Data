import java.util.Scanner;

public class IE02 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        float l=sc.nextFloat();
        System.out.println("Enter breath of rectangle");
        float b=sc.nextFloat();
        float Area=l*b;
        System.out.println("Area of rectangle"+Area);    
    }   
}
