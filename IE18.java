import java.util.Scanner;
public class IE18 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        if((a^1)==a+1)
        System.out.println("even number");
        else
        System.out.println("odd number");
    }
}
