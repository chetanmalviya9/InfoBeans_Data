import java.util.Scanner;

public class IE28 
{
    public static void main(String[] args) 
    { Scanner sc =new Scanner(System.in);
        float i=0.0f,j=0.0f;
        System.out.println("Enter unit");
        int n= sc.nextInt();
    if(n>0&&n<=50)
    {
        i=0.50f;
        j=(i*n);
        System.out.println("amount charge "+j);
    }
    else if (n<=150&&n>50)
    {
        i=0.75f;
        j=i*n;
        System.out.println("amount charge "+j);
    }
    else if(n<=250&&n>150)
    {
        i=1.20f;
        j=i*n;
        System.out.println("amount charge "+j);
    }
    else if(n>250)
    {
        i=1.50f;
        j=i*n;
        System.out.println("amount charge "+j);
    }
        float k=(j*20)/100.0f;
   
        System.out.println("Total Bill "+(k+j));
    }
}
