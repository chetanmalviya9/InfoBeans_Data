class Smally{
   public static void main(String args[])
   {
   for(int i=1;i<=7;i++)
    {
      for(int j=1;j<=4;j++)
       {
       if((j==1&&i<=3)||(i==4||i==7)&&(j==2||j==3)||(j==4&&i<=6)||(i==6&&j==1))
        System.out.print("*");
       else
        System.out.print(" ");
       }
       System.out.println();
       }
     }
   }