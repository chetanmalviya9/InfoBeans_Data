import java.util.Scanner;

public class IE11 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        int x= (a%2==0)?1:2;
        switch(x)
        {
            case 1:
            System.out.println("Even number");
            break;
            case 2:
            System.out.println("Odd number");
            break;
        }
    }
}
