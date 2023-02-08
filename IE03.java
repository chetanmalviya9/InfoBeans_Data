import java.util.Scanner;

class Student{
    private int a,b,c,d,e;
    public void setMarksOfA(int a)
    {
        this.a=a;
    }
    public void setMarksOfB(int b)
    {
        this.b=b;
    }
    public void setMarksOfC(int c)
    {
        this.c=c;
    }
    public void setMarksOfD(int d)
    {
        this.d=d;
    }
    public void setMarksOfE(int e)
    {
        this.e=e;
    }
    public void calculation(){
        int total=a+b+c+d+e;
        System.out.println("total marks:- "+total);
        float percentage=total/5.0f;
        System.out.println("Percentage of student:- "+percentage);
  
    }
}
class IE03
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st subject marks");
        int a=sc.nextInt();
        System.out.println("Enter 2nd subject marks");
        int b=sc.nextInt();
        System.out.println("Enter 3rd subject marks");
        int c=sc.nextInt();
        System.out.println("Enter 4th subject marks");
        int d=sc.nextInt();
        System.out.println("Enter 5th subject marks");
        int e=sc.nextInt();
        int total=a+b+c+d+e;
        System.out.println("total marks:- "+total);
        float percentage=total/5.0f;
        System.out.println("Percentage of student:- "+percentage);
    }
}