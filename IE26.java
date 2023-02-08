import java.util.Scanner;

class IE26
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
        System.out.println("Enter 6th subject marks");
        int f=sc.nextInt();
        int total=a+b+c+d+e+f;
        System.out.println("total marks:- "+total);
        float per=total/6.0f;
        System.out.println("Percentage of student:- "+per);
        
        if(per >= 90)
        System.out.println("Grade A");
        else if(per >= 80)
        System.out.println("Grade B");
        else if(per >= 70)
        System.out.println("Grade C");
        else if(per >= 60)
        System.out.println("Grade D");
        else if(per >= 40)
        System.out.println("Grade E");
        else
        System.out.println("Grade F");
    }
}