import java.util.Scanner;

class AreaOfCircle{
    
    public void area()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float r=sc.nextFloat();
        float Area=(float)Math.PI*r*r;
        System.out.println("Area of circle"+Area);
    }

}
class IE01
{
    public static void main(String args[])
    {
        new AreaOfCircle().area();
    }
}