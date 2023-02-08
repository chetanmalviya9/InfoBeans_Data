import java.util.Scanner;
public class IE25 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter cp and sp number");
        int cp=sc.nextInt();
        int sp=sc.nextInt();
        if(cp<sp)
        {
            System.out.println("profit amount is "+(sp-cp));
        }
        else if(cp>sp)
        {
            System.out.println("loss amount is "+(cp-sp));
        }
        else
        {
            System.out.println("no profit, no loss");
        }
    }
}
