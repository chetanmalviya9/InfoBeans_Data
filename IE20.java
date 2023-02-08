import java.util.Scanner;

class IE20
{
  public static void main (String[]args)
  {
      
    
      Scanner s = new Scanner (System.in);
      System.out.println("Enter Character");
      char a = s.next().charAt(0);
      
          if (a>=48&&a<=57)
          System.out.println("digit ");
          else if((a>=65&&a<=90)||(a>=97&&a<=122))
          System.out.println("character");
          else
          System.out.println("Special character");     
    }
}