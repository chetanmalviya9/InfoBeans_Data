import java.util.Scanner;

public class IE15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        if(a%4==0||a%400==0||a%100==0)
        {
            System.out.println("it is leap year");
        }
        else
        {
            System.out.println("it is not a leap year");
        }
    }
}
