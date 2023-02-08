import java.util.Scanner;

public class IE29 {
    public static void main(String[] args) 
    {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter a choice\n1:'+'\n2:'>'\n3:'=='");
        int a=sc.nextInt();
        System.out.println("Enter two number");
        int i=sc.nextInt();
        int j=sc.nextInt();
        int c;
        switch(a)
        {
            case 1:
                c=i+j;
                System.out.println("Addition of two numbers:- "+c);
            case 2:
                c=(i>j)?i:j;
                System.out.println("Greatest number :- "+c);
            case 3:
            String s =(i==j)?"equal":"not equal";
            System.out.println("numbers are :- "+s); 
        }
    }
}
