public class Smallr{
    public static void main(String args[])
    {
    for(int i=1;i<=6;i++)
     {
       for(int j=1;j<=4;j++)
        {
        if((j==1||(i+j==4)||(j==4&& i==1)))
         System.out.print("*");
        else
         System.out.print("  ");
        }
        System.out.println();
        }
      }
    } 
