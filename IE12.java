import java.util.Scanner;

public class IE12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        char a=sc.next().charAt(0);
        int x;
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
        x=1;
        else
        x=2;
        switch(x)
        {
            case 1:
            System.out.println("Vowel");
            break;
            case 2:
            System.out.println("Consonent");
        }
    }
}
