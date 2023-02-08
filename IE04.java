import java.util.Scanner;

class IE04
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("value before swapping \n"+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
    System.out.println("value after swapping");
        System.out.println(a+" "+b);
    }
}