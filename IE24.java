import java.util.Scanner;

class IE24
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i=0;
        System.out.println("Enter amount");
        int n= sc.nextInt();
        if(n>=2000)
        {
            i=n/2000;
            n=n-i*2000;   
        }
        if(i>0)
        System.out.println(i+"notes of 2000");
        i=0;
        if(n>=500)
        {
            i=n/500;
            n=n-i*500; 
        }
        if(i>0)
        System.out.println(i+"notes of 500");
        i=0;
        if(n>=200)
        {
            i=n/200;
            n=n-i*200;   
        }
        if(i>0)
        System.out.println(i+"notes of 200");
        i=0;
        if(n>=100)
        {
            i=n/100;
            n=n-i*100;  
        } 
        if(i>0)
        System.out.println(i+"notes of 100");
        i=0;
        if(n>=50)
        { 
            i=n/50;
            n=n-i*50;  
        }
        if(i>0)
        System.out.println(i+"notes of 50");
        i=0;
         if(n>=20)
        { 
            i=n/20;
            n=n-i*20;  
        }
        if(i>0)
        System.out.println(i+"notes of 20");
        i=0;
         if(n>=10)
        { 
            i=n/10;
            n=n-i*10;  
        }
        if(i>0)
        System.out.println(i+"notes of 10");
        i=0;
        if(n>=5)
        { 
            i=n/5;
            n=n-i*5;  
        }
        if(i>0)
        System.out.println(i+"notes of 5");
        i=0;
        if(n>=2)
        { 
            i=n/2;
            n=n-i*2;  
        }
        if(i>0)
        System.out.println(i+"notes of 2");
        System.out.println(n+"notes of 1");
    }
}