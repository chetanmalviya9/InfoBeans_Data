import java.util.Scanner;

public class IE07 
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter Three number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x=(a>b&&a>c)?a:(b>c)?b:c;
        System.out.println("Largest value:- "+x);
    }  
}
