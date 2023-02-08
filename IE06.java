import java.util.Scanner;

public class IE06 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=(a>b)?a:b;
        System.out.println("Largest value:- "+x);
    }
}
