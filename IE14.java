import java.util.Scanner;

public class IE14
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter four number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int x=(a<b&&a<c&&a<d)?a:(b<c&&b<d)?b:(c<d)?c:d;
        System.out.println("smallest value:- "+x);
    }  
}
