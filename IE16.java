import java.util.Scanner;

public class IE16 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a choice\n1:celcius to farenheit\n2:fareheit to celcius");
        int a=sc.nextInt();
        System.out.println("Enter temperature");
        switch(a)
        {
            case 1:
                    float c=sc.nextFloat();
                    System.out.println(((c*9/5.0)+32));
            case 2:
                    float f=sc.nextFloat();
                    System.out.println(((f-32)*5/9.0));
        }
    }
}
